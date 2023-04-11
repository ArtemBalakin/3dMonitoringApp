package com.mycompany.klipperapp.foreign;

import com.mycompany.klipperapp.service.ServerResp;
import com.mycompany.klipperapp.service.dto.ServerInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ForeignServiceImpl {

    @Autowired
    ForeigService foreigService;

    public void get() {
        final Respons response = foreigService.getEcho("foo", "bar");
        System.out.println(response.getArgs().getBar());
    }

    public ServerResp serverInfo() {
        ServerResp responce = foreigService.getServerInfo();
        return responce;
    }
}
