/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class wi {
    private static Hashtable field_c;
    private static String field_e;
    private static int field_d;
    private static boolean field_b;
    private static String field_a;

    private wi() throws Throwable {
        throw new Error();
    }

    public static File a(String param0, boolean param1, int param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param3);
    }

    public static File a(String param0, boolean param1) {
        if (param1) {
            return null;
        }
        return wi.a(field_e, false, field_d, param0);
    }

    public static void a(String param0, int param1, int param2) {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        field_d = param2;
        field_e = param0;
        try {
          L0: {
            L1: {
              field_a = System.getProperty("user.home");
              if (field_a == null) {
                break L1;
              } else {
                field_a = field_a + "/";
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L2;
          }
        }
        L3: {
          if (null == field_a) {
            field_a = "~/";
            break L3;
          } else {
            break L3;
          }
        }
        if (param1 != 11217) {
          return;
        } else {
          field_b = true;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_c = new Hashtable(16);
    }
}
