package com.example;

import java.util.Scanner;

public class exso4 {
    public static void main(String[] args) throws Exception {
        Scanner Clavier = new Scanner(System.in);
        System.out.println("entrer votre nombre de pièce jaune de 1 : "); // nombre de pièce de 1
        int piece1 = Clavier.nextInt();
        System.out.println("entrer votre nombre de pièce jaune de 5 : "); // nombre de pièce de 5
        int piece5 = Clavier.nextInt();
        System.out.println("entrer votre nombre de pièce jaune de 10 : "); // nombre de pièce de 10
        int piece10 = Clavier.nextInt();
        System.out.println("entrer votre nombre de pièce jaune de 20 : "); // nombre de pièce de 20
        int piece20 = Clavier.nextInt();
        System.out.println("entrer votre nombre de pièce jaune de 50 : "); // nombre de pièce de 50
        int piece50 = Clavier.nextInt();
        Clavier.close();
        int prixCafe = 100; // prix d'un café-crème en centimes
        int total = piece1 * 1 + piece5 * 5 + piece10 * 10 + piece20 * 20 + piece50 * 50; // calcul du total en centimes
        if (total == prixCafe) {
            System.out.print("vous avez exactement assez pour un café-crème !");
        }
        if (total > prixCafe) {
            System.out.print("vous avez assez pour un café-crème et il vous reste " + (total - prixCafe) + " centimes");
        }
        if (total < prixCafe) {
            System.out.print(
                    "vous n'avez pas assez d'argent pour un café-crème, il vous manque " + (prixCafe - total)
                            + " centimes");
        }
    }
}
