package Lab2;
//21000539 Goitseone Themba

import java.util.Scanner;

public class taskOne {
    public static void main(String[] args) {
        Scanner snatch = new Scanner(System.in);

        System.out.println("How many numbers do you want to add together?");
        int size = snatch.nextInt();

        int[] numbers = new int[size];

        for(int i = 0; i < size; i++)    {
            System.out.println("Enter number " + (i+1));
            numbers[i] = snatch.nextInt();
        }

        int sum = 0;
        for(int i : numbers)    {
            sum += i;
        }

        System.out.println("The sum is : " + sum);
    }
}
