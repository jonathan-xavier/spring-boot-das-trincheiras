package academy.devdojo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("v1/heroes")
public class HeroController {

    private static final List<String> HEREOS = new ArrayList<>(
            Arrays.asList("Guts", "zoro", "kakashi", "goku"));

    @GetMapping
    public List<String> listAllHeroes(){
        return HEREOS;
    }

    @GetMapping("filter")
    public List<String> listAllHeroesParam(@RequestParam(name = "username",
            required = false) final String username){
        HEREOS.add(username);
        return HEREOS;
    }

    @GetMapping("filter-list")
    public List<String> filterList(@RequestParam List<String> names){

        return HEREOS.stream().filter(names::contains).toList();
    }
}
