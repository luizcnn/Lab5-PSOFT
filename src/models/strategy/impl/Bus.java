package models.strategy.impl;

import models.strategy.Transport;

public class Bus extends Transport {

    private static final String NAME = "Ônibus";

    protected String calculateRoute(String origin, String destiny) {
        return String.format(PATTERN_OF_CALCULATED_ROUTE, NAME ,origin, destiny);
    }

}
