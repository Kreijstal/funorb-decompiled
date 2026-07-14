/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bp extends ji {
    static int[] field_E;
    private int field_D;
    static wp field_A;
    static ve field_y;
    static cr field_C;
    static int field_z;

    final static void a(int param0, boolean param1, java.awt.Canvas param2) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (10 > qc.field_A) {
          L0: {
            var3 = 0;
            if (uh.field_sc) {
              uh.field_sc = false;
              var3 = 1;
              break L0;
            } else {
              break L0;
            }
          }
          tq.a(bh.field_M, var3 != 0, db.h(2), (byte) -128, od.a((byte) -18));
          if (param0 != 240) {
            var5 = null;
            bp.a(-25, true, (java.awt.Canvas) null);
            return;
          } else {
            return;
          }
        } else {
          if (!nl.a((byte) 107)) {
            bi.c();
            lm.a((byte) 115, 240, 320);
            dh.a(0, (byte) -97, param2, 0);
            if (param0 != 240) {
              var5 = null;
              bp.a(-25, true, (java.awt.Canvas) null);
              return;
            } else {
              return;
            }
          } else {
            if (hn.field_w != 0) {
              an.a(-1243, param2);
              if (param0 == 240) {
                return;
              } else {
                var5 = null;
                bp.a(-25, true, (java.awt.Canvas) null);
                return;
              }
            } else {
              td.a(param1, false, (byte) -77);
              dh.a(0, (byte) -11, param2, 0);
              if (param0 == 240) {
                return;
              } else {
                var5 = null;
                bp.a(-25, true, (java.awt.Canvas) null);
                return;
              }
            }
          }
        }
    }

    final int[][] b(int param0, int param1) {
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
        var17 = Vertigo2.field_L ? 1 : 0;
        if (param0 == -3780) {
          var31 = ((bp) this).field_v.a(param1, -2);
          var27 = var31;
          var23 = var27;
          var19 = var23;
          var18 = var19;
          var3 = var18;
          if (!((bp) this).field_v.field_c) {
            return var18;
          } else {
            var32 = ((bp) this).a(1, -1, param1);
            var33 = ((bp) this).a(2, param0 ^ 3779, param1);
            var6 = var31[0];
            var7 = var31[1];
            var8 = var31[2];
            var9 = 0;
            L0: while (true) {
              if (we.field_M <= var9) {
                return var18;
              } else {
                var10 = var32[var9] * 255 >> 1202888300 & 255;
                var11 = ((bp) this).field_D * var33[var9] >> 784566508;
                var12 = qb.field_b[var10] * var11 >> 609430188;
                var13 = eh.field_b[var10] * var11 >> 1614696940;
                var14 = (var12 >> 252697484) + var9 & rm.field_z;
                var15 = param1 - -(var13 >> 1522830668) & fk.field_x;
                var34 = ((bp) this).c(0, 3, var15);
                var6[var9] = var34[0][var14];
                var7[var9] = var34[1][var14];
                var8[var9] = var34[2][var14];
                var9++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final void a(byte param0, int param1, ed param2) {
        int var4 = 0;
        int var5 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        var5 = Vertigo2.field_L ? 1 : 0;
        if (param0 == 110) {
          var4 = param1;
          if (-1 != (var4 ^ -1)) {
            if (var4 == 1) {
              L0: {
                stackOut_14_0 = this;
                stackIn_16_0 = stackOut_14_0;
                stackIn_15_0 = stackOut_14_0;
                if (1 != param2.h(param0 + -121)) {
                  stackOut_16_0 = this;
                  stackOut_16_1 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  break L0;
                } else {
                  stackOut_15_0 = this;
                  stackOut_15_1 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  break L0;
                }
              }
              ((bp) this).field_o = stackIn_17_1 != 0;
              return;
            } else {
              return;
            }
          } else {
            ((bp) this).field_D = param2.a((byte) -11) << 531666020;
            return;
          }
        } else {
          field_E = null;
          var4 = param1;
          if (-1 != (var4 ^ -1)) {
            L1: {
              if (var4 != 1) {
                break L1;
              } else {
                L2: {
                  stackOut_4_0 = this;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (1 != param2.h(param0 + -121)) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L2;
                  } else {
                    stackOut_5_0 = this;
                    stackOut_5_1 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L2;
                  }
                }
                ((bp) this).field_o = stackIn_7_1 != 0;
                break L1;
              }
            }
            return;
          } else {
            ((bp) this).field_D = param2.a((byte) -11) << 531666020;
            return;
          }
        }
    }

    public bp() {
        super(3, false);
        ((bp) this).field_D = 32768;
    }

    public static void g(int param0) {
        field_y = null;
        field_A = null;
        field_E = null;
        field_C = null;
        if (param0 != 7750) {
            field_C = null;
        }
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var15 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        var14 = Vertigo2.field_L ? 1 : 0;
        if (param1 > 91) {
          var15 = ((bp) this).field_x.a(param0, (byte) -84);
          var3 = var15;
          if (((bp) this).field_x.field_i) {
            var25 = ((bp) this).a(1, -1, param0);
            var26 = ((bp) this).a(2, -1, param0);
            var6 = 0;
            L0: while (true) {
              if (we.field_M > var6) {
                var7 = (4082 & var25[var6]) >> 948823236;
                var8 = ((bp) this).field_D * var26[var6] >> 1780404332;
                var9 = var8 * qb.field_b[var7] >> -890144724;
                var10 = var8 * eh.field_b[var7] >> -1844281556;
                var11 = var6 - -(var9 >> -2095034484) & rm.field_z;
                var12 = (var10 >> 1745491020) + param0 & fk.field_x;
                var27 = ((bp) this).a(0, -1, var12);
                var15[var6] = var27[var11];
                var6++;
                continue L0;
              } else {
                return var3;
              }
            }
          } else {
            return var3;
          }
        } else {
          return null;
        }
    }

    final void a(int param0) {
        uk.d((byte) 67);
        if (param0 >= -98) {
            ((bp) this).field_D = 10;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new int[]{600, 600, 1200, 600, 900, 1100, 2500, 1750, 2500, 2500, 1300, 2100, 2250, 3200, 6500, 9000, 5000, 8250, 6000, 5250, 6000, 5500, 5250, 7500, 6400, 7750, 6000, 7750, 12000, 6000, 6000, 8000, 7500, 6750, 7500, 10000, 9000, 6500, 9000, 7500, 7000, 7500, 6000, 6000, 4500, 6000, 6750, 10500, 6000, 8250};
        field_A = new wp();
        field_y = new ve(12, 0, 1, 0);
    }
}
