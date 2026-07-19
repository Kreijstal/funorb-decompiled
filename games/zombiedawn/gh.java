/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class gh {
    private static boolean field_b;
    private static Hashtable field_e;
    private static String field_a;
    private static int field_c;
    private static String field_d;

    public static void a(int param0, byte param1, String param2) {
        Exception var3 = null;
        Throwable decompiledCaughtException = null;
        field_d = param2;
        field_c = param0;
        try {
          L0: {
            field_a = System.getProperty("user.home");
            if (null != field_a) {
              field_a = field_a + "/";
              break L0;
            } else {
              L1: {
                field_b = true;
                if (field_a == null) {
                  field_a = "~/";
                  break L1;
                } else {
                  break L1;
                }
              }
              if (param1 >= 118) {
                return;
              } else {
                field_c = -6;
                return;
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = (Exception) (Object) decompiledCaughtException;
            field_b = true;
            if (field_a == null) {
              field_a = "~/";
              break L2;
            } else {
              break L2;
            }
          }
          if (param1 < 118) {
            field_c = -6;
            return;
          } else {
            return;
          }
        }
        L3: {
          field_b = true;
          if (field_a == null) {
            field_a = "~/";
            break L3;
          } else {
            break L3;
          }
        }
        if (param1 < 118) {
          field_c = -6;
          return;
        } else {
          return;
        }
    }

    private gh() throws Throwable {
        throw new Error();
    }

    public static File a(int param0, String param1) {
        if (param0 >= -2) {
            return (File) null;
        }
        return gh.a(field_d, field_c, (byte) 21, param1);
    }

    public static File a(String param0, int param1, byte param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param3);
    }

    static {
        field_b = false;
        field_e = new Hashtable(16);
    }
}
