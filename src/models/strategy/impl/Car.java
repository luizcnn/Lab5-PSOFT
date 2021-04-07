package models.strategy.impl;

import models.strategy.Transport;

public class Car extends Transport {
    private static final String NAME = "Carro";

    protected String calculateRoute(String origin, String destiny) {
        return String.format(PATTERN_OF_CALCULATED_ROUTE, NAME ,origin, destiny);
    }
}
