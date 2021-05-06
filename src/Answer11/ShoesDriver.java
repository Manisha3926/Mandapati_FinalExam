/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Answer11;

/**
 *
 * @author Manisha Mandapati
 */
public class ShoesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 11: Manisha Mandapati");
        Shoes s1 = new Shoes("nike", 3, "white");
        //Created object for Shoes Class
        Shoes s2 = new Shoes("adidas", 4, "blue");
        //Created object for Shoes Class
        Shoes s3 = new Shoes("puma", 5, "Red");
        System.out.println("******************Equals Method******************");
        //comparing s1 and s2 objects attributes with equals method
        System.out.println(s1.equals(s2));
        //comparing s2 and s3 objects attributes with equals method
        System.out.println(s2.equals(s3));
        //comparing s3 and s1 objects attributes with equals method
        System.out.println(s3.equals(s1));
        System.out.println("******************HashCode Method******************");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }

}
