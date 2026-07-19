/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class nk {
    private static boolean field_b;
    private static Hashtable field_a;
    private static String field_e;
    private static int field_c;
    private static String field_d;

    public static File a(int param0, String param1, String param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param2, param1);
    }

    public static File a(String param0, int param1) {
        if (param1 != -2) {
            return (File) null;
        }
        return nk.a(-1, param0, field_d, field_c);
    }

    private nk() throws Throwable {
        throw new Error();
    }

    public static void a(int param0, int param1, String param2) {
        File discarded$2 = null;
        Exception var3 = null;
        String var4 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          field_d = param2;
          field_c = param0;
          if (param1 == 0) {
            break L0;
          } else {
            var4 = (String) null;
            discarded$2 = nk.a(25, (String) null, (String) null, -32);
            break L0;
          }
        }
        try {
          L1: {
            field_e = System.getProperty("user.home");
            if (null != field_e) {
              field_e = field_e + "/";
              break L1;
            } else {
              L2: {
                if (null == field_e) {
                  field_e = "~/";
                  break L2;
                } else {
                  break L2;
                }
              }
              field_b = true;
              return;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = (Exception) (Object) decompiledCaughtException;
            if (null == field_e) {
              field_e = "~/";
              break L3;
            } else {
              break L3;
            }
          }
          field_b = true;
          return;
        }
        L4: {
          if (null == field_e) {
            field_e = "~/";
            break L4;
          } else {
            break L4;
          }
        }
        field_b = true;
    }

    static {
        field_b = false;
        field_a = new Hashtable(16);
    }
}
