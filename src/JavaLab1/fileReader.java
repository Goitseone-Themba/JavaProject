package JavaLab1;
//Goitseone Themba 21000539
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class fileReader {
    public static void main(String[] args) {

        //create a scanner to read file name from the user
        Scanner snatch = new Scanner(System.in);
        System.out.println("Enter file name");
        String fileName = snatch.nextLine();

        try {
            //create a buffered reader to read from the file specified by the user
            BufferedReader plant = new BufferedReader(new FileReader(fileName));

            //print the contents of the file
            String output;
            while((output = plant.readLine()) != null){
                System.out.println(output);
            }
            //close the buffered reader
            plant.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
