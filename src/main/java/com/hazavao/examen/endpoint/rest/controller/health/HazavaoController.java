package com.hazavao.examen.endpoint.rest.controller.health;

import com.hazavao.examen.service.OpenAiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HazavaoController {

    private final OpenAiService openAiService;

    public HazavaoController(OpenAiService openAiService) {
        this.openAiService = openAiService;
    }

    @GetMapping("/hazavao")
    public String hazavao(@RequestParam String teny) {
        return openAiService.defineInMalagasy(teny);
    }
}