package com.mondenelani.onlineStore.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{

    //Dymaic   added data display
    @RequestMapping("/")
    public String thyLeafTesting(Model model)
    {
        model.addAttribute("name"," i am a thyleaf Attribute");
        return "index";
    }

    //static added data display
//    @RequestMapping("/")
//    public String index()
//    {
//        return "index.html";
//    }
}
