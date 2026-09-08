package DesignPatterns.StrategyDesignPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Strategy Design Pattern");
        System.out.println("------------------------");
        System.out.println("Companion Robot");
        CompanionRobot companionRobot = new CompanionRobot("CompanionBot", new Walk(), new FlyWithJet(), new NormalTalk());
        companionRobot.walk();
        companionRobot.fly();
        companionRobot.talk();

        System.out.println("------------------------");
        System.out.println("Worker Robot");
        Worker workerRobot = new Worker("WorkerBot", new Walk(), new FlyWithJet(), new NotNormalTalk());
        workerRobot.walk();
        workerRobot.fly();
        workerRobot.talk();

    }
}
