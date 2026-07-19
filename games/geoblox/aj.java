/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class aj {
    private static boolean field_e;
    private static Hashtable field_c;
    private static int field_a;
    private static String field_d;
    private static String field_b;

    private aj() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0, String param1, int param2) {
        Exception var3 = null;
        Throwable decompiledCaughtException = null;
        field_d = param1;
        field_a = param2;
        try {
          L0: {
            L1: {
              field_b = System.getProperty("user.home");
              if (null == field_b) {
                break L1;
              } else {
                field_b = field_b + "/";
                break L1;
              }
            }
            if (param0 == 66) {
              break L0;
            } else {
              field_e = true;
              if (null != field_b) {
                field_e = true;
                return;
              } else {
                field_b = "~/";
                field_e = true;
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
        if (null == field_b) {
          field_b = "~/";
          field_e = true;
          return;
        } else {
          field_e = true;
          return;
        }
    }

    public static File a(String param0, int param1, String param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param2);
    }

    public static File a(String param0, byte param1) {
        File discarded$2 = null;
        String var3 = null;
        if (param1 > -67) {
          var3 = (String) null;
          discarded$2 = aj.a((String) null, (byte) -120);
          return aj.a(field_d, -27533, param0, field_a);
        } else {
          return aj.a(field_d, -27533, param0, field_a);
        }
    }

    static {
        field_e = false;
        field_c = new Hashtable(16);
    }
}
