/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class CacheFileLocator {
    private static boolean cacheEnvironmentInitialized;
    private static Hashtable unusedLegacyFileLookupCache;
    private static int cacheVariant;
    private static String gameCacheName;
    private static String homeDirectoryPrefix;

    private CacheFileLocator() throws Throwable {
        throw new Error();
    }

    public static void initializeCacheEnvironment(byte initializationGuard, String gameName, int variant) {
        Exception ignoredHomeDirectoryException = null;
        Throwable caughtHomeDirectoryThrowable = null;
        gameCacheName = gameName;
        cacheVariant = variant;
        try {
          homeDirectoryPrefix = System.getProperty("user.home");
          if (null != homeDirectoryPrefix) {
            homeDirectoryPrefix = homeDirectoryPrefix + "/";
          }
          if (initializationGuard != 66) {
            cacheEnvironmentInitialized = true;
            if (null != homeDirectoryPrefix) {
              cacheEnvironmentInitialized = true;
              return;
            }
            homeDirectoryPrefix = "~/";
            cacheEnvironmentInitialized = true;
            return;
          }
        } catch (java.lang.Exception homeDirectoryLookupFailure) {
          caughtHomeDirectoryThrowable = homeDirectoryLookupFailure;
          ignoredHomeDirectoryException = (Exception) (Object) caughtHomeDirectoryThrowable;
        }
        if (null == homeDirectoryPrefix) {
          homeDirectoryPrefix = "~/";
        }
        cacheEnvironmentInitialized = true;
    }

    public static File resolveRedirectedCacheFile(String gameName, int unusedResolverGuard, String fileName, int unusedCacheVariant) {
        return net.alterorb.launcher.Hook.cacheRedirect(gameName, fileName);
    }

    public static File resolveGameCacheFile(String fileName, byte lookupGuard) {
        if (lookupGuard <= -67) {
            return CacheFileLocator.resolveRedirectedCacheFile(gameCacheName, -27533, fileName, cacheVariant);
        }
        String unusedCacheLookupValue = (String) null;
        CacheFileLocator.resolveGameCacheFile((String) null, (byte) -120);
        return CacheFileLocator.resolveRedirectedCacheFile(gameCacheName, -27533, fileName, cacheVariant);
    }

    static {
        cacheEnvironmentInitialized = false;
        unusedLegacyFileLookupCache = new Hashtable(16);
    }
}
