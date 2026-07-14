/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends tc {
    static String field_o;
    static String field_l;
    int field_n;
    static String field_q;
    static boolean field_k;
    int field_m;
    static wk[] field_p;

    final static wk e(int param0) {
        int var1 = 0;
        wk var3 = null;
        int var5 = 0;
        int[] var5_ref_int__ = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        int[] var11 = null;
        int[] var13 = null;
        int[] var16 = null;
        int[] var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          var1 = qm.field_K[0] * c.field_e[0];
          var19 = vj.field_j[0];
          if (param0 == 12722) {
            break L0;
          } else {
            bj.a(-13);
            break L0;
          }
        }
        L1: {
          if (!ne.field_e[0]) {
            var21 = new int[var1];
            var17 = var21;
            var9 = var17;
            var5 = 0;
            L2: while (true) {
              if (var1 <= var5) {
                var3 = new wk(lg.field_d, wr.field_J, j.field_e[0], iq.field_g[0], qm.field_K[0], c.field_e[0], var21);
                break L1;
              } else {
                var9[var5] = qv.field_j[rn.a(255, (int) var19[var5])];
                var5++;
                continue L2;
              }
            }
          } else {
            var18 = cq.field_z[0];
            var20 = new int[var1];
            var16 = var20;
            var13 = var16;
            var11 = var13;
            var5_ref_int__ = var11;
            var6 = 0;
            L3: while (true) {
              if (var6 >= var1) {
                var3 = (wk) (Object) new nj(lg.field_d, wr.field_J, j.field_e[0], iq.field_g[0], qm.field_K[0], c.field_e[0], var20);
                break L1;
              } else {
                var5_ref_int__[var6] = oe.c(rn.a(255, (int) var18[var6]) << -1454887048, qv.field_j[rn.a(255, (int) var19[var6])]);
                var6++;
                continue L3;
              }
            }
          }
        }
        rj.d((byte) 113);
        return var3;
    }

    public static void a(int param0) {
        field_l = null;
        if (param0 != 0) {
            return;
        }
        field_p = null;
        field_q = null;
        field_o = null;
    }

    private bj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Equipment to sway the battle in your favour.";
        field_l = "Sandbox";
        field_k = true;
        field_o = "Highscores";
    }
}
