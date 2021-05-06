/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Answer12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Manisha Mandapati
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Employee> e1 = new ArrayList<>();
        Employee m1 = new Employee(123, "Manisha Mandapati", 5000);
        Employee m2 = new Employee(456, "likitha mata", 6000);
        Employee m3 = new Employee(789, "priyanka pyla", 2300);
        Employee m4 = new Employee(112, "chandu", 3000);
        Employee m5 = new Employee(345, "avinash", 8000);
        e1.add(m1);
        e1.add(m2);
        e1.add(m3);
        e1.add(m4);
        e1.add(m5);
        System.out.println("Employees of walmart: " + "\n" + "Before sorting:");
        print(e1);
        Collections.sort(e1);
        System.out.println("Sorting by Employee Id: ");
        print(e1);

        System.out.println("Sorting by Employee name: ");
        Collections.sort(e1, new Comparator<Employee>() {
            public int compare(Employee m1, Employee m2) {
                return m1.getEmpName().compareTo(m2.getEmpName());
            }
        });
        print(e1);
        System.out.println("Sorting by Employee salary: ");
        Collections.sort(e1, new Comparator<Employee>() {
            public int compare(Employee emp1, Employee emp2) {
                return Double.compare(emp1.getEmpSalary(), emp2.getEmpSalary());
            }

        });
        print(e1);
    }

    public static void print(List<Employee> l) {
        l.forEach(employee -> {
            System.out.println(employee);
        });

    }
}
