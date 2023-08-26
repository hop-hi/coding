package com.mh.music.moviematcher.service.impl;

import com.mh.music.moviematcher.repository.MusicSearchRepository;
import com.mh.music.moviematcher.service.MusicSearchService;
import com.mh.music.moviematcher.vo.MusicSearchVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicSearchServiceImpl implements MusicSearchService {

    @Autowired
    private MusicSearchRepository musicSearchRepository;

    @Override
    public void save(MusicSearchVO vo) {
        musicSearchRepository.save(vo);
    }
}
