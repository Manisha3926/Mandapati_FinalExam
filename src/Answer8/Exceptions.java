/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Answer8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Manisha Mandapati
 */
public class Exceptions {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Answer to the question 8: Manisha Mandapati");
        try {
            Scanner s1 = new Scanner(new File("file.txt"));
            int num1 = 66;
            int num2 = 0;
            System.out.println("Result: " + num1 / num2);
        } catch (Throwable e1) {
            System.out.println("value cannot divide by 0");

        }
    }
}
