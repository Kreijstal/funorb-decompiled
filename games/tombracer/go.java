/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class go extends ci {
    static int[] field_m;
    private int field_n;

    final static int e(int param0, int param1, int param2) {
        if (param0 != -1) {
            return 4;
        }
        int var3 = param1 >>> -749859809;
        return (var3 + param1) / param2 - var3;
    }

    public go() {
        super(1, true);
        this.field_n = 4096;
    }

    final static boolean d(int param0, int param1, int param2) {
        int discarded$13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param2 != 26205) {
          L0: {
            discarded$13 = go.e(-33, 75, 49);
            if ((param1 & 256) == 0) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((param1 & 256) == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void d(byte param0) {
        field_m = null;
        if (param0 >= -85) {
            field_m = (int[]) null;
        }
    }

    final int[] c(int param0, int param1) {
        int[] discarded$2 = null;
        int[] discarded$3 = null;
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
        int[] var20 = null;
        int[] var21 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        var16 = TombRacer.field_G ? 1 : 0;
        var17 = this.field_i.a((byte) 80, param1);
        var3 = var17;
        if (this.field_i.field_d) {
          var20 = this.c(0, -73, -1 + param1 & hba.field_b);
          var5 = this.c(0, -112, param1);
          var21 = this.c(0, -47, param1 + 1 & hba.field_b);
          var7 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var7 >= ns.field_g) {
                  break L2;
                } else {
                  var8 = (-var20[var7] + var21[var7]) * this.field_n;
                  var9 = this.field_n * (-var5[una.field_b & var7 - 1] + var5[1 + var7 & una.field_b]);
                  var10 = var9 >> 1524452236;
                  var11 = var8 >> -791331572;
                  var12 = var10 * var10 >> -1730752852;
                  var13 = var11 * var11 >> -1609901940;
                  var14 = (int)(4096.0 * Math.sqrt((double)((float)(var13 + var12 + 4096) / 4096.0f)));
                  stackOut_7_0 = var14;
                  stackIn_13_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (var16 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (stackIn_8_0 == 0) {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        break L3;
                      } else {
                        stackOut_9_0 = 16777216 / var14;
                        stackIn_11_0 = stackOut_9_0;
                        break L3;
                      }
                    }
                    var15 = stackIn_11_0;
                    var17[var7] = 4096 - var15;
                    var7++;
                    if (var16 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_12_0 = param0;
              stackIn_13_0 = stackOut_12_0;
              break L1;
            }
            if (stackIn_13_0 != 1) {
              discarded$2 = this.c(-51, 114);
              return var17;
            } else {
              return var17;
            }
          }
        } else {
          if (param0 == 1) {
            return var17;
          } else {
            var17 = var3;
            discarded$3 = this.c(-51, 114);
            return var17;
          }
        }
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
        int decompiledRegionSelector0 = 0;
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
                if (-1 != (param2 ^ -1)) {
                  break L1;
                } else {
                  this.field_n = param1.d(124);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (runtimeException);
            stackOut_5_1 = new StringBuilder().append("go.A(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_m = new int[]{200, 224, 300, 200, 230, 292};
    }
}
