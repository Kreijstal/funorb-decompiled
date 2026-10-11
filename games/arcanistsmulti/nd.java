/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class nd {
    private static Hashtable field_e;
    private static int field_a;
    private static String field_b;
    private static String field_d;
    private static boolean field_c;

    private nd() throws Throwable {
        throw new Error();
    }

    public static File a(byte param0, String param1) {
        if (param0 != 67) {
          return (File) null;
        }
        return nd.a(param1, -3, field_a, field_b);
    }

    public static void a(String param0, int param1, boolean param2) {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        field_a = param1;
        field_b = param0;
        try {
          field_d = System.getProperty("user.home");
          if (field_d != null) {
            field_d = field_d + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        field_c = param2;
        if (null != field_d) {
          return;
        }
        field_d = "~/";
    }

    public static File a(String param0, int param1, int param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param3, param0);
    }

    static {
        field_c = false;
        field_e = new Hashtable(16);
    }
}
