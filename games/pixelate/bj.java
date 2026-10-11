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
        if (un.field_l) {
          t.a(t.field_e, t.field_f, -t.field_e + t.field_h, t.field_a - t.field_f);
          bn.field_I.a(false, 0);
        }
        if (param0 == 1) {
          return;
        }
        field_b = (int[]) null;
    }

    final static dd a(int param0, int param1) {
        int var2 = 0;
        if (param0 >= 10) {
          if (10 > param0) {
            param0 = 10;
          }
          if (param0 > 50) {
            param0 = 50;
          }
          int var3 = 85 / ((0 - param1) / 35);
          var2 = 0 == ok.a(ea.field_b, -111, 4) ? 1 : 0;
          return mc.a(ea.field_b, 5, var2 != 0, param0, -52);
        }
        return up.field_d[param0];
    }

    public static void b(byte param0) {
        if (param0 == 109) {
          field_c = null;
          field_d = null;
          field_b = null;
          return;
        }
        field_b = (int[]) null;
        field_c = null;
        field_d = null;
        field_b = null;
    }

    static {
        field_c = new ua[18];
    }
}
