/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class hu {
    private static int field_a;
    private static String field_b;
    private static boolean field_d;
    private static Hashtable field_c;
    private static String field_e;

    public static File a(String param0, int param1) {
        Object var3 = null;
        if (param1 != 0) {
          var3 = null;
          File discarded$2 = hu.a((String) null, -116);
          return hu.a(field_a, param0, field_e, 1);
        } else {
          return hu.a(field_a, param0, field_e, 1);
        }
    }

    public static File a(int param0, String param1, String param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param2, param1);
    }

    private hu() throws Throwable {
        throw new Error();
    }

    public static void a(int param0, int param1, String param2) {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        L0: {
          field_e = param2;
          if (param0 == 0) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        field_a = param1;
        try {
          L1: {
            L2: {
              field_b = System.getProperty("user.home");
              if (field_b == null) {
                break L2;
              } else {
                field_b = field_b + "/";
                break L2;
              }
            }
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L3;
          }
        }
        field_d = true;
        if (null == field_b) {
          field_b = "~/";
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
        field_c = new Hashtable(16);
    }
}
