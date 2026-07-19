/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class qc {
    private static String field_d;
    private static String field_c;
    private static int field_a;
    private static Hashtable field_b;
    private static boolean field_e;

    public static File a(boolean param0, String param1) {
        File discarded$2 = null;
        String var3 = null;
        if (!param0) {
          var3 = (String) null;
          discarded$2 = qc.a(false, (String) null);
          return qc.a(param1, 1, field_a, field_d);
        } else {
          return qc.a(param1, 1, field_a, field_d);
        }
    }

    private qc() throws Throwable {
        throw new Error();
    }

    public static File a(String param0, int param1, int param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param3, param0);
    }

    public static void a(String param0, int param1, int param2) {
        Exception var3 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          field_a = param1;
          if (param2 >= 19) {
            break L0;
          } else {
            field_e = true;
            break L0;
          }
        }
        field_d = param0;
        try {
          L1: {
            field_c = System.getProperty("user.home");
            if (field_c != null) {
              field_c = field_c + "/";
              break L1;
            } else {
              field_e = true;
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
          var3 = (Exception) (Object) decompiledCaughtException;
          field_e = true;
          if (null == field_c) {
            field_c = "~/";
            return;
          } else {
            return;
          }
        }
        field_e = true;
        if (null == field_c) {
          field_c = "~/";
          return;
        } else {
          return;
        }
    }

    static {
        field_e = false;
        field_b = new Hashtable(16);
    }
}
