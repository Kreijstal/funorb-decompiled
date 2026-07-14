/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v extends RuntimeException {
    static jg[] field_g;
    Throwable field_f;
    String field_d;
    static jp field_b;
    static int field_e;
    static String field_c;
    static int[] field_a;

    final static int b(int param0) {
        if (param0 != 5395) {
            return -14;
        }
        return jj.field_c;
    }

    public static void a(boolean param0) {
        if (param0) {
            jp[] discarded$0 = v.a(-93);
        }
        field_g = null;
        field_b = null;
        field_c = null;
        field_a = null;
    }

    v(Throwable param0, String param1) {
        ((v) this).field_f = param0;
        ((v) this).field_d = param1;
    }

    final static void a(int param0, int param1, boolean param2, ak param3, int param4, int param5) {
        int var6 = 0;
        j var7 = null;
        int var8 = 0;
        int var9 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackOut_4_0;
        int stackOut_4_1;
        int stackOut_4_2;
        int stackOut_4_3;
        int stackOut_6_0;
        int stackOut_6_1;
        int stackOut_6_2;
        int stackOut_6_3;
        int stackOut_6_4;
        int stackOut_5_0;
        int stackOut_5_1;
        int stackOut_5_2;
        int stackOut_5_3;
        int stackOut_5_4;
        var9 = BrickABrac.field_J ? 1 : 0;
        op.a(param0 + 6, t.field_d, 294, 6, param1, 64, 3 + param5);
        var6 = 0;
        L0: while (true) {
          if (param3.field_k <= var6) {
            return;
          } else {
            if (0 == (1 << var6 & (param3.field_g | param3.field_i | param3.field_a))) {
              L1: {
                var7 = param3.field_l[var6];
                var8 = 1414 * var7.field_G / (30 * param3.field_k);
                var8 = var8 + (de.field_x + 294 << 2026107271);
                var8 = var8 >> 8;
                stackOut_4_0 = var7.field_H;
                stackOut_4_1 = 0;
                stackOut_4_2 = var7.field_M;
                stackOut_4_3 = var8;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_6_2 = stackOut_4_2;
                stackIn_6_3 = stackOut_4_3;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                stackIn_5_3 = stackOut_4_3;
                if (var6 != param4) {
                  stackOut_6_0 = stackIn_6_0;
                  stackOut_6_1 = stackIn_6_1;
                  stackOut_6_2 = stackIn_6_2;
                  stackOut_6_3 = stackIn_6_3;
                  stackOut_6_4 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  stackIn_7_3 = stackOut_6_3;
                  stackIn_7_4 = stackOut_6_4;
                  break L1;
                } else {
                  stackOut_5_0 = stackIn_5_0;
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = stackIn_5_2;
                  stackOut_5_3 = stackIn_5_3;
                  stackOut_5_4 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  stackIn_7_3 = stackOut_5_3;
                  stackIn_7_4 = stackOut_5_4;
                  break L1;
                }
              }
              ib.a(stackIn_7_0, stackIn_7_1 != 0, stackIn_7_2, stackIn_7_3, stackIn_7_4 != 0, param5, param0);
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    final static jp[] a(int param0) {
        jp[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        int[] var10 = null;
        byte[] var11 = null;
        int[] var13 = null;
        byte[] var15 = null;
        int[] var17 = null;
        byte[] var19 = null;
        int[] var21 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        L0: {
          var8 = BrickABrac.field_J ? 1 : 0;
          var1 = new jp[nl.field_c];
          if (param0 == -835) {
            break L0;
          } else {
            v.a(false);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= nl.field_c) {
            ee.d((byte) 96);
            return var1;
          } else {
            var3 = gg.field_t[var2] * jh.field_b[var2];
            var24 = cn.field_a[var2];
            if (!tm.field_b[var2]) {
              var10 = new int[var3];
              var26 = var10;
              var6 = 0;
              L2: while (true) {
                if (var6 >= var3) {
                  var1[var2] = new jp(cf.field_d, ek.field_db, ag.field_K[var2], dl.field_d[var2], jh.field_b[var2], gg.field_t[var2], var26);
                  var2++;
                  continue L1;
                } else {
                  var10[var6] = qp.field_c[ik.a((int) var24[var6], 255)];
                  var6++;
                  continue L2;
                }
              }
            } else {
              var23 = bj.field_S[var2];
              var19 = var23;
              var15 = var19;
              var11 = var15;
              var9 = var11;
              var5 = var9;
              var25 = new int[var3];
              var21 = var25;
              var17 = var21;
              var13 = var17;
              var6_ref_int__ = var13;
              var7 = 0;
              L3: while (true) {
                if (var3 <= var7) {
                  var1[var2] = (jp) (Object) new fb(cf.field_d, ek.field_db, ag.field_K[var2], dl.field_d[var2], jh.field_b[var2], gg.field_t[var2], var25);
                  var2++;
                  continue L1;
                } else {
                  var6_ref_int__[var7] = ud.d(ik.a(255, (int) var23[var7]) << 713805816, qp.field_c[ik.a(255, (int) var24[var7])]);
                  var7++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Send private message to <%0>";
    }
}
