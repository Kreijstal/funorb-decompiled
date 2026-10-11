/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class gl {
    private static int field_d;
    private static String field_c;
    private static String field_a;
    private static Hashtable field_b;
    private static boolean field_e;

    public static File a(String param0, int param1) {
        if (param1 != -1) {
          return (File) null;
        }
        return gl.a(-1, param0, field_c, field_d);
    }

    public static File a(int param0, String param1, String param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param2, param1);
    }

    public static void a(int param0, int param1, String param2) {
        Exception var3 = null;
        Throwable decompiledCaughtException = null;
        field_c = param2;
        field_d = param1;
        try {
          field_a = System.getProperty("user.home");
          if (param0 <= 87) {
            field_c = (String) null;
          }
          if (field_a == null) {
            if (null == field_a) {
              field_a = "~/";
            }
            field_e = true;
            return;
          }
          field_a = field_a + "/";
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          if (null == field_a) {
            field_a = "~/";
          }
          field_e = true;
          return;
        }
        if (null == field_a) {
          field_a = "~/";
        }
        field_e = true;
    }

    private gl() throws Throwable {
        throw new Error();
    }

    static {
        field_e = false;
        field_b = new Hashtable(16);
    }
}
