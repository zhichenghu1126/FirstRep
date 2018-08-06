package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.modol.User;
import com.springmvc.service.UserService;

@Controller
//@RequestMapping("/vi")
public class ViewController {
	@RequestMapping("/vi")	
    public ModelAndView view(){
        //String path = request.getParameter("path") + "";
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/doLogin")
	public ModelAndView login(String account,String password){
		User login = null;
		try {
			login = userService.login(account, password);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ModelAndView mav = new ModelAndView();
		if(login!=null) {
			mav.setViewName("redirect:toPage?pageName=success");
		}else {
			mav.setViewName("redirect:toPage?pageName=fail");
		}
		
        return mav;
	}
	
	@RequestMapping("/doRegis")
	public ModelAndView regis(String account,String password){
		int regis = 0;
		try {
			regis = userService.regis(account, password);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ModelAndView mav = new ModelAndView();
		if(regis!=0) {
			mav.setViewName("redirect:toPage?pageName=regisok");
		}else {
			mav.setViewName("redirect:toPage?pageName=regisfail");
		}
		
        return mav;
	}
	
	@RequestMapping("toPage")
	public String toPage(String pageName) {
		return pageName;
	}
	
}
