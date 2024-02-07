package be.vdab;

public class Breuk {

    private final int teller;
    private final int noemer;

    public Breuk(int teller, int noemer) {
        this.teller = teller;
        if (noemer == 0) {
            throw new IllegalArgumentException("noemer mag niet 0 zijn");
        }
        this.noemer = noemer;
    }

    @Override
    public String toString() {
        return teller + " / " + noemer;
    }
}
