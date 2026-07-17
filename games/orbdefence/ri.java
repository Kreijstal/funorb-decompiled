/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class ri {
    private static Hashtable field_a;
    private static String field_c;
    private static int field_b;
    private static boolean field_d;
    private static String field_e;

    private ri() throws Throwable {
        throw new Error();
    }

    public static File a(String param0, int param1) {
        if (param1 != 1) {
            field_e = null;
            return ri.a(-126, field_c, field_b, param0);
        }
        return ri.a(-126, field_c, field_b, param0);
    }

    public static File a(int param0, String param1, int param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param1, param3);
    }

    public static void a(String param0, byte param1, int param2) {
        Exception var3 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          field_c = param0;
          field_b = param2;
          if (param1 == -94) {
            break L0;
          } else {
            field_d = true;
            break L0;
          }
        }
        try {
          L1: {
            field_e = System.getProperty("user.home");
            if (null != field_e) {
              field_e = field_e + "/";
              break L1;
            } else {
              L2: {
                if (null == field_e) {
                  field_e = "~/";
                  break L2;
                } else {
                  break L2;
                }
              }
              field_d = true;
              return;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = (Exception) (Object) decompiledCaughtException;
            if (null == field_e) {
              field_e = "~/";
              break L3;
            } else {
              break L3;
            }
          }
          field_d = true;
          return;
        }
        L4: {
          if (null == field_e) {
            field_e = "~/";
            break L4;
          } else {
            break L4;
          }
        }
        field_d = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
        field_a = new Hashtable(16);
    }
}
