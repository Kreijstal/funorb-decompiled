/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of extends pc {
    static mk field_F;
    static int field_H;
    static wh field_C;
    static int field_D;
    static String field_G;

    final static void e(byte param0) {
        if (!(gl.field_c)) {
            throw new IllegalStateException();
        }
        jd.field_z = true;
        fl.a(false, 1);
        if (param0 >= -36) {
            field_C = null;
        }
        hp.field_s = 0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param2 >= -75) {
            field_D = 123;
        }
        ((of) this).field_A = !((of) this).field_A ? true : false;
        super.a(param0, param1, -106, param3);
    }

    final static void a(db param0, int param1, db param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = CrazyCrystals.field_B;
        wc.field_q = bl.a(param2, "initialset", "level-complete").a();
        re.field_h = bl.a(param2, "initialset", "crystal1-appear").a();
        jj.field_a = bl.a(param2, "initialset", "crystal2-appear").a();
        cb.field_p = bl.a(param2, "initialset", "bomb-appear").a();
        lp.field_b = bl.a(param2, "initialset", "ball-appear").a();
        ti.field_m = bl.a(param2, "initialset", "key-appear").a();
        ad.field_k = bl.a(param2, "initialset", "spider-appear").a();
        var3 = 0;
        L0: while (true) {
          if (var3 >= 7) {
            L1: {
              cj.field_x = bl.a(param2, "initialset", "penalty-appear").a();
              qp.field_i = bl.a(param2, "initialset", "crystal1-disappear").a();
              ck.field_cb = bl.a(param2, "initialset", "crystal2-disappear").a();
              cf.field_d = bl.a(param2, "initialset", "ball-disappear").a();
              de.field_l = bl.a(param2, "initialset", "key-disappear").a();
              rd.field_i = bl.a(param2, "initialset", "spider-disappear").a();
              if (param1 >= 22) {
                break L1;
              } else {
                field_D = -59;
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (7 <= var3) {
                bp.field_a = bl.a(param2, "initialset", "penalty-disappear").a();
                je.field_f = ha.a(param0, "initialset", "score-count").b();
                dn.field_e = bl.a(param2, "initialset", "score-end").a();
                return;
              } else {
                oj.field_L[var3] = bl.a(param2, "initialset", "bonus" + var3 + "-disappear").a();
                var3++;
                continue L2;
              }
            }
          } else {
            d.field_b[var3] = bl.a(param2, "initialset", "bonus" + var3 + "-appear").a();
            var3++;
            continue L0;
          }
        }
    }

    of(String param0, bi param1, boolean param2) {
        this(param0, param1);
        ((of) this).field_A = param2 ? true : false;
    }

    private of(String param0, bi param1) {
        this(param0, pi.field_j.field_p, param1);
        ((of) this).field_i = pi.field_j.field_i;
    }

    final static boolean a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (oi.field_c == null) {
                break L1;
              } else {
                if (gj.field_k != ek.field_h) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    public static void h(int param0) {
        field_F = null;
        field_C = null;
        field_G = null;
        if (param0 != 3) {
            field_G = null;
        }
    }

    private of(String param0, wo param1, bi param2) {
        super(param0, param1, param2);
        ((of) this).field_i = pi.field_j.field_i;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new mk();
        field_G = "'<%1>' levels complete<br><col=<%0>>Proceeding to Bonus Levels";
        field_C = new wh(3);
    }
}
