package com.mycompany.klipperapp.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mycompany.klipperapp.service.dto.PrinterInfoDTO;
import com.mycompany.klipperapp.service.dto.ServerInfoDTO;
import lombok.Data;

@Data
public class PrinterResp {

    @JsonProperty("result")
    PrinterInfoDTO result;
}
