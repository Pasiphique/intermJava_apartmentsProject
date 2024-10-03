package lab10;

public abstract class Apartment {
    int bedrooms;
    double rentAmount;
    int Apartmentnumber;

    public Apartment(int bedrooms, int rentAmount, int Apartmentnumber) {
        this.bedrooms = bedrooms;
        this.rentAmount = rentAmount;
        this.Apartmentnumber = Apartmentnumber;

    }

    public int getBedrooms() {
        return this.bedrooms;
    }

    public double getRent() {
        return this.rentAmount;
    }

    public int getNumber() {
        return this.Apartmentnumber;
    }

    public abstract double getSquareFeet();
    
}