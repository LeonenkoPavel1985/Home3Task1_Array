package org.example;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Your array numbers:");
        Array numbers = new Array<Integer>(new Integer[]{7, 8, 4, 2, 6});
        numbers.Show();
        Array random = new Array<Integer>(5);
        //random.ArrayFilling();
        System.out.println("Your array random numbers:");
        random.ArrayRandom();
        random.Show();
        System.out.println("Maximum number in array: " + random.Maximum());
        System.out.println("Minimum number in array: " + random.Minimum());
        System.out.println("AVG number in array: " + random.AVG());

        System.out.println("The array is sorted in ascending order:");
        random.SortAscending();
        random.Show();

        System.out.println("The array is sorted in descending order:");
        random.SortDescending();
        random.Show();

        System.out.println("-------------------------------------------------------");

        System.out.println("Your string array:");
        Array string1 = new Array<String>(new String[]{"cvnbbn", "uhjhj56mn", "rthh"});
        string1.Show();
        Array string2 = new Array<String>(5);
        string2.ArrayFilling();
        string2.Show();
        System.out.println("Maximum number in array: " + string2.Maximum());
        System.out.println("Minimum number in array: " + string2.Minimum());

        System.out.println("The array is sorted in ascending order:");
        string2.SortAscending();
        string2.Show();
        System.out.println("The array is sorted in descending order:");
        string2.SortDescending();
        string2.Show();
    }
}