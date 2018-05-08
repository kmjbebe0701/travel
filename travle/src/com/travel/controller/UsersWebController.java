package com.travel.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.travel.model.Users;
import com.travel.service.UsersService;


@Controller
public class UsersWebController {
	
	@Autowired
	private UsersService usersService;
	
	public String list(Model model, HttpServletRequest req) 
	{
		List<Users> list=null;
		try {
			list=usersService.selectAll();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			model.addAttribute("error","server");
		}
		model.addAttribute("list",list);

		return "admin/users-list";
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.GET)		//로그인 페이지
	public String login() 
	{
		return "login";
	}

}
