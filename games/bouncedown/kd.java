/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class kd {
    private static String field_e;
    private static Hashtable field_c;
    private static boolean field_b;
    private static String field_d;
    private static int field_a;

    public static File a(String param0, int param1) {
        if (param1 != 7900) {
          return (File) null;
        }
        return kd.a(field_d, param0, false, field_a);
    }

    public static File a(String param0, String param1, boolean param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param1);
    }

    private kd() throws Throwable {
        throw new Error();
    }

    public static void a(int param0, int param1, String param2) {
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        String var4 = null;
        field_d = param2;
        field_a = param1;
        try {
          field_e = System.getProperty("user.home");
          if (field_e == null) {
            field_b = true;
            if (param0 <= -28) {
              if (null == field_e) {
                field_e = "~/";
              }
              return;
            }
            var4 = (String) null;
            kd.a((String) null, (String) null, true, -114);
            if (null == field_e) {
              field_e = "~/";
            }
            return;
          }
          field_e = field_e + "/";
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          field_b = true;
          if (param0 <= -28) {
            if (null == field_e) {
              field_e = "~/";
            }
            return;
          }
          var4 = (String) null;
          kd.a((String) null, (String) null, true, -114);
          if (null == field_e) {
            field_e = "~/";
          }
          return;
        }
        field_b = true;
        if (param0 > -28) {
          var4 = (String) null;
          kd.a((String) null, (String) null, true, -114);
        }
        if (null == field_e) {
          field_e = "~/";
        }
    }

    static {
        field_b = false;
        field_c = new Hashtable(16);
    }
}
