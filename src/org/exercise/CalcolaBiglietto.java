package org.exercise;

import java.util.Scanner;

public class CalcolaBiglietto {
    public static void main(String[] args) {
        //prezzo del biglietto è definito in base ai km (0.21 € al km)
        //sconto del 20% per i minorenni
        //sconto del 40% per gli over 65.

        int eta, numKm;
        double totalPrice, discountPrice = 0;

        Scanner line = new Scanner(System.in);

//        System.out.println("Inserisci la tua eta': ");
//        eta = line.nextInt();
//        System.out.println("Inserisci i Km che vuoi percorrere: ");
//        numKm = line.nextInt();

        System.out.println("Inserisci la tua eta': ");
        eta = Integer.parseInt(line.nextLine());

        System.out.println("Inserisci i Km che vuoi percorrere: ");
        numKm = Integer.parseInt(line.nextLine());

        totalPrice = 0.21 * numKm;

        if (eta < 18) {
            discountPrice = totalPrice * 0.20;
        } else if (eta > 65) {
            discountPrice = totalPrice * 0.40;
        }

        totalPrice -= discountPrice;

        System.out.println("Questo sara' il prezzo del tuo biglietto: " + totalPrice);

        line.close();
    }
}
