package com.supvinci;

import java.util.List;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args)
    {
		// Creer une liste vide de matière
		List<Matiere> matieres = new ArrayList<Matiere>();
		
		// Instancier ses 3 matieres
		// Francais
	    Matiere francais = new Matiere();
	    francais.label = "Français";
	    francais.notes = new float[]{12, 8, 13, 6};
	    
	    matieres.add(francais);
	    
	    // Math
	    Matiere math = new Matiere();
	    math.label = "Math";
	    math.notes = new float[]{4, 9, 16, 18};
	    
	    matieres.add(math);
	    
	    // Sport
	    Matiere sport = new Matiere();
	    sport.label = "Sport";
	    sport.notes = new float[]{15, 13, 17, 2, 6};
	    
	    matieres.add(sport);
	    
	    // -------------------------------------
	    // Calculer la moyenne generale
	    // -------------------------------------
	    // Formule = La somme des moyennes / par le nombre de matière
	    float averageSum = 0f;
	    
	    // -- avoir la somme des moyennes
	    for (Matiere matiere : matieres) {
	    	averageSum += matiere.calculMoyenne();
	    }
	    
	    //-- diviser la somme des moyennes / nb matiere
	    float generalAverage = averageSum / matieres.size();
	    
	    System.out.println("La moyenne générale est de : " + generalAverage);
	    
    }
}
