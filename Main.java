package ru.geekbrains.level3.lesson1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*1st task */
        String[] fruits  = new String[] {"Orange", "Apple", "Lemon", "Mango", "Banana",
                "Grapes", "Cherry", "Peach", "Pear", "Kiwi"};
        changeFruits (fruits);
        /*2nd task*/
        ArrayList<String> fruitList = arrToList (fruits);
        System.out.println();
        System.out.println("ArrayList check:");
        for (int i = 0; i < fruitList.size(); i++) {
            System.out.print((i + 1) + "." + fruitList.get(i) + " ");
        }
    }

    private static ArrayList<String> arrToList(String[] arr) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(i, arr[i]);
        }
        return list;
    }

    private static void changeFruits(String[] arr) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        String change;
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + "." + arr[i] + " ");
        }
        System.out.println();
        do {
            System.out.println("Enter 1st fruit's number which you want to swap from 1 to " +
                    arr.length);
            k = sc.nextInt() - 1;
        } while (!(k >= 0 && k < arr.length));

        do {
            System.out.println("Enter other fruit's number which you want to swap from 1 to " +
                    arr.length);
            n = sc.nextInt() - 1;
        } while (!(n >= 0 && n < arr.length));
        if (n == k) {
            System.out.println("Nothing was swapped!");
        } else {
            change = arr[k];
            arr[k] = arr[n];
            arr[n] = change;
            System.out.println("You swapped " + arr[k] + " and " + arr[n] + "! Now list is ");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + "." + arr[i] + " ");
        }
    }
}
