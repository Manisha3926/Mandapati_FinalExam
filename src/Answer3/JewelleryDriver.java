/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Answer3;

/**
 *
 * @author Manisha Mandapati
 */
public class JewelleryDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answe to the question 3: Manisha Mandapati");
        int i = 24;
        System.out.println("the carats of the gold is " + 24);
        Jewellery j = new Jewellery("ring", 2000);
        System.out.println("we have different types of jewelleries");
        Gold g = new Gold(22, "braclet", 3000);
        j = g;
        g = (Gold) j;
        System.out.println(g);
    }

}
