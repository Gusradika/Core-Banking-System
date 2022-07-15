import java.io.*;
import java.util.*;

public class fitur {

    public static int input = 0;
    public static String ktp = "", nama = "", alamat = "", gender = "", agama = "", birthdate = "", telp = "",
            ibukandung = "", email = "", pekerjaan = "";
    private static boolean parameterNotOk = true;

    // login UI
    public static void mainMenu() throws IOException {
        do {
            cetak.spasi(2);
            // "Core Banking System // Pt.Bank Indivo Central" + cetak.ANSI_RESET + " || " +
            // cetak.randomLoginText()
            cetak.banner("CORE BANKING SYSTEM MENU" + cetak.ANSI_RESET + " || "
                    + "Dont forget to Smile, Happy, and Keep your spirit up!");
            System.out.println(cetak.ANSI_YELLOW + "NEWS : " + cetak.ANSI_RESET + cetak.newsPromosi());
            System.out.println(
                    "#########################################################################################");
            System.out.println(
                    cetak.ANSI_CYAN_BG + "LOGGED IN AS" + cetak.ANSI_RESET + " " + cache.loginId[main.loginAlias]);
            cetak.spasi(1);
            System.out.println(
                    "[1] - Registrasi Nasabah\n[2] - View Data Nasabah\n[3] - Pencarian Data Nasabah\n[4] - Hapus Edit Data Nasabah\n[5] - Proses Setoran\n[6] - Proses Penarikan\n[7] - Cetak Buku\n[8] - Transfer\n[9] - Penutupan Rekening");
            cetak.spasi(1);
            System.out.print(cetak.ANSI_GREEN + "Masukan inputan [0 = Logout]>" + cetak.ANSI_RESET);
            input = main.sc.nextInt();
            switch (input) {

                case 0:
                    logout();
                    break;

                case 1:
                    registNasabah();
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

    /*
     * ################# FEATURE KE 1 - REGISTRASI NASABAH #################
     */

    public static void registNasabah() throws IOException {

        cetak.spasi(2);
        cetak.banner2("1 - Registrasi Nasabah");
        System.out.println("Silahkan mengisi form untuk melakukan Registrasi [0 = Cancel]");
        cetak.spasi(1);
        System.out.println(cetak.ANSI_GREEN + "#### Data diri     ####" + cetak.ANSI_RESET);
        // KTP
        do {
            System.out.print("Nomor identitas\t\t\t: ");
            ktp = main.br.readLine();
            registNasabahCancel();
            cekInputan();
        } while (parameterNotOk);

        do {
            System.out.print("Nama sesuai identitas\t\t: ");
            nama = main.br.readLine();
            registNasabahCancel();
            cekInputan();
        } while (parameterNotOk);

        System.out.print("Alamat sesuai identitas\t\t: ");
        alamat = main.br.readLine();
        registNasabahCancel();
        cekInputan();

        System.out.print("Jenis kelamin\t\t\t: "); // L / P
        gender = main.br.readLine();
        registNasabahCancel();
        cekInputan();

        System.out.print("Agama\t\t\t\t: ");
        agama = main.br.readLine();
        registNasabahCancel();
        cekInputan();

        System.out.print("Tanggal lahir [DD/MM/YYYY]\t: ");
        birthdate = main.br.readLine();
        registNasabahCancel();
        cekInputan();

        cetak.spasi(1);
        System.out.println(cetak.ANSI_GREEN + "#### Data Tambahan ####" + cetak.ANSI_RESET);
        System.out.print("Nomor telepon\t\t\t: ");
        telp = main.br.readLine();
        registNasabahCancel();
        System.out.print("Nama ibu kandung\t\t: ");
        ibukandung = main.br.readLine();
        registNasabahCancel();
        System.out.print("Email\t\t\t\t: ");
        email = main.br.readLine();
        registNasabahCancel();

        cetak.spasi(1);
        System.out.println(cetak.ANSI_GREEN + "#### Data Pekerjaan ####" + cetak.ANSI_RESET);
        System.out.print("Pekerjaan\t\t\t: ");
        pekerjaan = main.br.readLine();
        registNasabahCancel();
        // PRINT SEMUA DATA YANG TELAH DI INPUT LALU, apakah anda yakin untuk
        // melanjutkan?

    }

    public static void registNasabahCancel() throws IOException {
        if (ktp.equals("0") || nama.equals("0") || alamat.equals("0") || gender.equals("0") || agama.equals("0")
                || birthdate.equals("0") || telp.equals("0") || ibukandung.equals("0") || email.equals("0")
                || pekerjaan.equals("0")) {

            cetak.spasi(2);
            // Clearing Cache untuk jaga-jaga
            ktp = "";
            nama = "";
            alamat = "";
            gender = "";
            agama = "";
            birthdate = "";
            telp = "";
            ibukandung = "";
            email = "";
            pekerjaan = "";

            // Tambahkan Debug Mode disini
            System.out.println(cetak.ANSI_RED_BG + "Canceled!" + cetak.ANSI_RESET);
            mainMenu();
        }
    }

    public static void cekInputan() {
        // cek inputan ktp dengan rules [Terdiri dari 11 karakter || Tidak Menggunakan
        // Huruf]
        parameterNotOk = true;
        if (!ktp.equals("") && ktp.length() == 11 && !ktp.matches("[a-zA-Z_]+")) {
            parameterNotOk = false;
        } else {
            System.out.println(cetak.ANSI_RED_BG
                    + "Masukan data KTP yang valid! [Terdiri dari 11 karakter || Tidak Menggunakan Huruf]"
                    + cetak.ANSI_RESET);
        }
        // cek inputan Nama [tidak lebih dari 16 karakter & tidak lebih kecil dari 6]
        // Tediri dari nama depan dan nama belakang
        parameterNotOk = true;
        if (!nama.equals("") && nama.length() < 16 && nama.length() >= 6 && !nama.matches("[0-9]+")) {
            parameterNotOk = false;
        } else {
            System.out.println(cetak.ANSI_RED_BG
                    + "Masukan Nama yang valid! [Max 16 & Min 6]"
                    + cetak.ANSI_RESET);
        }

        // cek inputan alamat
        if (alamat.length() >= 6) {
            parameterNotOk = false;
        } else {
            System.out.println(cetak.ANSI_RED_BG
                    + "Masukan alamat yang valid! [Min 6]"
                    + cetak.ANSI_RESET);
        }

        if (parameterNotOk) {
        }
    }
}
