/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class ub {
    private static Hashtable field_c;
    private static String field_e;
    private static boolean field_b;
    private static int field_a;
    private static String field_d;

    public static File a(String param0, byte param1) {
        int var2 = 127 / ((param1 - 6) / 62);
        return ub.a(field_d, -3, field_a, param0);
    }

    public static void a(String param0, int param1, int param2) {
        Exception var3 = null;
        Object var4 = null;
        Throwable decompiledCaughtException = null;
        field_a = param1;
        field_d = param0;
        try {
          L0: {
            L1: {
              field_e = System.getProperty("user.home");
              if (null == field_e) {
                break L1;
              } else {
                field_e = field_e + "/";
                break L1;
              }
            }
            if (param2 == -26761) {
              break L0;
            } else {
              L2: {
                var4 = null;
                File discarded$2 = ub.a((String) null, (byte) 19);
                field_b = true;
                if (null == field_e) {
                  field_e = "~/";
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
            break L3;
          }
        }
        L4: {
          field_b = true;
          if (null == field_e) {
            field_e = "~/";
            break L4;
          } else {
            break L4;
          }
        }
    }

    public static File a(String param0, int param1, int param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param3);
    }

    private ub() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_c = new Hashtable(16);
    }
}
