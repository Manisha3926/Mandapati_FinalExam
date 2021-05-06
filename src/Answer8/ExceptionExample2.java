/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Answer8;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Manisha Mandapati
 */
public class ExceptionExample2 {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        System.out.println("Answer for Question 8:  Manisha Mandapati");

        try {
            // TODO code application logic here
            Scanner s = new Scanner(new File("file.txt"));
        } catch (FileNotFoundException FOE) {
            System.out.println("example of File not exception");
        }

    }

}
