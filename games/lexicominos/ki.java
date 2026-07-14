/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ki {
    static ng field_b;
    static int field_f;
    static nc field_d;
    static int field_g;
    static wh field_a;
    static db field_c;
    static boolean field_e;

    final static void a(int param0, Random param1, int param2) {
        int var3 = 0;
        int var4 = Lexicominos.field_L ? 1 : 0;
        do {
            var3 = rh.a(14817, param1, 4);
        } while (e.field_q == var3);
        // if_icmpeq L5
        qj.field_gb = e.field_q;
        e.field_q = var3;
        nh.a(0, param0, var3, true);
        if (param2 > -96) {
            field_c = null;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(byte param0) {
        if (param0 > -101) {
            Object var2 = null;
            ki.a(-45, (Random) null, 72);
        }
        return qg.field_d;
    }

    final static void a(Object param0, ab param1, int param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (param1.field_i != null) {
          L0: {
            var3_int = 0;
            if (param2 == 50) {
              break L0;
            } else {
              field_f = -68;
              break L0;
            }
          }
          L1: while (true) {
            L2: {
              if (var3_int >= 50) {
                break L2;
              } else {
                if (null == param1.field_i.peekEvent()) {
                  break L2;
                } else {
                  ge.a(0, 1L);
                  var3_int++;
                  continue L1;
                }
              }
            }
            try {
              L3: {
                if (param0 != null) {
                  param1.field_i.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param0, 1001, "dummy"));
                  break L3;
                } else {
                  break L3;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var3 = (Exception) (Object) decompiledCaughtException;
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        int var1 = -128 / ((param0 - -49) / 63);
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = null;
        field_b = new ng();
        field_e = false;
    }
}
