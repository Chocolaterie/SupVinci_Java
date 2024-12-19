package fr.game.inventory;

public class Weapon extends Equipment {

    /**
     * Récupère les dégats de l'arme
     * @return
     */
    public int getDamage() {
        return attributes[1];
    }
}
