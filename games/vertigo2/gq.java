/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class gq {
    private static String field_b;
    private static boolean field_c;
    private static Hashtable field_d;
    private static int field_a;
    private static String field_e;

    private gq() throws Throwable {
        throw new Error();
    }

    public static File a(String param0, int param1) {
        if (param1 >= -118) {
            field_d = null;
            return gq.a(0, field_a, param0, field_e);
        }
        return gq.a(0, field_a, param0, field_e);
    }

    public static void a(byte param0, String param1, int param2) {
        if (param0 != -110) {
            return;
        }
        field_a = param2;
        field_e = param1;
        try {
            field_b = System.getProperty("user.home");
            // ifnull L57
            field_b = field_b + "/";
        } catch (Exception exception) {
        }
        field_c = true;
        if (!(field_b != null)) {
            field_b = "~/";
        }
    }

    public static File a(int param0, int param1, String param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param3, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_d = new Hashtable(16);
    }
}
