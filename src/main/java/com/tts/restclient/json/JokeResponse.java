package com.tts.restclient.json;

import lombok.Data;

@Data
public class JokeResponse {
    private String type;
    private JokeValue value;
}