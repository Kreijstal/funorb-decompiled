/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class la {
    private static int field_d;
    private static String field_a;
    private static String field_b;
    private static boolean field_c;
    private static Hashtable field_e;

    public static void a(byte param0, int param1, String param2) {
        Exception exception = null;
        int var3 = 0;
        Throwable decompiledCaughtException = null;
        field_d = param1;
        field_a = param2;
        try {
          L0: {
            L1: {
              field_b = System.getProperty("user.home");
              if (null == field_b) {
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
        var3 = 9 % ((param0 - 7) / 47);
        field_c = true;
        if (null == field_b) {
          field_b = "~/";
          return;
        } else {
          return;
        }
    }

    public static File a(String param0, int param1) {
        int var2 = 124 / ((param1 - 66) / 59);
        return la.a(param0, field_a, false, field_d);
    }

    private la() throws Throwable {
        throw new Error();
    }

    public static File a(String param0, String param1, boolean param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param1, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_e = new Hashtable(16);
    }
}
