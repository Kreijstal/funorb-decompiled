/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends rm {
    int field_G;
    static uf field_Q;
    static ng field_H;
    int field_O;
    static String field_M;
    int field_K;
    static String field_N;
    int field_J;
    int field_P;
    int field_L;
    static int field_I;

    public static void a(boolean param0) {
        field_N = null;
        field_M = null;
        field_Q = null;
        field_H = null;
    }

    final boolean a(int param0, int param1, int param2, n param3, byte param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var12 = HoldTheLine.field_D;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              L1: {
                var8_int = param5 - (param0 + (((hg) this).field_k + ((hg) this).field_G));
                var9 = param1 + -((hg) this).field_o + (-param2 + -((hg) this).field_J);
                if (((hg) this).field_P * ((hg) this).field_P <= var9 * var9 + var8_int * var8_int) {
                  break L1;
                } else {
                  L2: {
                    var10 = Math.atan2((double)var9, (double)var8_int) - sj.field_L;
                    if (var10 >= 0.0) {
                      if (var10 <= 0.0) {
                        break L2;
                      } else {
                        var10 = var10 + 3.141592653589793 / (double)((hg) this).field_O;
                        break L2;
                      }
                    } else {
                      var10 = var10 - 3.141592653589793 / (double)((hg) this).field_O;
                      break L2;
                    }
                  }
                  ((hg) this).field_K = (int)((double)((hg) this).field_O * var10 / 6.283185307179586);
                  L3: while (true) {
                    if (((hg) this).field_O > ((hg) this).field_K) {
                      L4: while (true) {
                        if (((hg) this).field_K >= 0) {
                          break L1;
                        } else {
                          ((hg) this).field_K = ((hg) this).field_K + ((hg) this).field_O;
                          continue L4;
                        }
                      }
                    } else {
                      ((hg) this).field_K = ((hg) this).field_K - ((hg) this).field_O;
                      continue L3;
                    }
                  }
                }
              }
              stackOut_13_0 = 1;
              stackIn_14_0 = stackOut_13_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var8;
            stackOut_15_1 = new StringBuilder().append("hg.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_14_0 != 0;
    }

    private hg() throws Throwable {
        throw new Error();
    }

    final static int a(byte param0) {
        return -mk.field_d + vf.field_t;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "Checking";
    }
}
