/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class va {
    private static int field_a;
    private static String field_e;
    private static boolean field_c;
    private static String field_b;
    private static Hashtable field_d;

    public static void a(String param0, int param1, int param2) {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        field_a = param2;
        field_b = param0;
        if (param1 >= 56) {
          try {
            L0: {
              L1: {
                field_e = System.getProperty("user.home");
                if (field_e == null) {
                  break L1;
                } else {
                  field_e = field_e + "/";
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
          L3: {
            field_c = true;
            if (null == field_e) {
              field_e = "~/";
              break L3;
            } else {
              break L3;
            }
          }
          return;
        } else {
          return;
        }
    }

    private va() throws Throwable {
        throw new Error();
    }

    public static File a(String param0, byte param1) {
        if (param1 != -61) {
            field_b = null;
            return va.a(field_b, field_a, true, param0);
        }
        return va.a(field_b, field_a, true, param0);
    }

    public static File a(String param0, int param1, boolean param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_d = new Hashtable(16);
    }
}
