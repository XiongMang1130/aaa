package com.team.u4project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TextController {
    @RequestMapping("getString")
    @ResponseBody
    public String getString(){
        System.out.println("欢迎来到测试控制器！");
        return "HelloWord!";
    }
}
