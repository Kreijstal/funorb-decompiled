/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class fd {
    private static String field_e;
    private static boolean field_d;
    private static Hashtable field_a;
    private static String field_c;
    private static int field_b;

    public static void a(String param0, int param1, byte param2) {
        Exception var3 = null;
        Throwable decompiledCaughtException = null;
        field_b = param1;
        if (param2 >= 124) {
          field_c = param0;
          try {
            L0: {
              field_e = System.getProperty("user.home");
              if (null != field_e) {
                field_e = field_e + "/";
                break L0;
              } else {
                field_d = true;
                if (field_e != null) {
                  return;
                } else {
                  field_e = "~/";
                  return;
                }
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            field_d = true;
            if (field_e == null) {
              field_e = "~/";
              return;
            } else {
              return;
            }
          }
          field_d = true;
          if (field_e == null) {
            field_e = "~/";
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static File a(String param0, int param1, String param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param2, param0);
    }

    private fd() throws Throwable {
        throw new Error();
    }

    public static File a(String param0, byte param1) {
        if (param1 != 115) {
            field_c = null;
            return fd.a(param0, field_b, field_c, 66);
        }
        return fd.a(param0, field_b, field_c, 66);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
        field_a = new Hashtable(16);
    }
}
