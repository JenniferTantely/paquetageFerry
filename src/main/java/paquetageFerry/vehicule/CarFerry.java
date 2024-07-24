package paquetageFerry.vehicule;

import paquetageFerry.personne.Personne;
import paquetageFerry.vehicule.camion.Camion;

import java.util.List;

public class CarFerry extends Vehicule{
    private List<Vehicule> vehiculeTransporte;

    public CarFerry(String model, int immatriculation, double mileage, double emptyWeight, double fuelReservation, List<Vehicule> vehiculeTransporte) {
        super(model, immatriculation, mileage, emptyWeight, fuelReservation);
        this.vehiculeTransporte = vehiculeTransporte;
    }
    public void embarquer(Vehicule newCar){
        if(newCar instanceof Voiture vehiculeVoiture){
            this.vehiculeTransporte.add(vehiculeVoiture);
        }
        else if(newCar instanceof Camion vehiculeCamion){
h        }
        else{
            System.out.println("on peut pas ajouter un Car Ferry dans un Car Ferry");
        }
    }

    public void debarquer(Vehicule carToBeRemoved){
        this.vehiculeTransporte.remove(carToBeRemoved);
    }

    public boolean chercheVoyageur(Personne personWanted){
        boolean result = false;
        for (int i = 0; i < this.vehiculeTransporte.size(); i++) {
            if(vehiculeTransporte.get(i) instanceof Camion camionVehicule){
                if(camionVehicule.getConductor().equals(personWanted)){
                    result = true;
                    break;
                }
            }
            if(vehiculeTransporte.get(i) instanceof Voiture voitureVehicule){
                if(voitureVehicule.getConductor().equals(personWanted)){
                    result = true;
                    break;
                }
                if(voitureVehicule.descendre(personWanted)){
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
