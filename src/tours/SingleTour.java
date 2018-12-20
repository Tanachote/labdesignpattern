package tours;

public class SingleTour implements Tour {
    private String name;
    private double price;
    private int TotalSeats;
    private int reserveSeats;

    public SingleTour(String name, double price, int TotalSeats){
        this.reserveSeats = 0;
        this.name = name;
        this.price = price;
        this.TotalSeats = TotalSeats;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getAvailableSeats() {
        int ans = TotalSeats - reserveSeats;
        return ans;
    }

}
