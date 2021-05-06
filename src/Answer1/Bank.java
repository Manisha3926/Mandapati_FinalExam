/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Answer1;

/**
 *
 * @author Manisha Mandapati
 */
public interface Bank {

    float rateOfInterest();
}

class BankOfBaroda implements Bank {

    public float rateOfInterest() {
        return 8.9f;
    }

}

class AxisBank implements Bank {

    public float rateOfInterest() {
        return 9.2f;
    }
}

class BankEmployee {

    public static void main(String[] args) {
        System.out.println("Answer for question 1: Manisha Mandapati");
        Bank b = new BankOfBaroda();

        System.out.println("RateOfIntrest: " + b.rateOfInterest());
    }
}
