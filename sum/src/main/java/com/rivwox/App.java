package com.rivwox;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");

        if (sc.hasNextLine()) {                         //check if the valid datatype was entered.
            String name = sc.nextLine();
            System.out.println("Hello " + name);
        }

        System.out.println();

        System.out.println("Enter a Integer number");

        if (sc.hasNextInt()) {                         //check if the valid datatype was entered.
            Integer naum = sc.nextInt();
            System.out.println("Entered Number " + naum);
        }
        else{
            System.out.println("Incorrect Value");
        }

        System.out.println( "Hello World!" );
    }
}
