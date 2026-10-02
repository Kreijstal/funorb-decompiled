/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class aj {
    private static boolean field_e;
    private static Hashtable field_c;
    private static int field_a;
    private static String field_d;
    private static String field_b;

    private aj() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0, String param1, int param2) {
        Exception var3 = null;
        Throwable decompiledCaughtException = null;
        field_d = param1;
        field_a = param2;
        try {
          field_b = System.getProperty("user.home");
          if (null != field_b) {
            field_b = field_b + "/";
          }
          if (param0 != 66) {
            field_e = true;
            if (null != field_b) {
              field_e = true;
              return;
            }
            field_b = "~/";
            field_e = true;
            return;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
        }
        if (null != field_b) {
          field_e = true;
          return;
        }
        field_b = "~/";
        field_e = true;
    }

    public static File a(String param0, int param1, String param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param2);
    }

    public static File a(String param0, byte param1) {
        if (param1 <= -67) {
            return aj.a(field_d, -27533, param0, field_a);
        }
        String var3 = (String) null;
        aj.a((String) null, (byte) -120);
        return aj.a(field_d, -27533, param0, field_a);
    }

    static {
        field_e = false;
        field_c = new Hashtable(16);
    }
}
