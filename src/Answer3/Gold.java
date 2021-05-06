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
public class Gold extends Jewellery {

    private int carats;

    public Gold(int carats, String jewelleryName, int price) {
        super(jewelleryName, price);
        this.carats = carats;
    }

    @Override
    public String toString() {
        return super.toString() + "the carts for the gold is " + carats;
    }

}
