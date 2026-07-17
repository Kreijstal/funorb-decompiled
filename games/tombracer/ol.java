/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    static String field_b;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
    }

    final static int a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        int var15 = 0;
        var6 = tk.a(-22636);
        if (var6 == 0) {
          return 0;
        } else {
          L0: {
            var7 = param0 - param3 >> 16;
            var8 = param4 + -param5 >> 16;
            var9 = (double)ua.a(var7, param2 + -29);
            var11 = (double)ua.a(var8, -102);
            var13 = Math.sqrt(var11 * var11 + var9 * var9);
            var15 = (int)((double)var6 - (double)var6 * (-64.0 + var13) / 704.0);
            if (768.0 <= var13) {
              var15 = 0;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var13 > 64.0) {
              break L1;
            } else {
              var15 = 255;
              break L1;
            }
          }
          var15 = za.a(0, (byte) 48, var6, var15);
          if (param2 != -91) {
            return 56;
          } else {
            var15 = var15 * to.field_n[param1] / var6;
            return var15;
          }
        }
    }

    final static boolean a(mu param0, boolean param1, mu param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = -param0.field_Db + param2.field_Db;
            if (param1) {
              L1: {
                if (param2.field_Cb != field_b) {
                  if (null == param2.field_Cb) {
                    var3_int += 200;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var3_int -= 200;
                  break L1;
                }
              }
              L2: {
                if (param0.field_Cb == field_b) {
                  var3_int += 200;
                  break L2;
                } else {
                  if (param0.field_Cb == null) {
                    var3_int -= 200;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var3_int <= 0) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L3;
                } else {
                  stackOut_15_0 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  break L3;
                }
              }
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("ol.B(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          L5: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44).append(param1).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
        return stackIn_17_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Online Race";
    }
}
