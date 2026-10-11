/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class tj {
    private static String field_e;
    private static boolean field_c;
    private static Hashtable field_d;
    private static String field_a;
    private static int field_b;

    private tj() throws Throwable {
        throw new Error();
    }

    public static void a(int param0, String param1, byte param2) {
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        String var4 = null;
        field_a = param1;
        field_b = param0;
        try {
          field_e = System.getProperty("user.home");
          if (field_e == null) {
            field_c = true;
            if (field_e != null) {
              if (param2 == -119) {
                return;
              }
              var4 = (String) null;
              tj.a((byte) 98, (String) null);
              return;
            }
            field_e = "~/";
            if (param2 == -119) {
              return;
            }
            var4 = (String) null;
            tj.a((byte) 98, (String) null);
            return;
          }
          field_e = field_e + "/";
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          field_c = true;
          if (field_e != null) {
            if (param2 == -119) {
              return;
            }
            var4 = (String) null;
            tj.a((byte) 98, (String) null);
            return;
          }
          field_e = "~/";
          if (param2 == -119) {
            return;
          }
          var4 = (String) null;
          tj.a((byte) 98, (String) null);
          return;
        }
        field_c = true;
        if (field_e == null) {
          field_e = "~/";
        }
        if (param2 == -119) {
          return;
        }
        var4 = (String) null;
        tj.a((byte) 98, (String) null);
    }

    public static File a(byte param0, String param1) {
        if (param0 == -61) {
          return tj.a(field_b, (byte) 83, field_a, param1);
        }
        String var3 = (String) null;
        tj.a((byte) 5, (String) null);
        return tj.a(field_b, (byte) 83, field_a, param1);
    }

    public static File a(int param0, byte param1, String param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param2, param3);
    }

    static {
        field_c = false;
        field_d = new Hashtable(16);
    }
}
