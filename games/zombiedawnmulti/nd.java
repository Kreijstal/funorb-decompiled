/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class nd {
    private static boolean field_c;
    private static String field_a;
    private static Hashtable field_d;
    private static String field_b;
    private static int field_e;

    private nd() throws Throwable {
        throw new Error();
    }

    public static File a(String param0, int param1, String param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param2, param0);
    }

    public static void a(String param0, int param1, int param2) {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        if (param2 == -7682) {
          field_e = param1;
          field_b = param0;
          try {
            L0: {
              L1: {
                field_a = System.getProperty("user.home");
                if (field_a == null) {
                  break L1;
                } else {
                  field_a = field_a + "/";
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
          if (null == field_a) {
            field_a = "~/";
            field_c = true;
            return;
          } else {
            field_c = true;
            return;
          }
        } else {
          return;
        }
    }

    public static File a(String param0, int param1) {
        File discarded$2 = null;
        String var3 = null;
        if (param1 != 0) {
          var3 = (String) null;
          discarded$2 = nd.a((String) null, -93);
          return nd.a(param0, -25157, field_b, field_e);
        } else {
          return nd.a(param0, -25157, field_b, field_e);
        }
    }

    static {
        field_c = false;
        field_d = new Hashtable(16);
    }
}
