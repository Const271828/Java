package ru.geekbrains.level2.lesson1Home.services;
import ru.geekbrains.level2.lesson1Home.interfaces.RobotService;
import ru.geekbrains.level2.lesson1Home.models.Obstacle;
import ru.geekbrains.level2.lesson1Home.models.Robot;
import ru.geekbrains.level2.lesson1Home.models.Track;

public class RobotServiceImpl implements RobotService {


    @Override
    public void overcome(Robot robot, Obstacle obstacle) {
        
        if (obstacle instanceof Track){
            if (!robot.isOnDistance()) {
                return;
            }
            if (robot.getRun() >= obstacle.getLength()) {
                System.out.println(robot.getName() + " ran the distance("
                        + obstacle.getLength() + "m)");
            } else {
                System.out.println(robot.getName() + " didn't finish!");
                robot.setOnDistance(false);
            }
        } else {
            if (!robot.isOnDistance()) {
                return;
            }
            if (robot.getJump() >= obstacle.getHeight()) {
                System.out.println(robot.getName() + " jump over the wall("
                        + obstacle.getHeight() + "m)");
            } else {
                System.out.println(robot.getName() + " didn't finish!");
                robot.setOnDistance(false);
            }
        }
    }
}
