package be.vdab;

import be.vdab.util.Kost;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Persoon en PolitiekePartij

        /*PolietiekePartij lsd = new PolietiekePartij("LSD", 60);
        Politiker adam = new Politiker("Adam", "Hillo");
        System.out.println(adam.getNaam());
        adam.setPartij(lsd);
        System.out.println(adam);*/

        //GoedeDoel

        /*GoedeDoel abc = new GoedeDoel("World for beetles");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tik een bedrag (0 om te stoppen)");
        BigDecimal bedrag = scanner.nextBigDecimal();
        while (bedrag.compareTo(BigDecimal.ZERO) != 0) {
            try {
                abc.storten(bedrag);
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
            System.out.println("Tik een bedrag (0 om te stoppen)");
            bedrag = scanner.nextBigDecimal();
        }
        System.out.println(abc.getNaam());
        System.out.println(abc.getTotBedrag());*/

        //Kost - Opbrengst

        /*BigDecimal totaal = BigDecimal.ZERO;
        Kost[] kosten = {
                new Gebouw(BigDecimal.valueOf(800)),
                new Gebouw(BigDecimal.valueOf(1500)),
                new Gebouw(BigDecimal.valueOf(1200)),
                new Instructeur(BigDecimal.valueOf(3000), BigDecimal.valueOf(30), 170),
                new Instructeur(BigDecimal.valueOf(3500), BigDecimal.valueOf(35), 140),
                new Instructeur(BigDecimal.valueOf(2200), BigDecimal.valueOf(33), 100)
        };
        for (Kost kost : kosten) {
            totaal = totaal.add(kost.getKost());
        }
        System.out.println(totaal);*/

        // PALINDROOM
        /*Scanner scanner = new Scanner(System.in);
        String woord = scanner.next();
        System.out.println(woord.equalsIgnoreCase(new StringBuilder(woord).reverse().toString()) ? "Palindroom" : "Geen palindroom");*/


        //BREUK

        Scanner scanner = new Scanner(System.in);

        int teller = scanner.nextInt();
        int noemer = scanner.nextInt();
        try {
            Breuk breuk = new Breuk(teller, noemer);
            System.out.println(breuk);
        } catch (IllegalArgumentException ie) {
            System.err.println(ie.getMessage());
        }

    }
}
