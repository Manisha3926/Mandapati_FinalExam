/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Answer2;

/**
 *
 * @author Manisha Mandapati
 */
public class GeometricObject {

    private String gName;
    private int NumberOfsides;

    public GeometricObject(String gName, int sides) {
        this.gName = gName;
        this.NumberOfsides = sides;
    }

    public String getGName() {
        return gName;
    }

    public int getNumberOfSides() {
        return NumberOfsides;
    }

    @Override
    public String toString() {
        return "The geometric object is " + this.gName
                + " and " + this.getGName() + " is not colorable.";
    }
}
