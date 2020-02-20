package PegsAndHole;

public class Test {

    static boolean fits(double hole, double peg){
        if(hole == peg){
            System.out.println("its a fit");
            return true;
        }
        System.out.println("Find a new Peg");
        return false;

    }

    public static void main(String[] args){
        RoundPeg pegFit = new RoundPeg();
        pegFit.setRadius(5);
        RoundHole holeFit = new RoundHole();

        pegFit.setRadius(5);
        holeFit.setRadius(5);
        System.out.println("The radius of the peg is" + pegFit.getRadius() + '\n' + "The radius of the hole is " + holeFit.getRadius() + '\n');
        fits(holeFit.getRadius(),pegFit.getRadius());


        SquarePeg squarePegFit = new SquarePeg();

        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePegFit);

        squarePegAdapter.setRadius(5);
        System.out.println(squarePegAdapter.getRadius());
        fits(holeFit.getRadius(), squarePegAdapter.getRadius());





    }
}
