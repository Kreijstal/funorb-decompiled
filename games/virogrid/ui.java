/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class ui {
    private static int field_b;
    private static String field_e;
    private static boolean field_a;
    private static String field_d;
    private static Hashtable field_c;

    public static File a(byte param0, String param1, String param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param1, param2);
    }

    private ui() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0, int param1, String param2) {
        int var3 = 0;
        Exception var4 = null;
        Throwable decompiledCaughtException = null;
        field_b = param1;
        field_d = param2;
        var3 = 67 / ((param0 - 81) / 34);
        try {
          L0: {
            field_e = System.getProperty("user.home");
            if (null != field_e) {
              field_e = field_e + "/";
              break L0;
            } else {
              L1: {
                if (field_e == null) {
                  field_e = "~/";
                  break L1;
                } else {
                  break L1;
                }
              }
              field_a = true;
              return;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = (Exception) (Object) decompiledCaughtException;
            if (field_e == null) {
              field_e = "~/";
              break L2;
            } else {
              break L2;
            }
          }
          field_a = true;
          return;
        }
        L3: {
          if (field_e == null) {
            field_e = "~/";
            break L3;
          } else {
            break L3;
          }
        }
        field_a = true;
    }

    public static File a(String param0, byte param1) {
        String var3 = null;
        if (param1 != -83) {
          var3 = (String) null;
          ui.a((byte) -20, -119, (String) null);
          return ui.a((byte) -47, field_d, param0, field_b);
        } else {
          return ui.a((byte) -47, field_d, param0, field_b);
        }
    }

    static {
        field_a = false;
        field_c = new Hashtable(16);
    }
}
