/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Answer7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Manisha Mandapati
 */
public class RandomIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int size = 100;
        Random r1 = new Random();
        Scanner s1 = new Scanner(System.in);
        int[] ar = new int[size];
        for (int i = 0; i < size; i++) {
            ar[i] = 1 + r1.nextInt(100);

        }
        System.out.print("Enter the value of index: ");
        int index = s1.nextInt();
        try {
            int value = ar[index];
            System.out.println("value of index" + index + " is " + value);

        } catch (ArrayIndexOutOfBoundsException m) {
            System.out.println("Out of Bounds");
        }
    }

}
