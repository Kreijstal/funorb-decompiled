/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class CacheFileLocator {
    private static int field_c;
    private static String field_b;
    private static String field_a;
    private static Hashtable field_d;
    private static boolean field_e;

    public static File a(String param0, byte param1) {
        int var2 = -89 / ((param1 - 54) / 33);
        return CacheFileLocator.a(field_a, field_c, 24173, param0);
    }

    public static File a(String param0, int param1, int param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param3);
    }

    private CacheFileLocator() throws Throwable {
        throw new Error();
    }

    public static void a(String param0, int param1, int param2) {
        field_c = param1;
        field_a = param0;
        try {
          if (param2 > -12) {
            String var4 = (String) null;
            CacheFileLocator.a((String) null, 107, 50, (String) null);
          }
          field_b = System.getProperty("user.home");
          if (null == field_b) {
            if (null == field_b) {
              field_b = "~/";
            }
            field_e = true;
            return;
          }
          field_b = field_b + "/";
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          Throwable decompiledCaughtException = decompiledCaughtParameter0;
          Exception var3 = (Exception) (Object) decompiledCaughtException;
          if (null == field_b) {
            field_b = "~/";
          }
          field_e = true;
          return;
        }
        if (null == field_b) {
          field_b = "~/";
        }
        field_e = true;
    }

    static {
        field_e = false;
        field_d = new Hashtable(16);
    }
}
