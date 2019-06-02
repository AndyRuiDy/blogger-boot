package com.zhush.bloggerboot.systems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhush
 * @Description:
 * @date 2019-06-02 11:04:56
 */
@Controller
public class SysUserInfoController {

    @GetMapping("/sysLogin")
    public String sysLogin(){
        return "redirect:main.html";
    }
}
