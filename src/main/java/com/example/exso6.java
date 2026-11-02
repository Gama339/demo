package com.example;

import java.util.Scanner;

public class exso6 {
    public static void main(String[] args) throws Exception {
        Scanner Clavier = new Scanner(System.in);
        for (int i = 1; i <= 4; i++) {
            System.out.println("entrer votre note 1 : ");
            int note1 = Clavier.nextInt();
            System.out.println("entrer votre note 2 : ");
            int note2 = Clavier.nextInt();
            int cumuleDesNotes = note1 + note2;
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