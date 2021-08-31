package ua.com.alevel.data;

public class Sun extends SolarEntity {

    private Double mass = 1.99 * Math.pow(10, 30);
    private Double radius = 6.96 * Math.pow(10, 8);

    public Double getMass() {
        return mass;
    }

    public Double getRadius() {
        return radius;
    }
}
