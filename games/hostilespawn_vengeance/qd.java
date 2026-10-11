/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class qd {
    private static int field_a;
    private static boolean field_b;
    private static String field_d;
    private static Hashtable field_c;
    private static String field_e;

    public static void a(int param0, int param1, String param2) {
        Exception exception = null;
        String var4 = null;
        Throwable decompiledCaughtException = null;
        if (param0 != -1) {
          var4 = (String) null;
          qd.a(107, 107, (String) null);
        }
        field_e = param2;
        field_a = param1;
        try {
          field_d = System.getProperty("user.home");
          if (null != field_d) {
            field_d = field_d + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        field_b = true;
        if (null != field_d) {
          return;
        }
        field_d = "~/";
    }

    public static File a(int param0, String param1, String param2, boolean param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param1, param2);
    }

    private qd() throws Throwable {
        throw new Error();
    }

    public static File a(String param0, int param1) {
        if (param1 == -19005) {
          return qd.a(field_a, field_e, param0, true);
        }
        String var3 = (String) null;
        qd.a(107, -10, (String) null);
        return qd.a(field_a, field_e, param0, true);
    }

    static {
        field_b = false;
        field_c = new Hashtable(16);
    }
}
