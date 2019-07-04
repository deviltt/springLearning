package com.tt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class HandlerDemo {
    @RequestMapping("modelAndView")
    public ModelAndView demo(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("name", "Tom");
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("model")
    public String model(Model model){
        model.addAttribute("name", "Jerry");
        return "index";
    }

    @RequestMapping("map")
    public String map(Map<String, String> map){
        map.put("name", "Kitty");
        return "index";
    }
}
