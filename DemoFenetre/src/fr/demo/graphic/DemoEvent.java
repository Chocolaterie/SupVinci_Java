package fr.demo.graphic;

import javax.swing.*;
import java.awt.*;

public class DemoEvent {

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
        // Creer un panneau qui contient une grille
        JPanel panel = new JPanel(new GridLayout(4, 1));

        // Creer un bouton et l'injecter dans le panneau
        JButton button = new JButton("Bouton Test");

        // TODO : Determiner l'action au clique du bouton
        button.addActionListener(e -> {
            System.out.println("J'ai cliqué sur le bouton");

            // Je creer un element et je l'ajoute au panneau
            JButton addedButton = new JButton("Bouton ajouté");
            // -- Le bouton qu'on creer on ecoute son clique
            addedButton.addActionListener(addedButtonEvent -> {
                // enlever un bouton grace a sa reference
                panel.remove(addedButton);
                // PS : Aussi possible de enlever un bouton grace a un index
                // panel.remove(2);
                
                panel.revalidate();
                panel.repaint();
            });
            // -- ajouter le bouton crée dans le panneau
            panel.add(addedButton);

            // Je vais tester si le paneau est obselete (en gros si y'a eu du changement entre temps)
            panel.revalidate();
            // Forcer le redraw des nouveaux elements
            panel.repaint();
        });

        // -- bouton dans le panneau
        panel.add(button);

        // Ajouter le panneau de grille à la fenetre
        frame.add(panel);

        // Afficher la fenetre
        frame.setVisible(true);
    }
}
