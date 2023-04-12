package com.mycompany.klipperapp.foreign;

import com.mycompany.klipperapp.service.ServerResp;
import com.mycompany.klipperapp.service.dto.PrinterInfoDTO;
import com.mycompany.klipperapp.service.dto.ServerInfoDTO;
import com.mycompany.klipperapp.service.dto.TemperatureStoreDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class ForeignServiceImpl {

    @Autowired
    ForeigService foreigService;

    public ServerResp serverInfo() {
        ServerResp responce = foreigService.getServerInfo();
        return responce;
    }

    public PrinterInfoDTO getPrinterInfo() {
        return foreigService.getPrinterInfo().getResult();
    }

    public TemperatureStoreDTO getTempStoreInf() {
        return foreigService.getTempStoreInf().getRes();
    }

    public void resume() {
        foreigService.resume();
    }

    public void getObjectsList() {
        foreigService.getObjectsList();
    }

    public void restart() {
        foreigService.restart();
    }

    public void emergencyStop() {
        foreigService.emergencyStop();
    }

    void updateKlipper() {
        foreigService.updateKlipper();
    }

    void updateMoonraker() {
        foreigService.updateMoonraker();
    }

    public void getAllSensors() {
        foreigService.getAllSensors();
    }

    public void getSensorInfoById(String id) {
        foreigService.getSensorInfoById(id);
    }

    public void restartServer() {
        foreigService.restartServer();
    }
}
