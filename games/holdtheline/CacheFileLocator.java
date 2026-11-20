/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class CacheFileLocator {
    private static String field_a;
    private static String field_d;
    private static boolean field_e;
    private static int field_c;
    private static Hashtable field_b;

    public static File resolveCacheFile(int param0, String param1, boolean param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param3, param1);
    }

    private CacheFileLocator() throws Throwable {
        throw new Error();
    }

    public static void initialize(String param0, int param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        Throwable decompiledCaughtException = null;
        field_a = param0;
        field_c = param1;
        try {
          field_d = System.getProperty("user.home");
          var3_int = -102 % ((param2 - 41) / 54);
          if (field_d != null) {
            field_d = field_d + "/";
            if (null == field_d) {
              field_d = "~/";
            }
            field_e = true;
            return;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
        }
        if (null == field_d) {
          field_d = "~/";
        }
        field_e = true;
    }

    public static File resolveCacheFile(String param0, int param1) {
        if (param1 > 10) {
          return CacheFileLocator.resolveCacheFile(field_c, param0, false, field_a);
        }
        String var3 = (String) null;
        CacheFileLocator.initialize((String) null, 25, 85);
        return CacheFileLocator.resolveCacheFile(field_c, param0, false, field_a);
    }

    static {
        field_e = false;
        field_b = new Hashtable(16);
    }
}
