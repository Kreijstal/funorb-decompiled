/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi extends am {
    private int field_t;
    static String field_v;
    static int field_s;
    static String field_u;

    final static t[] a(int param0, la param1, int param2, int param3) {
        if (!nd.a(param0, param1, -1, param2)) {
            return null;
        }
        if (param3 != 482809644) {
            mi.g((byte) 127);
        }
        return p.a(3499);
    }

    final int[] a(byte param0, int param1) {
        int[] var25 = null;
        int[] var26 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var27 = null;
        int var14 = Torquing.field_u;
        if (param0 <= 86) {
            return null;
        }
        int[] var15 = ((mi) this).field_l.a(param1, 25657);
        int[] var3 = var15;
        if (((mi) this).field_l.field_b) {
            var25 = ((mi) this).b(0, 1, param1);
            var26 = ((mi) this).b(0, 2, param1);
            for (var6 = 0; var6 < ci.field_c; var6++) {
                var7 = 255 & var25[var6] >> 1358845796;
                var8 = var26[var6] * ((mi) this).field_t >> 1409420684;
                var9 = de.field_d[var7] * var8 >> -224036660;
                var10 = var8 * jh.field_x[var7] >> 567317036;
                var11 = var6 - -(var9 >> -1582141972) & jh.field_A;
                var12 = vp.field_I & (var10 >> 2018529388) + param1;
                var27 = ((mi) this).b(0, 0, var12);
                var15[var6] = var27[var11];
            }
        }
        return var3;
    }

    final void a(fj param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        L0: {
          var5 = Torquing.field_u;
          var4 = param2;
          if (0 != var4) {
            if (var4 == 1) {
              L1: {
                stackOut_5_0 = this;
                stackIn_7_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (1 != param0.i((byte) -101)) {
                  stackOut_7_0 = this;
                  stackOut_7_1 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  break L1;
                } else {
                  stackOut_6_0 = this;
                  stackOut_6_1 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  break L1;
                }
              }
              ((mi) this).field_p = stackIn_8_1 != 0;
              break L0;
            } else {
              break L0;
            }
          } else {
            ((mi) this).field_t = param0.i(param1 ^ 7059) << 969540580;
            break L0;
          }
        }
        L2: {
          if (param1 == 35) {
            break L2;
          } else {
            ((mi) this).field_t = -72;
            break L2;
          }
        }
    }

    public mi() {
        super(3, false);
        ((mi) this).field_t = 32768;
    }

    final void a(byte param0) {
        if (param0 < 123) {
            int[] discarded$0 = ((mi) this).a((byte) -2, 21);
        }
        ie.a(14837);
    }

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        int[][] var18 = null;
        int[][] var19 = null;
        int[][] var23 = null;
        int[][] var27 = null;
        int[][] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[][] var34 = null;
        L0: {
          var17 = Torquing.field_u;
          if (param0 == -29116) {
            break L0;
          } else {
            field_u = null;
            break L0;
          }
        }
        L1: {
          var31 = ((mi) this).field_r.a(15142, param1);
          var27 = var31;
          var23 = var27;
          var19 = var23;
          var18 = var19;
          var3 = var18;
          if (!((mi) this).field_r.field_b) {
            break L1;
          } else {
            var32 = ((mi) this).b(0, 1, param1);
            var33 = ((mi) this).b(0, 2, param1);
            var6 = var31[0];
            var7 = var31[1];
            var8 = var31[2];
            var9 = 0;
            L2: while (true) {
              if (var9 >= ci.field_c) {
                break L1;
              } else {
                var10 = (1048214 & var32[var9] * 255) >> 1667523020;
                var11 = var33[var9] * ((mi) this).field_t >> 293212748;
                var12 = de.field_d[var10] * var11 >> -2076794868;
                var13 = jh.field_x[var10] * var11 >> -648237524;
                var14 = jh.field_A & (var12 >> 655782060) + var9;
                var15 = vp.field_I & param1 + (var13 >> 482809644);
                var34 = ((mi) this).c(24066, var15, 0);
                var6[var9] = var34[0][var14];
                var7[var9] = var34[1][var14];
                var8[var9] = var34[2][var14];
                var9++;
                continue L2;
              }
            }
          }
        }
        return var18;
    }

    public static void g(byte param0) {
        if (param0 != -39) {
            field_v = null;
        }
        field_u = null;
        field_v = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "End Game";
        field_u = "Next Steps";
    }
}
