package com.ismataga.qualifier;

import jakarta.enterprise.inject.Default;

@Default
public class Patron1 implements PatronInterFace {

    @Override
    public String surum(String data) {
        return "default data " + data;
    }
}
