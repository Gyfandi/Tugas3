import java.util.Scanner;

/**
 * class utama untuk menjalankan program
 */
public class MainApp {
    public static final int DIAMOND_86 = 20000;
    public static final int DIAMOND_170 = 38000;
    public static final int DIAMOND_257 = 55000;
    public static final int DIAMOND_706 = 150000;
    public static final int SALDO_AWAL = 1000000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== MOBILE LEGENDS TOP-UP CENTER ===");
        System.out.print("Enter Player ID: ");
        long id = sc.nextLong();

        System.out.print("Enter Server ID: ");
        int server = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Nickname: ");
        String nickname = sc.nextLine();

        Player player = new Player(id, server, nickname, SALDO_AWAL);
        System.out.println("\nAccount created successfully!");
        player.showProfile();

        boolean running = true;

        while (running) {
            ListDiamond.showMenu();
            System.out.print("Enter your choice: ");
            int menuChoice = sc.nextInt();

            TopUp selectedTopup = null;
            selectedTopup = ListDiamond.ProccessTopUp(menuChoice, player);

            // Tambahkan menu logout
            System.out.println("\nApakah Anda ingin melakukan transaksi lagi?");
            System.out.println("1. Ya, lanjut top up");
            System.out.println("2. Tidak, logout");
            System.out.print("Pilihan: ");
            int choice = sc.nextInt();

            if (choice == 2) {
                running = false;
                System.out.println("\n=== LOGOUT BERHASIL ===");
                System.out.println("Terima kasih sudah menggunakan layanan Top-Up MLBB!");
            }
        }

        sc.close();
    }

}