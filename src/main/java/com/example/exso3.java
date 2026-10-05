package com.example;

import java.util.Scanner;

public class exso3 {
    public static void main(String[] args) throws Exception {
        Scanner Clavier = new Scanner(System.in);
        System.out.println("entrer votre salaire annuel: ");
        int salaireAnnuel = Clavier.nextInt();
        System.out.println("entrer votre nombre d'années de travail: ");
        int nombreAnneesTravail = Clavier.nextInt();
        Clavier.close();
        if (salaireAnnuel >= 30000 && nombreAnneesTravail >=2) {
            System.out.println("prêt accorder");
        }
        else {
            System.out.println("prêt refuser");
        }
    }
}
