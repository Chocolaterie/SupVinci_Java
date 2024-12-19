public class DemoRPG {

    // Il existe un player et un enemy
    static int[] player = new int[2];
    static int[] enemy = new int[2];

    // ATTENTION : Va servir à pointer/referencer le joueur en cours d'action
    // Donc si par exemple je fais un moment currentPlayer=enemy
    // Alors cela veut dire currentPlayer est l'adresse mémoire de enemy
    // DONC CE N'EST PAS UN COPIER COLLER DES TABLEAU
    static int[] currentPlayer;

    // Viser quelqu'un
    // L'adresse mémoire/reference de la cible
    static int[] currentTarget;

    // Qui à gagner (qui est le tableau qui a gagné)
    // L'adresse mémoire/reference de de qui à gagner
    static int[] playerWinner;

    // Servira à savoir si on joue ou pas
    // Par défaut false car on joue pas
    static boolean isPlaying = false;

    /**
     * Initialiser les données
     */
    public static void initData(){
        // Les données du joueur
        player[0] = 100; // 0 : PV
        player[1] = 34; // 1 : ATK

        // Les données de l'enemie
        enemy[0] = 80; // 0 : PV
        enemy[1] = 22; // 1 : ATK
    }

    /**
     * Va choisir le premier à joueur
     */
    public static void selectFirstPlayer() {
        // TODO : Pour le moment c'est le Player le premier qui joue
        currentPlayer = player;
        currentTarget = enemy;

        System.out.println("Le player joue en premier");
    }

    /**
     * Faire jouer un joueur
     */
    public static void executePlayerAction() {
        // Récupérer l'atk de celui qui attaque
        int damage = currentPlayer[1]; // Attr ATK

        // Stocker combien de PV il avait avant de se faire attaquer
        int previousPV = currentTarget[0];

        // Réduire les PV de la cible par rapport au dégats de celui qui joue
        currentTarget[0] -= damage;

        // Afficher l'action
        System.out.println("----------------------------------------------------");
        System.out.println("La cible avait tant de PV " + previousPV);
        System.out.println("La cible a perdu " + damage + " PV");
        System.out.println("La cible : PV restant " + currentTarget[0]);
        System.out.println("----------------------------------------------------");
        System.out.println("");
        
        // Si les vies restantes < 1 
        // Alors le jeu s'arrete puisque on a au moins un perdant 
        if (currentTarget[0] < 1) {
            // on arrete le jeu
            isPlaying = false;

            // on stock qui à gagner
            playerWinner = currentPlayer;
        }
    }

    /**
     * Selectionner le joueur suivant
     */
    public static void selectNextPlayer() {
        // Si la reference etait le joueur
        // Alors c'est au tour de enemy de jouer
        if (currentPlayer == player){
            currentPlayer = enemy;
            currentTarget = player;

            System.out.println("L'enemy va jouer");
        }
        else {
            currentPlayer = player;
            currentTarget = enemy;

            System.out.println("Le player qui va jouer");
        }
    }

    /**
     * Afficher le vainqueur
     */
    public static void displayWinner() {
        // Si adresse mémoire / réference est le player
        if (playerWinner == player){
            System.out.println("Le player à gagné");
        }
        // sinon c'est l'enemy
        else {
            System.out.println("L'enemy à gagné");
        }
    }

    /**
     * Tester que la partie n'est pas terminée
     * True : Le la partie n'est pas terminée
     */
    public static boolean isGameRunning() {
        // la condition pour savoir si la partie est terminé ou pas
        return isPlaying;
    }

    /**
     * Entry / Point d'entrée de l'application
     */
    public static void main(String[] args)
    {
        // Initialiser les données des joueurs
        initData();

        // Lancer le jeu
        isPlaying = true;

        // 1 :: Choisir qui joue en premier
        selectFirstPlayer();

        // While = Répéter en boucle le code dans le while
        // tant que la condition est vrai
        while (isGameRunning()) {
            // 2 :: Faire joueur le joueur jouer
            executePlayerAction();

            // Si le jeu s'arrete avant la fin de la boucle
            // Alors on casse la boucle maintenant !!!!
            if (!isGameRunning()){
                break;
            }

            // 3 :: Selectionner le joueur suivant
            selectNextPlayer();
        }

        // ? :: Afficher le vainqueur
        displayWinner();
    }
}