package models.strategy;

public abstract class Transport {

     protected static final String PATTERN_OF_CALCULATED_ROUTE = "Calculando a rota de %s de %s para %s...";

     protected Transport() { }

     public void showRoute(String origin, String destiny) {
          System.out.println(this.calculateRoute(origin, destiny));
     }

     protected abstract String calculateRoute(String origin, String destiny);
}
