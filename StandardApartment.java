package lab10;

public  class StandardApartment extends Apartment {
            
    public StandardApartment(int bedrooms, int rentAmount, int Apartmentnumber) {
        super(bedrooms, rentAmount, Apartmentnumber);
        
    }
    public  double getSquareFeet(){
        int base = 400 +bedrooms*100;
        return base;
    }
    public String toString() {
        return "Apartment #" + Apartmentnumber + "(Standard):   " + bedrooms + " bedrooms, " + rentAmount + "$ per month," + getSquareFeet() + " sq ft.";
    }
    

}
