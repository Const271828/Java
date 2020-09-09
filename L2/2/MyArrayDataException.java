package ru.geekbrains.level2.lesson2Home;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException (String message, int i, int j) {
        super(message + "[" + i + "][" + j + "]");
    }
}
