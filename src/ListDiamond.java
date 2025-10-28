public class ListDiamond {
    /**
     * switch case untuk proses pemilihan dari list list diamond
     * if else untuk apabila saldo leih banyak dari harga akan memproses topup, dan apabila harga lebih mahal dari saldo akan menampilkan pesan
     * @param menuChoice
     * @param selectedTopup
     * @param player
     */
    static void ProccessTopUp(int menuChoice, TopUp selectedTopup, Player player) {
        switch (menuChoice) {
            case 1 -> selectedTopup = new TopUp("86 Diamonds", MainApp.DIAMOND_86); //Refactor 3
            case 2 -> selectedTopup = new TopUp("170 Diamonds", MainApp.DIAMOND_170); //Refactor 3
            case 3 -> selectedTopup = new TopUp("257 Diamonds", MainApp.DIAMOND_257); //Refactor 3
            case 4 -> selectedTopup = new TopUp("706 Diamonds", MainApp.DIAMOND_706); //Refactor 3
            default -> System.out.println("Invalid choice!");
        }

        if (selectedTopup != null) {
            if (player.getBalance() >= selectedTopup.getPrice()) {
                selectedTopup.processTopUp(player);
            } else {
                System.out.println("\n❌ Insufficient balance!");
            }
        }
    }

    public static void showMenu() {
    }
}
