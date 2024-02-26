package ru.dmitriiladnov.PP_3_1_2_SpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.dmitriiladnov.PP_3_1_2_SpringBoot.model.User;
import ru.dmitriiladnov.PP_3_1_2_SpringBoot.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService userService;


    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping()
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.findAll());

        return "users/usersList";
    }

    @GetMapping("/show")
    public String show(@RequestParam("id") Long id, Model model) {
        model.addAttribute("user", userService.findById(id));
        return "users/showUser";
    }

//    @GetMapping("/new")
//    public String newUser(@ModelAttribute("user") User user) {
//        return "new";
//    }
//
//    @PostMapping()
//    public String create(@ModelAttribute("user") User user) {
//        userService.save(user);
//        return "redirect:/";
//    }
//
//    @PostMapping("/update")
//    public String update(@ModelAttribute("user") User user) {
//        userService.save(user);
//        return "redirect:/";
//    }
//
//    @GetMapping("/delete")
//    public String delete(@RequestParam("id") Long id) {
//        userService.deleteById(id);
//        return "redirect:/";
//    }
}
