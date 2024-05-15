package org.exercise;

public class ClassificaCibi {
    public static void main(String[] args) {
        //Inizializzo un array
        String[] cibiPreferiti = {"Pizza", "Sushi", "Hamburger", "Pasta", "Casatiello", "Insalata"};

        //Stampo la lunghezza della classifica
        int lunghezzaClassifica = cibiPreferiti.length;
        System.out.println("Lunghezza della classifica: " + lunghezzaClassifica);

        //Stampo il cibo in cima alla classifica
        String ciboTop = cibiPreferiti[0];
        System.out.println("Il cibo in cima all'interno della classifica e': " + ciboTop);

        //Stampo il cibo preferito in coda alla classifica
        String ciboLast = cibiPreferiti[lunghezzaClassifica - 1];
        System.out.println("Il cibo in coda all'interno della classifica e': " + ciboLast);

        //Stampo il cibo in mezzo alla classifica
        String ciboMiddle = cibiPreferiti[lunghezzaClassifica / 2];
        System.out.println("Il cibo in mezzo alla classifica e': " + ciboMiddle);
    }
}
