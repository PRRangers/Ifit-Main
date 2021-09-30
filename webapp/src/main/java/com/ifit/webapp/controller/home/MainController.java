package com.ifit.webapp.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping("/checkHealth")
    public String checkHealth(HttpServletRequest request, Model model){
        String str = "inside controller";
        return "/main/checkHealth";
    }
}
