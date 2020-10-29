package com.qf.hua.mvc.controller;

import com.qf.hua.mvc.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/*
* 如何接收参数
* 1.接收基本类型的参数
* 2.对象（简单对象 复杂对象）
* 3.map 数组 集合（list）
* 4.日期
* */
@Controller
public class BaseParamsController {

    /*xxx/test1?username=111*/
    /*基本类型参数*/
    @GetMapping("test1")
    @ResponseBody
    public String test1(String username,int id){
        System.out.println(username);
        System.out.println(id);
        return username;
    }

    @GetMapping("test2")
    @ResponseBody
    public String test2(UserDto userDto){
        System.out.println(userDto);
        return userDto.getUsername();
    }


     /** json数据 复杂对象(嵌套对象建议使用json格式的数据上传)
     * @param userDto
     * @return*/

    @GetMapping("test3")
    @ResponseBody
    public String test3(UserDto userDto){
        System.out.println(userDto);
        System.out.println(userDto.getAddress().getCity());
        return "username";
    }

    @GetMapping("test4")
    @ResponseBody
    public String test4(int[] ids){
        System.out.println(ids);
        return "ids";
    }

    @GetMapping("test5")
    @ResponseBody
    public String test5(Map<String,String> map){
        System.out.println(map.toString());
        return "map";
    }


     /**
      * list必须配合@RequestParms注解使用
     * 或者把他放进实体对象中
     * @param userDto
     * @return*/

    @GetMapping("test6")
    @ResponseBody
    public String test6(UserDto userDto){
        System.out.println(userDto.getList().toString());
        return "map";
    }


    @GetMapping("test7")
    @ResponseBody
    public String test7(HttpServletRequest request,
                        HttpServletResponse response,
                        HttpSession session,
                        Model model,
                        ModelMap modelMap){
        System.out.println(request.toString());
        System.out.println(response.toString());
        System.out.println(model.toString());
        System.out.println(modelMap.toString());
        return "map";
    }
}
