package com.qf.hua.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


/*
* 前后端不分离
* */
@Controller
public class JSPController {

    /*前缀+控制器返回的名称+后缀名*/
    @GetMapping("/index")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("hello","world");
        return "user";
    }

    @GetMapping("/index1")
    public ModelAndView index1(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username","admin");
        modelAndView.setViewName("user");
        return modelAndView;
    }
}
