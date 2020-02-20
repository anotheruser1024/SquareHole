package PegsAndHole;

public class RoundHole implements Hole {
    private double radius;




    @Override
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }
}
