package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Array<T> {
    Object[] array;
    int amount;

    public Array(int amount) {
        this.amount = amount;
        this.array = new Object[this.amount];
    }

    public Array(T[] array) {
        this.amount = array.length;
        this.array = new Object[this.amount];
        for (int i = 0; i < amount; i++) this.array[i] = array[i];
    }

    public void ArrayFilling() throws IOException {
        Scanner scanner = new Scanner(System.in);
        array = new String[amount];
        for (int i = 0; i < amount; i++) {
            System.out.println("Fill the array with numbers:");
            array[i] = scanner.next();
        }
    }

    public void ArrayRandom() {
        array = new Integer[amount];
        for (int i = 0; i < amount; i++) {
            int rand = (int)(Math.random() * 100);
            array[i] = Integer.valueOf(rand);
        }
    }

    public void Show(){
        System.out.print("[ ");
        for (Object i : array) System.out.print(i + " ");
        System.out.println("]");
    }

    public String Maximum() {
        String maximum = array[0].toString();
        for (int i = 1; i<amount; i++) {
            String s = array[i].toString();
            if (s.compareTo(maximum) > 0) maximum = s;
        }
        return maximum;
    }

    public String Minimum() {
        String minimum = array[0].toString();
        for (int i = 1; i < amount; i++) {
            String s = array[i].toString();
            if (s.compareTo(minimum) < 0) minimum = s;
        }
        return minimum;
    }

    public float AVG() {
        int summa = 0;
        for (int i = 1; i < amount; i++) summa += (Integer)array[i];
        return summa / amount;
    }

    public void SortAscending() {
        for(int i = amount-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++) {
                String s1 = array[j].toString();
                String s2 = array[j + 1].toString();
                if (s1.compareTo(s2) > 0) {
                    T temp = (T) array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void SortDescending() {
        for (int i = amount - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                String s1 = array[j].toString();
                String s2 = array[j + 1].toString();
                if (s2.compareTo(s1) > 0) {
                    T temp = (T) array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
