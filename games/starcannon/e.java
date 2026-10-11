/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class e {
    private static int field_c;
    private static Hashtable field_a;
    private static boolean field_b;
    private static String field_e;
    private static String field_d;

    public static File a(int param0, String param1) {
        if (param0 != 0) {
          return (File) null;
        }
        return e.a(param1, field_d, -8204, field_c);
    }

    public static void a(int param0, String param1, int param2) {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        field_d = param1;
        field_c = param0;
        try {
          field_e = System.getProperty("user.home");
          if (field_e != null) {
            field_e = field_e + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        field_b = true;
        if (param2 != -19960) {
          return;
        }
        if (null == field_e) {
          field_e = "~/";
        }
    }

    private e() throws Throwable {
        throw new Error();
    }

    public static File a(String param0, String param1, int param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param1, param0);
    }

    static {
        field_b = false;
        field_a = new Hashtable(16);
    }
}
