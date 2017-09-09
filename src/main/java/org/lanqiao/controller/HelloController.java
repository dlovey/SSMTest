package org.lanqiao.controller;

import org.lanqiao.bean.User;
import org.lanqiao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2017/9/1.
 */
@Controller//告诉spring这是一个controller
@RequestMapping("/test")//请求地址
public class HelloController {
    @Autowired
    private UserService userService;
    @RequestMapping("/hello.do")
    public ModelAndView hello(){
        List<User> userList=userService.getAllUser();
        ModelAndView modelAndView = new ModelAndView("show");
        modelAndView.addObject("users",userList);
        return modelAndView;
    }
    @RequestMapping("/test.do")
    public  String test(){
        //重定向处理
        /*return "redirect:/Hello.jsp";*/
        return "hello";
    }
    @RequestMapping("/forTest.do")
    public  String forwardTest(){
        //转发
        return "forward:/Hello.jsp";
    }
    @RequestMapping("/forwardTest.do")
    public ModelAndView forwardTest1(){
        Map map = new HashMap();
        map.put("name","yhy");
        return new ModelAndView("forward:/Hello.jsp",map);
    }
    @RequestMapping("/condition.do")
    public ModelAndView getUserCondition(User user){
        List<User> userList=userService.getUserCondition(user);
        ModelAndView modelAndView = new ModelAndView("show");
        modelAndView.addObject("users",userList);
        return modelAndView;
    }
    @RequestMapping("/reg.do")
    public  ModelAndView reg(User user){
        System.out.println(user.toString());
        //模型和视图的转换器
        ModelAndView modelAndView = new ModelAndView("reg");
        modelAndView.addObject("user",user);
        return modelAndView;
    }

   /* 1. 基本数据类型绑定 int*/
    @RequestMapping("/baseType.do")
    @ResponseBody      //该注解指的是将内容或对象作为 HTTP 响应正文返回
    public String basType(int id){
        return "id:"+id;
    }
}
