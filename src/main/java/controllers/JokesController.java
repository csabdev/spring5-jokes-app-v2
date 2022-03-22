package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import services.JokesService;
import services.JokesServiceImpl;

@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", ""})
    public String getJoke(Model model) {
        String joke = jokesService.getJoke();
        model.addAttribute("joke", joke);
        System.out.println(joke);

        return "joke";
    }
}
