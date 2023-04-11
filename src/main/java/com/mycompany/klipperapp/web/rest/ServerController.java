package com.mycompany.klipperapp.web.rest;

import com.mycompany.klipperapp.foreign.ForeignServiceImpl;
import com.mycompany.klipperapp.service.dto.ServerInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/server")
public class ServerController {

    @Autowired
    ForeignServiceImpl foreignService;

    @GetMapping(value = "/info")
    public ServerInfoDTO getServerInfo() {
        ServerInfoDTO serverInfoDTO = foreignService.serverInfo().getResult();
        return serverInfoDTO;
    }

    @GetMapping(value = "/temperatureStore")
    public void getTemperatureStore() {}

    @GetMapping(value = "sensors/list")
    public void getAllSensors() {}

    @GetMapping(value = "sensors/info")
    public void getAllSensors(@RequestParam("id") String sensorId) {}

    @PostMapping(value = "/restart")
    public void restarServer() {}
}
