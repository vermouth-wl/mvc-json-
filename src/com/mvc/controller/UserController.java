package com.mvc.controller;

import com.mvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Classname UserController
 * @Description TODO
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-05-01 15:24
 * @Version 1.0
 **/
@Controller
public class UserController {

    /* 创建请求首页方法 */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    /* 创建请求返回json格式数据方法 */
    // @ResponseBody可将返回数据转化为json格式
    @ResponseBody
    @RequestMapping(value = "/returnJson")
    public Collection<User> returnJson(){
        Map<String, User> userMap = new HashMap<String, User>();
        userMap.put("客户1", new User("王磊", "123456", 24, "重庆市南川区"));
        userMap.put("客户2", new User("苦艾酒", "vermouth", 29, "日本"));
        return userMap.values();
    }
}
