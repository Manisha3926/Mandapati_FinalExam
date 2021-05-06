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
public class Factorial {

    static int factorial(int f) {
        if (f != 0) {
            return f * factorial(f - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Answer for question 10: Manisha Mandapati");
        int value = 6, output;
        output = factorial(value);
        System.out.println(value + " factorial = " + output);
    }
}
