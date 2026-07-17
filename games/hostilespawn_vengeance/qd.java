/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class qd {
    private static int field_a;
    private static boolean field_b;
    private static String field_d;
    private static Hashtable field_c;
    private static String field_e;

    public static void a(int param0, int param1, String param2) {
        Exception exception = null;
        Object var4 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            var4 = null;
            qd.a(107, 107, (String) null);
            break L0;
          }
        }
        field_e = param2;
        field_a = param1;
        try {
          L1: {
            L2: {
              field_d = System.getProperty("user.home");
              if (null == field_d) {
                break L2;
              } else {
                field_d = field_d + "/";
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
        field_b = true;
        if (null == field_d) {
          field_d = "~/";
          return;
        } else {
          return;
        }
    }

    public static File a(int param0, String param1, String param2, boolean param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param1, param2);
    }

    private qd() throws Throwable {
        throw new Error();
    }

    public static File a(String param0, int param1) {
        Object var3 = null;
        if (param1 != -19005) {
          var3 = null;
          qd.a(107, -10, (String) null);
          return qd.a(field_a, field_e, param0, true);
        } else {
          return qd.a(field_a, field_e, param0, true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_c = new Hashtable(16);
    }
}
