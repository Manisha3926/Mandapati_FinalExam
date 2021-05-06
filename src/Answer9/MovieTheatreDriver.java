/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Answer9;

/**
 *
 * @author Manisha Mandapati
 */
public class MovieTheatreDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer to the question 9: Manisha Mandapati");
        try {
            MovieTheatre m = new MovieTheatre();

            //int totalNumberOfSeats=50;
            int totalNumberOfSeats = 500;

            if (totalNumberOfSeats > 105) {
                throw new IllegalArgumentException("Number of seats should not be lesser than 105");
            } else {
                System.out.println(m.seatnumber(105));
            }
        } catch (ArithmeticException AE) {
            System.out.println(AE.getMessage());
        } catch (RuntimeException AE) {
            System.out.println(AE.getMessage());
        }
    }

}
