/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class ul {
    private static boolean field_b;
    private static Hashtable field_e;
    private static String field_a;
    private static int field_c;
    private static String field_d;

    private ul() throws Throwable {
        throw new Error();
    }

    public static void a(int param0, String param1, int param2) {
        Exception var3 = null;
        Throwable decompiledCaughtException = null;
        if (param0 != 21747) {
          field_c = -58;
        }
        field_a = param1;
        field_c = param2;
        try {
          field_d = System.getProperty("user.home");
          if (field_d == null) {
            if (null == field_d) {
              field_d = "~/";
            }
            field_b = true;
            return;
          }
          field_d = field_d + "/";
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          if (null == field_d) {
            field_d = "~/";
          }
          field_b = true;
          return;
        }
        if (null == field_d) {
          field_d = "~/";
        }
        field_b = true;
    }

    public static File a(byte param0, String param1) {
        if (param0 >= -49) {
          field_e = (Hashtable) null;
          return ul.a(field_a, field_c, param1, (byte) 86);
        }
        return ul.a(field_a, field_c, param1, (byte) 86);
    }

    public static File a(String param0, int param1, String param2, byte param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param2);
    }

    static {
        field_b = false;
        field_e = new Hashtable(16);
    }
}
