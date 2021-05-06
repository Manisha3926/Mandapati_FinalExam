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
public class MovieTicket extends MovieTheatre {

    private String movies;

    public MovieTicket(String name, int numberOfSeats, String movies) {
        super(name, numberOfSeats);
        this.movies = movies;
    }

    @Override
    public String toString() {
        return super.toString() + "name of the movie released in same theatre is " + movies;
    }

}
