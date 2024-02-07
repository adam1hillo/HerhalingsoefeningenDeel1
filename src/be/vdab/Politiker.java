package be.vdab;

public class Politiker extends Persoon{

    private PolietiekePartij partij;
    public Politiker(String voornaam, String familienaam) {
        super(voornaam, familienaam);
    }

    public void setPartij(PolietiekePartij partij) {
        this.partij = partij;
    }

    public PolietiekePartij getPartij() {
        return partij;
    }

    @Override
    public String toString() {
        return getNaam() + ", Partij: " + partij.getNaam() + " met " + partij.getAantalLeden() + " leden";
    }
}
