/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class vf {
    private static Hashtable field_c;
    private static int field_d;
    private static boolean field_a;
    private static String field_b;
    private static String field_e;

    public static File a(int param0, int param1, String param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param2, param3);
    }

    public static void a(boolean param0, String param1, int param2) {
        Exception var3 = null;
        Throwable decompiledCaughtException = null;
        field_b = param1;
        field_d = param2;
        try {
          L0: {
            field_e = System.getProperty("user.home");
            if (field_e != null) {
              field_e = field_e + "/";
              break L0;
            } else {
              L1: {
                field_a = param0;
                if (null == field_e) {
                  field_e = "~/";
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = (Exception) (Object) decompiledCaughtException;
            field_a = param0;
            if (null == field_e) {
              field_e = "~/";
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
        L3: {
          field_a = param0;
          if (null == field_e) {
            field_e = "~/";
            break L3;
          } else {
            break L3;
          }
        }
    }

    public static File a(int param0, String param1) {
        if (param0 != 0) {
            return (File) null;
        }
        return vf.a(field_d, 1387, field_b, param1);
    }

    private vf() throws Throwable {
        throw new Error();
    }

    static {
        field_a = false;
        field_c = new Hashtable(16);
    }
}
