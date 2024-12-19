package fr.demo.graphic;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // Creer une fenetre
        JFrame frame = new JFrame("Demo Graphic");

        // Taille de la fenêtre
        frame.setSize(800, 600);

        // Le bouton fermer
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // CONTENU ::
        // Creer un panneau sous forme de Grille
        JPanel panel = new JPanel(new GridLayout(6, 1));

        // Ajouter le panneau de grille dans la fenetre
        frame.add(panel);

        JButton button = new JButton("Je veux devenir riche");

        // Pour ajoute des elements dans la fenetre
        // Il faut que la fenetre ai au moins un Layout
        // Layout = pour gerer les dispositions des elements
        //frame.setLayout(new java.awt.FlowLayout());

        // Ajoute le bouton dans le Layout de la Fenetre
        panel.add(button);

        // Creer et ajouter un label
        JLabel label = new JLabel("Je suis pauvre = Je suis étudiant");
        panel.add(label);

        // Afficher la fenetre
        frame.setVisible(true);
    }
}