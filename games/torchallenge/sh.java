/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sh extends w {
    boolean field_s;
    volatile boolean field_v;
    boolean field_p;
    static int field_r;
    static cf field_t;
    static int[] field_w;
    static uj field_u;
    static int[] field_q;

    final static void a(int param0, boolean param1) {
        int var2 = 82 % ((param0 - 9) / 57);
        ub.field_h = 0;
        oi.field_j = 0;
        kk.field_i = 0;
        ll.field_d = eh.field_k;
        of.field_c = new rl(2);
        of.field_c.a((byte) -123, param1, -1, pf.a(ph.field_d, -19503, kc.field_u));
    }

    final static void a(int param0, int param1, int[] param2, int param3, int[][] param4, int[][] param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var11 = TorChallenge.field_F ? 1 : 0;
        var7 = param5[param3][1] - param5[param3][0];
        var8 = 64;
        var9 = param2[var7 - 1] + param2[0] >> -1026292095;
        var10 = 0;
        L0: while (true) {
          if ((var10 ^ -1) <= -4) {
            var12 = 0;
            var10 = var12;
            L1: while (true) {
              if (var12 > 1) {
                la.field_f.a(-27);
                if (param1 <= -98) {
                  return;
                } else {
                  return;
                }
              } else {
                L2: {
                  L3: {
                    re.field_v[var12][param3].d();
                    qg.a(ae.field_y);
                    if (-1 != var12) {
                      break L3;
                    } else {
                      if (-1 == param0) {
                        var7 = param5[param3][1] + -param4[param3][0];
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var12 != 0) {
                      break L4;
                    } else {
                      if (1 != param0) {
                        break L4;
                      } else {
                        var7 = -param5[param3][0] + param4[param3][1];
                        break L2;
                      }
                    }
                  }
                  L5: {
                    if (-2 != (var12 ^ -1)) {
                      break L5;
                    } else {
                      if (param0 == 0) {
                        var7 = param5[param3][1] + -param4[param3][0];
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var7 = param4[param3][1] - param5[param3][0];
                  break L2;
                }
                if (-1 > (var7 ^ -1)) {
                  qg.a(0, 0, var7, var8);
                  od.a(fh.field_a[param0][var7 - 1], var9);
                  qg.b(ae.field_y);
                  la.field_f.a(-106);
                  var12++;
                  continue L1;
                } else {
                  var12++;
                  continue L1;
                }
              }
            }
          } else {
            we.field_e[var10][param3].d();
            qg.a(ae.field_y);
            if (var7 > 0) {
              qg.a(0, 0, var7, var8);
              od.a(cg.field_b[var10][param0][var7 + -1], param2);
              qg.b(ae.field_y);
              la.field_f.a(-106);
              var10++;
              continue L0;
            } else {
              var10++;
              continue L0;
            }
          }
        }
    }

    public static void b(boolean param0) {
        field_q = null;
        field_t = null;
        field_w = null;
        if (!param0) {
            ge discarded$0 = sh.d(99);
        }
        field_u = null;
    }

    abstract int f(int param0);

    final static ge d(int param0) {
        if (param0 >= -121) {
            field_r = 30;
        }
        ge var1 = new ge(ij.field_B, le.field_g, ug.field_e[0], dd.field_t[0], pg.field_r[0], lg.field_e[0], h.field_a[0], td.field_m);
        p.a(0);
        return var1;
    }

    sh() {
        ((sh) this).field_v = true;
    }

    abstract byte[] e(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = 256;
        field_t = new cf();
        field_w = new int[4];
        field_q = new int[]{0, 0};
    }
}
