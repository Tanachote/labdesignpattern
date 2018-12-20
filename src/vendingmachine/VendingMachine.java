package vendingmachine;

public class VendingMachine {

    private State payState = new PayState(this);
    private State readyState = new ReadyState(this);
    private State endState = new EndState(this);
    private State currentState = readyState;
    private int price = 0;
    private int amount = 0;

    public VendingMachine(){}

    public State getCurrentState() {
        return currentState;
    }

    public State getEndState(){
        return endState;
    }

    public State getPayState(){
        return payState;

    }

    public State getReadyState(){
        return readyState;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }

    public void setCurrentState(State state){
        this.currentState = state;
    }

    public void reset(){
        this.amount = 0;
        this.price = 0;
    }
}
