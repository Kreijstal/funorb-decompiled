/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class s {
    private static boolean field_d;
    private static String field_a;
    private static String field_c;
    private static int field_e;
    private static Hashtable field_b;

    public static void a(int param0, String param1, boolean param2) {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        field_a = param1;
        field_e = param0;
        try {
          L0: {
            L1: {
              field_c = System.getProperty("user.home");
              if (field_c == null) {
                break L1;
              } else {
                field_c = field_c + "/";
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
        field_d = true;
        if (param2) {
          return;
        } else {
          L3: {
            if (field_c != null) {
              break L3;
            } else {
              field_c = "~/";
              break L3;
            }
          }
          return;
        }
    }

    private s() throws Throwable {
        throw new Error();
    }

    public static File a(boolean param0, String param1) {
        if (!param0) {
            field_e = 92;
            return s.a(param1, field_a, field_e, (byte) -45);
        }
        return s.a(param1, field_a, field_e, (byte) -45);
    }

    public static File a(String param0, String param1, int param2, byte param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param1, param0);
    }

    static {
        field_d = false;
        field_b = new Hashtable(16);
    }
}
