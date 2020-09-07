package ru.geekbrains.level2.lesson1Home.models;

public class Wall extends Obstacle {
    int height;

    public Wall() {
        this.height = 1 + (int)(Math.random() * 3);
    }

    public int getHeight() {
        return height;
    }


}
