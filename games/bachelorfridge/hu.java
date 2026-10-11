/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class hu {
    private static int field_a;
    private static String field_b;
    private static boolean field_d;
    private static Hashtable field_c;
    private static String field_e;

    public static File a(String param0, int param1) {
        if (param1 == 0) {
          return hu.a(field_a, param0, field_e, 1);
        }
        String var3 = (String) null;
        hu.a((String) null, -116);
        return hu.a(field_a, param0, field_e, 1);
    }

    public static File a(int param0, String param1, String param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param2, param1);
    }

    private hu() throws Throwable {
        throw new Error();
    }

    public static void a(int param0, int param1, String param2) {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        field_e = param2;
        if (param0 != 0) {
          field_b = (String) null;
        }
        field_a = param1;
        try {
          field_b = System.getProperty("user.home");
          if (field_b != null) {
            field_b = field_b + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        field_d = true;
        if (null != field_b) {
          return;
        }
        field_b = "~/";
    }

    static {
        field_d = false;
        field_c = new Hashtable(16);
    }
}
