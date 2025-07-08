package com.example.cars.Constant;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Flatform {
    ON_Line("online"), OFF_Line("offline");

    private final String description;
}