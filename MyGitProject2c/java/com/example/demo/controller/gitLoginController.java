package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class gitLoginController {

    @RequestMapping(path = "/gitpralogin", method = RequestMethod.GET)
    public String showLoginForm() {
        return "gitlogin";
    }

    @RequestMapping(path = "/gitpralogin", method = RequestMethod.POST)
    public String processLogin(Model model, @RequestParam String id, @RequestParam String ps) {
        // Dummy authentication check
        if ("gitlogin".equals(id) && "gitpw".equals(ps)) {
            // Authentication successful, perform appropriate actions (e.g., display login success message)
            model.addAttribute("message", "ログイン成功");
            return "gititemedit"; // Redirect to gititemedit.html on successful login
        } else {
            // Authentication failed, display error message
            model.addAttribute("error", "IDまたはパスワードが正しくありません");
            return "gitlogin";
        }
    }
}
