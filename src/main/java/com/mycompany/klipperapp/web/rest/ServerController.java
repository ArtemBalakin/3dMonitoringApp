package com.mycompany.klipperapp.web.rest;

import com.mycompany.klipperapp.foreign.ForeignServiceImpl;
import com.mycompany.klipperapp.service.dto.ServerInfoDTO;
import com.mycompany.klipperapp.service.dto.TemperatureStoreDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/server")
public class ServerController {

    @Autowired
    ForeignServiceImpl foreignService;

    @GetMapping(value = "/info")
    public ResponseEntity<ServerInfoDTO> getServerInfo() {
        ServerInfoDTO serverInfoDTO = foreignService.serverInfo().getResult();
        return new ResponseEntity<>(serverInfoDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/temperatureStore")
    public ResponseEntity<TemperatureStoreDTO> getTemperatureStore() {
        return new ResponseEntity<>(foreignService.getTempStoreInf(), HttpStatus.OK);
    }

    @GetMapping(value = "sensors/list")
    public void getAllSensors() {
        foreignService.getAllSensors();
    }

    @GetMapping(value = "sensors/info")
    public void getAllSensors(@RequestParam("id") String sensorId) {
        foreignService.getSensorInfoById(sensorId);
    }

    @PostMapping(value = "/restart")
    public void restarServer() {
        foreignService.restartServer();
    }
}
