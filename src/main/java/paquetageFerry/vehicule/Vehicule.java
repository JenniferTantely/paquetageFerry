package paquetageFerry.vehicule;

import paquetageFerry.personne.Conducteur;

import java.util.Objects;

public class Vehicule {
    private String model;
    private int immatriculation;
    private double mileage;
    private double emptyWeight;
    private double fuelReservation;
    private Conducteur conductor;

    public Vehicule(String model, int immatriculation, double mileage, double emptyWeight, double fuelReservation) {
        this.model = model;
        this.immatriculation = immatriculation;
        this.mileage = mileage;
        this.emptyWeight = emptyWeight;
        this.fuelReservation = fuelReservation;
        this.conductor = null;
    }

    public void changerConducteur(Conducteur newConductor){
        this.conductor = newConductor;
    };
    public double getPoids(){
        return this.emptyWeight + fuelReservation;//eventuel charge
    };
    public void allerAlaPompe(double quantity){
        this.fuelReservation+=quantity;
    };
    public void rouler(double distance, int tauxConsommation){
        if(this.fuelReservation <distance * tauxConsommation/100 || this.conductor==null){
            throw new RuntimeException("l'operation n'est pas permis");
        }
        else{
            this.mileage += distance;
            this.fuelReservation -= distance * tauxConsommation/100;
            System.out.println("ce véhicule a roulé "+distance+" km");
        }
    };


    public void setConductor(Conducteur conductor) {
        if(conductor.getBirhtDate().getYear() < 18){
            this.conductor = conductor;
        }
        else{
            System.out.println("ce conducteur n'est pas valide");
        }

    }

    public String getModel() {
        return model;
    }

    public int getImmatriculation() {
        return immatriculation;
    }

    public double getMileage() {
        return mileage;
    }

    public double getEmptyWeight() {
        return emptyWeight;
    }

    public double getFuelReservation() {
        return fuelReservation;
    }

    public Conducteur getConductor() {
        return conductor;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setImmatriculation(int immatriculation) {
        this.immatriculation = immatriculation;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setEmptyWeight(double emptyWeight) {
        this.emptyWeight = emptyWeight;
    }

    public void setFuelReservation(double fuelReservation) {
        this.fuelReservation = fuelReservation;
    }


    @Override
    public String toString() {
        return "Vehicule{" +
                "model='" + model + '\'' +
                ", immatriculation=" + immatriculation +
                ", mileage=" + mileage +
                ", emptyWeight=" + emptyWeight +
                ", fuelReservation=" + fuelReservation +
                ", conductor=" + conductor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicule vehicule = (Vehicule) o;
        return immatriculation == vehicule.immatriculation && Double.compare(mileage, vehicule.mileage) == 0 && Double.compare(emptyWeight, vehicule.emptyWeight) == 0 && Double.compare(fuelReservation, vehicule.fuelReservation) == 0 && Objects.equals(model, vehicule.model) && Objects.equals(conductor, vehicule.conductor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, immatriculation, mileage, emptyWeight, fuelReservation, conductor);
    }
}
