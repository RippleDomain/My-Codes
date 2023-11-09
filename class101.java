/**
 * @author CS-101 Student MFD
 */

/*This is a program that calculates the area of 
 * a circle for a given radius value.
 */


public class class101 {
    public static void main (String[] args){
        // The radius of the circle
        int radius = 3;
        // The area of the cicrcle
        double area = 0.0;
        // The PI constant
        final double PI = 3.14;

        /*
         * THIS
         * IS
         * A
         * MULTI
         * LINE
         * COMMENT
         */

        area = PI * radius * radius;

        System.out.println("Area of the circle is:" + area);

        radius = 2 * radius;
        area = PI * radius * radius;

                System.out.println("Area of the new circle is:" + area);

                int totalArea = (int)area;

                System.out.println(totalArea);

    }
}
