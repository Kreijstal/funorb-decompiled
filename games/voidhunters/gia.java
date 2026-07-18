/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gia extends le {
    private boolean field_l;
    private int field_i;
    static eab field_k;
    static String field_j;

    final void a(int param0, int param1, ds param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 < -60) {
                break L1;
              } else {
                field_k = null;
                break L1;
              }
            }
            var4_int = param0;
            if (var4_int == 0) {
              ((gia) this).field_i = param2.e(1869);
              return;
            } else {
              L2: {
                if (var4_int != 1) {
                  break L2;
                } else {
                  L3: {
                    stackOut_7_0 = this;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (param2.e((byte) -118) != 1) {
                      stackOut_9_0 = this;
                      stackOut_9_1 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      break L3;
                    } else {
                      stackOut_8_0 = this;
                      stackOut_8_1 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      break L3;
                    }
                  }
                  ((gia) this).field_l = stackIn_10_1 != 0;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("gia.F(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    public gia() {
        super(1, false);
        ((gia) this).field_i = 4096;
        ((gia) this).field_l = true;
    }

    final int[][] a(int param0, int param1) {
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
        var21 = VoidHunters.field_G;
        var41 = ((gia) this).field_d.a(param1, (byte) -85);
        var35 = var41;
        var29 = var35;
        var23 = var29;
        var22 = var23;
        var3 = var22;
        if (param0 == 255) {
          if (!((gia) this).field_d.field_g) {
            return var22;
          } else {
            var43 = ((gia) this).a(0, wf.field_d & param1 - 1, 255);
            var5 = ((gia) this).a(0, param1, 255);
            var42 = ((gia) this).a(0, 1 + param1 & wf.field_d, 255);
            var44 = var41[0];
            var45 = var41[1];
            var46 = var41[2];
            var10 = 0;
            L0: while (true) {
              if (hob.field_d <= var10) {
                return var22;
              } else {
                L1: {
                  var14 = ((gia) this).field_i * (var42[var10] - var43[var10]);
                  var15 = (var5[gbb.field_q & var10 - -1] - var5[gbb.field_q & -1 + var10]) * ((gia) this).field_i;
                  var16 = var15 >> 12;
                  var17 = var14 >> 12;
                  var18 = var16 * var16 >> 12;
                  var19 = var17 * var17 >> 12;
                  var20 = (int)(Math.sqrt((double)((float)(4096 + (var19 + var18)) / 4096.0f)) * 4096.0);
                  if (var20 != 0) {
                    var12 = var14 / var20;
                    var13 = 16777216 / var20;
                    var11 = var15 / var20;
                    break L1;
                  } else {
                    var13 = 0;
                    var12 = 0;
                    var11 = 0;
                    break L1;
                  }
                }
                L2: {
                  if (!((gia) this).field_l) {
                    break L2;
                  } else {
                    var13 = 2048 - -(var13 >> 1);
                    var11 = 2048 + (var11 >> 1);
                    var12 = 2048 - -(var12 >> 1);
                    break L2;
                  }
                }
                var44[var10] = var11;
                var45[var10] = var12;
                var46[var10] = var13;
                var10++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    public static void a(boolean param0) {
        field_j = null;
        field_k = null;
        if (param0) {
            gia.a(true);
        }
    }

    final static int d() {
        return rpa.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Boosters";
    }
}
