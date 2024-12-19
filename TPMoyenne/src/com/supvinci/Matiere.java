package com.supvinci;

public class Matiere {
	
	public String label;
	public float[] notes;
	
	public float calculMoyenne() {
		// Faire la somme des notes
		float sum = 0f;
		
		for (float note : notes) {
			sum += note;
		}
		
		// Afficher un message
		System.out.println("Somme de " + label + " est de : " + sum);
		
		// Diviser la somme par le nombre de notes
		float average = sum / notes.length;
		
		// Afficher un message
		System.out.println("La moyenne de " + label + " est de " + average);
		
		return average;
	}
}
