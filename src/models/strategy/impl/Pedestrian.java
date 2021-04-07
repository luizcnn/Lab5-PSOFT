package models.strategy.impl;

import models.strategy.Transport;

public class Pedestrian extends Transport{
    private static final String NAME = "Pedestre";

    protected String calculateRoute(String origin, String destiny) {
        return String.format(PATTERN_OF_CALCULATED_ROUTE, NAME ,origin, destiny);
    }
}
