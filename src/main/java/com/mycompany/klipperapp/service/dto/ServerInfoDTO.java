package com.mycompany.klipperapp.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

@Data
public class ServerInfoDTO {

    @JsonProperty("klippy_connected")
    boolean isKlippyConnect;

    @JsonProperty("klippy_state")
    String klippyState;

    List<String> components;

    @JsonProperty("failed_components")
    List<String> failedComponents;

    @JsonProperty("registered_directories")
    List<String> registeredDirectories;

    List<String> warnings;

    @JsonProperty("websocket_count")
    Long webSocketCount;

    @JsonProperty("moonraker_version")
    String moonrakerVersion;

    @JsonProperty("api_version")
    List<Long> apiVersion;

    @JsonProperty("api_version_string")
    String apiVersionString;
}
