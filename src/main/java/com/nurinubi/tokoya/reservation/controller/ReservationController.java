package com.nurinubi.tokoya.reservation.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
* @Class Name : AdminController.java.java
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
public class ReservationController {
	private static final Logger logger = LoggerFactory.getLogger(ReservationController.class);

	/** WriteService */
	
	@RequestMapping(value = "/reservation/check", method = RequestMethod.GET)
	public String check(Locale locale, Model model) throws Exception {
		
		return "/reservation/check";
	}
	
	@RequestMapping(value = "/reservation/history", method = RequestMethod.GET)
	public String history() {
		logger.info("Welcome home! The client locale is {}.");
		
		//表示するページ設定
		return "/reservation/history";
	}
}
