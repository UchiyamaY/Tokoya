package com.nurinubi.tokoya.board.repository;

import java.util.List;
<<<<<<< HEAD
=======
import java.util.Map;
>>>>>>> 2d3f1391c99286b5475ec27e480a6edf6c078f86

import org.apache.ibatis.annotations.Mapper;

import com.nurinubi.tokoya.board.domain.BoardVO;
<<<<<<< HEAD
import com.nurinubi.tokoya.sample.domain.SampleVO;

@Mapper
public interface BoardRepository {
	
	List<SampleVO> getUserList();
	
	List<BoardVO> getNoticeDetail();
=======

@Mapper
public interface BoardRepository {
	List<BoardVO> getBoardList();
	
	void insertBoard(Map<String, Object> map) throws Exception;
>>>>>>> 2d3f1391c99286b5475ec27e480a6edf6c078f86
}
