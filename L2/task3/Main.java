package ru.geekbrains.level2.lesson3_1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String [] words = new String []{
            "one", "one", "two", "three", "four", "five",
                "two", "three", "four", "five", "two",
                "three", "four", "five", "five", "two",
                "six", "six", "seven", "eight", "nine"
        };

        Set<String> setUniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println(setUniqueWords);
        ArrayList<String> list = new ArrayList<>(Arrays.asList(words));
        System.out.println(list);

        String word;
        while (!list.isEmpty()) {
            word = list.get(0); // присваиваем значение первого элемента
            int n = 0;
            Iterator<String> wordIterator = list.iterator(); //каждый раз создаем новый итератор
            while(wordIterator.hasNext()) {
                String nextWord = wordIterator.next();
                if (nextWord.equals(word)) {
                    wordIterator.remove();
                    n++;
                }
            }
            System.out.println(word + " occurs " + n + " times");
        }
        System.out.println(list);

        /*=================== 2nd task ==========================*/

        ArrayList<Entry> phoneBook = new ArrayList<>();

        phoneBook.add(new Entry("Petrov", "1332"));
        phoneBook.add(new Entry("Ivanov", "1333"));
        phoneBook.add(new Entry("Ivanov", "1334"));
        phoneBook.add(new Entry("Solviev", "1335"));
        phoneBook.add(new Entry("Ivanov", "1336"));
        phoneBook.add(new Entry("Sidorov", "1337"));

        Entry entry = new Entry();
        // как можно вызывать метод без создания объекта класса?
        entry.get("Ivanov", phoneBook);

    }
}
