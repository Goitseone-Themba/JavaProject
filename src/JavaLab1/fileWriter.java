package JavaLab1;
//Goitseone Themba 21000539
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileWriter {
    public static void main(String[] args) {
        //create a scanner to real file name and text data from the user
        Scanner snatch = new Scanner(System.in);

        System.out.println("Enter fileName");
        String fileName = snatch.nextLine();

        System.out.println("What would you like to write to the file?");
        String textData = snatch.nextLine();

        try {
            //create a buffered writer to write the user's text data to their specified file
            BufferedWriter plant = new BufferedWriter(new FileWriter(fileName, true));
            plant.write(textData);

            //close the buffered writer
            plant.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
