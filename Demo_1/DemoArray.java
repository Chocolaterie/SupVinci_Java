public class DemoArray {

    public static void main(String[] args)
    {
        // ---------------------------------------
        // Partie 1
        // ---------------------------------------
        // MonType[] = Un tableau de MonType
        // Creer un tableau d'attributs
        int[] attributes = new int[3];
        
        // modifier le deuxieme element (index 1)
        attributes[1] = 27;

        // afficher dans la console l'attribut index 1 (donc deuxieme element)
        System.out.println("le mana : " + attributes[1]);

        // ---------------------------------------
        // Partie 2
        // ---------------------------------------
        // Parcourir des elements dans un tableau
        // Synonyme Itération
        // Boucle itérer les index
        for (int index = 0; index < attributes.length; index++){
            System.out.println("Valeur de l'iteration for: " + attributes[index]);
        }

        // Boucle itérer les éléments donc les valeurs
        for (int valeur : attributes){
            System.out.println("Valeur de l'iteration for: " + valeur);
        }
    }
}