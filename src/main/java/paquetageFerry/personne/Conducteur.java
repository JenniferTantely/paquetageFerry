package paquetageFerry.personne;

import java.util.Date;
import java.util.Objects;

public class Conducteur extends Voyageur{
    private int drivingNumber;

    public Conducteur(String lastName, String firstName, Date birhtDate, String adress, double weigh, Date travelDate, int drivingNumber) {
        super(lastName, firstName, birhtDate, adress, weigh, travelDate);
        this.drivingNumber = drivingNumber;
    }


    public int getDrivingNumber() {
        return drivingNumber;
    }

    public void setDrivingNumber(int drivingNumber) {
        this.drivingNumber = drivingNumber;
    }

    @Override
    public String toString() {
        return "Conducteur{" +
                "drivingNumber=" + drivingNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Conducteur that = (Conducteur) o;
        return drivingNumber == that.drivingNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), drivingNumber);
    }
}
