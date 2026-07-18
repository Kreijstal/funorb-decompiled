/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh extends eb {
    static String field_L;
    int field_K;
    int field_R;
    int field_P;
    static String field_O;
    int field_Q;
    int field_M;
    int field_N;

    final boolean a(boolean param0, int param1, int param2, int param3, int param4, gl param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var12 = Terraphoenix.field_V;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_15_0 = 0;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              L1: {
                var8_int = param1 + (-((gh) this).field_R + (-((gh) this).field_w + -param3));
                var9 = param6 - (((gh) this).field_M + ((gh) this).field_u + param2);
                if (var9 * var9 + var8_int * var8_int >= ((gh) this).field_Q * ((gh) this).field_Q) {
                  break L1;
                } else {
                  L2: {
                    var10 = Math.atan2((double)var9, (double)var8_int) - kd.field_b;
                    if (var10 >= 0.0) {
                      if (0.0 < var10) {
                        var10 = var10 + 3.141592653589793 / (double)((gh) this).field_K;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      var10 = var10 - 3.141592653589793 / (double)((gh) this).field_K;
                      break L2;
                    }
                  }
                  ((gh) this).field_N = (int)(var10 * (double)((gh) this).field_K / 6.283185307179586);
                  L3: while (true) {
                    if (((gh) this).field_K > ((gh) this).field_N) {
                      L4: while (true) {
                        if (((gh) this).field_N >= 0) {
                          break L1;
                        } else {
                          ((gh) this).field_N = ((gh) this).field_N + ((gh) this).field_K;
                          continue L4;
                        }
                      }
                    } else {
                      ((gh) this).field_N = ((gh) this).field_N - ((gh) this).field_K;
                      continue L3;
                    }
                  }
                }
              }
              stackOut_13_0 = 1;
              stackIn_14_0 = stackOut_13_0;
              return stackIn_14_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var8;
            stackOut_17_1 = new StringBuilder().append("gh.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param5 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param6 + ')');
        }
        return stackIn_16_0 != 0;
    }

    public static void a(int param0) {
        field_O = null;
        field_L = null;
    }

    final static int g(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_2_0 = 0;
        var3 = Terraphoenix.field_V;
        try {
          L0: {
            if (param0 < -114) {
              var1_int = 0;
              var2 = 0;
              L1: while (true) {
                if (var2 >= 9) {
                  stackOut_10_0 = var1_int;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  L2: {
                    if (rf.field_B[var2].field_c) {
                      var1_int++;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var2++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = -82;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1, "gh.V(" + param0 + ')');
        }
        return stackIn_11_0;
    }

    private gh() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "    2nd level";
        field_O = "    Wall";
    }
}
