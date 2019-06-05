package com.Cowking.ArmadaFleetBuilder.Controller;

import com.Cowking.ArmadaFleetBuilder.Service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnitSearchController {

    @Autowired
    private UnitService unitService;

}
