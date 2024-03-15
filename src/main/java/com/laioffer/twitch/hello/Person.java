package com.laioffer.twitch.hello;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Person(
        String name,
        String company,
        @JsonProperty("home_address") Address homeAdrress,
        @JsonProperty("favorite_book") Book favortiteBook
) {
}
