package fr.game;

import fr.game.inventory.Equipment;
import fr.game.inventory.Inventory;

import java.util.ArrayList;
import java.util.List;

public class Character {

    /**
     * Le pseudo du personnage
     */
    public String pseudo;

    /**
     * L'inventaire du personnage
     */
    public Inventory inventory;

    /**
     * La liste des équipements equipés
     */
    public List<Equipment> equipments = new ArrayList<Equipment>();

    /**
     * Sert à equiper un item
     * @param equipment l'item à equiper
     */
    public void equipItem(Equipment equipment) {

        equipments.add(equipment);

        System.out.println("A equipé l'item : " + equipment.name);
    }
}
