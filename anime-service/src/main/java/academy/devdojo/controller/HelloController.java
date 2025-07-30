package academy.devdojo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value = "v1")
public class HelloController {

    @GetMapping(value = {"hi"})
    public String hi() {
        return "OMAE WA MOU SHINDE IRU";
    }

    ;
}
