package com.mycompany.klipperapp.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
"state": "ready",
    "state_message": "Printer is ready",
    "hostname": "my-pi-hostname",
    "software_version": "v0.9.1-302-g900c7396",
    "cpu_info": "4 core ARMv7 Processor rev 4 (v7l)",
    "klipper_path": "/home/pi/klipper",
    "python_path": "/home/pi/klippy-env/bin/python",
    "log_file": "/tmp/klippy.log",
    "config_file": "/home/pi/printer.cfg",
 */
public class PrinterInfoDTO {

    @JsonProperty("state")
    String state;

    @JsonProperty("state_message")
    String stateMes;

    @JsonProperty("hostname")
    String hostname;

    @JsonProperty("software_version")
    String softVersion;

    @JsonProperty("cpu_info")
    String cpuInfo;

    @JsonProperty("klipper_path")
    String klipperPath;

    @JsonProperty("python_path")
    String pythonPath;

    @JsonProperty("log_file")
    String logFile;

    @JsonProperty("config_file")
    String confFile;
}
