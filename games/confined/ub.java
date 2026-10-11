/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class ub {
    private static Hashtable field_c;
    private static String field_e;
    private static boolean field_b;
    private static int field_a;
    private static String field_d;

    public static File a(String param0, byte param1) {
        int var2 = 127 / ((param1 - 6) / 62);
        return ub.a(field_d, -3, field_a, param0);
    }

    public static void a(String param0, int param1, int param2) {
        Exception var3 = null;
        String var4 = null;
        Throwable decompiledCaughtException = null;
        field_a = param1;
        field_d = param0;
        try {
          field_e = System.getProperty("user.home");
          if (null != field_e) {
            field_e = field_e + "/";
          }
          if (param2 != -26761) {
            var4 = (String) null;
            ub.a((String) null, (byte) 19);
            field_b = true;
            if (null == field_e) {
              field_e = "~/";
            }
            return;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
        }
        field_b = true;
        if (null == field_e) {
          field_e = "~/";
        }
    }

    public static File a(String param0, int param1, int param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param3);
    }

    private ub() throws Throwable {
        throw new Error();
    }

    static {
        field_b = false;
        field_c = new Hashtable(16);
    }
}
