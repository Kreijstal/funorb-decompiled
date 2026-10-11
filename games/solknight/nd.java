/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class nd {
    private static int field_d;
    private static Hashtable field_c;
    private static String field_a;
    private static boolean field_b;
    private static String field_e;

    public static File a(String param0, String param1, int param2, byte param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param1);
    }

    public static File a(String param0, int param1) {
        if (param1 != -19154) {
          return (File) null;
        }
        return nd.a(field_a, param0, field_d, (byte) -75);
    }

    private nd() throws Throwable {
        throw new Error();
    }

    public static void a(String param0, int param1, byte param2) {
        Exception var3 = null;
        Throwable decompiledCaughtException = null;
        field_d = param1;
        field_a = param0;
        try {
          field_e = System.getProperty("user.home");
          if (field_e == null) {
            if (null == field_e) {
              field_e = "~/";
            }
            if (param2 <= -52) {
              field_b = true;
              return;
            }
            field_b = false;
            field_b = true;
            return;
          }
          field_e = field_e + "/";
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          if (null == field_e) {
            field_e = "~/";
          }
          if (param2 <= -52) {
            field_b = true;
            return;
          }
          field_b = false;
          field_b = true;
          return;
        }
        if (null == field_e) {
          field_e = "~/";
        }
        if (param2 > -52) {
          field_b = false;
        }
        field_b = true;
    }

    static {
        field_b = false;
        field_c = new Hashtable(16);
    }
}
