public class Test {

    static int[] player = new int[2];
    static int[] enemy = new int[2];

    public static void main(String[] args)
    {
        // Les données du joueur
        player[0] = 100; // 0 : PV
        player[1] = 34; // 1 : ATK

        // Les données de l'enemie
        enemy[0] = 80; // 0 : PV
        enemy[1] = 22; // 1 : ATK

        int[] reference = player;
        reference[1] = 987;

        System.out.println(player[1]);
    }
}