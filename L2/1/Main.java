package ru.geekbrains.level2.lesson1Home;

import ru.geekbrains.level2.lesson1Home.models.Obstacle;
import ru.geekbrains.level2.lesson1Home.models.*;
import ru.geekbrains.level2.lesson1Home.services.CatServiceImpl;
import ru.geekbrains.level2.lesson1Home.services.HumanServiceImpl;
import ru.geekbrains.level2.lesson1Home.services.RobotServiceImpl;

public class Main {

    public static void main(String[] args) {

        RobotServiceImpl rsi = new RobotServiceImpl();
        HumanServiceImpl hsi = new HumanServiceImpl();
        CatServiceImpl csi = new CatServiceImpl();

        Obstacle[] obstacles = new Obstacle[]{
            new Wall(), new Track(), new Wall(), new Track(),
        };

        Robot[] robotTeam = new Robot[]{
                new Robot(0,10000,"R2-D2"),
                new Robot (2,1000, "C-3PO")
        };

        Human[] humanTeam = new Human[]{
                new Human(2,800,"John"),
                new Human (2,1500, "Bob")
        };

        Cat[] catTeam = new Cat[]{
                new Cat (3, 600, "Murzik"),
                new Cat (4, 400, "Barsik")
        };


        System.out.println("Robots run:");
        for (Robot rbt:robotTeam) {
            for (Obstacle obs:obstacles){
                    rsi.overcome(rbt, obs);
            }
        }
        System.out.println("Cats run:");
        for (Cat catT:catTeam) {
            for (Obstacle obs:obstacles){
                csi.overcome(catT, obs);
            }
        }
        System.out.println("Humans run:");
        for (Human humanT:humanTeam) {
            for (Obstacle obs:obstacles){
                hsi.overcome(humanT, obs);
            }
        }
        
    }


}
