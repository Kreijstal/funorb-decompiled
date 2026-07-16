/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class ai {
    private static int field_c;
    private static String field_b;
    private static String field_a;
    private static Hashtable field_d;
    private static boolean field_e;

    public static File a(String param0, byte param1) {
        int var2 = -89 / ((param1 - 54) / 33);
        return ai.a(field_a, field_c, 24173, param0);
    }

    public static File a(String param0, int param1, int param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param3);
    }

    private ai() throws Throwable {
        throw new Error();
    }

    public static void a(String param0, int param1, int param2) {
        Exception var3 = null;
        Object var4 = null;
        Throwable decompiledCaughtException = null;
        field_c = param1;
        field_a = param0;
        try {
          L0: {
            L1: {
              if (param2 <= -12) {
                break L1;
              } else {
                var4 = null;
                File discarded$2 = ai.a((String) null, 107, 50, (String) null);
                break L1;
              }
            }
            field_b = System.getProperty("user.home");
            if (null != field_b) {
              field_b = field_b + "/";
              break L0;
            } else {
              L2: {
                if (null == field_b) {
                  field_b = "~/";
                  break L2;
                } else {
                  break L2;
                }
              }
              field_e = true;
              return;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = (Exception) (Object) decompiledCaughtException;
            if (null == field_b) {
              field_b = "~/";
              break L3;
            } else {
              break L3;
            }
          }
          field_e = true;
          return;
        }
        L4: {
          if (null == field_b) {
            field_b = "~/";
            break L4;
          } else {
            break L4;
          }
        }
        field_e = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
        field_d = new Hashtable(16);
    }
}
