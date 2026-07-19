/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class fk {
    private static String field_d;
    private static boolean field_a;
    private static Hashtable field_c;
    private static int field_b;
    private static String field_e;

    private fk() throws Throwable {
        throw new Error();
    }

    public static File a(int param0, String param1) {
        File discarded$2 = null;
        String var3 = null;
        if (param0 != 0) {
          var3 = (String) null;
          discarded$2 = fk.a(-100, (String) null);
          return fk.a(field_e, param1, false, field_b);
        } else {
          return fk.a(field_e, param1, false, field_b);
        }
    }

    public static File a(String param0, String param1, boolean param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param1);
    }

    public static void a(boolean param0, String param1, int param2) {
        Exception var3 = null;
        Throwable decompiledCaughtException = null;
        field_b = param2;
        field_e = param1;
        try {
          L0: {
            field_d = System.getProperty("user.home");
            if (null != field_d) {
              field_d = field_d + "/";
              break L0;
            } else {
              field_a = param0;
              if (null != field_d) {
                return;
              } else {
                field_d = "~/";
                return;
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          field_a = param0;
          if (null == field_d) {
            field_d = "~/";
            return;
          } else {
            return;
          }
        }
        field_a = param0;
        if (null == field_d) {
          field_d = "~/";
          return;
        } else {
          return;
        }
    }

    static {
        field_a = false;
        field_c = new Hashtable(16);
    }
}
