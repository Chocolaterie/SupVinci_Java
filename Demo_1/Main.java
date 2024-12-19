public class Main 
{
	public static void main(String[] args)
    {
        // Démo variable primitives
        int hp = 300;
        boolean isAlive = true;
        float atkPercent = 0.5f;
        double atkPercentVersionDouble = 0.5;

        // Calcul
        hp = hp - 200;

        // Afficher du texte formaté
        // version à pas faire
        System.out.println("Les HP restants sont : " + hp);

        // version propre
        System.out.println(String.format("Les HP restants sont : %d", hp));

        // ============================================
        // Partie 2
        // ============================================
        float hpDivive = (float) hp / 300f;
        System.out.println("Résultat de hp/300 : " + hpDivive);
	}
}