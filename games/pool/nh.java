/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class nh {
    private static String field_b;
    private static Hashtable field_d;
    private static int field_e;
    private static String field_c;
    private static boolean field_a;

    public static File a(String param0, int param1) {
        if (param1 >= -125) {
          field_c = (String) null;
          return nh.a(param0, field_b, field_e, (byte) 110);
        }
        return nh.a(param0, field_b, field_e, (byte) 110);
    }

    public static void a(int param0, String param1, int param2) {
        Exception var3 = null;
        Throwable decompiledCaughtException = null;
        field_e = param0;
        field_b = param1;
        if (param2 != 25617) {
          return;
        }
        try {
          field_c = System.getProperty("user.home");
          if (field_c == null) {
            if (null == field_c) {
              field_c = "~/";
            }
            field_a = true;
            return;
          }
          field_c = field_c + "/";
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          if (null == field_c) {
            field_c = "~/";
          }
          field_a = true;
          return;
        }
        if (null == field_c) {
          field_c = "~/";
        }
        field_a = true;
    }

    public static File a(String param0, String param1, int param2, byte param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param1, param0);
    }

    private nh() throws Throwable {
        throw new Error();
    }

    static {
        field_a = false;
        field_d = new Hashtable(16);
    }
}
