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
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Object var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (10 > qc.field_A) {
                L2: {
                  var3_int = 0;
                  if (uh.field_sc) {
                    uh.field_sc = false;
                    var3_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                tq.a(bh.field_M, var3_int != 0, db.h(2), (byte) -128, od.a((byte) -18));
                break L1;
              } else {
                if (!nl.a((byte) 107)) {
                  bi.c();
                  lm.a((byte) 115, 240, 320);
                  dh.a(0, (byte) -97, param2, 0);
                  break L1;
                } else {
                  if (hn.field_w != 0) {
                    an.a(-1243, param2);
                    break L1;
                  } else {
                    td.a(param1, false, (byte) -77);
                    dh.a(0, (byte) -11, param2, 0);
                    break L1;
                  }
                }
              }
            }
            if (param0 == 240) {
              break L0;
            } else {
              var5 = null;
              bp.a(-25, true, (java.awt.Canvas) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("bp.B(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
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
                var10 = var32[var9] * 255 >> 12 & 255;
                var11 = ((bp) this).field_D * var33[var9] >> 12;
                var12 = qb.field_b[var10] * var11 >> 12;
                var13 = eh.field_b[var10] * var11 >> 12;
                var14 = (var12 >> 12) + var9 & rm.field_z;
                var15 = param1 - -(var13 >> 12) & fk.field_x;
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
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 110) {
                break L1;
              } else {
                field_E = null;
                break L1;
              }
            }
            var4_int = param1;
            if (var4_int != 0) {
              L2: {
                if (var4_int != 1) {
                  break L2;
                } else {
                  L3: {
                    stackOut_8_0 = this;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_9_0 = stackOut_8_0;
                    if (1 != param2.h(param0 + -121)) {
                      stackOut_10_0 = this;
                      stackOut_10_1 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      break L3;
                    } else {
                      stackOut_9_0 = this;
                      stackOut_9_1 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      break L3;
                    }
                  }
                  ((bp) this).field_o = stackIn_11_1 != 0;
                  break L2;
                }
              }
              break L0;
            } else {
              ((bp) this).field_D = param2.a((byte) -11) << 4;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("bp.C(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
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
                var7 = (4082 & var25[var6]) >> 4;
                var8 = ((bp) this).field_D * var26[var6] >> 12;
                var9 = var8 * qb.field_b[var7] >> 12;
                var10 = var8 * eh.field_b[var7] >> 12;
                var11 = var6 - -(var9 >> 12) & rm.field_z;
                var12 = (var10 >> 12) + param0 & fk.field_x;
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
