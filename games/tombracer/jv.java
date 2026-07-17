/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jv extends ci {
    static ica field_m;
    private int field_o;
    private boolean field_n;

    final static int d() {
        int var1 = 50;
        return aqa.field_d - wt.field_a;
    }

    public jv() {
        super(1, false);
        ((jv) this).field_o = 4096;
        ((jv) this).field_n = true;
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var5 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[][] var22 = null;
        int[][] var23 = null;
        int[][] var29 = null;
        int[][] var35 = null;
        int[][] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        var21 = TombRacer.field_G ? 1 : 0;
        var41 = ((jv) this).field_h.a(param0, (byte) -125);
        var35 = var41;
        var29 = var35;
        var23 = var29;
        var22 = var23;
        var3 = var22;
        if (((jv) this).field_h.field_f) {
          var43 = ((jv) this).c(0, param1 + -118, hba.field_b & -1 + param0);
          var5 = ((jv) this).c(0, -32, param0);
          var42 = ((jv) this).c(0, -111, param0 - -1 & hba.field_b);
          var44 = var41[0];
          var45 = var41[1];
          var46 = var41[2];
          var10 = 0;
          L0: while (true) {
            if (ns.field_g > var10) {
              L1: {
                var14 = (var42[var10] - var43[var10]) * ((jv) this).field_o;
                var15 = ((jv) this).field_o * (-var5[una.field_b & -1 + var10] + var5[una.field_b & 1 + var10]);
                var16 = var15 >> 12;
                var17 = var14 >> 12;
                var18 = var16 * var16 >> 12;
                var19 = var17 * var17 >> 12;
                var20 = (int)(4096.0 * Math.sqrt((double)((float)(4096 + var18 - -var19) / 4096.0f)));
                if (var20 == 0) {
                  var13 = 0;
                  var11 = 0;
                  var12 = 0;
                  break L1;
                } else {
                  var12 = var14 / var20;
                  var11 = var15 / var20;
                  var13 = 16777216 / var20;
                  break L1;
                }
              }
              L2: {
                if (((jv) this).field_n) {
                  var12 = 2048 + (var12 >> 1);
                  var11 = (var11 >> 1) + 2048;
                  var13 = (var13 >> 1) + 2048;
                  break L2;
                } else {
                  break L2;
                }
              }
              var44[var10] = var11;
              var45[var10] = var12;
              var46[var10] = var13;
              var10++;
              continue L0;
            } else {
              if (param1 != -1) {
                ((jv) this).field_n = false;
                return var3;
              } else {
                return var3;
              }
            }
          }
        } else {
          if (param1 != -1) {
            ((jv) this).field_n = false;
            return var3;
          } else {
            return var3;
          }
        }
    }

    final void a(byte param0, uia param1, int param2) {
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
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == 107) {
              var4_int = param2;
              if (0 != var4_int) {
                if (var4_int == 1) {
                  L1: {
                    stackOut_8_0 = this;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_9_0 = stackOut_8_0;
                    if (param1.h(255) != 1) {
                      stackOut_10_0 = this;
                      stackOut_10_1 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      break L1;
                    } else {
                      stackOut_9_0 = this;
                      stackOut_9_1 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      break L1;
                    }
                  }
                  ((jv) this).field_n = stackIn_11_1 != 0;
                  break L0;
                } else {
                  return;
                }
              } else {
                ((jv) this).field_o = param1.d(param0 ^ 18);
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("jv.A(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 41);
        }
    }

    public static void c(int param0) {
        if (param0 != -15471) {
            return;
        }
        field_m = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new ica();
    }
}
