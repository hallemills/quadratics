package org.LickingHeights;

public class Main {

    public static void main(String[] args) {

        //todo declare variables a,b,c,discriminate, axisOfSymmetry,parabolaFacing,x, y
        double a,b,c,discriminant,axisOfSymmetry,x,y;
        String parabolaFacing;
        //todo initialize manually
        a=5;
        b=3;
        c=1;
        //todo do calculations
        axisOfSymmetry = -b/(2*a);
        discriminant = (b*b)-4*(a*c);
        if(discriminant >0) {
            System.out.println("There are two real solutions");
        }
        else if(discriminant == 0) {
            System.out.println("There is one real solution");
        }
        else{
            System.out.println("There are NO real solutions");
        }
        //todo print results
        System.out.println("Axis of symmetry: "+axisOfSymmetry);
        System.out.println("Discriminant: "+discriminant);
        //todo not in code check results


        //todo initialize scanner and redo the initialized area

        //todo double check results




































    }
}
