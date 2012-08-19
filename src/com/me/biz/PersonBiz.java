package com.me.biz;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;

import com.me.domain.VOPerson;

@Controller
public class PersonBiz
{
	@Autowired
	private JdbcTemplate dao;

	public List<VOPerson> listPerons()
	{
		List<VOPerson> list=new ArrayList<VOPerson>();
		list = dao.queryForList("select * from t_person", VOPerson.class);
		return list;
	}

	public VOPerson getPerson()
	{
		
		VOPerson vo=new VOPerson();
		System.out.println(dao);
		
		vo.setUserName("zhang");
		return vo;
		
	}

}
