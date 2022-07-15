import java.io.IOException;
import java.util.*;

public class fitur {

    public static int input = 0;

    // login UI
    public static void mainMenu() throws IOException {
        do {
            cetak.spasi(2);
            cetak.banner("Loged in as " + cache.loginId[main.loginAlias]);
            System.out.println(
                    "[1] - Registrasi Nasabah\n[2] - View Data Nasabah\n[3] - Pencarian Data Nasabah\n[4] - Hapus Edit Data Nasabah\n[5] - Proses Setoran\n[6] - Proses Penarikan\n[7] - Cetak Buku\n[8] - Transfer\n[9] - Penutupan Rekening");
            cetak.spasi(1);
            System.out.print("Masukan inputan [0 = Logout]>");
            input = main.sc.nextInt();
            switch (input) {

                case 0:
                    logout();
                    break;

                case 1:

                    break;

            }
        } while (true);

    }

    // CASE 0
    public static void logout() throws IOException {
        main.loginAlias = 0;
        cetak.spasi(1);
        System.out.println(cetak.ANSI_RED_BG + "Logout Success!" + cetak.ANSI_RESET);
        main.loginMenu();
    }
}
