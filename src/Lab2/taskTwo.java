package Lab2;
//21000539 Goitseone Themba

import java.util.ArrayList;

public class taskTwo {
    public static void main(String[] args) {

        int x = 0, y = 1, sum = 0, average, min = 0, max = 0;
        ArrayList<Integer> fibonacci = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            fibonacci.add(x);
            int bin = x + y;
            x = y;
            y = bin;
        }

        for (int i : fibonacci) {
            sum += i;
            if (i < min) min = i;
            if (i > max) max = i;
        }
        
        average = sum / 10;
        System.out.println("Sum : " + sum + "\nAverage : " + average + "\nMin : " + min + "\nMax : " + max);

    }
}
