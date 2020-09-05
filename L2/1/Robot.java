package ru.geekbrains.level2.lesson1Home;

public class Robot implements Competitor {

    int jump;
    int run;
    String name;
    boolean onDistance = true;

    public Robot(int jump, int run, String name) {
        this.jump = jump;
        this.run = run;
        this.name = name;
    }

    @Override
    public void run(int dist) {
        if (!onDistance) {
            return;
        }
        if (run >= dist) {
            System.out.println(name + " ran the distance");
        } else {
            System.out.println(name + " didn't finish!");
            onDistance = false;
        }

    }

    @Override
    public void jump(int height) {
        if (!onDistance) {
            return;
        }
        if (jump >= height) {
            System.out.println(name + " jumped over the wall");
        } else {
            System.out.println(name + " didn't finish!");
            onDistance = false;
        }
    }
}
