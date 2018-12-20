package tours;

public class Main {
    public static void main(String[] args) {

        Tour tourA = new SingleTour("TourA single",1500,20);
        Tour tourB = new PackageTour("TourB package");

        ((PackageTour)tourB).addTour(tourA);
        ((PackageTour)tourB).addTour(tourA);

        ((PackageTour)tourB).addTour(new SingleTour("TourA single",2500,20));
        ((PackageTour)tourB).addTour(new SingleTour("TourB package", 1700,15));


        System.out.format("Tour: %s \nPrice: %.2f \nSeat: %d\n-------------------------------------\n"
                , tourA.getName(), tourA.getPrice(), tourA.getAvailableSeats());

        System.out.format("Tour: %s \nPrice: %.2f \nSeat: %d\n-------------------------------------\n"
                , tourB.getName(), tourB.getPrice(), tourB.getAvailableSeats());

    }
}
