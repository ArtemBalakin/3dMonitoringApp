package com.mycompany.klipperapp.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TemperatureStoreDTO {

    @JsonProperty("heater_bed")
    HeaterBedDTO heaterBedDTO;

    @JsonProperty("extruder")
    ExtruderDTO extruderDTO;

    @JsonProperty("temperature_fan my_fan")
    FanDTO fanDTO;

    @JsonProperty("temperature_sensor my_sensor")
    SensorDTO sensorDTO;
}
