package com.qf.hua.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.Source;

@Controller
public class RequestParamController {
    //大型的项目
    //不一样的编程语言，当命名规则不一样时
    @GetMapping("/t1")
    public String test1(@RequestParam(value = "user_name") String username){
        System.out.println(username);
        return "RequestParam的注解的使用";
    }

    @PostMapping(value = "/t2")
    /**
     * @RequestParam
     * @RequestParam(value = "user_name")在后端里面叫username，传过来的参数名字叫user_name
     * value当客户端给的参数跟方法不一样的时候可以使用
     * 属性required 默认true 表示必传参数
     * defaultValue 给参数赋默认值
     */
    public String test2(@RequestParam(value = "username", required = false) String name,
                        @RequestParam(required = false,defaultValue = "1") int page,
                        @RequestParam(required = false,defaultValue = "10") int size){
        System.out.println(name);
        System.out.println(page);
        System.out.println(size);
        return "RequestParam的注解的使用给默认值";
    }

    //@PostMapping有请求体  @GetMapping没有请求体
    /**
     * 传递参数不要使用map 尽量是对象
     * @return
     */
    @PostMapping("/t3")
    @ResponseBody
    public String test3(@RequestBody UserRequestParam param){
        System.out.println(param.toString());
        return "RequestParam的注解的使用";
    }

    /**
     *
     * @param param
     * @return
     */
    @PostMapping("/t4")
    @ResponseBody
    public String test4(@RequestBody UserRequestParam param){
        return "@RequestBody注解";
    }
}
