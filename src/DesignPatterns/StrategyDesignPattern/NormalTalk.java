package DesignPatterns.StrategyDesignPattern;

public class NormalTalk implements TalkAbleRobot {
    @Override
    public void talk() {
        System.out.println("Normal talking");
    }
}
