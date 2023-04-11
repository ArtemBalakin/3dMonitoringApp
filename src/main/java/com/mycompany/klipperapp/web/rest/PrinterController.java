package com.mycompany.klipperapp.web.rest;

import com.mycompany.klipperapp.foreign.ForeignServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/printer")
public class PrinterController {

    @Autowired
    ForeignServiceImpl foreignService;

    @GetMapping(value = "/info")
    public String getServerInfo() {
        foreignService.get();
        return null;
    }

    @PostMapping(value = "/printer/emergencyStop")
    public String stopPrinter() {
        foreignService.get();
        return null;
    }

    @PostMapping(value = "/printer/emergencyRestart")
    public String restartPrinter() {
        foreignService.get();
        return null;
    }

    @GetMapping(value = "/objects/list")
    public String getObjectsList() {
        foreignService.get();
        return null;
    }

    /*
    GET /printer/objects/query?gcode_move&toolhead&extruder=target,temperature

{
    "eventtime": 578243.57824499,
    "status": {
        "gcode_move": {
            "absolute_coordinates": true,
            "absolute_extrude": true,
            "extrude_factor": 1,
            "gcode_position": [0, 0, 0, 0],
            "homing_origin": [0, 0, 0, 0],
            "position": [0, 0, 0, 0],
            "speed": 1500,
            "speed_factor": 1,
        },
        "toolhead": {
            "position": [0, 0, 0, 0],
            "status": "Ready"
        }
    }
}
     */
    @PostMapping(value = "/printer/print/resume")
    public String resumePrint() {
        foreignService.get();
        return null;
    }
}
