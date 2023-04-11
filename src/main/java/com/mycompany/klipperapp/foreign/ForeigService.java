package com.mycompany.klipperapp.foreign;

import com.mycompany.klipperapp.service.ServerResp;
import com.mycompany.klipperapp.service.dto.ServerInfoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "postman-echo", url = "192.168.1.111:7125")
public interface ForeigService {
    @GetMapping(path = "/get", consumes = "application/json")
    Respons getEcho(@RequestParam("foo") String foo, @RequestParam("bar") String bar);

    @GetMapping(value = "server/info")
    ServerResp getServerInfo();
}
