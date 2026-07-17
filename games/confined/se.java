/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se {
    static bi field_a;

    final static void a(int param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var5 = bd.field_g;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L1: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                int incrementValue$40 = var2;
                var2++;
                var5[incrementValue$40] = 0;
                int incrementValue$41 = var2;
                var2++;
                var5[incrementValue$41] = 0;
                int incrementValue$42 = var2;
                var2++;
                var5[incrementValue$42] = 0;
                int incrementValue$43 = var2;
                var2++;
                var5[incrementValue$43] = 0;
                int incrementValue$44 = var2;
                var2++;
                var5[incrementValue$44] = 0;
                int incrementValue$45 = var2;
                var2++;
                var5[incrementValue$45] = 0;
                int incrementValue$46 = var2;
                var2++;
                var5[incrementValue$46] = 0;
                int incrementValue$47 = var2;
                var2++;
                var5[incrementValue$47] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1_ref, "se.B(" + 0 + 41);
        }
    }

    final static void a(vg param0, boolean param1, double[] param2, boolean param3, double param4, double param5, dj param6) {
        double var9_double = 0.0;
        RuntimeException var9 = null;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        int var17 = 0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        int[] stackIn_12_4 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        int[] stackOut_11_4 = null;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        int[] stackOut_10_4 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              var9_double = param6.field_E + param2[9] * param6.field_C;
              var11 = param6.field_t + param6.field_C * param2[10];
              if (!param1) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            L2: {
              var13 = param6.field_D + param2[11] * param6.field_C;
              var15 = param4 * 1.0;
              var17 = (int)(32768.0 * var15);
              var18 = var9_double - param0.field_T;
              var20 = -param0.field_L + var11;
              var22 = var13 - param0.field_O;
              var24 = var20 * param0.field_ab + param0.field_R * var18 + var22 * param0.field_M;
              var26 = param0.field_F * var22 + (param0.field_U * var20 + param0.field_V * var18);
              var28 = var20 * param0.field_H + var18 * param0.field_P + var22 * param0.field_N;
              if (var28 < 0.15) {
                break L2;
              } else {
                L3: {
                  var30 = 5120 - -(int)(var24 / var28 * 10240.0);
                  var31 = 3008 - -(int)(10240.0 * (var26 / var28));
                  var17 = (int)qn.field_v.a((double)var17 * (-(var22 / param5) + 1.0), 0, var13);
                  var32 = (int)(0.2 / var28 * 10240.0);
                  var33 = var17 >> 10;
                  if (127 < var33) {
                    var33 = 127;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  stackOut_6_0 = var30;
                  stackOut_6_1 = var31;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  if (var32 <= 4100) {
                    stackOut_8_0 = stackIn_8_0;
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = var32;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    break L4;
                  } else {
                    stackOut_7_0 = stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = 4100;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_9_2 = stackOut_7_2;
                    break L4;
                  }
                }
                L5: {
                  stackOut_9_0 = stackIn_9_0;
                  stackOut_9_1 = stackIn_9_1;
                  stackOut_9_2 = stackIn_9_2;
                  stackOut_9_3 = var33;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  stackIn_11_3 = stackOut_9_3;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  stackIn_10_3 = stackOut_9_3;
                  if (!param3) {
                    stackOut_11_0 = stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = stackIn_11_2;
                    stackOut_11_3 = stackIn_11_3;
                    stackOut_11_4 = mm.field_cb;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    stackIn_12_3 = stackOut_11_3;
                    stackIn_12_4 = stackOut_11_4;
                    break L5;
                  } else {
                    stackOut_10_0 = stackIn_10_0;
                    stackOut_10_1 = stackIn_10_1;
                    stackOut_10_2 = stackIn_10_2;
                    stackOut_10_3 = stackIn_10_3;
                    stackOut_10_4 = mm.field_gb;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    stackIn_12_2 = stackOut_10_2;
                    stackIn_12_3 = stackOut_10_3;
                    stackIn_12_4 = stackOut_10_4;
                    break L5;
                  }
                }
                fn.a(stackIn_12_0, stackIn_12_1, stackIn_12_2, stackIn_12_3, stackIn_12_4);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var9 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var9;
            stackOut_14_1 = new StringBuilder().append("se.A(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          L7: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param1).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          L8: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param6 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
    }

    public static void a(byte param0) {
        field_a = null;
    }

    static {
    }
}
