package com.mh.music.moviematcher.controller;

import com.google.gson.Gson;
import com.mh.music.moviematcher.service.MusicSearchService;
import com.mh.music.moviematcher.vo.MusicSearchVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.DefaultUriBuilderFactory;
import reactor.core.publisher.Mono;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.*;

@RestController
public class MusicSearchController {

    @Autowired
    private MusicSearchService musicSearchService;

    @GetMapping("/welcome")
    public String hi(){
        return "Hellow world";
    }

    @GetMapping("/search")
    public String search(HttpServletRequest request){

        String movie_year = request.getParameter("movie_year");
        // 3개의 음악 포털 사이트에서 검색을 통해 Music Play List를 가져 온다.
        // + 알고리즘.(아직 추가 안함.)
        //  - Rule (규칙)
        //  - 영화 정보 - 음악 정보 간의 규칙을 만드는 것
        //  - 전문가 , 머신러닝(기계학습)
        //  - 전문가 룰(규칙) 직접 만듬 ( 룰 엔진이 중요 함.)
        //  - 기계 대입을 해보면 ... 결국 전문가가 한 거랑 비슷해짐.
        //  - 두가지가 다 되도록 .( 전문가 룰 <- 기계학습이 결과를 보완...해줌)
        //  List<String> play_list = MusicMAtcherEngine.fire(".....")
        //  역할 의 분리 -- 수집(.. 영화정보...) , 매칭/매핑 (음악....) , 알고리즘 연산

        // okHttp 오픈소스
        // WebFlux : webClient....
        String TOKEN_URL = "https://accounts.spotify.com/api/token";
        String SEARCH_URL = "https://api.spotify.com/v1/search";
        DefaultUriBuilderFactory factory = new DefaultUriBuilderFactory(TOKEN_URL);
        factory.setEncodingMode(DefaultUriBuilderFactory.EncodingMode.VALUES_ONLY);
        WebClient webClient = WebClient.builder()
                            .uriBuilderFactory(factory)
                            .baseUrl(TOKEN_URL)
                            .build();
        String response = webClient.post()
                .uri(uriBuilder -> uriBuilder
                        .queryParam("grant_type","client_credentials")
                        .queryParam("client_id","67d92ea5cebe407a9ceb0341a4aae137")
                        .queryParam("client_secret","115739e5caee477fa3c8c09a20c6e5e4")
                        .build())
                .header("Content-Type","application/x-www-form-urlencoded")
                .retrieve()
                .bodyToMono(String.class)
                .block();
        Gson gson = new Gson();
        Map<String,Object> json_map = gson.fromJson(response,Map.class);
        String access_token = json_map.get("access_token")+"";

        factory = new DefaultUriBuilderFactory(SEARCH_URL);
        factory.setEncodingMode(DefaultUriBuilderFactory.EncodingMode.VALUES_ONLY);
        webClient = WebClient.builder()
                .uriBuilderFactory(factory)
                .baseUrl(SEARCH_URL)
                .build();

        // https://developer.spotify.com/documentation/web-api/reference/search
        // movie_year =  영화 년도
        response = webClient.get()
                .uri(uriBuilder -> {
                    try {
                        return uriBuilder
                                .queryParam("q", URLEncoder.encode("year:2021", StandardCharsets.UTF_8.toString()))
                                .queryParam("type", "album")  //  결과(Response) 받고 싶은 내용
                                .queryParam("market", "US")
                                .queryParam("limit", "10")
                                .queryParam("offset", "5")
                                .build();
                    } catch (UnsupportedEncodingException e) {
                        throw new RuntimeException(e);
                    }
                })
                .header("Authorization", "Bearer " + access_token)
                .retrieve()
                .bodyToMono(String.class)
                .block();

        List<Object> play_list = Collections.singletonList(response);
        Map<String,Object> search_result = new HashMap<>();
        search_result.put("play_list",play_list);

        MusicSearchVO vo = new MusicSearchVO();
        vo.setMusicName("TEST");
        vo.setMusicURL("TEST");
        musicSearchService.save(vo);

        return gson.toJson(search_result);
    }
}
