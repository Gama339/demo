package com.example;

import java.util.Scanner;

public class exso6 {
    public static void main(String[] args) throws Exception {
        Scanner Clavier = new Scanner(System.in);
        for (int i = 1; i <= 4; i++) {
            double cumuleDesNotes = 0;
            for (int NbNote = 1; NbNote <= 2; NbNote++) {
                System.out.println("entrer votre note  : ");
                double note = Clavier.nextDouble();
                cumuleDesNotes += note;
            }

            double moyenne = cumuleDesNotes / 2.0;
            System.out.println("la moyenne de l'étudiant " + i + " est : " + moyenne);

            
        }
        Clavier.close();
    }

}

// alogorithme
// pour chacun des 4 étudiants
// initialiser le cumuleDesNotes de cet étudiant à 0
// pour chacun des 2 notes de cet étudiant
// demander la note
// ajouter la note au cumuleDesNotes de cet étudiant
// Calculer la moyenne de cet étudiant en divisant le cumuleDesNotes par 2
// Afficher la moyenne de cet étudiant