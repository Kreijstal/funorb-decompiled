/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class od {
    private static int field_d;
    private static String field_c;
    private static Hashtable field_b;
    private static boolean field_e;
    private static String field_a;

    private od() throws Throwable {
        throw new Error();
    }

    public static File a(int param0, String param1) {
        if (param0 != 0) {
            field_c = null;
            return od.a(field_c, 30869, param1, field_d);
        }
        return od.a(field_c, 30869, param1, field_d);
    }

    public static File a(String param0, int param1, String param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param2);
    }

    public static void a(int param0, String param1, int param2) {
        Exception var3 = null;
        Throwable decompiledCaughtException = null;
        field_c = param1;
        field_d = param0;
        try {
          L0: {
            field_a = System.getProperty("user.home");
            if (null != field_a) {
              field_a = field_a + "/";
              break L0;
            } else {
              field_e = true;
              if (param2 == 7154) {
                L1: {
                  if (null == field_a) {
                    field_a = "~/";
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          field_e = true;
          if (param2 != 7154) {
            return;
          } else {
            L2: {
              if (null == field_a) {
                field_a = "~/";
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        }
        field_e = true;
        if (param2 != 7154) {
          return;
        } else {
          L3: {
            if (null == field_a) {
              field_a = "~/";
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
        field_b = new Hashtable(16);
    }
}
