package com.tts.restclient.json;

import lombok.Data;

@Data
public class JokeValue {
    private int id;
    private String joke;
    private String[] categories;
}