package ru.geekbrains.level2.lesson1Home.models;

public class Robot{

    private int jump;
    private int run;
    private String name;
    boolean onDistance = true;

    public Robot(int jump, int run, String name) {
        this.jump = jump;
        this.run = run;
        this.name = name;
    }

    public int getJump() {
        return jump;
    }

    public int getRun() {
        return run;
    }

    public String getName() {
        return name;
    }

    public boolean isOnDistance() {
        return onDistance;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOnDistance(boolean onDistance) {
        this.onDistance = onDistance;
    }
}
