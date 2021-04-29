package com.mg.matgdrs.controller;

import com.mg.matgdrs.entity.User;
import com.mg.matgdrs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/view")
@Controller
public class ViewController {

    @Autowired
    private UserService UserService;

    @GetMapping("/view")
    public String view(Model model) {
        model.addAttribute("users", UserService.getUserDAOList());
        model.addAttribute("newUsers", new User());
        return "view";
    }

    /**@GetMapping("/view/{id}")
    public String viewById(@PathVariable String id, Model model) {
        model.addAttribute("user", UserService.getUserDAOList(id));
        return "view-id";
    }**/
}