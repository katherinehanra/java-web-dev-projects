package org.launchcode;
import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's calculate the area of a rectangle. What is the rectangle's length?");
        int length = Integer.parseInt(input.nextLine());
        System.out.println("What is the rectangle's width?");
        int width = Integer.parseInt(input.nextLine());
        System.out.println("The area of this rectangle is " + length*width + ".");
    }
}
