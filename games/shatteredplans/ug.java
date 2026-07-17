/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class ug {
    private static int field_e;
    private static String field_b;
    private static Hashtable field_a;
    private static boolean field_d;
    private static String field_c;

    public static void a(int param0, String param1, byte param2) {
        Exception exception = null;
        int var3 = 0;
        Throwable decompiledCaughtException = null;
        field_e = param0;
        var3 = 82 / ((-5 - param2) / 57);
        field_c = param1;
        try {
          L0: {
            L1: {
              field_b = System.getProperty("user.home");
              if (field_b == null) {
                break L1;
              } else {
                field_b = field_b + "/";
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L2;
          }
        }
        field_d = true;
        if (field_b == null) {
          field_b = "~/";
          return;
        } else {
          return;
        }
    }

    private ug() throws Throwable {
        throw new Error();
    }

    public static File a(String param0, int param1, int param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param3, param0);
    }

    public static File a(String param0, boolean param1) {
        if (param1) {
            return null;
        }
        return ug.a(param0, field_e, -18261, field_c);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
        field_a = new Hashtable(16);
    }
}
