/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class va {
    private static boolean field_a;
    private static String field_d;
    private static int field_b;
    private static String field_e;
    private static Hashtable field_c;

    public static File a(String param0, byte param1) {
        if (param1 != 40) {
            field_d = (String) null;
            return va.a(field_b, -29755, field_e, param0);
        }
        return va.a(field_b, -29755, field_e, param0);
    }

    public static File a(int param0, int param1, String param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param2, param3);
    }

    private va() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0, int param1, String param2) {
        Exception var3 = null;
        Throwable decompiledCaughtException = null;
        field_b = param1;
        field_e = param2;
        try {
          L0: {
            L1: {
              field_d = System.getProperty("user.home");
              if (param0 <= -87) {
                break L1;
              } else {
                field_c = (Hashtable) null;
                break L1;
              }
            }
            if (field_d == null) {
              break L0;
            } else {
              field_d = field_d + "/";
              if (null != field_d) {
                field_a = true;
                return;
              } else {
                field_d = "~/";
                field_a = true;
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
        if (null == field_d) {
          field_d = "~/";
          field_a = true;
          return;
        } else {
          field_a = true;
          return;
        }
    }

    static {
        field_a = false;
        field_c = new Hashtable(16);
    }
}
