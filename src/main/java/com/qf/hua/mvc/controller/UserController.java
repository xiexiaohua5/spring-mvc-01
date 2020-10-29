package com.qf.hua.mvc.controller;

import com.qf.hua.mvc.entity.User;
import com.qf.hua.mvc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/*
* 一个控制器 一般就是一个功能模块
* */
@Controller
@RequestMapping
public class UserController {
    @RequestMapping(value = "/list",method = {RequestMethod.GET})
    @ResponseBody
    public List<User> users(){
        System.out.println("method");
        return new ArrayList<>();
    }

    /*RequestMapping value是指定请求的实际地址 method是请求的方式*/
    @RequestMapping(value = "/info",params = "id>1")
    @ResponseBody
    public User user(int id){
        System.out.println("params");
        return new User();
    }

    /**
     * 只能接收json数据
     * @return
     */
    @RequestMapping(value = "/save",method = RequestMethod.POST,consumes = "application/json")
    public String save(){
        return "";
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST,produces = "image/png")
    @GetMapping("")
    public String accept(){
        return "";
    }
}
