/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ce {
    static boolean field_c;
    static String field_a;
    static String field_d;
    static int field_b;

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        if (!param0) {
            field_a = null;
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (param1 < 0) {
          L0: {
            if (param4 < param2) {
              var7 = param4;
              var5 = var7;
              L1: while (true) {
                if (param2 <= var7) {
                  break L0;
                } else {
                  vl.field_e[var7][param0] = param3;
                  var7++;
                  continue L1;
                }
              }
            } else {
              var5 = param2;
              L2: while (true) {
                if (param4 <= var5) {
                  break L0;
                } else {
                  vl.field_e[var5][param0] = param3;
                  var5++;
                  continue L2;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static boolean a(byte param0, boolean param1) {
        // if_acmpne L27
        hb.field_q = kr.field_g.a(-121, cl.field_d, nb.field_y);
        // goto L27
        // ifne L38
        return false;
    }

    final static String a(byte param0, boolean param1, CharSequence param2) {
        int var4 = 0;
        int var5 = Vertigo2.field_L ? 1 : 0;
        String var3 = dp.a(param2, false, param1);
        if (var3 != null) {
            return var3;
        }
        for (var4 = 0; var4 < param2.length(); var4++) {
            if (!wb.a(param2.charAt(var4), (byte) 123)) {
                return ud.field_w;
            }
        }
        if (param0 < -112) {
            return null;
        }
        field_d = null;
        return null;
    }

    final static void a(boolean param0, uh param1) {
        int var3 = Vertigo2.field_L ? 1 : 0;
        param1.c(2);
        if (!param0) {
            field_b = -90;
        }
        uh var2 = (uh) (Object) nr.field_p.a((byte) 100);
        while (var2 != null) {
            // ifeq L62
            var2 = (uh) (Object) nr.field_p.b(25);
        }
        if (var2 != null) {
            jn.a((li) (Object) param1, (li) (Object) var2, 18724);
        } else {
            nr.field_p.a((li) (Object) param1, false);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Enter name of friend to delete from list";
        field_d = "Unable to add friend - system busy";
        field_b = 480;
    }
}
