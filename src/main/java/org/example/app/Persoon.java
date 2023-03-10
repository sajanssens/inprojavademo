package org.example.app;

public class Persoon {

    // encapsulation: private fields met get/set methodes
    private String naam;
    private int leeftijd;

    public Persoon() {

    }

    public Persoon(String naam, int leeftijd) {
        setLeeftijd(leeftijd);
        setNaam(naam);
        // impliciet staat hier: return een nieuwe instance
    }

    public String getNaam() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        if (leeftijd < 130) {
            this.leeftijd = leeftijd;
        }
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String toString() {
        return "Hallo, ik ben " + this.naam + " en ik ben " + this.leeftijd + " jaar oud.";
    }

    @Override
    public boolean equals(Object o) {
        Persoon other = (Persoon) o;
        if (this.naam.equals(other.naam) && this.leeftijd == other.leeftijd) {
            return true;
        } else {
            return false;
        }
    }
}
