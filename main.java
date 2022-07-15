//PROGRAM CORE BANK
//I Gusti Ngurah Aditya Kesuma - 21410100039

import java.util.*;
import java.io.*;

public class main {

    public static Scanner sc = new Scanner(System.in);
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int loginAlias = 0;

    public static void main(String[] args) throws IOException {
        // Masuk ke Login Menu
        cache.allCache();
        loginMenu();
    }

    public static void mainMenu() {

    }

    public static void loginMenu() throws IOException {
        do {
            cetak.spasi(1);
            cetak.bannerLogin("Core Banking System <Login as Admin>" + cetak.ANSI_RED_BG + "[0 = Exit]"
                    + cetak.ANSI_RESET + " || "
                    + cetak.randomLoginText());
            System.out.print("Username : ");
            String adminUserName = br.readLine();
            if (adminUserName.equals("0")) {
                sysExit();
            }
            System.out.print("Password : ");
            String adminUserPass = br.readLine();
            if (adminUserPass.equals("0")) {
                sysExit();
            }

            for (int i = 0; i < cache.Vector_dataAdminUserName.size(); i++) {
                String a = cache.Vector_dataAdminUserName.elementAt(i);
                String b = cache.Vector_dataAdminUserName.elementAt(i);
                if (adminUserName.equals(a) && adminUserPass.equals(b)) {
                    loginAlias = i;
                    System.out.println("LoginAlias : " + loginAlias);
                }
            }

        } while (true);
    }

    public static void sysExit() {
        cetak.spasi(1);
        System.out.println(cetak.ANSI_RED_BG + "SYSTEM EXITING..." + cetak.ANSI_RESET);
        System.exit(0);
    }
}