package com.me.control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.me.biz.PersonBiz;


@Controller
@RequestMapping("person")
public class person
{

    @Autowired
    private PersonBiz personBiz;
    

    public ModelAndView addperson()
    {
        ModelAndView mod = new ModelAndView();
        try
        {
            personBiz.addperson();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        mod.setViewName("index");
        return mod;
    }

}