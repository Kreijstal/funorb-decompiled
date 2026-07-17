/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class go extends ci {
    static int[] field_m;
    private int field_n;

    final static int e(int param0, int param1, int param2) {
        int var3 = param1 >>> 31;
        return (var3 + param1) / param2 - var3;
    }

    public go() {
        super(1, true);
        ((go) this).field_n = 4096;
    }

    final static boolean d(int param0, int param1) {
        return (param1 & 256) != 0;
    }

    public static void d() {
        field_m = null;
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int[] var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var24 = null;
        int[] var25 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var16 = TombRacer.field_G ? 1 : 0;
          var17 = ((go) this).field_i.a((byte) 80, param1);
          var3 = var17;
          if (((go) this).field_i.field_d) {
            var24 = ((go) this).c(0, -73, -1 + param1 & hba.field_b);
            var5 = ((go) this).c(0, -112, param1);
            var25 = ((go) this).c(0, -47, param1 + 1 & hba.field_b);
            var7 = 0;
            L1: while (true) {
              if (var7 >= ns.field_g) {
                break L0;
              } else {
                L2: {
                  var8 = (-var24[var7] + var25[var7]) * ((go) this).field_n;
                  var9 = ((go) this).field_n * (-var5[una.field_b & var7 - 1] + var5[1 + var7 & una.field_b]);
                  var10 = var9 >> 12;
                  var11 = var8 >> 12;
                  var12 = var10 * var10 >> 12;
                  var13 = var11 * var11 >> 12;
                  var14 = (int)(4096.0 * Math.sqrt((double)((float)(var13 + var12 + 4096) / 4096.0f)));
                  if (var14 == 0) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    stackOut_5_0 = 16777216 / var14;
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
                var15 = stackIn_7_0;
                var17[var7] = 4096 - var15;
                var7++;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        L3: {
          if (param0 == 1) {
            break L3;
          } else {
            int[] discarded$1 = ((go) this).c(-51, 114);
            break L3;
          }
        }
        return var17;
    }

    final void a(byte param0, uia param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 107) {
              L1: {
                if (param2 != 0) {
                  break L1;
                } else {
                  ((go) this).field_n = param1.d(124);
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("go.A(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new int[]{200, 224, 300, 200, 230, 292};
    }
}
