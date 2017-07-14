package com.nurinubi.tokoya.board.domain;

/**
<!--
 * 
 * @ClassName : NoticeVO.java
 * @Description : 
 * @
 * @		修正日			修正者			修正内容
 * @ 	---------		---------		-------------------------------
 * @ 	2017. 7. 13.		李　多　浩			最初作成
 * 
 * @author 李　多　浩
 * @since 2017
 * @version 0.1
 *
 *  Copyright (C) by NuriNubi All right reserved.
 * -->
 */

public class BoardVO {
	
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
		return builder.toString();
	}

}
