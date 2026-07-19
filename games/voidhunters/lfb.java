/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class lfb {
    private static String field_b;
    private static boolean field_d;
    private static Hashtable field_a;
    private static String field_e;
    private static int field_c;

    private lfb() throws Throwable {
        throw new Error();
    }

    public static File a(String param0, int param1, String param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param2, param0);
    }

    public static File a(String param0, byte param1) {
        if (param1 != 34) {
          field_b = (String) null;
          return lfb.a(param0, param1 ^ -35, field_e, field_c);
        } else {
          return lfb.a(param0, param1 ^ -35, field_e, field_c);
        }
    }

    public static void a(int param0, int param1, String param2) {
        File discarded$2 = null;
        Exception exception = null;
        String var4 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param1 < -103) {
            break L0;
          } else {
            var4 = (String) null;
            discarded$2 = lfb.a((String) null, -23, (String) null, -127);
            break L0;
          }
        }
        field_c = param0;
        field_e = param2;
        try {
          L1: {
            L2: {
              field_b = System.getProperty("user.home");
              if (null == field_b) {
                break L2;
              } else {
                field_b = field_b + "/";
                break L2;
              }
            }
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L3;
          }
        }
        L4: {
          field_d = true;
          if (field_b == null) {
            field_b = "~/";
            break L4;
          } else {
            break L4;
          }
        }
    }

    static {
        field_d = false;
        field_a = new Hashtable(16);
    }
}
