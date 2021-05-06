/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Answer3;

/**
 *
 * @author Manisha Mandapati
 */
public class MovieTicketDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for Question3: Manisha Mandapati");
        int m = (int) 8;
        System.out.println("rating of the Movie: " + m);
        MovieTheatre mt = new MovieTheatre("Alamo Drafthouse", 88);
        System.out.println("it is one of the best theatre");
        MovieTicket mt1 = new MovieTicket("Alamo Drafthouse", 88, "Avengers");
        mt = mt1;
        mt1 = (MovieTicket) mt;
        System.out.println(mt1);

    }
}
