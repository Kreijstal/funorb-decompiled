/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi extends am {
    private int field_t;
    static String field_v;
    static int field_s;
    static String field_u;

    final static t[] a(int param0, la param1, int param2, int param3) {
        RuntimeException var4 = null;
        t[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        t[] stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (nd.a(param0, param1, -1, param2)) {
              L1: {
                if (param3 == 482809644) {
                  break L1;
                } else {
                  mi.g((byte) 127);
                  break L1;
                }
              }
              stackOut_5_0 = p.a(3499);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("mi.C(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
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
            return (int[]) null;
        }
        int[] var15 = this.field_l.a(param1, 25657);
        int[] var3 = var15;
        if (this.field_l.field_b) {
            var25 = this.b(0, 1, param1);
            var26 = this.b(0, 2, param1);
            for (var6 = 0; var6 < ci.field_c; var6++) {
                var7 = 255 & var25[var6] >> 1358845796;
                var8 = var26[var6] * this.field_t >> 1409420684;
                var9 = de.field_d[var7] * var8 >> -224036660;
                var10 = var8 * jh.field_x[var7] >> 567317036;
                var11 = var6 - -(var9 >> -1582141972) & jh.field_A;
                var12 = vp.field_I & (var10 >> 2018529388) + param1;
                var27 = this.b(0, 0, var12);
                var15[var6] = var27[var11];
            }
        }
        return var3;
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (0 != var4_int) {
                if (var4_int == 1) {
                  L2: {
                    stackOut_6_0 = this;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (1 != param0.i((byte) -101)) {
                      stackOut_8_0 = this;
                      stackOut_8_1 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      break L2;
                    } else {
                      stackOut_7_0 = this;
                      stackOut_7_1 = 1;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      break L2;
                    }
                  }
                  ((mi) (this)).field_p = stackIn_9_1 != 0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                this.field_t = param0.i(param1 ^ 7059) << 969540580;
                break L1;
              }
            }
            L3: {
              if (param1 == 35) {
                break L3;
              } else {
                this.field_t = -72;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var4);
            stackOut_13_1 = new StringBuilder().append("mi.H(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public mi() {
        super(3, false);
        this.field_t = 32768;
    }

    final void a(byte param0) {
        int[] discarded$0 = null;
        if (param0 < 123) {
            discarded$0 = this.a((byte) -2, 21);
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
        int[] var30 = null;
        int[] var31 = null;
        int[][] var32 = null;
        L0: {
          var17 = Torquing.field_u;
          if (param0 == -29116) {
            break L0;
          } else {
            field_u = (String) null;
            break L0;
          }
        }
        L1: {
          var23 = this.field_r.a(15142, param1);
          var19 = var23;
          var18 = var19;
          var3 = var18;
          if (!this.field_r.field_b) {
            break L1;
          } else {
            var30 = this.b(0, 1, param1);
            var31 = this.b(0, 2, param1);
            var6 = var23[0];
            var7 = var23[1];
            var8 = var23[2];
            var9 = 0;
            L2: while (true) {
              if (var9 >= ci.field_c) {
                break L1;
              } else {
                var10 = (1048214 & var30[var9] * 255) >> 1667523020;
                var11 = var31[var9] * this.field_t >> 293212748;
                var12 = de.field_d[var10] * var11 >> -2076794868;
                var13 = jh.field_x[var10] * var11 >> -648237524;
                var14 = jh.field_A & (var12 >> 655782060) + var9;
                var15 = vp.field_I & param1 + (var13 >> 482809644);
                var32 = this.c(24066, var15, 0);
                var6[var9] = var32[0][var14];
                var7[var9] = var32[1][var14];
                var8[var9] = var32[2][var14];
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
            field_v = (String) null;
        }
        field_u = null;
        field_v = null;
    }

    static {
        field_v = "End Game";
        field_u = "Next Steps";
    }
}
