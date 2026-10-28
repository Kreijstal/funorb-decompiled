/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class CacheFileLocator {
    private static int cacheBuild;
    private static String homeDirectory;
    private static String cacheName;
    private static Hashtable cachedFiles;
    private static boolean initialized;

    public static File resolveFile(String fileName, byte guard) {
        int var2 = -89 / ((guard - 54) / 33);
        return CacheFileLocator.resolveFile(cacheName, cacheBuild, 24173, fileName);
    }

    public static File resolveFile(String cacheName, int cacheBuild, int guard, String fileName) {
        return net.alterorb.launcher.Hook.cacheRedirect(cacheName, fileName);
    }

    private CacheFileLocator() throws Throwable {
        throw new Error();
    }

    public static void initialize(String newCacheName, int newCacheBuild, int guard) {
        cacheBuild = newCacheBuild;
        cacheName = newCacheName;
        try {
          if (guard > -12) {
            String var4 = (String) null;
            CacheFileLocator.resolveFile((String) null, 107, 50, (String) null);
          }
          homeDirectory = System.getProperty("user.home");
          if (null == homeDirectory) {
            if (null == homeDirectory) {
              homeDirectory = "~/";
            }
            initialized = true;
            return;
          }
          homeDirectory = homeDirectory + "/";
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          Throwable decompiledCaughtException = decompiledCaughtParameter0;
          Exception var3 = (Exception) (Object) decompiledCaughtException;
          if (null == homeDirectory) {
            homeDirectory = "~/";
          }
          initialized = true;
          return;
        }
        if (null == homeDirectory) {
          homeDirectory = "~/";
        }
        initialized = true;
    }

    static {
        initialized = false;
        cachedFiles = new Hashtable(16);
    }
}
