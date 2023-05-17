package ru.kyzma.syf.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RightechData {
    public String name;
    public String sensor_action;
    public String sensor_rele;
    public String time_action;
    public String time_rele;
    public String result;
}
