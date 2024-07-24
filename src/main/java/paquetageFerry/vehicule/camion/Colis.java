package paquetageFerry.vehicule.camion;

public class Colis {
    private String description;
    private double weight;

    public Colis(String description, double weight) {
        this.description = description;
        this.weight = weight;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }
}
