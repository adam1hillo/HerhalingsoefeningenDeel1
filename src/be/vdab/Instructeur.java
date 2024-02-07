package be.vdab;

import be.vdab.util.Kost;
import be.vdab.util.Opbrengst;

import java.math.BigDecimal;

public class Instructeur implements Kost, Opbrengst {

    private final BigDecimal maandwedde;
    private final BigDecimal uurPrijsPerLes;

    private int aantalUrenLesAanWerknemers;

    public Instructeur(BigDecimal maandwedde, BigDecimal uurPrijsPerLes, int aantalUrenLesAanWerknemers) {
        this.maandwedde = maandwedde;
        this.uurPrijsPerLes = uurPrijsPerLes;
        this.aantalUrenLesAanWerknemers = aantalUrenLesAanWerknemers;
    }

    @Override
    public BigDecimal getKost() {
        return maandwedde;
    }

    @Override
    public BigDecimal getOpbrengst() {
        return uurPrijsPerLes.multiply(BigDecimal.valueOf(aantalUrenLesAanWerknemers));
    }
}
