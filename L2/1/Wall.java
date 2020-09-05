package ru.geekbrains.level2.lesson1Home;

public class Wall implements Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void didIt(Competitor competitor) {
        competitor.jump(height);
    }
}
