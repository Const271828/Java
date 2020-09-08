package ru.geekbrains.level2.lesson3_1;

import java.util.ArrayList;

public class Entry {

    String surname;
    String phoneNumber;

    public Entry() {
    }

    public Entry(String surname, String phoneNumber) {
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public static void get(String s, ArrayList<Entry> pb) {
        for (Entry e: pb) {
            if (e.surname.equals(s)){
                System.out.println(e.surname + " " + e.phoneNumber);
            }
        }
    }


}
