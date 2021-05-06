/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Answer10;

/**
 *
 * @author Manisha Mandapati
 */
public class InfiniteRecursion {

    static String m = "xyz";

    static void mymain() {
        System.out.println("Infinite recursion is the non terminating execution of block of code");
        mymain();
    }

    public static void main(String[] args) {
        System.out.println("Answer to the question 10: Manisha Mandapati");
        mymain();
    }

}
