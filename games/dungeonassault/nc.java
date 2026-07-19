/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class nc {
    private static String field_c;
    private static boolean field_b;
    private static int field_d;
    private static String field_e;
    private static Hashtable field_a;

    public static void a(int param0, int param1, String param2) {
        int var3 = 0;
        Exception var3_ref_Exception = null;
        Throwable decompiledCaughtException = null;
        field_e = param2;
        field_d = param0;
        try {
          L0: {
            field_c = System.getProperty("user.home");
            if (null != field_c) {
              field_c = field_c + "/";
              break L0;
            } else {
              L1: {
                if (null == field_c) {
                  field_c = "~/";
                  break L1;
                } else {
                  break L1;
                }
              }
              var3 = 97 / ((param1 - 69) / 46);
              field_b = true;
              return;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref_Exception = (Exception) (Object) decompiledCaughtException;
            if (null == field_c) {
              field_c = "~/";
              break L2;
            } else {
              break L2;
            }
          }
          var3 = 97 / ((param1 - 69) / 46);
          field_b = true;
          return;
        }
        L3: {
          if (null == field_c) {
            field_c = "~/";
            break L3;
          } else {
            break L3;
          }
        }
        var3 = 97 / ((param1 - 69) / 46);
        field_b = true;
    }

    public static File a(String param0, int param1, String param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param2, param0);
    }

    public static File a(int param0, String param1) {
        if (param0 != 0) {
            return (File) null;
        }
        return nc.a(param1, field_d, field_e, -6665);
    }

    private nc() throws Throwable {
        throw new Error();
    }

    static {
        field_b = false;
        field_a = new Hashtable(16);
    }
}
