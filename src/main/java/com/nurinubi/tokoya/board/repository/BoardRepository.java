package com.nurinubi.tokoya.board.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.nurinubi.tokoya.board.domain.BoardVO;
import com.nurinubi.tokoya.sample.domain.SampleVO;

@Mapper
public interface BoardRepository {
	
	List<SampleVO> getUserList();
	
	List<BoardVO> getNoticeDetail();
}
