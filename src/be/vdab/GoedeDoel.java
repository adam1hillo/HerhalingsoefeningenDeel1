package be.vdab;

import java.math.BigDecimal;

public class GoedeDoel {

    private final String naam;
    private BigDecimal totBedrag = BigDecimal.ZERO;

    public GoedeDoel(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public BigDecimal getTotBedrag() {
        return totBedrag;
    }

    public void storten (BigDecimal bedrag) {
        if (!(bedrag.compareTo(BigDecimal.ZERO) <= 0)) {
            totBedrag = totBedrag.add(bedrag);
        } else {
            throw new IllegalArgumentException("bedrag moet groter dan 0 zijn");
        }
    }
}
