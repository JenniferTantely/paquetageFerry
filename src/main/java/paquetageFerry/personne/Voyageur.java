package paquetageFerry.personne;

import java.util.Date;
import java.util.Objects;

public class Voyageur extends Personne{
    private Date travelDate;

    public Voyageur(String lastName, String firstName, Date birhtDate, String adress, double weigh, Date travelDate) {
        super(lastName, firstName, birhtDate, adress, weigh);
        this.travelDate = travelDate;
    }

    @Override
    public void voyager() {
        System.out.println("voyage");
    }

    public Date getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(Date travelDate) {
        this.travelDate = travelDate;
    }

    @Override
    public String toString() {
        return "Voyageur{" +
                "travelDate=" + travelDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Voyageur voyageur = (Voyageur) o;
        return Objects.equals(travelDate, voyageur.travelDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), travelDate);
    }
}
