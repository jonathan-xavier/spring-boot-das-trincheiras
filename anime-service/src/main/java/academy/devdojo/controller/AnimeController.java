package academy.devdojo.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/animes")
@Slf4j
public class AnimeController {

    @GetMapping
    public List<String> animes() {
//        List<String> animes = new ArrayList<>();
//        animes.add("Dragon ball");
//        animes.add("Naruto");
//        animes.add("Jojo");
//        animes.add("Death note");
//        log.info(Thread.currentThread().getName());
        return List.of("Ninja kamui", "kaiju no 8");
    }
}
