package paquetageFerry.vehicule.camion;

import paquetageFerry.personne.Conducteur;
import paquetageFerry.vehicule.Vehicule;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Camion extends Vehicule {
    private List<Colis> cargaison;

    public Camion(String model, int immatriculation, double mileage, double emptyWeight, double fuelReservation) {
        super(model, immatriculation, mileage, emptyWeight, fuelReservation);
        this.cargaison = new ArrayList<>();
    }

    public void ajouterColis(Colis newColis){
        this.cargaison.add(newColis);
    }
    public void retirerColis(Colis trashColis){
        this.cargaison.remove(trashColis);
    }

    public List<Colis> getCargaison() {
        return cargaison;
    }

    public void setCargaison(List<Colis> cargaison) {
        this.cargaison = cargaison;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "cargaison=" + cargaison +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Camion camion = (Camion) o;
        return Objects.equals(cargaison, camion.cargaison);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cargaison);
    }
}
