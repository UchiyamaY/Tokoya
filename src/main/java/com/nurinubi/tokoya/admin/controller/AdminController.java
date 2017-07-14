package com.nurinubi.tokoya.admin.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nurinubi.tokoya.admin.repository.AdminRepository;

import com.nurinubi.tokoya.admin.repository.AdminRepository;
import com.nurinubi.tokoya.sample.repository.SampleRepository;

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
public class AdminController {
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

	/** WriteService */
	@Autowired
<<<<<<< HEAD
	private AdminRepository adminRepository;
=======
	private AdminRepository AdminRepository;
>>>>>>> fe01d9d732c9bd127aada6e209fa50cedf823274
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView adminHome(Map<String, Object> cmdMap) throws Exception {
		ModelAndView mv = new ModelAndView("admin/admin");
		List<Map<String, Object>> result = adminRepository.getReservationListByStylist(cmdMap);
		mv.addObject("result", result);
		return mv;
	}
	/**
	 * スタイリスト追加画面：デフォルト
	 * @return
	 */
	@RequestMapping(value = "/admin/stylist/add", method = RequestMethod.GET)
	public String addStylist() {
		
		//表示するページ設定
		return "/admin/stylist/addStylist";
	}
	
	/**
	 * スタイリスト管理画面：デフォルト
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/admin/stylist/management", method = RequestMethod.GET)
<<<<<<< HEAD
	public String management() {
=======
	public String management(Model model) {
		logger.info("Stylistmanagement");
		
        model.addAttribute("result", AdminRepository.getStylistList());
		System.out.println(model);
		
		//表示するページ設定
		return "/admin/stylist/management";
	}
	/**
	 * スタイリスト管理画面：追加画面遷移
	 * @return
	 */
	@RequestMapping(value = "/stylistinsert", method = RequestMethod.GET, params = "stylistinsert")
	public String stylistinsert() {
		logger.info("addStylist");
		
		//表示するページ設定
		return "/admin/stylist/addStylist";
	}
	
	/**
	 * スタイリスト追加画面：管理画面遷移
	 * @return
	 */
	@RequestMapping(value = "/addstylistform", method = RequestMethod.GET, params = "cansel")
	public String stylistadd() {
		logger.info("addStylist");
>>>>>>> fe01d9d732c9bd127aada6e209fa50cedf823274
		
		//表示するページ設定
		return "/admin/stylist/management";
	}
}
