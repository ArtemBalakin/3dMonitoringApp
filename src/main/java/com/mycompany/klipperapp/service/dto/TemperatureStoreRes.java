package com.mycompany.klipperapp.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TemperatureStoreRes {

    @JsonProperty("result")
    TemperatureStoreDTO res;
}
