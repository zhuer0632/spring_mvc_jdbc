package com.me.biz;


import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import net.sourceforge.jtds.jdbc.DateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import com.me.domain.VOPerson;
import com.me.ut.DateTimeUT;
import com.me.ut.StringUT;


@Controller
public class PersonBiz
{
    @Autowired
    private JdbcTemplate dao;


    public List<VOPerson> listPerons()
    {
        List<VOPerson> list = new ArrayList<VOPerson>();
        list = dao.queryForList("select * from t_person", VOPerson.class);
        return list;
    }


    public VOPerson getPerson()
    {

        VOPerson vo = new VOPerson();
        System.out.println(dao);

        vo.setUserName("zhang");
        return vo;

    }

    
    @Transactional
    public void addperson()
    {
        String id = StringUT.getUUID();
        Timestamp time=DateTimeUT.getNowstamp();
        String insertSql = "insert into t_person(ID,birthday,age,userName,gender) values('"
                + id + "','"+time+"',22,'zhang',0)";
        dao.execute(insertSql);
        
        insertSql = "insert into t_person(ID,birthday,age,userName,gender) values('"
            + id + "','"+time+"',22,'zhang',false)";
        dao.execute(insertSql);
        StringUT.print(insertSql);
    }

}
