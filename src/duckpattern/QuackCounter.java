package duckpattern;

public class QuackCounter implements Quackable {
    private Quackable duck;
    private static int numberOfQuack;

    @Override
    public void quack() {
        duck.quack();
        numberOfQuack++;

    }

    public QuackCounter (Quackable duck){
        this.duck = duck;
    }
}
