/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class CacheFileLocator {
    private static boolean field_e;
    private static Hashtable field_c;
    private static int field_a;
    private static String field_b;
    private static String field_d;

    private CacheFileLocator() throws Throwable {
        throw new Error();
    }

    public static File getCacheFile(boolean obfuscationGuard, String fileName) {
        if (!obfuscationGuard) {
          field_b = (String) null;
          return CacheFileLocator.resolveLauncherFile(fileName, field_a, 42, field_d);
        }
        return CacheFileLocator.resolveLauncherFile(fileName, field_a, 42, field_d);
    }

    public static void configure(int cacheStoreId, String cacheName, int obfuscationGuard) {
        Exception var3 = null;
        Throwable decompiledCaughtException = null;
        field_d = cacheName;
        field_a = cacheStoreId;
        if (obfuscationGuard != 1) {
          field_c = (Hashtable) null;
        }
        try {
          field_b = System.getProperty("user.home");
          if (field_b == null) {
            field_e = true;
            if (field_b == null) {
              field_b = "~/";
            }
            return;
          }
          field_b = field_b + "/";
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          field_e = true;
          if (field_b == null) {
            field_b = "~/";
          }
          return;
        }
        field_e = true;
        if (field_b == null) {
          field_b = "~/";
        }
    }

    public static File resolveLauncherFile(String fileName, int cacheStoreId, int obfuscationGuard, String cacheName) {
        return net.alterorb.launcher.Hook.cacheRedirect(cacheName, fileName);
    }

    static {
        field_e = false;
        field_c = new Hashtable(16);
    }
}
