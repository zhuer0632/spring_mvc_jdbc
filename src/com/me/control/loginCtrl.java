package com.me.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("login")
@Controller
public class loginCtrl
{
	
	/**
	 * 在web.xml中配置的welcome文件不是index.jsp而是这个servlet
	 */
	@RequestMapping(value = "logins", method = RequestMethod.GET)
	public String login()
	{
		return "login";
	}
	
}
