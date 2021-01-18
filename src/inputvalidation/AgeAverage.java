package inputvalidation;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AgeAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> ages = new ArrayList<Integer>();

        for(int i = 0; i < 10; ++i)
        {
            int finished = 0;
            while(finished == 0)
            {
                System.out.println("Enter age " + (i+1));
                try {
                    int age = scanner.nextInt();
                    ages.add(age);
                    finished = 1;
                } catch (InputMismatchException e) {
                    System.out.println("Please enter integers only.");
                    scanner.next();
                }
            }
        }

        double total = 0;

        for (double number : ages) {
            total = total + number;
        }

        double average = total / ages.size();

        System.out.println("The average age is " + average);
    }
}
