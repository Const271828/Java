package ru.geekbrains.level2.lesson2Home;

public class Main {
    public static void main(String[] args) {

        String [][] arr = {
                {"1","1","1","1"},
                {"1","M","1","1"},
                {"1","1","1","1","1"},
               // {"1","1","1"}
        };
        Array array = new Array();
        try {
            array.getArr(arr);
        } catch (MyArraySizeException exSize){
            System.err.print(exSize);
        } catch (MyArrayDataException exData){
            System.err.print(exData);
        }

    }
}
