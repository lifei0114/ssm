package com.lf.oa.controller;

import com.lf.oa.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;

@RequestMapping("main")
@Controller
public class Hello {

    @Autowired
    private TestService testService;

    @RequestMapping("hh")
    @ResponseBody
    public String getStr(){
        return testService.getStr();

    }

}
