package com.mycompany.klipperapp.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mycompany.klipperapp.service.dto.ServerInfoDTO;
import java.util.List;
import lombok.Data;

@Data
public class ServerResp {

    @JsonProperty("result")
    ServerInfoDTO result;
}
