package models;

import models.strategy.Transport;
import models.strategy.impl.Bus;
import models.strategy.impl.Car;
import models.strategy.impl.Pedestrian;
import models.strategy.impl.Subway;

public class RouteManager {
    private Transport transport;

    public void showRoute(String origin, String destiny) {
        this.transport.showRoute(origin, destiny);
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public void selectTransport(int idDigit) {
        this.transport =  this.defineTypeOfTransport(idDigit);
    }

    private Transport defineTypeOfTransport(int idDigit) {
        switch (idDigit) {
            case 1: return new Pedestrian();
            case 2: return new Car();
            case 3: return new Bus();
            case 4: return new Subway();
            default: return null;
        }
    }


}
