package org.exercise;

import java.util.Scanner;

public class MetGala {
    public static void main(String[] args) {
        String[] invitatiGala = {"Jennifer Lopez", "Zendaya", "Chris Hemsworth", "Bad Bunny", "Cara Delevingne", "Kendall Jenner", "Uma Thurman", "Damiano David", "Luca Guadagnino"};

        Scanner line = new Scanner(System.in);

        System.out.println("Come si chiama?");
        String nomeUser = line.nextLine();

        boolean invitato = false;

        for (String nome : invitatiGala) {
            if (nome.equalsIgnoreCase(nomeUser)){
                invitato = true;
                break;
            }
        }

        if (invitato){
            System.out.println("Benvenuto al Met Gala");
        }else{
            System.out.println("Mi dispiace, ma il suo nome non e' all'interno della lista");
        }
        line.close();
    }
}
