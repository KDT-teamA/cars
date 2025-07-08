package com.example.cars.Constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Flatform {
    ON_Line("online"), OFF_Line("offline");

    private final String description;
}