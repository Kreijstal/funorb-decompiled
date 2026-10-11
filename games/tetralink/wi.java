/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class wi {
    private static Hashtable field_c;
    private static String field_e;
    private static int field_d;
    private static boolean field_b;
    private static String field_a;

    private wi() throws Throwable {
        throw new Error();
    }

    public static File a(String param0, boolean param1, int param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param3);
    }

    public static File a(String param0, boolean param1) {
        if (param1) {
          return (File) null;
        }
        return wi.a(field_e, false, field_d, param0);
    }

    public static void a(String param0, int param1, int param2) {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        field_d = param2;
        field_e = param0;
        try {
          field_a = System.getProperty("user.home");
          if (field_a != null) {
            field_a = field_a + "/";
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        if (null == field_a) {
          field_a = "~/";
        }
        if (param1 != 11217) {
          return;
        }
        field_b = true;
    }

    static {
        field_b = false;
        field_c = new Hashtable(16);
    }
}
