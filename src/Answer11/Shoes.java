/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Answer11;

import java.util.Objects;

/**
 *
 * @author Manisha Mandapati
 */
public class Shoes {

    /**
     * declared the variable names
     */
    private String brandName;
    private int ID;
    private String colour;

    /**
     * wriiten the constructor
     *
     * @param brandName
     * @param ID
     * @param colour
     */
    public Shoes(String brandName, int ID, String colour) {
        this.brandName = brandName;
        this.ID = ID;
        this.colour = colour;
    }

    /**
     * it returns the brandName of type String
     *
     * @return brandName
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * it returns the ID of type int
     *
     * @return ID
     */
    public int getID() {
        return ID;
    }

    /**
     * it returns the color of type String
     *
     * @return color
     */
    public String getColour() {
        return colour;
    }

    /**
     * it returns the integer value
     *
     * @return hash
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.brandName);
        hash = 83 * hash + this.ID;
        hash = 83 * hash + Objects.hashCode(this.colour);
        return hash;
    }

    /**
     *
     * Based on the conditions given, it returns the boolean value.
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Shoes other = (Shoes) obj;
        if (this.ID == other.ID) {
            return true;
        }
        if (!Objects.equals(this.brandName, other.brandName)) {
            return false;
        }
        if (!Objects.equals(this.colour, other.colour)) {
            return false;
        }
        return true;
    }

    /**
     * it returns the toString method
     *
     * @return toString
     */
    @Override
    public String toString() {
        return "Shoes{" + "brandName=" + brandName + ", ID=" + ID + ", colour=" + colour + '}';
    }

}
