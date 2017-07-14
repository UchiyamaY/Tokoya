package com.nurinubi.tokoya.board;

import java.util.List;
<<<<<<< HEAD
=======
import java.util.Map;
>>>>>>> 2d3f1391c99286b5475ec27e480a6edf6c078f86

import org.apache.ibatis.session.SqlSession;

import com.nurinubi.tokoya.board.domain.BoardVO;
<<<<<<< HEAD
import com.nurinubi.tokoya.sample.domain.NoticeVO;
import com.nurinubi.tokoya.sample.domain.SampleVO;
import com.nurinubi.tokoya.sample.repository.SampleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardApplication implements SampleRepository {

	@Autowired
	private SqlSession sqlSession;
	public List<SampleVO> getUserList() {
		return this.sqlSession.selectList("getUserList");
	}
	
	@Override
	public List<NoticeVO> getNoticeList() {
		return this.sqlSession.selectList("getNoticeList");
	}
	
	public List<BoardVO> getNoticeDetail() {
		return this.sqlSession.selectList("getNoticeDetail");
	}
			
=======
import com.nurinubi.tokoya.board.repository.BoardRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

@Repository
public class BoardApplication implements BoardRepository {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<BoardVO> getBoardList() {
		return this.sqlSession.selectList("getBoardList");
	}
	public void insertBoard(Map<String, Object> map) {
		this.sqlSession.insert("addBoardList", map);
		}
>>>>>>> 2d3f1391c99286b5475ec27e480a6edf6c078f86
}