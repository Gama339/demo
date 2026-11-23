package com.example;

public class exsoM4 {
    public static void main(String[] args) {
        bienvenue();
        String combattant = "Goldorak";
        combat(combattant);
        caractéristiques(combattant);
    }

    public static void bienvenue() {
        System.out.println("Bienvenue !");
    }

    public static void combat(String combattant) {
        System.out.println("Le combat commence avec " + combattant + " !");
    }

    public static void caractéristiques(String combattant) {
        System.out.println("- nom: " + combattant);
        System.out.println("Caractéristiques du combattant :");
        System.out.println("- Force : 1000");
        System.out.println("- Agilité : 90");
        System.out.println("- point de vie : 100");

    }

}