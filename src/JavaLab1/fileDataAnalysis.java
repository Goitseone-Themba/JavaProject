package JavaLab1;
//Goitseone Themba 21000539
import java.io.*;
import java.util.ArrayList;

public class fileDataAnalysis {
    public static void main(String[] args) {

        try {
            //create a buffered reader
            BufferedReader plant = new BufferedReader(new FileReader("values.txt"));

            //create a dynamic array
            ArrayList <Integer> values = new ArrayList<>();

            //read from the files and store in the dynamic array
            String output;
            while((output = plant.readLine()) != null){
                values.add(Integer.valueOf(output));
            }
            plant.close();

            //find the largest number
            int largest = values.get(0);
            for(int i : values){
                if(i > largest){
                    largest = i;
                }
            }

            //find the smallest number
            int smallest = values.get(0);
            for(int i : values){
                if(i < smallest)    {
                    smallest = i;
                }
            }

            //find the sum and use it to calculate the average
            int sum = 0;
            for(int i : values) {
                sum += i;
            }
            int average = sum / values.toArray().length;

            BufferedWriter insert = new BufferedWriter(new FileWriter("solutions.txt"));
            insert.write("Goitseone Themba \n 21000539" + "\nLargest value: " + largest +
                    "\nSmallest value: " + smallest + "\nAverage: " + average);

            insert.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
