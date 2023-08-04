package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.controller.bean.User;
import com.example.demo.service.UserService;

@Controller
public class LoginController {
	@Autowired
	UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String welcomePage(ModelMap model, @RequestParam String userid, @RequestParam String password) {
		boolean testFlag = false;
		if (!testFlag && userid.equals(userid) && password.equals(password)) {
			model.put("userid", userid);
			return "welcome";
		} else if (testFlag) {
			User user = userService.getUserByUserId(userid);
			if (user.getPassword().equals(password)) {
				model.put("userId", userid);
				return "welcome";
			}
		}
//		if (userid.equals("rosadiasthetempo@gmail.com") && password.equals("trial")) {
//			model.put("userid", userid);
//			return "welcome"; }
		model.put("errorMsg", "The user id or password was incorrect. Please try again.");
		return "login";
	}
}
