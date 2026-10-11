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
        if (param1 == 34) {
          return lfb.a(param0, param1 ^ -35, field_e, field_c);
        }
        field_b = (String) null;
        return lfb.a(param0, param1 ^ -35, field_e, field_c);
    }

    public static void a(int param0, int param1, String param2) {
        Exception exception = null;
        String var4 = null;
        Throwable decompiledCaughtException = null;
        if (param1 >= -103) {
          var4 = (String) null;
          lfb.a((String) null, -23, (String) null, -127);
        }
        field_c = param0;
        field_e = param2;
        try {
          field_b = System.getProperty("user.home");
          if (null != field_b) {
            field_b = field_b + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        field_d = true;
        if (field_b == null) {
          field_b = "~/";
        }
    }

    static {
        field_d = false;
        field_a = new Hashtable(16);
    }
}
