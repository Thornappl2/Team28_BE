package com.devcard.devcard.card.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class walletListController {

    @GetMapping("walletList")
    public String walletList() {
        return "walletList";
    }
}