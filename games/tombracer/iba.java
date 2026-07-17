/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class iba {
    private static boolean field_b;
    private static String field_c;
    private static String field_e;
    private static int field_a;
    private static Hashtable field_d;

    public static File a(String param0, byte param1) {
        if (param1 > -67) {
            return null;
        }
        return iba.a(field_e, param0, 0, field_a);
    }

    public static void a(int param0, int param1, String param2) {
        int var3_int = 0;
        Exception var3 = null;
        Throwable decompiledCaughtException = null;
        field_e = param2;
        field_a = param0;
        try {
          L0: {
            field_c = System.getProperty("user.home");
            var3_int = -103 % ((51 - param1) / 60);
            if (field_c == null) {
              break L0;
            } else {
              field_c = field_c + "/";
              field_b = true;
              if (null != field_c) {
                return;
              } else {
                field_c = "~/";
                return;
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = (Exception) (Object) decompiledCaughtException;
            break L1;
          }
        }
        field_b = true;
        if (null == field_c) {
          field_c = "~/";
          return;
        } else {
          return;
        }
    }

    public static File a(String param0, String param1, int param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param1);
    }

    private iba() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_d = new Hashtable(16);
    }
}
