package lab10;

import java.util.ArrayList;

public class Lab10 {

    public static void main(String[] args) {
        ArrayList<Apartment> inventory = new ArrayList<>();
      

        Building building = new Building("1234 drive");
        StandardApartment standard = new StandardApartment(2, 600, 35);
        LuxuryApartment normal = new LuxuryApartment(1, 700, 24, true);
        LuxuryApartment upgraded = new LuxuryApartment(1, 700, 27, false);

        building.addApartment(normal);
        building.addApartment(upgraded);
        building.addApartment(standard);

        Building building2 = new Building("987 drive");
        StandardApartment standard2 = new StandardApartment(1, 800, 31);
        LuxuryApartment normal2 = new LuxuryApartment(2, 650, 22, true);
        LuxuryApartment upgraded2 = new LuxuryApartment(3, 700, 24, false);

        building2.addApartment(normal2);
        building2.addApartment(upgraded2);
        building2.addApartment(standard2);

        System.out.println(building.toString());
        inventory.add(normal);
        inventory.add(standard);
        inventory.add(upgraded);
        inventory.add(upgraded2);
        inventory.add(standard2);
        inventory.add(normal2);
        for(int i=0;i<inventory.size();i++){
            System.out.println(inventory.get(i));
        }
    }

}
