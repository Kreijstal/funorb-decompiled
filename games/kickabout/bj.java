/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class bj {
    private static boolean field_e;
    private static Hashtable field_d;
    private static String field_a;
    private static String field_c;
    private static int field_b;

    public static File a(String param0, int param1) {
        if (param1 != 0) {
            field_a = (String) null;
            return bj.a(param0, field_c, field_b, false);
        }
        return bj.a(param0, field_c, field_b, false);
    }

    public static File a(String param0, String param1, int param2, boolean param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param1, param0);
    }

    private bj() throws Throwable {
        throw new Error();
    }

    public static void a(String param0, byte param1, int param2) {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        L0: {
          field_b = param2;
          field_c = param0;
          if (param1 == -99) {
            break L0;
          } else {
            field_b = -5;
            break L0;
          }
        }
        try {
          L1: {
            L2: {
              field_a = System.getProperty("user.home");
              if (null == field_a) {
                break L2;
              } else {
                field_a = field_a + "/";
                break L2;
              }
            }
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L3;
          }
        }
        L4: {
          field_e = true;
          if (field_a == null) {
            field_a = "~/";
            break L4;
          } else {
            break L4;
          }
        }
    }

    static {
        field_e = false;
        field_d = new Hashtable(16);
    }
}
