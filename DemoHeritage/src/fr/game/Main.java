package fr.game;

import fr.game.inventory.*;

public class Main {

    public static void main(String[] args) {

        // Creer un inventaire
        Inventory inventory = new Inventory();

        // Creer deux items
        Material crystal = new Material();
        crystal.name = "Crystal";

        Consumable potion = new Consumable();
        potion.name = "Potion de vie";

        // Les ajouter dans l'inventaire
        inventory.items.add(crystal);
        inventory.items.add(potion);

        // Afficher l'inventaire
        for (Item item : inventory.items) {
            // Afficher le nom de l'item
            System.out.println(item.name);

            // Tester que l'Item (parentClass, baseClass) est un Material
            // Tester que l'enfant de la class (childClass) Item est un Material
            if (item instanceof Material) {
                System.out.println("La c'est un Material");
            }

            // Tester que c'est un Consumable
            if (item instanceof Consumable) {
                // Récupérer la version consumable de l'item
                // Caster l'item en Consumable pour l'exploiter
                // Version en deux temps
                Consumable consumable = (Consumable) item;
                consumable.use();

                // Version en une seule ligne
                // ((Consumable) item).use();
            }
        }
        // SUITE : Creer un personnage et donner des equipements
        Character goulteck = new Character();
        goulteck.pseudo = "Le boss des boss";

        // Associer l'inventaire dans le character
        goulteck.inventory = inventory;

        // Creer un equipement
        Weapon bonk = new Weapon();
        bonk.name = "Baton Bonk";
        bonk.attributes = new int[]{ 20, 999 }; // 20 pv et 999 Atk

        // Associer l'equipement a goulteck
        goulteck.equipItem(bonk);

        // Lire tout les equipements de goulteck
        for(Equipment equipment : goulteck.equipments){

            // SI c'est une Arme (donc Wezpon) afficher getDamage de weapon
            if (equipment instanceof Weapon){
                Weapon weapon = (Weapon) equipment;
                System.out.println("Les dégats de l'arme " + weapon.name + " est de : " + weapon.getDamage());
            }
        }
    }
}