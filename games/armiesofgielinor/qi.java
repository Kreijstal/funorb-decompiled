/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class qi {
    private static boolean field_e;
    private static Hashtable field_c;
    private static int field_a;
    private static String field_b;
    private static String field_d;

    private qi() throws Throwable {
        throw new Error();
    }

    public static File a(boolean param0, String param1) {
        if (!param0) {
            field_b = null;
            return qi.a(param1, field_a, 42, field_d);
        }
        return qi.a(param1, field_a, 42, field_d);
    }

    public static void a(int param0, String param1, int param2) {
        Exception var3 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          field_d = param1;
          field_a = param0;
          if (param2 == 1) {
            break L0;
          } else {
            field_c = null;
            break L0;
          }
        }
        try {
          L1: {
            field_b = System.getProperty("user.home");
            if (field_b != null) {
              field_b = field_b + "/";
              break L1;
            } else {
              L2: {
                field_e = true;
                if (field_b == null) {
                  field_b = "~/";
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = (Exception) (Object) decompiledCaughtException;
            field_e = true;
            if (field_b == null) {
              field_b = "~/";
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
        L4: {
          field_e = true;
          if (field_b == null) {
            field_b = "~/";
            break L4;
          } else {
            break L4;
          }
        }
    }

    public static File a(String param0, int param1, int param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param3, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
        field_c = new Hashtable(16);
    }
}
