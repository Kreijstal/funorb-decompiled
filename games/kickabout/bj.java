/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class bj {
    private static boolean field_e;
    private static Hashtable field_d;
    private static String field_a;
    private static String field_c;
    private static int field_b;

    public static File a(String param0, int param1) {
        if (param1 != 0) {
            field_a = null;
            return bj.a(param0, field_c, field_b, false);
        }
        return bj.a(param0, field_c, field_b, false);
    }

    public static File a(String param0, String param1, int param2, boolean param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param1, param0);
    }

    private bj() throws Throwable {
        throw new Error();
    }

    public static void a(String param0, byte param1, int param2) {
        field_b = param2;
        field_c = param0;
        if (param1 != -99) {
            field_b = -5;
        }
        try {
            field_a = System.getProperty("user.home");
            // if_acmpeq L65
            field_a = field_a + "/";
        } catch (Exception exception) {
        }
        field_e = true;
        if (!(field_a != null)) {
            field_a = "~/";
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
        field_d = new Hashtable(16);
    }
}
