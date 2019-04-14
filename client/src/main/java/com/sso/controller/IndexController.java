package com.sso.controller;

import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

/**
 * @author zengweicheng@qipeipu.com
 * @date 2019/4/11 17:42
 * @since 1.0.0
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/securedPage")
    public String securedPage(OAuth2Authentication authentication) {
        System.out.println(authentication);
        return "securedPage";
    }


    @RequestMapping("/test")
    public String testGit() {
        System.out.println("hello");
        System.out.println("one");
        System.out.println("two");
        System.out.println("three");
        System.out.println("four");
        System.out.println("five");
        System.out.println("six");
        System.out.println("seven");
        System.out.println("eight");

        return "test";
    }
}
