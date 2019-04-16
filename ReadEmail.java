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
public class ReadEmail {
    public static void main(String[] args)throws IOException {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter email address: ");
        String email = input.nextLine();
        
        System.out.printf("Username: %s\n", email.substring(0, email.indexOf("@")));
        System.out.printf("Domain Name: %s\n",email.substring(email.indexOf("@", 1), email.length()));
    }
}