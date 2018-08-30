package pl.malykriszo.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.malykriszo.blog.forms.LoginForm;
import pl.malykriszo.blog.services.NotificationService;
import pl.malykriszo.blog.services.UserService;

import javax.validation.Valid;

/**
 * pl.malykriszo.blog.controllers Created by MałyKriszo on 2018-08-30.
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private NotificationService notificationService;

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public String loginPage(@Valid LoginForm loginForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            notificationService.addErrorMessage("Proszę wypełnić formularz poprawnie!");
            return "user/login";
        }
        if (!userService.authenticate(loginForm.getUsername(),loginForm.getPassword())) {
            notificationService.addErrorMessage("Zły Login!");
            return "user/login";
        }
        notificationService.addInfoMessage("Logowanie udane!");
        return "redirect:/";
    }

}
