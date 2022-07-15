import java.util.*;

public class cache {

    private static String String_dataAdminUserName[] = { "1", "debug" };
    private static String String_dataAdminUserPass[] = { "1", "debug" };
    public static String[] loginId = { "Adminstrator", "Debugmode" };
    public static Vector<String> Vector_dataAdminUserName = new Vector<String>();
    public static Vector<String> Vector_dataAdminUserPass = new Vector<String>();

    public static void allCache() {
        dataAdminVector();
    }

    public static void dataAdminVector() {
        for (int i = 0; i < String_dataAdminUserName.length; i++) {
            Vector_dataAdminUserName.add(String_dataAdminUserName[i]);
            Vector_dataAdminUserPass.add(String_dataAdminUserPass[i]);
        }
    }

}
