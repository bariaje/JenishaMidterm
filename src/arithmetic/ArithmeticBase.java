/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * 
 */

public class ArithmeticBase {
    public double x, y;

    enum Operation {
        ADD, SUB, MUL, DIV
    }

    double calculate(double x, double y) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arithmetic operation to perform: ");
        Operation operation = Operation.valueOf(sc.next().toUpperCase());

        switch (operation) {
            case ADD:
                return x + y;
            case SUB:
                return x - y;
            case MUL:
                return x * y;
            case DIV:
                return x / y;
            default:
                throw new AssertionError("Unknown operation: " + operation);
        }
    }
}

   