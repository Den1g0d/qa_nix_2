package ua.com.alevel.data;

public class Earth extends SolarEntity {

    private Double mass = 5.97 * Math.pow(10, 24);
    private Double radius = 6.37 * Math.pow(10, 6);

    public Double getMass() {
        return mass;
    }

    public Double getRadius() {
        return radius;
    }
}
