import java.io.IOException;
import java.util.*;

public class fitur {

    public static int input = 0;

    // login UI
    public static void mainMenu() throws IOException {
        do {
            cetak.banner("Loged in as " + cache.loginId[main.loginAlias]);
            System.out.println();
            System.out.println("Masukan inputan [0 = Logout]>");
            input = main.sc.nextInt();
            switch (input) {

                case 0:
                    logout();
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
