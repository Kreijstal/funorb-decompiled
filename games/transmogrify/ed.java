/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class ed {
    private static boolean field_a;
    private static String field_e;
    private static Hashtable field_d;
    private static String field_c;
    private static int field_b;

    public static File a(String param0, int param1) {
        if (param1 != 32718) {
            return (File) null;
        }
        return ed.a(51, field_b, param0, field_c);
    }

    public static void a(byte param0, String param1, int param2) {
        Exception var3 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        field_b = param2;
        field_c = param1;
        try {
          L0: {
            field_e = System.getProperty("user.home");
            if (param0 == -4) {
              if (field_e != null) {
                field_e = field_e + "/";
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (null == field_e) {
                    field_e = "~/";
                    break L1;
                  } else {
                    break L1;
                  }
                }
                field_a = true;
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = (Exception) (Object) decompiledCaughtException;
            if (null == field_e) {
              field_e = "~/";
              break L2;
            } else {
              break L2;
            }
          }
          field_a = true;
          return;
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          L3: {
            if (null == field_e) {
              field_e = "~/";
              break L3;
            } else {
              break L3;
            }
          }
          field_a = true;
          return;
        }
    }

    private ed() throws Throwable {
        throw new Error();
    }

    public static File a(int param0, int param1, String param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param3, param2);
    }

    static {
        field_a = false;
        field_d = new Hashtable(16);
    }
}
