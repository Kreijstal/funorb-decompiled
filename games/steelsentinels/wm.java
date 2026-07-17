/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class wm {
    private static String field_e;
    private static String field_a;
    private static boolean field_c;
    private static Hashtable field_b;
    private static int field_d;

    public static File a(String param0, int param1, byte param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param3);
    }

    public static void a(String param0, boolean param1, int param2) {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        field_a = param0;
        field_d = param2;
        try {
          L0: {
            L1: {
              field_e = System.getProperty("user.home");
              if (null == field_e) {
                break L1;
              } else {
                field_e = field_e + "/";
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
        if (field_e == null) {
          field_e = "~/";
          field_c = param1;
          return;
        } else {
          field_c = param1;
          return;
        }
    }

    public static File a(int param0, String param1) {
        if (param0 != 8244) {
            field_b = null;
            return wm.a(field_a, field_d, (byte) 26, param1);
        }
        return wm.a(field_a, field_d, (byte) 26, param1);
    }

    private wm() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_b = new Hashtable(16);
    }
}
