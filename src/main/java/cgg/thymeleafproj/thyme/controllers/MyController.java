package cgg.thymeleafproj.thyme.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import cgg.thymeleafproj.thyme.entities.LoginObj;
import jakarta.validation.Valid;

@Controller
public class MyController {

    @GetMapping("/about")
    public String about(Model m) {

        System.out.println("ABOUT HANDLER.....");
        m.addAttribute("name", "dinz");
        m.addAttribute("date", new Date());
        return "about";

    }

    @GetMapping("/loop")
    public String iterateHandlerList(Model m) {

        System.out.println("in iterate.....");
        List<String> of = List.of("din", "putin", "nihil");

        m.addAttribute("names", "dine");
        List<String> l1 = List.of("1");
        m.addAttribute("list", l1);

        return "iter";

    }

    @GetMapping("/condition")
    public String condition(Model m) {

        m.addAttribute("gender", "m");

        return "condition";

    }

    // handler for including fragments
    @GetMapping("/service")
    public String service(Model m) {

        m.addAttribute("name", "jhonwick");
        m.addAttribute("place", "nyc");
        return "service";
    }

    @GetMapping("/contact")
    public String contactHandler() {

        return "contact";

    }

    @GetMapping("/aboutt")
    public String abouthander() {

        return "newabout";

    }

    @GetMapping("/form")
    public String openofrm(Model m) {
        m.addAttribute("logindata", new LoginObj());

        return "form";

    }

    @PostMapping("/process")
    public String processform(@Valid @ModelAttribute("loginData") LoginObj l1, BindingResult b) {

        if (b.hasErrors()) {
            System.out.println(b);
            return "form";
        }
        System.out.println(l1);

        return "success";

    }

}
