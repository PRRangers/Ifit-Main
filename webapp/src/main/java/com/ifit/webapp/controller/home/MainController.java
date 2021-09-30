package com.ifit.webapp.controller.home;

import com.ifit.webapp.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/main")
public class MainController {

    @Autowired
    UserDao userDao;

    @RequestMapping("/checkhealth")
    public String checkHealth(HttpServletRequest request, Model model) {
        return "check health success !";
    }
}
