package com.example;

import java.util.Scanner;

public class exso2 {
    public static void main(String[] args) throws Exception {
        Scanner Clavier = new Scanner(System.in);
        System.out.println("entrer la note : ");
        int note = Clavier.nextInt();
        if(note <= 5){
            System.out.println("Rouge");
        }
        else if(note >= 6 && note <=10){
            System.out.println("jaune");
        }
        else if(note >= 11 && note <=15){
            System.out.println("Vert");
        }
        else{
            System.out.println("Vert+");
        }
    }

}

// Cour du 21/09/2026 B1
// Exercice 2 : Ecrire un programme : utilisation de if & else 
// Note <= 5 : Rouge   
// Note >= 6 et <= 10 : jaune
// Note >= 11 et <= 15 : Vert
// Note > 15 : Vert+

