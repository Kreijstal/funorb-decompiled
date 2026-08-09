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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_6_0 = p.a(3499);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("mi.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
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
        int var5 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (0 != var4_int) {
                if (var4_int == 1) {
                  L2: {
                    stackIn_8_0 = this;

                    if (1 != param0.i((byte) -101)) {
                      stackIn_9_0 = this;
                      stackIn_9_1 = 0;
                      break L2;
                    } else {
                      stackIn_9_0 = this;
                      stackIn_9_1 = 1;
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
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("mi.H(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
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
        if (param0 < 123) {
            this.a((byte) -2, 21);
        }
        ie.a(14837);
    }

    final int[][] a(int param0, int param1) {
        int[] var30 = null;
        int[] var31 = null;
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
        int[][] var32 = null;
        int var17 = Torquing.field_u;
        if (param0 != -29116) {
            field_u = (String) null;
        }
        int[][] var23 = this.field_r.a(15142, param1);
        int[][] var19 = var23;
        int[][] var18 = var19;
        int[][] var3 = var18;
        if (this.field_r.field_b) {
            var30 = this.b(0, 1, param1);
            var31 = this.b(0, 2, param1);
            var6 = var23[0];
            var7 = var23[1];
            var8 = var23[2];
            for (var9 = 0; var9 < ci.field_c; var9++) {
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
