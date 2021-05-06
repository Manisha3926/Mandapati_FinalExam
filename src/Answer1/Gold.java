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
public class Gold extends Jewellery {

    public Gold() {

    }

    @Override
    public String name() {
        return "Gold is a jewellery";
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 1: Manisha Mandapati");
        Jewellery j = new Gold();
        System.out.println("there are different types of jewelry" + "\n" + j.name());
    }

}
