import java.util.*;

public class cache {

    public static String kodeRahasia = "21410100039";

    public static int rangeMinNorek = 1000, rangeMaxNorek = 9999, rangeMinPin = 100, rangeMaxPin = 999;
    public static Random random = new Random();

    private static String String_dataAdminUserName[] = { "1", "debug" };
    private static String String_dataAdminUserPass[] = { "1", "debug" };
    public static String[] loginId = { "Administrator", "Debugmode" };
    public static Vector<String> Vector_dataAdminUserName = new Vector<String>();
    public static Vector<String> Vector_dataAdminUserPass = new Vector<String>();

    // Cache Data Nasabah 1 2 3 4 5 6 7 8
    private static String[] SNnomorKtp = { "21410100039", "45210100022", "22510100033", "33440100010", "01013389002",
            "09410100002", "01010100005", "20014100022" };
    private static String[] SNnama = { "Aditya kesuma", "Ahmad Dhani", "Rudi Salim", "Cheryl Kalya", "Anjayani Vikar",
            "Natasha Daliman", "Putri Darma", "Nike Ardila" };
    private static String[] SNalamat = { "Jl.Bhayangkara B14 RT.11 RW.02", "Jl.Astungkara Raya 9 RT.01 RW.02",
            "Perum Arjuna 9b RT.29 RW.10", "Jl.Ahmad Yani 11b RT.20 RW.07", "Jl.Ketintang 11a RT.08 RW.01",
            "Jl.Jendral Sudirman 1a RT.02 RW.01", "Perum Belimbing 9c RT.49 RW.09", "Perum Gatotkaca 20 RT.45 RW.02" };
    private static String[] SNgender = { "L", "L", "L", "P", "P", "P", "P", "P" };
    private static String[] SNagama = { "Islam", "Islam", "Islam", "Kristen", "Budha", "Kristen", "Islam", "Islam" };
    public static String[] SNbirthdate = { "15/09/2000", "20/02/1988", "06/04/1979", "11/04/2001", "29/03/1970",
            "15/07/1997", "22/02/1994", "04/05/2000" };

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
    public static String[] SNcreateDate = { "16/07/2022", "04/05/2014", "13/02/1999", "11/08/2013", "01/01/2000",
            "15/05/1989", "07/12/2019", "03/03/2015" };

    public static String[] SNnopin = { "000000", "898989", "123412", "098765", "556611", "772200", "676721", "232323" };
    public static String[] SNnorek = { "21410039", "99998888", "12344321", "22346767", "55445544", "89011000",
            "56782022", "88887777" };

    public static int[] SNsaldo = { 150000, 2000000, 300000, 450000, 1500000, 600000, 780000, 100000 };

    // Cache data nasabah
    public static Vector<String> Nnomorktp = new Vector<String>();
    public static Vector<String> Nnama = new Vector<String>();
    public static Vector<String> Nalamat = new Vector<String>();
    public static Vector<String> Ngender = new Vector<String>();
    public static Vector<String> Nagama = new Vector<String>();
    public static Vector<String> Nbirthdate = new Vector<String>();

    // Cache data pendukung
    public static Vector<String> NibuKandung = new Vector<String>();
    public static Vector<String> Ntelp = new Vector<String>();
    public static Vector<String> Nemail = new Vector<String>();

    // Cache data pendukung
    public static Vector<String> Npekerjaan = new Vector<String>();
    public static Vector<String> NcreateDate = new Vector<String>();

    public static Vector<String> Npin = new Vector<String>();
    public static Vector<String> Nnorek = new Vector<String>();

    public static Vector<Integer> Nsaldo = new Vector<Integer>();

    // Rekaman Transaksi
    public static Vector<Character> Rtipe = new Vector<Character>();
    public static Vector<Integer> Rjumlah = new Vector<Integer>();
    public static Vector<Integer> Rtotal = new Vector<Integer>();
    public static Vector<String> Rdate = new Vector<String>();
    public static Vector<String> Rnama = new Vector<String>();

    // Validator Rekaman Transaksi
    public static Vector<Integer> Rvalidator = new Vector<Integer>();

    public static void allCache() {
        dataAdminVector();
        dataCacheNasabah();
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

            // Data No Pin & No rek
            Nnorek.add(SNnorek[i]);
            Npin.add(SNnopin[i]);

            // Data saldo
            Nsaldo.add(SNsaldo[i]);

            // Rekaman Saldo
            Rtipe.add('K');
            Rjumlah.add(SNsaldo[i]);
            Rtotal.add(SNsaldo[i]);
            Rdate.add(fitur.formatter3.format(fitur.date));
            Rnama.add("Setoran Tunai");
            Rvalidator.add(i);
        }
    }

    // public static void generatePin() {
    // /*
    // * method ini digunakan untuk generate Pin khusus pengguna yang sudah di
    // * tentukan di awal program (cache)
    // *
    // * RUMUS :
    // * SNnomorktp 2141010039 --> 2 Pertama = 21
    // * SNtelp 081330293390 --> 2 Terakhir = 90
    // * SNnomorktp 2141010039 --> 2 Terakhir = 39
    // * PIN = 219039
    // */
    // String temp = "";
    // for (int i = 0; i < SNnomorKtp.length; i++) {
    // temp = SNnomorKtp[i].substring(0, 2) + SNtelp[i].substring(10, 12) +
    // SNnomorKtp[i].substring(8, 10);
    // // System.out.println(i + "- " + temp);
    // Npin.add(temp);
    // }
    // }

    public static String generatePin2() {
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
        // temp = fitur.ktp.substring(0, 2) + fitur.telp.substring((fitur.telp.length()
        // - 2), fitur.telp.length())
        // + fitur.ktp.substring(9, fitur.ktp.length());
        for (int i = 0; i < 2; i++) {
            int tempInt = random.nextInt(rangeMaxPin + 1 - rangeMinPin) + rangeMinPin;
            String a = Integer.toString(tempInt);
            temp = temp + a;
        }
        return temp;
    }

    public static String generateNorek() {
        String temp = "";
        // 1234 5678
        for (int i = 0; i < 2; i++) {
            int tempInt = random.nextInt(rangeMaxNorek + 1 - rangeMinNorek) + rangeMinNorek;
            String a = Integer.toString(tempInt);
            temp = temp + a;
        }

        return temp;
    }

    public static void dataAdminVector() {
        for (int i = 0; i < String_dataAdminUserName.length; i++) {
            Vector_dataAdminUserName.add(String_dataAdminUserName[i]);
            Vector_dataAdminUserPass.add(String_dataAdminUserPass[i]);
        }
    }

}
