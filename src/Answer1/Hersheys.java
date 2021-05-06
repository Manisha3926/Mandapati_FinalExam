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
interface Chocolates {

    String flavor = "Sweet";

    void main();
}

public class Hersheys implements Chocolates {

    public void main() {
        System.out.println("Answer for question 1: Manisha Mandapati");
        System.out.println("taste of the chocolates is sweet");
    }

    public static void main(String[] args) {
        Chocolates C = new Hersheys();
        C.main();
        System.out.println("The taste of the chocolates are: Sweet");
    }
}
