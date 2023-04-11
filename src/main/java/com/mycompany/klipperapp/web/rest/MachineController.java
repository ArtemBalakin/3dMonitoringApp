package com.mycompany.klipperapp.web.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/machine")
public class MachineController {

    @PostMapping("/update/klipper")
    public void updateKlipper() {}

    @PostMapping("/update/moonraker")
    public void updateMoonraker() {}
}
