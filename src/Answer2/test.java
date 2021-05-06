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
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer to the question2: Manisha Mandapati");
        GeometricObject[] gArray = new GeometricObject[5];
        Square Obj1 = new Square(false, 9, "Square1", 4);
        Square Obj2 = new Square(false, 6, "Square2", 4);
        GeometricObject Obj3 = new Square(true, 3, "Square3", 4);
        GeometricObject Obj4 = new Square(true, 8.5, "Square4", 4);
        GeometricObject Obj5 = new Square(false, 9, "Square5", 4);
        gArray[0] = Obj4;
        gArray[1] = Obj1;
        gArray[2] = Obj2;
        gArray[3] = Obj5;
        gArray[4] = Obj3;

        for (GeometricObject g1 : gArray) {
            Square s1 = (Square) (g1);
            if (s1.isColorable()) {
                s1.howToColor();
                System.out.println("The Area of " + s1.getGName() + " is " + Math.round(s1.calcArea() * 100) / 100.0);
            } else {
                System.out.println(g1);

            }
        }

    }

}
