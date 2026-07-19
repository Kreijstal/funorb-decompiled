/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class c {
    private static int field_e;
    private static boolean field_c;
    private static String field_d;
    private static String field_b;
    private static Hashtable field_a;

    public static void a(int param0, int param1, String param2) {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        field_e = param0;
        field_d = param2;
        try {
          L0: {
            L1: {
              field_b = System.getProperty("user.home");
              if (field_b == null) {
                break L1;
              } else {
                field_b = field_b + "/";
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
        field_c = true;
        if (param1 <= 43) {
          return;
        } else {
          L3: {
            if (field_b != null) {
              break L3;
            } else {
              field_b = "~/";
              break L3;
            }
          }
          return;
        }
    }

    public static File a(String param0, int param1, String param2, byte param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param2, param0);
    }

    public static File a(String param0, int param1) {
        if (param1 != 0) {
            return (File) null;
        }
        return c.a(param0, field_e, field_d, (byte) -6);
    }

    private c() throws Throwable {
        throw new Error();
    }

    static {
        field_c = false;
        field_a = new Hashtable(16);
    }
}
