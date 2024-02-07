package be.vdab;

public class Persoon {

    private final String voornaam;
    private final String familienaam;

    public Persoon(String voornaam, String familienaam) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
    }

    public String getNaam() {
        return voornaam + " " + familienaam;
    }


}
