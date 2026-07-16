/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class f {
    private static boolean field_b;
    private static String field_d;
    private static String field_e;
    private static Hashtable field_c;
    private static int field_a;

    public static File a(int param0, String param1, String param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param2, param1);
    }

    public static File a(int param0, String param1) {
        if (param0 != -3455) {
            return null;
        }
        return f.a(-31192, param1, field_d, field_a);
    }

    public static void a(byte param0, String param1, int param2) {
        Exception var3 = null;
        Object var4 = null;
        Throwable decompiledCaughtException = null;
        field_d = param1;
        field_a = param2;
        try {
          L0: {
            L1: {
              if (param0 == 32) {
                break L1;
              } else {
                var4 = null;
                f.a((byte) -102, (String) null, 46);
                break L1;
              }
            }
            field_e = System.getProperty("user.home");
            if (null == field_e) {
              break L0;
            } else {
              L2: {
                field_e = field_e + "/";
                if (field_e == null) {
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
            break L3;
          }
        }
        L4: {
          if (field_e == null) {
            field_e = "~/";
            break L4;
          } else {
            break L4;
          }
        }
        field_b = true;
    }

    private f() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_c = new Hashtable(16);
    }
}
