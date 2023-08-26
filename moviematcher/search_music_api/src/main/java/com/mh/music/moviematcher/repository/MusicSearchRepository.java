package com.mh.music.moviematcher.repository;

import com.mh.music.moviematcher.vo.MusicSearchVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MusicSearchRepository {
    void save(MusicSearchVO vo);
}
