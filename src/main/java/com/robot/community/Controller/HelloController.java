package com.robot.community.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name="shabia") String bianl, Model moxing){
        moxing.addAttribute("shabia", bianl);
        return "hello";
    }

}
