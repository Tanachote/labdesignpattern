package duckpattern;

public class QuackEcho implements Quackable {
    private Quackable duck;

    public QuackEcho(Quackable quackable){
        this.duck = quackable;
    }

    @Override
    public void quack() {
        duck.quack();
        System.out.println("Echo: ");
        duck.quack();

    }
}
