package ru.geekbrains.level2.lesson1Home.models;

public class Track extends Obstacle {

    int length;

    public Track() {
        length = (int)(100 + Math.random() * 1000);
    }

    public int getLength() {
        return length;
    }

}
