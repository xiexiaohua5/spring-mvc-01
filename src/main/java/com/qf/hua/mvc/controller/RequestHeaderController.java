package com.qf.hua.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class RequestHeaderController {
    /**
     * 请求头
     * @param token
     * @return
     */
    @GetMapping("h1")
    @ResponseBody
    public String test1(@RequestHeader String token){
        System.out.println(token);
        return "请求头传递参数";
    }

    /**
     * Cookie
     * @param um
     * @return
     */
    @GetMapping("h2")
    @ResponseBody
    public String test2(@CookieValue("UM_DISTINCTID") String um){
        System.out.println(um);
        return "请求头传递参数";
    }
}
