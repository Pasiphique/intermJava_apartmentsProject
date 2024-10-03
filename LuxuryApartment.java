package lab10;

public class LuxuryApartment extends Apartment {

    private boolean hasOffice;

    public LuxuryApartment(int bedrooms, int rentAmount, int Apartmentnumber, boolean hasOffice) {
        super(bedrooms, rentAmount, Apartmentnumber);
        this.hasOffice = hasOffice;
    }

    public double getSquareFeet() {
        int base = 600 + bedrooms * 120;
        if (hasOffice) {
            base = base + 120;
        }
        return base;
    }

    public String toString() {
        if (hasOffice) {
            return "Apartment #" + Apartmentnumber + "(Luxury):   " + bedrooms + " bedrooms, with office, " + rentAmount + "$ per month," + getSquareFeet() + " sq ft.";
        } else {
            return "Apartment #" + Apartmentnumber + "(Luxury):   " + bedrooms + " bedrooms, " + rentAmount + "$ per month," + getSquareFeet() + " sq ft.";
        }

    }

}
