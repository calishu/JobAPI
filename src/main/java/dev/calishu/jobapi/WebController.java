package dev.calishu.jobapi;

import dev.calishu.jobapi.database.management.TitleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
    @Autowired
    TitleRepo titleRepo;

    @GetMapping("/apply")
    public String applyPage(@RequestParam Integer id, Model model) {
        titleRepo.findById(id).ifPresentOrElse(
                title -> model.addAttribute("titleData", title),
                () -> model.addAttribute("titleData", null)
        );
        return "apply";
    }
}