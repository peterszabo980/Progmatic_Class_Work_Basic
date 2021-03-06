package hu.progmatic.Basic_20220321;

public class Ora20220321_03 {
    public static void main(String[] args) {
        int[][] homersekletek =  {
                { // Budapest
                        2, 4, 4, 0, -5, -5, -7, // 1-7
                        -4, -3, -8, -8, -2, -3, 6 // 8-14
                },
                { // Debrecen
                        5, 2, 1, 0, 5, -8, -7, // 1-7
                        -4, -4, -8, -8, 3, -5, -2 // 8-14
                },
                { // Sopron
                        2, 3, 3, 3, 2, 0, -3, // 1-7
                        -4, -9, 8, 8, 2, -3, 5 // 8-14
                }
        };

        int[] sopronHomersekletek = homersekletek[2];
        int fagyosNapokSzama = 0;

        for (int i = 0; i < sopronHomersekletek.length; i++) {
            if (sopronHomersekletek[i] < 0) {
                fagyosNapokSzama++;
            }
        }
        System.out.println("Sopronban a fagyos napok száma: " + fagyosNapokSzama);

        //Debrecen
        fagyosNapokSzama = 0;
        for (int i = 0; i < homersekletek[1].length; i++) {
            if (homersekletek[1][i] < 0) {
                fagyosNapokSzama++;
            }
        }
        System.out.println("Debrecenben a fagyos napok száma: " + fagyosNapokSzama);

    }
}
