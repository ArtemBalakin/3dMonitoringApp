package com.mycompany.klipperapp.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class SensorDTO {

    String id;

    @JsonProperty("frienly_name")
    String friendlyName;

    String type;
    List<Long> values;
}
