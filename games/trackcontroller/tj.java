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
        Exception var3 = null;
        Object var4 = null;
        Throwable decompiledCaughtException = null;
        field_a = param1;
        field_b = param0;
        try {
          L0: {
            field_e = System.getProperty("user.home");
            if (field_e != null) {
              field_e = field_e + "/";
              break L0;
            } else {
              field_c = true;
              if (field_e != null) {
                if (param2 == -119) {
                  return;
                } else {
                  var4 = null;
                  File discarded$6 = tj.a((byte) 98, (String) null);
                  return;
                }
              } else {
                field_e = "~/";
                if (param2 != -119) {
                  var4 = null;
                  File discarded$7 = tj.a((byte) 98, (String) null);
                  return;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          field_c = true;
          if (field_e != null) {
            if (param2 != -119) {
              var4 = null;
              File discarded$8 = tj.a((byte) 98, (String) null);
              return;
            } else {
              return;
            }
          } else {
            field_e = "~/";
            if (param2 == -119) {
              return;
            } else {
              var4 = null;
              File discarded$9 = tj.a((byte) 98, (String) null);
              return;
            }
          }
        }
        field_c = true;
        if (field_e != null) {
          if (param2 != -119) {
            var4 = null;
            File discarded$10 = tj.a((byte) 98, (String) null);
            return;
          } else {
            return;
          }
        } else {
          field_e = "~/";
          if (param2 == -119) {
            return;
          } else {
            var4 = null;
            File discarded$11 = tj.a((byte) 98, (String) null);
            return;
          }
        }
    }

    public static File a(byte param0, String param1) {
        Object var3 = null;
        if (param0 != -61) {
          var3 = null;
          File discarded$2 = tj.a((byte) 5, (String) null);
          return tj.a(field_b, (byte) 83, field_a, param1);
        } else {
          return tj.a(field_b, (byte) 83, field_a, param1);
        }
    }

    public static File a(int param0, byte param1, String param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_d = new Hashtable(16);
    }
}
