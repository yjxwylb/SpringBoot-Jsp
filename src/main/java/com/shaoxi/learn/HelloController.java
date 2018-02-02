package com.shaoxi.learn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author XYJ
 * @类描述:
 * @Date:Created in 2018/1/12 10:34
 * @Version:
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "index";
    }
}
