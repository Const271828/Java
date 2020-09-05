package ru.geekbrains.level2.lesson1Home;

public class Track implements Obstacle{
    int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public void didIt(Competitor competitor) {
        competitor.run(length);
    }
}
