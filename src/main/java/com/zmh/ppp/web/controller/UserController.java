package com.zmh.ppp.web.controller;

import com.zmh.ppp.security.Msg;
import com.zmh.ppp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;


@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/")
    public String index1(Model model) {
        Msg msg = new Msg("测试标题", "测试内容", "额外信息，只对管理员显示");
        model.addAttribute("msg", msg);
        return "index";
    }

    @RequestMapping(value = "/index")
    public String index(Model model) {
        return "/index.html";
    }

    @RequestMapping("/temp")
    public String temp(Model model) {
        model.addAttribute("msg", "WEOLCOME FREEMAKER");
        model.addAttribute("list", userService.queryAll());
        return "temp";
    }

    @RequestMapping("/login")
    public String login(Model model, String username, String password) {
        if ("admin".equals(username) && "1".equals(password)) {
            model.addAttribute("msg", "登录成功");
            return "/temp";
        } else {
            model.addAttribute("msg", "登录错误");
            return "/temp";
        }
    }

    @RequestMapping("/list")
    @ResponseBody
    public Object list() {
        return userService.queryAll();
    }
}
