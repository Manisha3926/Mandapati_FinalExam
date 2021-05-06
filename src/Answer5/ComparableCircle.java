/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Answer5;

/**
 *
 * @author Manisha Mandapati
 */
public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    private double radius;

    public ComparableCircle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return getPi() * radius * radius;
    }

    public double getPi() {
        return Math.PI;
    }

    @Override
    public String toString() {
        return "ComparableCircle{" + "radius=" + radius + '}';
    }

    @Override
    public int compareTo(ComparableCircle CC) {
        return Double.valueOf(this.getArea()).compareTo(CC.getArea());
    }

}
