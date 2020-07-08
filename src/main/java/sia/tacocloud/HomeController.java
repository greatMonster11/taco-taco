package sia.tacocloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // The controller
public class HomeController {
    @GetMapping("/") // Handler request from the root path /
    public String home() {
        return "home"; // Return the views name
    }

}