package com.qf.hua.mvc.controller;

import com.qf.hua.mvc.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* 前后端不分离
* @RestController这一个就等于下面这两个相加
* @Controller+@ResponseBody
* */
@RestController
@RequestMapping("/user1")
public class ResponseController {

    /**
     * mapping 声明{变量}
     * 在参数中 使用@PathVariable注解，一般参数不能太多
     * 也可以使用?去传
     * @param id
     * @return
     */
    @GetMapping("/detail/{id}")
    public User detail(@PathVariable int id){
        System.out.println(id);
        return new User();
    }

    @GetMapping("/detail/{page}/{size}")
    public String detail(@PathVariable int page,@PathVariable int size){
        System.out.println(page);
        System.out.println(size);
        return "动态路径";
    }
}
