package paquetageFerry.vehicule;

import paquetageFerry.personne.Personne;
import paquetageFerry.personne.Voyageur;

import java.util.List;

public class Voiture extends Vehicule{
    private List<Personne> passengers;
    private int passengerlimit;

    public Voiture(String model, int immatriculation, double mileage, double emptyWeight, double fuelReservation, List<Personne> passengers, int passengerlimit) {
        super(model, immatriculation, mileage, emptyWeight, fuelReservation);
        this.passengers = passengers;
        this.passengerlimit = passengerlimit;
    }

    public void monter(Voyageur newPassenger){
        if(passengers.size()>= passengerlimit){
            System.out.println("les places sont pleins");
        }
        passengers.add(newPassenger);
    }

    public boolean descendre(Personne passengerWhoShouldLeave){
        boolean result = false;
        for (int i = 0; i < passengers.size(); i++) {
            if(passengers.get(i).equals(passengerWhoShouldLeave)){
                passengers.remove(passengerWhoShouldLeave);//contains
                result = true;
                break;
            }
            result = false;
            System.out.println("le passager n'est pas là");
        }
        return result;
    }

    public List<Personne> getPassengers() {
        return passengers;
    }

    public int getPassengerlimit() {
        return passengerlimit;
    }

    public void setPassengers(List<Personne> passengers) {
        this.passengers = passengers;
    }

    public void setPassengerlimit(int passengerlimit) {
        this.passengerlimit = passengerlimit;
    }
}
