package com.me.control;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.me.biz.TransTestBiz;

@Controller
@RequestMapping("TransCtrl")
public class TransCtrl
{

	@Autowired
	private TransTestBiz transTestBiz;

	@SuppressWarnings("unchecked")
	@RequestMapping("test00")
	public @ResponseBody
	Map test00()
	{
		Map map = new HashMap();
		try
		{
			transTestBiz.test00();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return map;
	}
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping("test01")
	public @ResponseBody
	Map test01()
	{
		Map map = new HashMap();
		try
		{
			transTestBiz.test01();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return map;
	}
	
	 


}
