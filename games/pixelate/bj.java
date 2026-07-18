/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bj {
    static gp field_d;
    static int field_a;
    static int[] field_b;
    static ua[] field_c;

    final static void a(byte param0) {
        if (!(!un.field_l)) {
            t.a(t.field_e, t.field_f, -t.field_e + t.field_h, t.field_a + -t.field_f);
            bn.field_I.a(false, 0);
        }
    }

    final static dd a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 < 10) {
          return up.field_d[param0];
        } else {
          L0: {
            if (10 <= param0) {
              break L0;
            } else {
              param0 = 10;
              break L0;
            }
          }
          L1: {
            if (param0 <= 50) {
              break L1;
            } else {
              param0 = 50;
              break L1;
            }
          }
          L2: {
            var3 = 85 / ((0 - param1) / 35);
            if (0 != ok.a(ea.field_b, -111, 4)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L2;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L2;
            }
          }
          var2 = stackIn_8_0;
          return mc.a(ea.field_b, 5, var2 != 0, param0, -52);
        }
    }

    public static void b(byte param0) {
        field_c = null;
        field_d = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ua[18];
    }
}
