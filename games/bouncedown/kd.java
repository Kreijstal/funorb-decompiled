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
            return null;
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
        Exception var3 = null;
        Object var4 = null;
        Throwable decompiledCaughtException = null;
        field_d = param2;
        field_a = param1;
        try {
          L0: {
            field_e = System.getProperty("user.home");
            if (field_e != null) {
              field_e = field_e + "/";
              break L0;
            } else {
              field_b = true;
              if (param0 <= -28) {
                L1: {
                  if (null == field_e) {
                    field_e = "~/";
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              } else {
                L2: {
                  var4 = null;
                  File discarded$3 = kd.a((String) null, (String) null, true, -114);
                  if (null == field_e) {
                    field_e = "~/";
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return;
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          field_b = true;
          if (param0 > -28) {
            L3: {
              var4 = null;
              File discarded$4 = kd.a((String) null, (String) null, true, -114);
              if (null == field_e) {
                field_e = "~/";
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            L4: {
              if (null == field_e) {
                field_e = "~/";
                break L4;
              } else {
                break L4;
              }
            }
            return;
          }
        }
        field_b = true;
        if (param0 > -28) {
          L5: {
            var4 = null;
            File discarded$5 = kd.a((String) null, (String) null, true, -114);
            if (null == field_e) {
              field_e = "~/";
              break L5;
            } else {
              break L5;
            }
          }
          return;
        } else {
          L6: {
            if (null == field_e) {
              field_e = "~/";
              break L6;
            } else {
              break L6;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_c = new Hashtable(16);
    }
}
