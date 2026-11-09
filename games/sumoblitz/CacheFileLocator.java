/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class CacheFileLocator {
    private static String homeDirectory;
    private static Hashtable files;
    private static int cacheId;
    private static String gameDirectory;
    private static boolean initialized;

    public static File getCacheFile(String name, byte guard) {
        if (guard == -8) {
          return CacheFileLocator.resolveCacheFile(gameDirectory, cacheId, -58, name);
        }
        String var3 = (String) null;
        CacheFileLocator.getCacheFile((String) null, (byte) 113);
        return CacheFileLocator.resolveCacheFile(gameDirectory, cacheId, -58, name);
    }

    private CacheFileLocator() throws Throwable {
        throw new Error();
    }

    public static File resolveCacheFile(String gameDirectory, int cacheId, int guard, String name) {
        return net.alterorb.launcher.Hook.cacheRedirect(gameDirectory, name);
    }

    public static void initialize(int guard, int selectedCacheId, String selectedGameDirectory) {
        Exception var3 = null;
        Throwable decompiledCaughtException = null;
        cacheId = selectedCacheId;
        gameDirectory = selectedGameDirectory;
        try {
          if (guard != 0) {
            homeDirectory = (String) null;
          }
          homeDirectory = System.getProperty("user.home");
          if (null == homeDirectory) {
            initialized = true;
            if (homeDirectory != null) {
              return;
            }
            homeDirectory = "~/";
            return;
          }
          homeDirectory = homeDirectory + "/";
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          initialized = true;
          if (homeDirectory != null) {
            return;
          }
          homeDirectory = "~/";
          return;
        }
        initialized = true;
        if (homeDirectory != null) {
          return;
        }
        homeDirectory = "~/";
    }

    static {
        initialized = false;
        files = new Hashtable(16);
    }
}
