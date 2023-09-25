package Lab2;
//21000539 Goitseone Themba

import java.util.Scanner;

public class taskThree {
    public static void main(String[] args) {
        Scanner snatch = new Scanner(System.in);

        System.out.println("Select an operation you would like to perform?  " + "\n1.Add two words" + "\n2.insert a string" + "\n3.Replace a character");
        String answer = snatch.nextLine();

        switch (answer) {
            case "1":
                System.out.println("To add two words.....\n Enter the first word.");
                String initial = snatch.nextLine();

                System.out.println("Enter the second word.");
                String added = snatch.nextLine();

                initial = initial.concat(added);
                System.out.println("The result of adding your two words is: " + initial);
                break;
            case    "2":
                System.out.println("what word do you want to insert another word to?");
                String wordOne = snatch.nextLine();

                System.out.println("On which character would you like to the a new e.g 4 ");
                int index = snatch.nextInt();
                snatch.nextLine();

                System.out.println("what character do you want to insert there?");
                String insert = snatch.nextLine();

                StringBuffer result = new StringBuffer(wordOne);

                result.insert(index , insert);
                System.out.printf("The new word is: " + result);
                break;
            case   "3":
                System.out.println("Enter a word ");
                String word = snatch.nextLine();

                System.out.println("What part or the word do you want to replace");
                String replace = snatch.nextLine();

                System.out.println("What would you like to replace it with?");
                String replacement = snatch.nextLine();

                String newWord = word.replace(replace,replacement);
                System.out.println("The new word is: " + newWord);
                break;
            default:
                break;
        }
    }
}