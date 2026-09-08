package DesignPatterns.StrategyDesignPattern;

public class NotNormalTalk implements TalkAbleRobot {
    @Override
    public void talk() {
        System.out.println("I am not normal, I talk in a weird way!");
    }
}
