/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class dk {
    private static boolean field_b;
    private static Hashtable field_a;
    private static String field_e;
    private static int field_c;
    private static String field_d;

    public static File a(String param0, int param1, byte param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param3);
    }

    private dk() throws Throwable {
        throw new Error();
    }

    public static File a(boolean param0, String param1) {
        Object var3 = null;
        if (param0) {
          var3 = null;
          dk.a((String) null, -87, (byte) -32);
          return dk.a(field_d, field_c, (byte) 117, param1);
        } else {
          return dk.a(field_d, field_c, (byte) 117, param1);
        }
    }

    public static void a(String param0, int param1, byte param2) {
        Exception var3 = null;
        Object var4 = null;
        Throwable decompiledCaughtException = null;
        field_c = param1;
        field_d = param0;
        try {
          L0: {
            L1: {
              if (param2 >= 28) {
                break L1;
              } else {
                var4 = null;
                dk.a((String) null, -40, (byte) 13);
                break L1;
              }
            }
            field_e = System.getProperty("user.home");
            if (field_e != null) {
              field_e = field_e + "/";
              break L0;
            } else {
              if (field_e != null) {
                field_b = true;
                return;
              } else {
                field_e = "~/";
                field_b = true;
                return;
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          if (field_e == null) {
            field_e = "~/";
            field_b = true;
            return;
          } else {
            field_b = true;
            return;
          }
        }
        if (field_e == null) {
          field_e = "~/";
          field_b = true;
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
        field_a = new Hashtable(16);
    }
}
