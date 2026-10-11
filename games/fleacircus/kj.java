/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class kj {
    private static String field_e;
    private static String field_c;
    private static int field_a;
    private static Hashtable field_b;
    private static boolean field_d;

    public static File a(int param0, String param1) {
        if (param0 != 20926) {
          field_e = (String) null;
          return kj.a(field_e, -2, field_a, param1);
        }
        return kj.a(field_e, -2, field_a, param1);
    }

    public static File a(String param0, int param1, int param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param3);
    }

    public static void a(String param0, int param1, boolean param2) {
        Exception var3 = null;
        Throwable decompiledCaughtException = null;
        field_e = param0;
        field_a = param1;
        try {
          field_c = System.getProperty("user.home");
          if (field_c == null) {
            if (field_c != null) {
              field_d = param2;
              return;
            }
            field_c = "~/";
            field_d = param2;
            return;
          }
          field_c = field_c + "/";
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          if (field_c != null) {
            field_d = param2;
            return;
          }
          field_c = "~/";
          field_d = param2;
          return;
        }
        if (field_c == null) {
          field_c = "~/";
        }
        field_d = param2;
    }

    private kj() throws Throwable {
        throw new Error();
    }

    static {
        field_d = false;
        field_b = new Hashtable(16);
    }
}
