package paquetageFerry.personne;

import java.util.Date;
import java.util.Objects;

public class Personne {
    private String lastName;
    private String firstName;
    private Date birhtDate;
    private String adress;
    private double weigh;

    public Personne(String lastName, String firstName, Date birhtDate, String adress, double weigh) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birhtDate = birhtDate;
        this.adress = adress;
        this.weigh = weigh;
    }

    public void voyager(){
        System.out.println("voyage");
    };

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Date getBirhtDate() {
        return birhtDate;
    }

    public String getAdress() {
        return adress;
    }

    public double getWeigh() {
        return weigh;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setBirhtDate(Date birhtDate) {
        this.birhtDate = birhtDate;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setWeigh(double weigh) {
        this.weigh = weigh;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", birhtDate=" + birhtDate +
                ", adress='" + adress + '\'' +
                ", weigh=" + weigh +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return Double.compare(weigh, personne.weigh) == 0 && Objects.equals(lastName, personne.lastName) && Objects.equals(firstName, personne.firstName) && Objects.equals(birhtDate, personne.birhtDate) && Objects.equals(adress, personne.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, birhtDate, adress, weigh);
    }
}
