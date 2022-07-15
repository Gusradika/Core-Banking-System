import java.util.*;

public class cache {

    private static String String_dataAdminUserName[] = { "1", "debug" };
    private static String String_dataAdminUserPass[] = { "1", "debug" };
    public static String[] loginId = { "Adminstrator", "Debugmode" };
    public static Vector<String> Vector_dataAdminUserName = new Vector<String>();
    public static Vector<String> Vector_dataAdminUserPass = new Vector<String>();

    // Cache Data Nasabah 1 2 3 4 5 6 7 8
    private static String[] SNnomorKtp = { "2141010039", "4521010022", "2251010033", "3344010010", "0101338902",
            "0941010002", "01010100050", "2001410022" };
    private static String[] SNnama = { "Aditya kesuma", "Ahmad Dhani", "Rudi Salim", "Cheryl Kalya", "Anjayani Vikar",
            "Natasha Daliman", "Putri Darma", "Nike Ardila" };
    private static String[] SNalamat = { "Jl.Bhayangkara B14 RT.11 RW.02", "Jl.Astungkara Raya 9 RT.01 RW.02",
            "Perum Arjuna 9b RT.29 RW.10", "Jl.Ahmad Yani 11b RT.20 RW.07", "Jl.Ketintang 11a RT.08 RW.01",
            "Jl.Jendral Sudirman 1a RT.02 RW.01", "Perum Belimbing 9c RT.49 RW.09", "Perum Gatotkaca 20 RT.45 RW.02" };
    private static String[] SNgender = { "L", "L", "L", "P", "P", "P", "P", "P" };
    private static String[] SNagama = { "Islam", "Islam", "Islam", "Kristen", "Budha", "Kristen", "Islam", "Islam" };
    public static int[] SNbirthdate = { 15092000, 20021988, 6041979, 11042001, 2931970, 15071997, 22021994, 4052000 };

    // Cache Data Pendukung
    private static String[] SNibuKandung = { "Ita Indrayani", "Aisyah Purnawati", "Mega Ramayana", "Santi Sinta",
            "Ida Kadek", "Lina Damar Wangi", "Siti Nur Jannah", "Ida Bagus Astuti" };
    private static String[] SNtelp = { "081330293390", "082314133323", "081362431234", "081390892931", "081310102020",
            "081321410039", "082380909976", "081322817877" };
    private static String[] SNemail = { "21410100039@dinamika.ac.id", "Ahmadhani@gmail.com", "Rudwi34@gmail.com",
            "Cherylkayla90@yahoo.co.id", "Vikaraso@gmail.com", "Natashadlm@gmail.com", "Puput.darma@gmail.com",
            "Nikearsdila@gmail.com" };

    // Data pekerjaan
    private static String[] SNpekerjaan = { "Mahasiswa", "Karyawan Swasta", "Wiraswasta", "Mahasiswa", "Guru",
            "Wiraswasta", "Polisi", "Hakim" };
    public static int[] SNcreateDate = { 1672022, 452014, 1321999, 1182013, 112000, 1551989, 7122019, 332015 };

    // Cache data nasabah
    public static Vector Nnomorktp = new Vector<String>();
    public static Vector Nnama = new Vector<String>();
    public static Vector Nalamat = new Vector<String>();
    public static Vector Ngender = new Vector<String>();
    public static Vector Nagama = new Vector<String>();
    public static Vector Nbirthdate = new Vector<Integer>();

    // Cache data pendukung
    public static Vector NibuKandung = new Vector<String>();
    public static Vector Ntelp = new Vector<String>();
    public static Vector Nemail = new Vector<String>();

    // Cache data pendukung
    public static Vector Npekerjaan = new Vector<String>();
    public static Vector NcreateDate = new Vector<Integer>();

    public static Vector Npin = new Vector<String>();

    public static void allCache() {
        dataAdminVector();
        dataCacheNasabah();
        cache.generatePin();
    }

    public static void dataCacheNasabah() {
        for (int i = 0; i < SNnomorKtp.length; i++) {
            // Data diri
            Nnomorktp.add(SNnomorKtp[i]);
            Nnama.add(SNnama[i]);
            Nalamat.add(SNalamat[i]);
            Ngender.add(SNgender[i]);
            Nagama.add(SNagama[i]);
            Nbirthdate.add(SNbirthdate[i]);

            // Data Pendukung
            NibuKandung.add(SNibuKandung[i]);
            Ntelp.add(SNtelp[i]);
            Nemail.add(SNemail[i]);

            // Data Pekerjaan
            Npekerjaan.add(SNpekerjaan[i]);
            NcreateDate.add(SNcreateDate[i]);
        }
    }

    public static void generatePin() {
        /*
         * method ini digunakan untuk generate Pin khusus pengguna yang sudah di
         * tentukan di awal program (cache)
         * 
         * RUMUS :
         * SNnomorktp 2141010039 --> 2 Pertama = 21
         * SNtelp 081330293390 --> 2 Terakhir = 90
         * SNnomorktp 2141010039 --> 2 Terakhir = 39
         * PIN = 219039
         */
        String temp = "";
        for (int i = 0; i < SNnomorKtp.length; i++) {
            temp = SNnomorKtp[i].substring(0, 2) + SNtelp[i].substring(10, 12) + SNnomorKtp[i].substring(8, 10);
            // System.out.println(i + "- " + temp);
            Npin.add(temp);
        }
    }

    public static void dataAdminVector() {
        for (int i = 0; i < String_dataAdminUserName.length; i++) {
            Vector_dataAdminUserName.add(String_dataAdminUserName[i]);
            Vector_dataAdminUserPass.add(String_dataAdminUserPass[i]);
        }
    }

}
