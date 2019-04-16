/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadingInput;
import java.util.Scanner;
import java.io.IOException;
/**
 *
 * @author MUHAMMAD ABDULLAHI ABDULLAHI
 */
public class Triangle {
    public static void main(String[] args)throws IOException {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter side a: ");
        Double a = input.nextDouble();
        
        System.out.print("Enter side b: ");
        Double b = input.nextDouble();
        
        System.out.print("Enter side c: ");
        Double c = input.nextDouble();
        
        System.out.print("Enter height (h): ");
        Double h = input.nextDouble();
        Double half = 0.5;
        System.out.printf("Perimeter of triangle: %.2f\n", (a + b + c));
        System.out.printf("Area of triangle with sides a = %.2f, b = %.2f, and c = %.2f is: %.2f\n", a,b,c,(half * c * h));
        
        if(a > b && b > c) {
            System.out.printf("The longest side is a: %.2f\n", a);
            System.out.printf("The smallest side is c: %.2f\n",c);
            System.out.printf("Remainder is: %.2f\n", a/c);
        }else if(b > c && c > a) {
            System.out.printf("The longest side is b: %.2f\n", b);
            System.out.printf("The smallest side is a: %.2f\n",a);
            System.out.printf("Remainder is: %.2f\n", b/a);
        }else if(c > a && a > b) {
            System.out.printf("The longest side is c: %.2f\n", c);
            System.out.printf("The smallest side is c: %.2f\n",b);
            System.out.printf("Remainder is: %.2f\n", c/b);
        }else if(a > c && c > b) {
            System.out.printf("The longest side is a: %.2f\n", a);
            System.out.printf("The smallest side is c: %.2f\n",b);
            System.out.printf("Remainder is: %.2f\n", a/b);
        }else if(b > a && a > c) {
            System.out.printf("The longest side is b: %.2f\n", b);
            System.out.printf("The smallest side is a: %.2f\n",c);
            System.out.printf("Remainder is: %.2f\n", b/c);
        }else if(c > b && b > a) {
            System.out.printf("The longest side is c: %.2f\n", c);
            System.out.printf("The smallest side is c: %.2f\n",a);
            System.out.printf("Remainder is: %.2f\n", c/a);
        }
    }
}
