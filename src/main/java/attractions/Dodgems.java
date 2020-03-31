package attractions;

public class Dodgems extends Attraction {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double priceFor() {
        return 0;
    }
}
