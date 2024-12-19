package fr.demo.graphic;

import javax.swing.*;
import java.awt.*;

public class DemoListPerson {

    public static void main(String[] args) {
        // Creer une fenetre
        JFrame frame = new JFrame("Demo Graphic");

        // Taille de la fenêtre
        frame.setSize(800, 600);

        // Le bouton fermer
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // -------------------------------------------------------
        // CONTENU
        // -------------------------------------------------------
        // Creer une liste de personne (exemple de données)
        String[] persons = {
                "Isaac", "Christophe", "Fredo", "Jerezouze", "Master Of Bonk"
        };

        // Element graphique qui affiche une liste d'element
        JList<String> jList = new JList<String>(persons);

        // Un element pour scroller
        // PS : J'envoie la JList dans l'element scrollable
        JScrollPane jScrollPane = new JScrollPane(jList);

        // Ajouter la scroll pane dans la fenetre
        frame.add(jScrollPane);

        // Afficher la fenetre
        frame.setVisible(true);
    }

}
