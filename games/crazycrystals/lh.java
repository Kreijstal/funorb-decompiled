/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class lh {
    private static boolean field_d;
    private static String field_c;
    private static String field_e;
    private static int field_a;
    private static Hashtable field_b;

    public static File a(String param0, int param1) {
        String var3 = null;
        if (param1 > -77) {
          var3 = (String) null;
          lh.a(-79, (String) null, -22);
          return lh.a(field_c, 6234, param0, field_a);
        } else {
          return lh.a(field_c, 6234, param0, field_a);
        }
    }

    public static File a(String param0, int param1, String param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param2);
    }

    private lh() throws Throwable {
        throw new Error();
    }

    public static void a(int param0, String param1, int param2) {
        Exception var3 = null;
        String var4 = null;
        Throwable decompiledCaughtException = null;
        field_a = param2;
        field_c = param1;
        try {
          L0: {
            L1: {
              field_e = System.getProperty("user.home");
              if (field_e != null) {
                field_e = field_e + "/";
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 < -87) {
              break L0;
            } else {
              var4 = (String) null;
              lh.a(-52, (String) null, -39);
              if (null != field_e) {
                field_d = true;
                return;
              } else {
                field_e = "~/";
                field_d = true;
                return;
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = (Exception) (Object) decompiledCaughtException;
            break L2;
          }
        }
        if (null == field_e) {
          field_e = "~/";
          field_d = true;
          return;
        } else {
          field_d = true;
          return;
        }
    }

    static {
        field_d = false;
        field_b = new Hashtable(16);
    }
}
