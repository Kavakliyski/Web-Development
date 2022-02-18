package com.example.SofiaKnightsWeb.Home;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model) {
//        model.addAttribute("appName", "sadknfasd");
        return "home_page";
    }

}
