/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cl extends hk {
    private int field_h;
    static int field_o;
    private int field_f;
    static int[] field_j;
    static String field_i;
    private int field_l;
    static ko field_m;
    private int field_k;
    static dl[] field_n;
    private int field_g;

    final void a(byte param0) {
        int var2 = 0;
        if (-1 > (((cl) this).field_h ^ -1)) {
          L0: {
            tb.field_d.a(d.field_b[((cl) this).field_k], 100, 128 * gi.field_m, ((cl) this).field_l / ((cl) this).field_h);
            ((cl) this).field_k = ((cl) this).field_k + 1;
            ((cl) this).field_l = 0;
            ((cl) this).field_h = 0;
            if ((((cl) this).field_f ^ -1) < -1) {
              tb.field_d.a(cj.field_x, 100, gi.field_m * 128, ((cl) this).field_g / ((cl) this).field_f);
              ((cl) this).field_f = 0;
              ((cl) this).field_g = 0;
              break L0;
            } else {
              break L0;
            }
          }
          var2 = 63 / ((29 - param0) / 42);
          return;
        } else {
          L1: {
            if ((((cl) this).field_f ^ -1) < -1) {
              tb.field_d.a(cj.field_x, 100, gi.field_m * 128, ((cl) this).field_g / ((cl) this).field_f);
              ((cl) this).field_f = 0;
              ((cl) this).field_g = 0;
              break L1;
            } else {
              break L1;
            }
          }
          var2 = 63 / ((29 - param0) / 42);
          return;
        }
    }

    final void a(int param0, int param1, ta param2) {
        ln var4 = null;
        int var5 = 0;
        var4 = (ln) vm.field_j[param0].elementAt(r.field_i[param0]);
        if (param1 == 23041505) {
          var5 = (18 + (m.field_l[param0] * 16384 + 73728)) / 37;
          if (var4.field_e < 0) {
            ((cl) this).field_g = ((cl) this).field_g + var5;
            ((cl) this).field_f = ((cl) this).field_f + 1;
            r.field_i[param0] = r.field_i[param0] + 1;
            return;
          } else {
            ((cl) this).field_l = ((cl) this).field_l + var5;
            ((cl) this).field_h = ((cl) this).field_h + 1;
            r.field_i[param0] = r.field_i[param0] + 1;
            return;
          }
        } else {
          field_m = null;
          var5 = (18 + (m.field_l[param0] * 16384 + 73728)) / 37;
          if (var4.field_e < 0) {
            ((cl) this).field_g = ((cl) this).field_g + var5;
            ((cl) this).field_f = ((cl) this).field_f + 1;
            r.field_i[param0] = r.field_i[param0] + 1;
            return;
          } else {
            ((cl) this).field_l = ((cl) this).field_l + var5;
            ((cl) this).field_h = ((cl) this).field_h + 1;
            r.field_i[param0] = r.field_i[param0] + 1;
            return;
          }
        }
    }

    final void a(byte param0, ta param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = CrazyCrystals.field_B;
        var3 = 0;
        L0: while (true) {
          if (ma.field_n.length <= var3) {
            if (param0 != 19) {
              ((cl) this).field_l = 31;
              return;
            } else {
              return;
            }
          } else {
            fo.field_m[var3] = param1.field_g;
            var3++;
            continue L0;
          }
        }
    }

    final pb b(byte param0) {
        if (param0 <= -127) {
            return null;
        }
        return null;
    }

    public static void c(int param0) {
        field_n = null;
        field_j = null;
        field_m = null;
        int var1 = -67 % ((param0 - -39) / 47);
        field_i = null;
    }

    cl() {
        ((cl) this).field_h = 0;
        ((cl) this).field_f = 0;
        ((cl) this).field_l = 0;
        ((cl) this).field_k = 0;
        ((cl) this).field_g = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
        field_i = "You don't have to kill spiders, but you get points if you do. Here's a spider for you to practise on.";
    }
}
