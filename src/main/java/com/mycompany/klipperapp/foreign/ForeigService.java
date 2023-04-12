package com.mycompany.klipperapp.foreign;

import com.mycompany.klipperapp.service.PrinterResp;
import com.mycompany.klipperapp.service.ServerResp;
import com.mycompany.klipperapp.service.dto.PrinterInfoDTO;
import com.mycompany.klipperapp.service.dto.ServerInfoDTO;
import com.mycompany.klipperapp.service.dto.TemperatureStoreRes;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "postman-echo", url = "192.168.1.111:7125")
public interface ForeigService {
    @GetMapping(value = "server/info")
    ServerResp getServerInfo();

    @GetMapping(value = "printer/info")
    PrinterResp getPrinterInfo();

    @GetMapping(value = "server/temperature_store")
    TemperatureStoreRes getTempStoreInf();

    @PostMapping("/printer/print/resume")
    void resume();

    @GetMapping("printer/objects/list")
    void getObjectsList();

    @PostMapping("printer/restart")
    void restart();

    @PostMapping("/printer/emergency_stop")
    void emergencyStop();

    @PostMapping("machine/update/klipper")
    void updateKlipper();

    @PostMapping("machine/update/moonraker")
    void updateMoonraker();

    @GetMapping("/server/sensors/list")
    void getAllSensors();

    @GetMapping("/server/sensors/info")
    void getSensorInfoById(@RequestParam("sensor") String id);

    @GetMapping("/server/restart")
    void restartServer();
}
