/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Answer1;

/**
 *
 * @author Manisha Mandapati
 */
public class Maybelline extends CosmeticBrands {

    public Maybelline() {

    }

    @Override
    public String name() {
        return "Maybelline is name of the CosmeticBrand";
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question1: Manisha Mandapati");
        CosmeticBrands CB = new Maybelline();
        System.out.println("There are different types of CosmeticBrands" + "\n" + CB.name());
    }

}
