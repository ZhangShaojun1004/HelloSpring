package com.yuntao.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
//@RequestMapping(value = "/hello", method = RequestMethod.GET)
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("msg", "Spring MVC Hello World");
        model.addAttribute("name", "hello");
        return "hello";
    }
    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String printHello1(ModelMap model) {
        model.addAttribute("msg", "Spring MVC Hello World");
        model.addAttribute("name", "hello1");
        return "hello";
    }


    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public String printHello2(ModelMap model) {
        model.addAttribute("msg", "Spring MVC Hello World");
        model.addAttribute("name", "hello2");
        return "hello";
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.GET)
    public String printHello3(ModelMap model) {
        model.addAttribute("msg", "Spring MVC Hello World");
        model.addAttribute("name", "hello3");
        return "hello";
    }

}
