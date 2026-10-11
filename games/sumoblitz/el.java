/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class el {
    private static String field_e;
    private static Hashtable field_d;
    private static int field_b;
    private static String field_c;
    private static boolean field_a;

    public static File a(String param0, byte param1) {
        if (param1 == -8) {
          return el.a(field_c, field_b, -58, param0);
        }
        String var3 = (String) null;
        el.a((String) null, (byte) 113);
        return el.a(field_c, field_b, -58, param0);
    }

    private el() throws Throwable {
        throw new Error();
    }

    public static File a(String param0, int param1, int param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param3);
    }

    public static void a(int param0, int param1, String param2) {
        Exception var3 = null;
        Throwable decompiledCaughtException = null;
        field_b = param1;
        field_c = param2;
        try {
          if (param0 != 0) {
            field_e = (String) null;
          }
          field_e = System.getProperty("user.home");
          if (null == field_e) {
            field_a = true;
            if (field_e != null) {
              return;
            }
            field_e = "~/";
            return;
          }
          field_e = field_e + "/";
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          field_a = true;
          if (field_e != null) {
            return;
          }
          field_e = "~/";
          return;
        }
        field_a = true;
        if (field_e != null) {
          return;
        }
        field_e = "~/";
    }

    static {
        field_a = false;
        field_d = new Hashtable(16);
    }
}
