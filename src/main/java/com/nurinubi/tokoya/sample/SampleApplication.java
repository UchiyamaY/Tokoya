package com.nurinubi.tokoya.sample;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.nurinubi.tokoya.sample.domain.NoticeVO;
import com.nurinubi.tokoya.sample.domain.SampleVO;
import com.nurinubi.tokoya.sample.repository.SampleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SampleApplication implements SampleRepository {

	@Autowired
	private SqlSession sqlSession;
	public List<SampleVO> getUserList() {
		return this.sqlSession.selectList("getUserList");
	}
	
	@Override
	public List<NoticeVO> getNoticeList() {
		return this.sqlSession.selectList("getNoticeList");
	}
		
}