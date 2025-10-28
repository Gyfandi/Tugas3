public class ListDiamond {
    public static TopUp ProccessTopUp(int menuChoice, Player player) {
        TopUp selectedTopup = null;

        switch (menuChoice) {
            case 1 -> selectedTopup = new TopUp("86 Diamonds");
            case 2 -> selectedTopup = new TopUp("170 Diamonds");
            case 3 -> selectedTopup = new TopUp("257 Diamonds");
            case 4 -> selectedTopup = new TopUp("706 Diamonds");
            default -> System.out.println("Invalid choice!");
        }

        if (selectedTopup != null) {
            if (player.getBalance() >= selectedTopup.getPrice()) {
                selectedTopup.processTopUp(player);
            } else {
                System.out.println("\n❌ Insufficient balance!");
            }
        }

        return selectedTopup;
    }

    public static void showMenu() {
    }
}