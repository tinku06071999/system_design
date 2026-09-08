package DesignPatterns.StrategyDesignPattern;

public class FlyWithWings implements FlyAbleRobot {
    @Override
    public void fly() {
        System.out.println("I can fly with wings!");
    }
}
