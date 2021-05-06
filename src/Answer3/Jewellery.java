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
public class Jewellery {

    private String jewelleryName;
    private int price;

    public Jewellery(String jewelleryName, int price) {
        this.jewelleryName = jewelleryName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name of the jewellery is " + jewelleryName + ", price of the jewellery " + price + ",";
    }

}
