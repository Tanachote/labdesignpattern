package duckpattern;

public class PigeonAdapter implements Quackable {
    private Pigeon pigeon;

    @Override
    public void quack() {
        pigeon.coo();
        pigeon.coo();
    }
}
