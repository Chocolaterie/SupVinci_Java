package fr.demo.graphic;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DemoGrid {

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
        // Une liste de produit en données (exemple de données vide)
        List<String> products = new ArrayList<String>();

        // Generer 30 produits mocké/prédéfinie
        for (int i = 0; i < 30; i++) {
            products.add("Product " + i);
        }

        // Genere un GridLayout qui s'adapte au nombre de produit
        // Toujours 6 colonne mais nombre de ligne selon le nombre de produit
        // Exemple : 12 Produits = 2 lignes de 6 colonnes (GridLayout(2,6))
        // Exemple : 30 produits = 5 lignes de 6 colonnes (GridLayout(5,6))
        // Formule = Nombre de produit / Nb Colonne = Nb Lignes
        int nombreLigne = (int) Math.ceil(products.size() / 6f); // Force à arrondir au plus haut
        JPanel panel = new JPanel(new GridLayout(nombreLigne, 6));

       // Pour chaque produit dans la liste des produits
        for (String product : products) {
            // Ajouter un bouton qui contient le nom du produit dans la grille
            panel.add(new JButton(product));
        }

        // Ajouter le panel de grille dans la fenetre
        frame.add(panel);

        // Afficher la fenetre
        frame.setVisible(true);
    }
}
