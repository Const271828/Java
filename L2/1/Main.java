package ru.geekbrains.level2.lesson1Home;

public class Main {

    public static void main(String[] args) {

        Obstacle [] obstacles = new Obstacle[]{
            new Wall(1),
            new Track(800),
            new Wall(2),
            new Track(1000),
        };
        Competitor [] competitors = new Competitor[] {
            new Human(2,800, "John"),
            new Robot(1, 10000, "R2-D2"),
            new Cat(3, 200, "Murzik"),
            new Human(2, 700, "Bob"),
            new Robot(2, 1000, "C-3PO"),
            new Cat(2, 1000, "Barsik")
        };

        for (Obstacle obstacle:obstacles) {
            for (Competitor competitor:competitors){
                obstacle.didIt(competitor);
            }
        }
    }


}
