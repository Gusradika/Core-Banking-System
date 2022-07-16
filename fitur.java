import java.io.*;
import java.util.*;
import java.text.*;

public class fitur {

    public static int input = 0;
    public static String ktp = "", nama = "", alamat = "", gender = "", agama = "", birthdate = "", telp = "",
            ibukandung = "", email = "", pekerjaan = "", inputString = "", pin = "", norek = "", createDate = "";
    private static boolean parameterNotOk = true;
    public static SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    public static SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");
    public static Date date = new Date();

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
                    cetak.ANSI_CYAN + "LOGGED IN AS" + cetak.ANSI_RESET + " " + cache.loginId[main.loginAlias]
                            + cetak.ANSI_CYAN + " Time : " + formatter1.format(date) + cetak.ANSI_RESET);
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
        System.out.println("Silahkan mengisi form untuk melakukan Registrasi" + cetak.ANSI_CYAN
                + " [0 = Cancel | -help = Guide mengisi]" + cetak.ANSI_RESET);
        cetak.spasi(1);
        System.out.println(cetak.ANSI_GREEN + "#### Data diri     ####" + cetak.ANSI_RESET);
        // KTP
        do {
            System.out.print("Nomor identitas\t\t\t: ");
            ktp = main.br.readLine();
            registNasabahCancel();
            cekInputan();
        } while (parameterNotOk);

        // NAMA
        do {
            System.out.print("Nama [Depan & Belakang]\t\t: ");
            nama = main.br.readLine();
            registNasabahCancel();
            cekInputan();
        } while (parameterNotOk);

        // ALAMAT
        do {
            System.out.print("Alamat sesuai identitas\t\t: ");
            alamat = main.br.readLine();
            registNasabahCancel();
            cekInputan();
        } while (parameterNotOk);

        // JENIS KELAMIN
        do {
            System.out.print("Jenis kelamin (L/ P)\t\t: "); // L / P
            gender = main.br.readLine();
            registNasabahCancel();
            cekInputan();
        } while (parameterNotOk);

        do {
            System.out.print("Agama\t\t\t\t: ");
            agama = main.br.readLine();
            registNasabahCancel();
            cekInputan();
        } while (parameterNotOk);

        do {
            System.out.print("Tanggal lahir [DD/MM/YYYY]\t: ");
            birthdate = main.br.readLine();
            registNasabahCancel();
            cekInputan();
        } while (parameterNotOk);

        cetak.spasi(1);
        System.out.println(cetak.ANSI_GREEN + "#### Data Tambahan ####" + cetak.ANSI_RESET);
        do {
            System.out.print("Nomor telepon\t\t\t: ");
            telp = main.br.readLine();
            registNasabahCancel();
            cekInputan();
        } while (parameterNotOk);

        do {
            System.out.print("Nama ibu kandung\t\t: ");
            ibukandung = main.br.readLine();
            registNasabahCancel();
            cekInputan();
        } while (parameterNotOk);

        do {
            System.out.print("Email\t\t\t\t: ");
            email = main.br.readLine();
            registNasabahCancel();
            cekInputan();
        } while (parameterNotOk);

        cetak.spasi(1);
        System.out.println(cetak.ANSI_GREEN + "#### Data Pekerjaan ####" + cetak.ANSI_RESET);
        do {
            System.out.print("Pekerjaan\t\t\t: ");
            pekerjaan = main.br.readLine();
            registNasabahCancel();
            cekInputan();
        } while (parameterNotOk);

        // PRINT SEMUA DATA YANG TELAH DI INPUT LALU, apakah anda yakin untuk
        // melanjutkan?

        if (!parameterNotOk) {
            cetak.spasi(1);
            cetak.banner2("Rekap Pengisian");
            cetak.spasi(1);
            System.out.println(cetak.ANSI_YELLOW + "#### Data diri     ####" + cetak.ANSI_RESET);
            System.out.println("Nomor identitas\t\t\t: " + ktp);
            System.out.println("Nama [Depan & Belakang]\t\t: " + nama);
            System.out.println("Alamat sesuai identitas\t\t: " + alamat);
            System.out.println("Jenis kelamin (L/P)\t\t: " + gender.toUpperCase());
            System.out.println("Agama\t\t\t\t: " + agama);
            System.out.println("Tanggal lahir [DD/MM/YYYY]\t: " + birthdate);

            cetak.spasi(1);
            System.out.println(cetak.ANSI_YELLOW + "#### Data Tambahan ####" + cetak.ANSI_RESET);
            System.out.println("Nomor telepon\t\t\t: " + telp);
            System.out.println("Nama ibu kandung\t\t: " + ibukandung);
            System.out.println("Email\t\t\t\t: " + email);

            cetak.spasi(1);
            System.out.println(cetak.ANSI_YELLOW + "#### Data Pekerjaan ####" + cetak.ANSI_RESET);
            System.out.println("Pekerjaan\t\t\t: " + pekerjaan);
            cetak.spasi(1);

            do {
                System.out.print(cetak.ANSI_YELLOW
                        + "Apakah data anda sudah benar?" + cetak.ANSI_RESET
                        + " [0 = Rubah data / Back || 1 = Sudah Benar] >");
                inputString = main.br.readLine();
                if (inputString.equals("0")) {
                    registNasabahCancel();
                }
                if (inputString.equals("1")) {
                    break;
                } else {
                    System.out.println(cetak.ANSI_RED + "Inputan Salah" + cetak.ANSI_RESET);
                }
            } while (true);

            do {
                System.out.print("Silahkan " + cetak.ANSI_YELLOW + "Tanda Tangan" + cetak.ANSI_RESET
                        + "(Sebagai Pernyataan Setuju) dengan menuliskan nama anda >");
                inputString = main.br.readLine();
                if (inputString.equals(nama)) {
                    System.out.println(cetak.ANSI_GREEN_BG + "[Pernyataan Setuju Dibuat]" + cetak.ANSI_RESET
                            + "[DATE : " + formatter2.format(date) + "]");
                    createDate = formatter2.format(date);
                    break;
                } else {
                    System.out.println(cetak.ANSI_RED_BG + "Inputan Salah" + cetak.ANSI_RESET);
                }
            } while (true);

            cetak.spasi(2);
            System.out.println(cetak.ANSI_YELLOW + "#### Data Keamanan & Akses Transaksi ####" + cetak.ANSI_RESET);
            pin = cache.generatePin2();
            norek = cache.generateNorek();
            System.out
                    .println("PIN anda\t\t\t: " + cetak.ANSI_YELLOW_BG + pin + cetak.ANSI_RESET);
            System.out.println(
                    "Nomor Rekening\t\t\t: " + cetak.ANSI_YELLOW_BG + norek + cetak.ANSI_RESET);
            do {
                System.out.print("Ingin merubah PIN? [0 = Tidak | 1 = Ya] >");
                inputString = main.br.readLine();
                if (inputString.equals("1")) {
                    do {
                        System.out.print("Masukan Pin Yang baru [6 Digit] >");
                        pin = main.br.readLine();
                        if (pin.length() == 6 && !pin.matches("[a-zA-Z_]+")) {
                            break;
                        }
                        System.out.println(cetak.ANSI_RED_BG + "Inputan Salah!" + cetak.ANSI_RESET);
                        cetak.spasi(1);
                    } while (true);
                } else if (inputString.equals("0")) {
                    break;
                } else {
                    System.out.println(cetak.ANSI_RED_BG + "Inputan Salah" + cetak.ANSI_RESET);
                    continue;
                }
                cetak.spasi(1);
                System.out.println("PIN yang baru : " + cetak.ANSI_YELLOW_BG + pin + cetak.ANSI_RESET);
                break;
            } while (true);
            cetak.spasi(1);
            System.out.println(cetak.ANSI_GREEN_BG + "Selamat!, Registrasi Rekening anda Berhasil!" + cetak.ANSI_RESET);
            dataAccepted();
            // Pergi Setor Semua data ke Vector
        }

    }

    public static void dataAccepted() throws IOException {
        cache.Nnomorktp.add(ktp);
        cache.Nnama.add(nama);
        cache.Nalamat.add(alamat);
        cache.Ngender.add(gender);
        cache.Nagama.add(agama);
        cache.Nbirthdate.add(birthdate);
        cache.Ntelp.add(telp);
        cache.NibuKandung.add(ibukandung);
        cache.Nemail.add(email);
        cache.Npekerjaan.add(pekerjaan);
        cache.Npin.add(pin);
        cache.Nnorek.add(norek);
        cache.NcreateDate.add(createDate);
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
        pin = "";
        norek = "";
        createDate = "";
        System.out.println(cetak.ANSI_GREEN_BG + "SUKSES & Now Exiting..." + cetak.ANSI_RESET);
        mainMenu();
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
            pin = "";
            norek = "";
            createDate = "";

            // Tambahkan Debug Mode disini
            System.out.println(cetak.ANSI_RED_BG + "Canceled" + cetak.ANSI_RESET);
            mainMenu();
        } else if (ktp.equals("-help") || nama.equals("-help") || alamat.equals("-help") || gender.equals("-help")
                || agama.equals("-help")
                || birthdate.equals("-help") || telp.equals("-help") || ibukandung.equals("-help")
                || email.equals("-help")
                || pekerjaan.equals("-help")) {
            // Buat Sistem Seperti OWSS dimana kita dapat memberikan parameter huruf di
            // setiap baris untuk guide.
        } else if (inputString.equals("0")) {
            cetak.spasi(2);
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
            pin = "";
            norek = "";
            createDate = "";
            System.out.println(cetak.ANSI_RED_BG + "Rubah Data" + cetak.ANSI_RESET);
            inputString = "";
            registNasabah();
        }
    }

    public static void cekInputan() {
        // cek inputan ktp dengan rules [Terdiri dari 11 karakter || Tidak Menggunakan
        // Huruf]
        if (!ktp.equals("") && ktp.length() == 11 && !ktp.matches("[a-zA-Z_]+")) {
            parameterNotOk = false;
        } else if (!ktp.equals("")) {
            System.out.println(cetak.ANSI_RED_BG
                    + "Masukan data KTP yang valid! [Terdiri dari 11 karakter || Tidak Menggunakan Huruf]"
                    + cetak.ANSI_RESET);
            parameterNotOk = true;
        }
        // cek inputan Nama [tidak lebih dari 16 karakter & tidak lebih kecil dari 6]
        // Tediri dari nama depan dan nama belakang
        if (!nama.equals("") && nama.length() < 16 && nama.length() >= 6 && !nama.matches("[0-9]+")) {
            parameterNotOk = false;
        } else if (!nama.equals("")) {
            System.out.println(cetak.ANSI_RED_BG
                    + "Masukan Nama yang valid! [Max 16 & Min 6 & bukan huruf]"
                    + cetak.ANSI_RESET);
            parameterNotOk = true;
        }

        // cek inputan alamat
        if (alamat.length() > 6) {
            parameterNotOk = false;
        } else if (!alamat.equals("")) {
            System.out.println(cetak.ANSI_RED_BG
                    + "Masukan alamat yang valid! [Min 6]"
                    + cetak.ANSI_RESET);
            parameterNotOk = true;
        }

        // cek inputan Gender
        if ((gender.equalsIgnoreCase("L") || gender.equalsIgnoreCase("P")) && !gender.equals("")) {
            parameterNotOk = false;
        } else if (!gender.equals("")) {
            System.out.println(cetak.ANSI_RED_BG
                    + "Masukan gender yang valid! [L / P]"
                    + cetak.ANSI_RESET);
            parameterNotOk = true;
        }

        // cek inputan agama
        if (agama.length() >= 5 && !agama.equals("")) {
            parameterNotOk = false;
        } else if (agama.length() < 5 && !agama.equals("")) {
            System.out.println(cetak.ANSI_RED_BG
                    + "Masukan nama Agama yang valid [Min 5]"
                    + cetak.ANSI_RESET);
            parameterNotOk = true;
        }

        // cek inputan birthdate manfaatkan String to Integer if substr pertama 0 maka
        // cut dengan char at nomor 2 sampai habis di masukan ke data yang baru
        // (replace)
        if (birthdate.length() == 10 && !birthdate.matches("[a-zA-Z_]+") && !birthdate.equals("")) {
            parameterNotOk = false;
        } else if (!birthdate.equals("")) {
            System.out.println(cetak.ANSI_RED_BG
                    + "Masukan Birthdate yang valid [DD/MM/YYYY] jangan lupa Tuliskan \"/\""
                    + cetak.ANSI_RESET);
            parameterNotOk = true;
        }

        // cek inputan notelp
        if (telp.length() >= 8 && !telp.matches("[a-zA-Z_]+") && telp.length() < 14 && !telp.equals("")) {
            parameterNotOk = false;
        } else if (!telp.equals("")) {
            System.out.println(cetak.ANSI_RED_BG
                    + "Masukan NoTelp yang valid [min = 8 & bukan huruf & max = 13]"
                    + cetak.ANSI_RESET);
            parameterNotOk = true;
        }

        // cek inputan ibu kandung
        if (!ibukandung.equals("") && ibukandung.length() < 16 && ibukandung.length() >= 6
                && !ibukandung.matches("[0-9]+")) {
            parameterNotOk = false;
        } else if (!ibukandung.equals("")) {
            System.out.println(cetak.ANSI_RED_BG
                    + "Masukan Nama yang valid! [Max 16 & Min 6 & bukan huruf]"
                    + cetak.ANSI_RESET);
            parameterNotOk = true;
        }

        // cek inputan email
        if (!email.equals("") && email.length() >= 8) {
            parameterNotOk = false;
        } else if (!email.equals("")) {
            System.out.println(cetak.ANSI_RED_BG
                    + "Masukan Email yang valid! [Min = 8]"
                    + cetak.ANSI_RESET);
            parameterNotOk = true;
        }

        // cek inputan pekerjaan
        if (!pekerjaan.equals("") && pekerjaan.length() > 4 && !pekerjaan.matches("[0-9]+")) {
            parameterNotOk = false;
        } else if (!pekerjaan.equals("")) {
            System.out.println(cetak.ANSI_RED_BG
                    + "Masukan Data Pekerjaan yang valid! [Min = 5 & bukan angka]"
                    + cetak.ANSI_RESET);
            parameterNotOk = true;
        }

        if (parameterNotOk) {
        }
    }
}
