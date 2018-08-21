package pl.malykriszo.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * pl.malykriszo.blog.controllers Created by MałyKriszo on 2018-08-21.
 */

@Controller
public class BlogControllers {

    @RequestMapping("/")
        public String index() {
            return "index";
    }

}
