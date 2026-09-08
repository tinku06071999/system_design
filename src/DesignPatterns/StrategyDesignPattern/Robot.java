package DesignPatterns.StrategyDesignPattern;

import java.net.InterfaceAddress;

public abstract class Robot{
    protected WalkableRobot walkableRobot;
    protected TalkAbleRobot talkAbleRobot;
    protected FlyAbleRobot flyAbleRobot;
    private String name;
    public Robot(String name,WalkableRobot walkableRobot, TalkAbleRobot talkAbleRobot, FlyAbleRobot flyAbleRobot) {
        this.name = name;
        this.walkableRobot = walkableRobot;
        this.talkAbleRobot = talkAbleRobot;
        this.flyAbleRobot = flyAbleRobot;
    }
    void walk(){
        walkableRobot.walk();
    };
    void talk(){
        talkAbleRobot.talk();
    };
    void fly(){
        flyAbleRobot.fly();
    };
    public abstract void projection();
}
