package ru.geekbrains.level2.lesson1Home.services;

import ru.geekbrains.level2.lesson1Home.interfaces.CatService;
import ru.geekbrains.level2.lesson1Home.models.*;

public class CatServiceImpl implements CatService {
    @Override
    public void overcome(Cat cat, Obstacle obstacle) {

        if (obstacle instanceof Track){
            if (!cat.isOnDistance()) {
                return;
            }
            if (cat.getRun() >= obstacle.getLength()) {
                System.out.println(cat.getName() + " ran the distance("
                        + obstacle.getLength() + "m)");
            } else {
                System.out.println(cat.getName() + " didn't finish!");
                cat.setOnDistance(false);
            }
        } else {
            if (!cat.isOnDistance()) {
                return;
            }
            if (cat.getJump() >= obstacle.getHeight()) {
                System.out.println(cat.getName() + " jump over the wall("
                        + obstacle.getHeight() + "m)");
            } else {
                System.out.println(cat.getName() + " didn't finish!");
                cat.setOnDistance(false);
            }
        }
    }
}
