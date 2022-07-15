import java.util.*;

public class cetak {

    private static Random random = new Random();
    private static int rangeMaxText = 11;

    // Space defined by parameter
    public static void spasi(int spasi) {
        for (int i = 0; i < spasi; i++) {
            System.out.println("");
        }
    }

    // ######################################################################//
    // NEWS dan PROMOSI
    // ######################################################################//

    public static String newsPromosi() {
        String[] news = { "Promo bunga pinjaman hanya 0,5% untuk para pelaku UMK",
                "Menabung lebih mudah dengan rekening pelajar, Khusus usia dibawah 18",
                "Nikmati program syariah yang telah disediakan" };
        int int_random2 = random.nextInt(news.length);
        return news[int_random2];
    }

    // ######################################################################//
    // Banner
    // ######################################################################//

    public static String randomLoginText() {
        int int_random = random.nextInt(rangeMaxText);

        // CONTROL RANDOM LOGIN TEXT
        String[] randomText = { "Dont forget to Smile!", "Don't be afraid to follow your heart",
                "Wish you a sweet goodluck",
                "I think you're awesome (just sayin')", "No Pain, No Gain", "Work Hard, Play Hard",
                "Whats'up! I hope your day is going good so far!", "Wish you all the best", "Smile!",
                "There's always a moment for family",
                "Have a Good day" };
        return randomText[int_random];
    }

    // cetak banner biasa dengan text Yellow
    // public static void banner(String kata) {
    // int panjangGaris = kata.length();
    // for (int i = 0; i < (panjangGaris + 4); i++) {
    // System.out.print("#");
    // }
    // System.out.println();
    // System.out.println(ANSI_YELLOW + "# " + kata + ANSI_RESET
    // + "|| Dont forget to smile,happy, and keep your spirit up :)" + " #");
    // for (int i = 0; i < (panjangGaris + 4); i++) {
    // System.out.print("#");
    // }
    // System.out.println();
    // }

    // Banner debug di gunakan untuk segala urusan debugging info
    public static void bannerDebug(String kata) {
        spasi(1);
        int panjangGaris = kata.length();
        System.out.println();
        for (int i = 0; i < (panjangGaris + 4); i++) {
            System.out.print("#");
        }
        System.out.println();
        System.out.println("##  " + ANSI_CYAN_BG + kata + ANSI_RESET + "  ##");
        for (int i = 0; i < (panjangGaris + 4); i++) {
            System.out.print("#");
        }
        System.out.println();
    }

    // Banner login untuk login sebagai Admin Security Lock
    public static void bannerLogin(String kata) {
        spasi(1);
        int panjangGaris = kata.length();
        System.out.println();
        for (int i = 0; i < (panjangGaris + 4); i++) {
            System.out.print("#");
        }
        System.out.println();
        System.out.println("##  " + ANSI_GREEN + kata + "  ##" + ANSI_RESET);
        for (int i = 0; i < (panjangGaris + 4); i++) {
            System.out.print("#");
        }
        System.out.println();
    }

    public static void banner(String kata) {
        spasi(1);
        int panjangGaris = kata.length();
        System.out.println();
        for (int i = 0; i < (panjangGaris + 4); i++) {
            System.out.print("#");
        }
        System.out.println();
        System.out.println("##  " + ANSI_YELLOW + kata + ANSI_RESET + "  ##");
        for (int i = 0; i < (panjangGaris + 4); i++) {
            System.out.print("#");
        }
        System.out.println();
    }

    public static void banner2(String kata) {
        spasi(1);
        int panjangGaris = kata.length();
        System.out.println();
        for (int i = 0; i < (panjangGaris + 8); i++) {
            System.out.print("#");
        }
        System.out.println();
        System.out.println("##  " + ANSI_YELLOW + kata + ANSI_RESET + "  ##");
        for (int i = 0; i < (panjangGaris + 8); i++) {
            System.out.print("#");
        }
        System.out.println();
    }

    // ######################################################################//
    // Text Colour
    // ######################################################################//

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED_BG = "\u001B[41m";
    public static final String ANSI_YELLOW_BG = "\u001B[43m";
    public static final String ANSI_CYAN_BG = "\u001B[46m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_GREEN_BG = "\u001B[42m";
    public static final String ANSI_YELLOW = "\u001B[33m";
}
