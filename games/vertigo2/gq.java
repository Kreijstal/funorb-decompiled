/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class gq {
    private static String field_b;
    private static boolean field_c;
    private static Hashtable field_d;
    private static int field_a;
    private static String field_e;

    private gq() throws Throwable {
        throw new Error();
    }

    public static File a(String param0, int param1) {
        if (param1 >= -118) {
            field_d = (Hashtable) null;
            return gq.a(0, field_a, param0, field_e);
        }
        return gq.a(0, field_a, param0, field_e);
    }

    public static void a(byte param0, String param1, int param2) {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        if (param0 == -110) {
          field_a = param2;
          field_e = param1;
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
          L3: {
            field_c = true;
            if (field_b == null) {
              field_b = "~/";
              break L3;
            } else {
              break L3;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static File a(int param0, int param1, String param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param3, param2);
    }

    static {
        field_c = false;
        field_d = new Hashtable(16);
    }
}
