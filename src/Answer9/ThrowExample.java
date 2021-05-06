/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Answer9;

import java.util.Scanner;

/**
 *
 * @author Manisha Mandapati
 */
public class ThrowExample {

    static void studentAge(int studentAge) {
        if (studentAge < 12) {
            throw new ArithmeticException("Student is not eligible for registration");
        } else {
            System.out.println("welcome to the registration process!");
        }
    }

    public static void main(String[] args) {
        studentAge(22);
    }
}
