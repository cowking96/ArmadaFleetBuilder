package com.Cowking.ArmadaFleetBuilder.Controller;

import com.Cowking.ArmadaFleetBuilder.Service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CardSearchController {

    @Autowired
    private CardService cardService;

}
