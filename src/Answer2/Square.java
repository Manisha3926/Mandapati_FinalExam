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
public class Square extends GeometricObject implements Colorable {

    private final boolean colorable;
    private final double sLength;

    public Square(boolean colorable, double sLength, String gName, int numberOfSides) {
        super(gName, numberOfSides);
        this.sLength = sLength;
        this.colorable = colorable;
    }

    public boolean isColorable() {
        return colorable;
    }

    public double getsLength() {
        return sLength;
    }

    public double calcArea() {
        return Math.pow(sLength, 2);

    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

}
