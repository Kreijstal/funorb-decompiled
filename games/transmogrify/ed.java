/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class ed {
    private static boolean field_a;
    private static String field_e;
    private static Hashtable field_d;
    private static String field_c;
    private static int field_b;

    public static File a(String param0, int param1) {
        if (param1 != 32718) {
          return (File) null;
        }
        return ed.a(51, field_b, param0, field_c);
    }

    public static void a(byte param0, String param1, int param2) {
        Exception var3 = null;
        Throwable decompiledCaughtException = null;
        field_b = param2;
        field_c = param1;
        try {
          field_e = System.getProperty("user.home");
          if (param0 != -4) {
            return;
          }
          if (field_e == null) {
            if (null == field_e) {
              field_e = "~/";
            }
            field_a = true;
            return;
          }
          field_e = field_e + "/";
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          if (null == field_e) {
            field_e = "~/";
          }
          field_a = true;
          return;
        }
        if (null == field_e) {
          field_e = "~/";
        }
        field_a = true;
    }

    private ed() throws Throwable {
        throw new Error();
    }

    public static File a(int param0, int param1, String param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param3, param2);
    }

    static {
        field_a = false;
        field_d = new Hashtable(16);
    }
}
