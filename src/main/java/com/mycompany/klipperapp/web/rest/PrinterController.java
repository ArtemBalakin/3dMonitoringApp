package com.mycompany.klipperapp.web.rest;

import com.mycompany.klipperapp.foreign.ForeignServiceImpl;
import com.mycompany.klipperapp.service.dto.PrinterInfoDTO;
import com.mycompany.klipperapp.service.dto.ServerInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/printer")
public class PrinterController {

    @Autowired
    ForeignServiceImpl foreignService;

    @GetMapping(value = "/info")
    public ResponseEntity<PrinterInfoDTO> getServerInfo() {
        PrinterInfoDTO dto = foreignService.getPrinterInfo();
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @PostMapping(value = "/emergencyStop")
    public String stopPrinter() {
        foreignService.emergencyStop();
        return null;
    }

    @GetMapping(value = "/restart")
    public String restartPrinter() {
        foreignService.restart();
        return null;
    }

    @GetMapping(value = "/objectsList")
    public String getObjectsList() {
        foreignService.getObjectsList();
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
    @GetMapping(value = "/printResume")
    public String resumePrint() {
        foreignService.resume();
        return null;
    }
}
