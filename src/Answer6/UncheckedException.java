/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Answer6;

/**
 *
 * @author Manisha Mandapati
 */
public class UncheckedException {

    public static void main(String args[]) {
        try {
            int ar[] = {2, 4, 6, 8, 10};
            System.out.println(ar[9]);
        } catch (ArrayIndexOutOfBoundsException m) {
            System.out.println("The index doesnot exist");
        }
    }
}
