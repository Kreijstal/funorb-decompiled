/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends wp {
    int field_F;
    static int field_I;
    int field_G;
    int field_K;
    static ki field_J;
    static boolean field_E;
    int field_M;
    int field_L;
    int field_H;

    public static void a() {
        field_J = null;
    }

    final static void a(byte param0, boolean param1) {
        int var2 = 104 / ((param0 - 78) / 36);
        int discarded$0 = 108;
        kt.b();
    }

    final boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var12 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, -47, param2, param3, param4, param5, param6)) {
              L1: {
                if (param1 <= -42) {
                  break L1;
                } else {
                  vb.a((byte) 68, false);
                  break L1;
                }
              }
              stackOut_16_0 = 0;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            } else {
              L2: {
                var8_int = param5 + (-param4 + (-((vb) this).field_r - ((vb) this).field_G));
                var9 = -((vb) this).field_K + -((vb) this).field_v + (-param6 + param2);
                if (((vb) this).field_F * ((vb) this).field_F <= var9 * var9 + var8_int * var8_int) {
                  break L2;
                } else {
                  L3: {
                    var10 = Math.atan2((double)var9, (double)var8_int) - s.field_m;
                    if (var10 >= 0.0) {
                      if (0.0 >= var10) {
                        break L3;
                      } else {
                        var10 = var10 + 3.141592653589793 / (double)((vb) this).field_L;
                        break L3;
                      }
                    } else {
                      var10 = var10 - 3.141592653589793 / (double)((vb) this).field_L;
                      break L3;
                    }
                  }
                  ((vb) this).field_H = (int)((double)((vb) this).field_L * var10 / 6.283185307179586);
                  L4: while (true) {
                    if (((vb) this).field_L > ((vb) this).field_H) {
                      L5: while (true) {
                        if (((vb) this).field_H >= 0) {
                          break L2;
                        } else {
                          ((vb) this).field_H = ((vb) this).field_H + ((vb) this).field_L;
                          continue L5;
                        }
                      }
                    } else {
                      ((vb) this).field_H = ((vb) this).field_H - ((vb) this).field_L;
                      continue L4;
                    }
                  }
                }
              }
              stackOut_12_0 = 1;
              stackIn_13_0 = stackOut_12_0;
              return stackIn_13_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var8;
            stackOut_18_1 = new StringBuilder().append("vb.R(");
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
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_17_0 != 0;
    }

    private vb() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = -1;
    }
}
