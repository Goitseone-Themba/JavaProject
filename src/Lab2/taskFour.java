package Lab2;

import java.util.Scanner;
public class taskFour {
    public static String pally(String in)    {

        StringBuilder string = new StringBuilder();
        string.append(in);
        string.reverse();

        if(in.equals(String.valueOf(string)))   return in + " is a palindrome";
        return in + " is not a palindrome";
    }
    public static void main(String[] args) {
        Scanner snatch = new Scanner(System.in);

        System.out.println("Enter a string to check if it's a palindrome");
        String input = snatch.nextLine();

        System.out.println(pally(input));
    }
}
