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
public class MovieTheatre {

    private String name;
    private int numberOfSeats;

    public MovieTheatre(String name, int numberOfSeats) {
        this.name = name;
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Name of the MovieTheatre is " + name + ", number of seats available are " + numberOfSeats + ",";
    }
}
