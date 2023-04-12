package com.mycompany.klipperapp.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class SensorDTO {

    String id;

    @JsonProperty("friendly_name")
    String friendlyName;

    String type;
    List<Long> values;

    @JsonProperty("temperatures")
    List<Float> temperatures;
}
