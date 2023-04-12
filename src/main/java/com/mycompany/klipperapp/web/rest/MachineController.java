package com.mycompany.klipperapp.web.rest;

import com.mycompany.klipperapp.foreign.ForeigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/machine")
public class MachineController {

    @Autowired
    ForeigService foreigService;

    @PostMapping("/update/klipper")
    public void updateKlipper() {
        foreigService.updateKlipper();
    }

    @PostMapping("/update/moonraker")
    public void updateMoonraker() {
        foreigService.updateMoonraker();
    }
}
