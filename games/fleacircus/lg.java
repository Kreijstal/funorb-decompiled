/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg {
    static volatile int field_d;
    static String field_a;
    static bi[] field_c;
    static ul field_b;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 > -23) {
            field_b = null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        gb.a(si.field_R);
        int var4 = 16 * param3 + -4;
        int var5 = 16 * param1 - 4;
        gb.a(var4, var5, var4 + 16, var5 + 16);
        se.field_a[param2].f(param0, -4, 128);
        gb.b(si.field_R);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param4 > -86) {
            lg.a(80, -23, -25, 98, -100, -103);
        }
        rl.field_e[qh.field_D] = param1;
        mh.field_y[qh.field_D] = qh.field_D;
        jl.field_b[qh.field_D] = param2;
        if (ea.field_a > param2) {
            ak.field_f = param2;
        }
        if (!(lc.field_u >= param2)) {
            ok.field_L = param2;
        }
        kk.field_b[qh.field_D] = param0;
        hg.field_q[qh.field_D] = param3;
        vh.field_i[qh.field_D] = param5;
        int var6 = param5 + param0 + param3;
        int var7 = var6 != 0 ? param0 * 1000 / var6 : 0;
        uj.field_a[qh.field_D] = var7;
        qh.field_D = qh.field_D + 1;
        if (!(ok.field_L >= var7)) {
            ok.field_L = var7;
        }
        if (!(var7 >= ak.field_f)) {
            ak.field_f = var7;
        }
    }

    final static void a(sg param0, int param1) {
        int var2 = 0;
        sg var3 = null;
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        if (null == param0.field_l) {
          return;
        } else {
          L0: {
            L1: {
              if (param0.field_b != param1) {
                break L1;
              } else {
                if (0 == param0.field_e) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var2 = 0;
            L2: while (true) {
              if (var2 >= qb.field_a) {
                break L0;
              } else {
                var3 = vg.field_H[var2];
                if (2 == var3.field_j) {
                  if (var3.field_b == param0.field_b) {
                    if (param0.field_e == var3.field_e) {
                      return;
                    } else {
                      var2++;
                      continue L2;
                    }
                  } else {
                    var2++;
                    continue L2;
                  }
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          }
          L3: {
            if (null == param0.field_c) {
              break L3;
            } else {
              break L3;
            }
          }
          ef.a(param0, (byte) -101);
          return;
        }
    }

    final static void a(int param0, int param1) {
        th.field_D = param1;
        if (gg.field_h != null) {
            gg.field_h.b(-114, param1);
        }
        if (!(null == hh.field_b)) {
            hh.field_b.a(param1, (byte) 63);
        }
        if (param0 >= -82) {
            lg.a(-113);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_a = "<%0>Recessed Wall:<%1> doesn't affect the fleas, but means you can't place tiles in its square.";
    }
}
