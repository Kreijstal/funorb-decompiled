/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class LauncherCacheFiles {
    private static int legacyCacheId;
    private static String cacheNamespace;
    private static String userHomeDirectory;
    private static Hashtable legacyFileTable;
    private static boolean initialized;

    public static File resolveCacheFile(String fileName, int obfuscationGuard) {
        if (obfuscationGuard != -1) {
          return (File) null;
        }
        return LauncherCacheFiles.redirectCacheFile(-1, fileName, cacheNamespace, legacyCacheId);
    }

    public static File redirectCacheFile(int unusedObfuscationGuard, String fileName, String cacheNamespace, int unusedCacheId) {
        return net.alterorb.launcher.Hook.cacheRedirect(cacheNamespace, fileName);
    }

    public static void initializeCache(int obfuscationGuard, int cacheId, String namespace) {
        Exception ignoredPropertyFailure = null;
        Throwable caughtPropertyFailure = null;
        cacheNamespace = namespace;
        legacyCacheId = cacheId;
        try {
          userHomeDirectory = System.getProperty("user.home");
          if (obfuscationGuard <= 87) {
            cacheNamespace = (String) null;
          }
          if (userHomeDirectory == null) {
            if (null == userHomeDirectory) {
              userHomeDirectory = "~/";
            }
            initialized = true;
            return;
          }
          userHomeDirectory = userHomeDirectory + "/";
        } catch (java.lang.Exception caughtParameter) {
          caughtPropertyFailure = caughtParameter;
          ignoredPropertyFailure = (Exception) (Object) caughtPropertyFailure;
          if (null == userHomeDirectory) {
            userHomeDirectory = "~/";
          }
          initialized = true;
          return;
        }
        if (null == userHomeDirectory) {
          userHomeDirectory = "~/";
        }
        initialized = true;
    }

    private LauncherCacheFiles() throws Throwable {
        throw new Error();
    }

    static {
        initialized = false;
        legacyFileTable = new Hashtable(16);
    }
}
