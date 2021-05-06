/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Answer5;

/**
 *
 * @author Manisha Mandapati
 */
public class CircleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for question5: Manisha Mandapati");
        // TODO code application logic here
        ComparableCircle c1 = new ComparableCircle(4);

        ComparableCircle c2 = new ComparableCircle(8);

        if (c1.compareTo(c2) > 0) {
            System.out.println("Circle2 is greater");
        } else if (c1.compareTo(c2) < 0) {
            System.out.println("Circle1 is greater");
        } else {
            System.out.println("Area of two circle are equal");
        }

    }
}
