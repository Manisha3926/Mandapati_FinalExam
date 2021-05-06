/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Answer6;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Manisha Mandapati
 */
public class CheckedExceptions {

    public static void main(String args[]) throws IOException {
        System.out.println("Answer for question6 :Manisha Mandapati");
        FileInputStream f1 = null;
        f1 = new FileInputStream("c:/myfile.txt");
        int m;

        while ((m = f1.read()) != -1) {
            System.out.print((char) m);
        }
        f1.close();
    }
}
