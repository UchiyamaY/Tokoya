package com.nurinubi.tokoya.board.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nurinubi.tokoya.board.repository.BoardRepository;

/**
* @Class Name : BoardController.java.java
* @Description :  BoardController.java Class
* @Modification Information
* @ 
* @	修正日			修正者		修正内容
* @ 	---------		---------		-------------------------------
* @ 	2017.07.12		Kim		最初作成
* 
* @author Kim
* @since 2017.07.12
* @version 0.1
*
*  Copyright (C) by NuriNubi All right reserved.
*/


@Controller
public class BoardController {
	
	@Autowired
	private BoardRepository boardRepository;

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	//お知らせのホーム画面
	@RequestMapping(value = "/board", method = RequestMethod.GET)
	public String board() throws Exception {
		
		return "/board/board";
	}
	
	//お知らせの作成画面
	@RequestMapping(value = "/board/write", method = RequestMethod.GET)
	public String write(Locale locale, Model model) throws Exception {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "/board/write";
	}
	
	
	@RequestMapping(value = "/board/view", method = RequestMethod.GET)
	public String board(Model model) {
		logger.info("BoardController");
		
        model.addAttribute("Detail", boardRepository.getNoticeDetail());
		System.out.println(model);
		return "/board/view";
	}
}