/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class lfb {
    private static String field_b;
    private static boolean field_d;
    private static Hashtable field_a;
    private static String field_e;
    private static int field_c;

    private lfb() throws Throwable {
        throw new Error();
    }

    public static File a(String param0, int param1, String param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param2, param0);
    }

    public static File a(String param0, byte param1) {
        if (param1 != 34) {
          field_b = null;
          return lfb.a(param0, param1 ^ -35, field_e, field_c);
        } else {
          return lfb.a(param0, param1 ^ -35, field_e, field_c);
        }
    }

    public static void a(int param0, int param1, String param2) {
        if (param1 >= -103) {
            Object var4 = null;
            File discarded$0 = lfb.a((String) null, -23, (String) null, -127);
        }
        field_c = param0;
        field_e = param2;
        try {
            field_b = System.getProperty("user.home");
            // if_acmpeq L79
            field_b = field_b + "/";
        } catch (Exception exception) {
        }
        field_d = true;
        if (!(field_b != null)) {
            field_b = "~/";
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
        field_a = new Hashtable(16);
    }
}
