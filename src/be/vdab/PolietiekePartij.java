package be.vdab;

public class PolietiekePartij {
    private final String naam;

    private final int aantalLeden;

    public PolietiekePartij(String naam, int aantalLeden) {
        this.naam = naam;
        this.aantalLeden = aantalLeden;
    }

    public String getNaam() {
        return naam;
    }

    public int getAantalLeden() {
        return aantalLeden;
    }
}
