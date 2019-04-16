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
public class ClosedBox {
    public static void main(String[] args)throws IOException {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter length (cm): ");
        Double length = input.nextDouble();
        
        System.out.print("Enter width (cm): ");
        Double width = input.nextDouble();
        
        System.out.print("Enter height (cm): ");
        Double heigth = input.nextDouble();
        
        System.out.printf("Volume = %.2f cm3\n", (length * width * heigth));
        System.out.printf("Surface Area = %.2f cm2\n", (2*(heigth * width ) + 2*(heigth * length) + 2*(width * length)));
        
    }
}
