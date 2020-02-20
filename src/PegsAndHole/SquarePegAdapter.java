package PegsAndHole;

public class SquarePegAdapter implements Hole {
    SquarePeg theSquare;

    double radius;

    SquarePegAdapter(SquarePeg newSquarePeg){
        theSquare = newSquarePeg;
    }
    @Override
    public void setRadius(double radius) {

        theSquare.setWidth(radius  / (Math.sqrt(2) / 2));

    }



    @Override
    public double getRadius() {

        return theSquare.getWidth() * Math.sqrt(2) / 2;
    }
}
