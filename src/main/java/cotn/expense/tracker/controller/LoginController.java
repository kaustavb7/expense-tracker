package cotn.expense.tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author kaustavbasu
 * @Date 8/23/20
 * @Time 3:25 PM
 */
@Controller
public class LoginController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/")
    public String homePage(){
        return "home";
    }

    @GetMapping("/login")
    public String login()
    {
        return "login";
    }



}
