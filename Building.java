package lab10;

import java.util.ArrayList;

public class Building {

    ArrayList<Apartment> apartments;
    String addressName;

    public Building(String addressName) {
        this.addressName = addressName;
        apartments = new ArrayList<Apartment>();

    }

    public void addApartment(Apartment apt) {
        apartments.add(apt);
    }

    public String toString() {
        String temp ="";
        for(int i=0;i<apartments.size();i++){
            temp+= apartments.get(i).toString()+"\n";
        }
        return addressName+"\n"+temp;

    }
}
