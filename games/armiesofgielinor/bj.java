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
        Object var3 = null;
        int var5 = 0;
        int[] var5_ref_int__ = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        int[] var11 = null;
        int[] var13 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        var1 = qm.field_K[0] * c.field_e[0];
        var18 = vj.field_j[0];
        if (param0 != 12722) {
          L0: {
            L1: {
              bj.a(-13);
              if (!ne.field_e[0]) {
                break L1;
              } else {
                var17 = cq.field_z[0];
                var13 = new int[var1];
                var11 = var13;
                var5_ref_int__ = var11;
                var6 = 0;
                L2: while (true) {
                  if (var6 >= var1) {
                    var3 = new nj(lg.field_d, wr.field_J, j.field_e[0], iq.field_g[0], qm.field_K[0], c.field_e[0], var13);
                    if (var7 == 0) {
                      break L0;
                    } else {
                      break L1;
                    }
                  } else {
                    var5_ref_int__[var6] = oe.c(rn.a(255, (int) var17[var6]) << -1454887048, qv.field_j[rn.a(255, (int) var18[var6])]);
                    var6++;
                    continue L2;
                  }
                }
              }
            }
            var9 = new int[var1];
            var5 = 0;
            L3: while (true) {
              L4: {
                if (var1 <= var5) {
                  break L4;
                } else {
                  var9[var5] = qv.field_j[rn.a(255, (int) var18[var5])];
                  var5++;
                  if (var7 == 0) {
                    continue L3;
                  } else {
                    break L4;
                  }
                }
              }
              var3 = new wk(lg.field_d, wr.field_J, j.field_e[0], iq.field_g[0], qm.field_K[0], c.field_e[0], var9);
              break L0;
            }
          }
          rj.d((byte) 113);
          return (wk) (var3);
        } else {
          L5: {
            L6: {
              if (!ne.field_e[0]) {
                break L6;
              } else {
                var19 = cq.field_z[0];
                var13 = new int[var1];
                var11 = var13;
                var5_ref_int__ = var11;
                var6 = 0;
                L7: while (true) {
                  if (var6 >= var1) {
                    var3 = new nj(lg.field_d, wr.field_J, j.field_e[0], iq.field_g[0], qm.field_K[0], c.field_e[0], var13);
                    if (var7 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  } else {
                    var5_ref_int__[var6] = oe.c(rn.a(255, (int) var19[var6]) << -1454887048, qv.field_j[rn.a(255, (int) var18[var6])]);
                    var6++;
                    continue L7;
                  }
                }
              }
            }
            var9 = new int[var1];
            var5 = 0;
            L8: while (true) {
              if (var1 <= var5) {
                var3 = new wk(lg.field_d, wr.field_J, j.field_e[0], iq.field_g[0], qm.field_K[0], c.field_e[0], var9);
                break L5;
              } else {
                var9[var5] = qv.field_j[rn.a(255, (int) var18[var5])];
                var5++;
                continue L8;
              }
            }
          }
          rj.d((byte) 113);
          return (wk) (var3);
        }
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
        field_q = "Equipment to sway the battle in your favour.";
        field_l = "Sandbox";
        field_k = true;
        field_o = "Highscores";
    }
}
