package ua.com.alevel.service;

public class PlanetCalculation implements Planet {

    private final Double gravitationalConstant = 6.67 * Math.pow(10, -11);

    @Override
    public Double acceleration(Double mass, Double radius) {
        Double diameter = Math.pow(radius,2);
        Double acceleration = (mass / diameter) * gravitationalConstant;
        return acceleration;
    }
}
