/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class CacheFiles {
    private static String userHome;
    private static boolean initialized;
    private static Hashtable field_a;
    private static String gameName;
    private static int buildId;

    private CacheFiles() throws Throwable {
        throw new Error();
    }

    public static File resolveCacheFile(String param0, int param1, String param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param2, param0);
    }

    public static File resolveCacheFile(String param0, byte param1) {
        if (param1 == 34) {
          return CacheFiles.resolveCacheFile(param0, param1 ^ -35, gameName, buildId);
        }
        userHome = (String) null;
        return CacheFiles.resolveCacheFile(param0, param1 ^ -35, gameName, buildId);
    }

    public static void initialize(int param0, int param1, String param2) {
        Exception exception = null;
        String var4 = null;
        Throwable decompiledCaughtException = null;
        if (param1 >= -103) {
          var4 = (String) null;
          CacheFiles.resolveCacheFile((String) null, -23, (String) null, -127);
        }
        buildId = param0;
        gameName = param2;
        try {
          userHome = System.getProperty("user.home");
          if (null != userHome) {
            userHome = userHome + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        initialized = true;
        if (userHome == null) {
          userHome = "~/";
        }
    }

    static {
        initialized = false;
        field_a = new Hashtable(16);
    }
}
