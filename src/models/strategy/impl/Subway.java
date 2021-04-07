package models.strategy.impl;

import models.strategy.Transport;

public class Subway extends Transport {

    private static final String NAME = "Metrô";

    protected String calculateRoute(String origin, String destiny) {
        return String.format(PATTERN_OF_CALCULATED_ROUTE, NAME ,origin, destiny);
    }
}
