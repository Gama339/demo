package com.example;

import java.util.Scanner;

public class exso5 {
    public static void main(String[] args) throws Exception {
        Scanner Clavier = new Scanner(System.in);
        System.out.println("entrer votre nombre d'heures travaillées: 0");
        int heuresTravaillees = Clavier.nextInt();

        while (heuresTravaillees < 0 || heuresTravaillees > 42) {
            System.out.println("entrer votre nombre d'heures travaillées comprises entre 0 et 42: ");
            heuresTravaillees = Clavier.nextInt();
                   //System.out.println("après ");
        }
        Clavier.close();
        //System.out.println("après ");
        int salaireHoraire = 15; // salaire horaire en euros
        int salaireSemaine = heuresTravaillees * salaireHoraire; // calcul du salaire hebdomadaire
        System.out.println("votre salaire cette semaine est de : " + salaireSemaine + " euros");
    }
}
