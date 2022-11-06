import java.lang.Math;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;
    private int price;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        return Math.abs( this.squares * this.pricePerSquare - compared.pricePerSquare * compared.squares);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if (this.squares * this.pricePerSquare > compared.pricePerSquare * compared.squares) {
            return true;
        }
        return false;
    }

}