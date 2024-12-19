package fr.game.inventory;

public class Consumable extends Item {

    /**
     * Possibilité de consommer l'objet
     */
    public void use() {
        System.out.println("J'utilise l'objet : " + name);
    }
}
