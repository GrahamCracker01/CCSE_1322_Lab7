//Class: CSE 1322L
//Section: J03
//Term: Spring 2023
//Name: Asher Graham

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //declarations
        Scanner scan = new Scanner(System.in);
        boolean boolStop = false;
        Calculator calc = new Calculator();
        do {

            //menu and get inputs
            System.out.print("\n0 - Exit\n1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division\nPlease Choose an Option: ");
            int intCalcOp = Integer.parseInt(scan.nextLine());
            if (intCalcOp < 0 || intCalcOp > 4) {
                System.out.println("Please input a valid option.");
            }
            else {
                if (intCalcOp == 0) {
                    return;
                }
                System.out.print("Please enter the first number ");
                float flt1 = Float.parseFloat(scan.nextLine());
                System.out.print("Please enter the second number ");
                float flt2 = Float.parseFloat(scan.nextLine());

                //operations
                switch (intCalcOp) {
                    case 1:
                        System.out.println(calc.add(flt1, flt2));
                        break;
                    case 2:
                        System.out.println(calc.subtract(flt1, flt2));
                        break;
                    case 3:
                        System.out.println(calc.multiply(flt1, flt2));
                        break;
                    case 4:
                        System.out.println(calc.divide(flt1, flt2));
                        break;
                    default:
                        System.out.println("Please enter a valid option.");
                }
            }

        }while (!boolStop);
    }
}
