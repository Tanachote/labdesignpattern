package vendingmachine;

public interface State {
    void insertCoin(int coin);
    void chooseStation(String station);
    void getTicket();

}
