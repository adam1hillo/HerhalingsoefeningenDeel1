package be.vdab;

import be.vdab.util.Kost;

import java.math.BigDecimal;

public class Gebouw implements Kost {

    private final BigDecimal huurprijs;

    public Gebouw(BigDecimal huurprijs) {
        this.huurprijs = huurprijs;
    }

    @Override
    public BigDecimal getKost() {
        return huurprijs;
    }
}
