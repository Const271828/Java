package ru.geekbrains.level2.lesson1Home.services;
import ru.geekbrains.level2.lesson1Home.interfaces.HumanService;
import ru.geekbrains.level2.lesson1Home.models.*;

public class HumanServiceImpl implements HumanService {

    @Override
    public void overcome(Human human, Obstacle obstacle) {

        if (obstacle instanceof Track){
            if (!human.isOnDistance()) {
                return;
            }
            if (human.getRun() >= obstacle.getLength()) {
                System.out.println(human.getName() + " ran the distance("
                        + obstacle.getLength() + "m)");
            } else {
                System.out.println(human.getName() + " didn't finish!");
                human.setOnDistance(false);
            }
        } else {
            if (!human.isOnDistance()) {
                return;
            }
            if (human.getJump() >= obstacle.getHeight()) {
                System.out.println(human.getName() + " jump over the wall("
                        + obstacle.getHeight() + "m)");
            } else {
                System.out.println(human.getName() + " didn't finish!");
                human.setOnDistance(false);
            }
        }
    }
}
