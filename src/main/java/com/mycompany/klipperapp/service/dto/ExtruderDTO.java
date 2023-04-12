package com.mycompany.klipperapp.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class ExtruderDTO {

    @JsonProperty("temperatures")
    List<Float> temperatures;

    @JsonProperty("targets")
    List<Long> targets;

    @JsonProperty("powers")
    List<Long> powers;
}
