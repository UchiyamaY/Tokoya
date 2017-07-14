package com.nurinubi.tokoya.board.domain;

<<<<<<< HEAD
/**
<!--
 * 
 * @ClassName : NoticeVO.java
=======
import java.util.Date;

/**
<!--
 * 
 * @ClassName : SampleVO.java
>>>>>>> 2d3f1391c99286b5475ec27e480a6edf6c078f86
 * @Description : 
 * @
 * @		修正日			修正者			修正内容
 * @ 	---------		---------		-------------------------------
<<<<<<< HEAD
 * @ 	2017. 7. 13.		李　多　浩			最初作成
 * 
 * @author 李　多　浩
=======
 * @ 	2017. 7. 13.		Kim			最初作成
 * 
 * @author Kim
>>>>>>> 2d3f1391c99286b5475ec27e480a6edf6c078f86
 * @since 2017
 * @version 0.1
 *
 *  Copyright (C) by NuriNubi All right reserved.
 * -->
 */

public class BoardVO {
	
<<<<<<< HEAD
	private String NoticeId;
	private String noticeDetail;
	

	public String getNoticeId() {
		return NoticeId;
	}

	public void setNoticeId(String noticeId) {
		this.NoticeId = noticeId;
	}

	public String getNoticeDetail() {
		return noticeDetail;
	}

	public void setNoticeDetail(String noticeDetail) {
		this.noticeDetail = noticeDetail;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
//		builder.append("SampleVO [userId=");
//		builder.append(userId);
//		builder.append(", userPassword=");
//		builder.append(userPassword);
//		builder.append(", userName=");
//		builder.append(userName);
//		builder.append(", userHuri=");
//		builder.append(userHuri);
//		builder.append(", userEmail=");
//		builder.append(userEmail);
//		builder.append(", userPhone=");
//		builder.append(userPhone);
//		builder.append(", getClass()=");
//		builder.append(getClass());
//		builder.append(", hashCode()=");
//		builder.append(hashCode());
//		builder.append(", toString()=");
//		builder.append(super.toString());
//		builder.append("]");
=======
	private int noticeId;
	private String noticeTitle;
	private String noticeBody;
	private Date registerDate;
	
	public int getNoticeId() {
		return noticeId;
	}

	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeBody() {
		return noticeBody;
	}

	public void setNoticeBody(String noticeBody) {
		this.noticeBody = noticeBody;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("boardVo [noticeId=");
		builder.append(noticeId);
		builder.append(", noticeTitle=");
		builder.append(noticeTitle);
		builder.append(", noticeBody=");
		builder.append(noticeBody);
		builder.append(", registerDate=");
		builder.append(registerDate);
>>>>>>> 2d3f1391c99286b5475ec27e480a6edf6c078f86
		return builder.toString();
	}

}
