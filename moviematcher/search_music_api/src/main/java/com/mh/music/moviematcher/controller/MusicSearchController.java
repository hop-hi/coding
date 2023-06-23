package com.mh.music.moviematcher.controller;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class MusicSearchController {

    @GetMapping("/welcome")
    public String hi(){
        return "Hellow world";
    }

    @GetMapping("/search")
    public String search(){

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

        List<String> play_list = Arrays.asList("All of Me","When we were young");
        Map<String,Object> search_result = new HashMap<>();
        search_result.put("play_list",play_list);
        Gson gson = new Gson();
        return gson.toJson(search_result);
    }
}
