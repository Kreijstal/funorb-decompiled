/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qh extends hk {
    private int field_m;
    static hj field_h;
    static boolean field_f;
    static String field_g;
    private int field_l;
    static Vector field_o;
    private int field_n;
    private int field_j;
    private int field_p;
    static int field_k;
    static int field_i;

    final pb b(byte param0) {
        if (param0 <= -127) {
            return null;
        }
        return null;
    }

    final static boolean a(int param0, int param1, int param2, db param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = CrazyCrystals.field_B;
          if (-1 == (param2 ^ -1)) {
            if (null != vj.field_a) {
              return false;
            } else {
              vj.field_a = new dl[23][];
              break L0;
            }
          } else {
            break L0;
          }
        }
        var4 = 23 * param2 >> -693818206;
        if (vj.field_a[var4] == null) {
          td.a((float)param1, oi.field_b, false);
          fe.field_g.a(param0 + -9384);
          L1: while (true) {
            if (var4 >= 23 * (1 + param2) >> -1700909022) {
              L2: {
                if (param0 == 9260) {
                  break L2;
                } else {
                  qh.c((byte) 33);
                  break L2;
                }
              }
              return true;
            } else {
              L3: {
                vj.field_a[var4] = new dl[bp.field_c[var4]];
                if (wk.field_c[var4] != null) {
                  L4: {
                    if (wk.field_c[var4] != "") {
                      sd.field_R = bf.a(-1, "sprites_player_" + wk.field_c[var4], "", param3);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var5 = 0;
                  L5: while (true) {
                    if (var5 >= fg.field_j[var4]) {
                      L6: while (true) {
                        if (bp.field_c[var4] <= var5) {
                          break L3;
                        } else {
                          vj.field_a[var4][var5] = sd.field_R[var5 + (vf.field_a[var4] + oe.field_c[var4])];
                          var5++;
                          continue L6;
                        }
                      }
                    } else {
                      vj.field_a[var4][var5] = sd.field_R[vf.field_a[var4] + var5];
                      var5++;
                      continue L5;
                    }
                  }
                } else {
                  var5 = 0;
                  L7: while (true) {
                    if (var5 >= bp.field_c[var4]) {
                      break L3;
                    } else {
                      vj.field_a[var4][var5] = vj.field_a[var4 + -1][var5].c();
                      var5++;
                      continue L7;
                    }
                  }
                }
              }
              var4++;
              continue L1;
            }
          }
        } else {
          return false;
        }
    }

    final void a(int param0, int param1, ta param2) {
        ln var9 = (ln) vm.field_j[param0].elementAt(ib.field_l[param0]);
        int var5 = (18 + (16384 * m.field_l[param0] - -73728)) / 37;
        if ((var9.field_e ^ -1) <= -1) {
            ((qh) this).field_m = ((qh) this).field_m + var5;
            ((qh) this).field_n = ((qh) this).field_n + 1;
        } else {
            ((qh) this).field_l = ((qh) this).field_l + 1;
            ((qh) this).field_j = ((qh) this).field_j + var5;
        }
        int var6 = -1 != (var9.field_e ^ -1) ? var9.field_e : pd.field_g[param0];
        if (param1 != 23041505) {
            Object var8 = null;
            ((qh) this).a(32, -26, (ta) null);
        }
        int var7 = var6;
        mb.field_g = mb.field_g - var7;
        pd.field_g[param0] = pd.field_g[param0] + var6;
        ib.field_l[param0] = ib.field_l[param0] + 1;
    }

    final void a(byte param0) {
        if ((((qh) this).field_n ^ -1) < -1) {
            tb.field_d.a(oj.field_L[((qh) this).field_p], 100, gi.field_m * 128, ((qh) this).field_m / ((qh) this).field_n);
            ((qh) this).field_m = 0;
            ((qh) this).field_n = 0;
            ((qh) this).field_p = ((qh) this).field_p + 1;
        }
        if (!((((qh) this).field_l ^ -1) >= -1)) {
            tb.field_d.a(bp.field_a, 100, gi.field_m * 128, ((qh) this).field_j / ((qh) this).field_l);
            ((qh) this).field_l = 0;
            ((qh) this).field_j = 0;
        }
        int var2 = -9 / ((param0 - 29) / 42);
    }

    public static void c(byte param0) {
        if (param0 <= 6) {
            return;
        }
        field_o = null;
        field_g = null;
        field_h = null;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = CrazyCrystals.field_B;
        for (var5 = 0; param2 > var5; var5++) {
            ((qh) this).a(param1, 23041505, (ta) null);
        }
        if (!param0) {
            ((qh) this).a(true, -42, 29, 122);
        }
    }

    qh() {
        ((qh) this).field_n = 0;
        ((qh) this).field_m = 0;
        ((qh) this).field_j = 0;
        ((qh) this).field_l = 0;
        ((qh) this).field_p = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Safe";
        field_i = 0;
    }
}
