/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rr extends rj {
    int field_E;
    int field_z;
    int field_C;
    int field_B;
    int field_F;
    int field_A;
    static String field_G;

    public static void b(int param0) {
        field_G = null;
        if (param0 == 0) {
            return;
        }
        field_G = null;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
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
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!super.a(112, param1, param2, param3, param4, param5, param6)) {
              L1: {
                if (param0 > 70) {
                  break L1;
                } else {
                  rr.b(-11);
                  break L1;
                }
              }
              stackOut_16_0 = 0;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            } else {
              L2: {
                var8_int = param6 - ((rr) this).field_i - param1 - ((rr) this).field_E;
                var9 = -param2 - (((rr) this).field_n - (-((rr) this).field_C + param3));
                if (((rr) this).field_F * ((rr) this).field_F <= var8_int * var8_int + var9 * var9) {
                  break L2;
                } else {
                  L3: {
                    var10 = Math.atan2((double)var9, (double)var8_int) - uca.field_b;
                    if (0.0 > var10) {
                      var10 = var10 - 3.141592653589793 / (double)((rr) this).field_B;
                      break L3;
                    } else {
                      if (var10 <= 0.0) {
                        break L3;
                      } else {
                        var10 = var10 + 3.141592653589793 / (double)((rr) this).field_B;
                        break L3;
                      }
                    }
                  }
                  ((rr) this).field_A = (int)(var10 * (double)((rr) this).field_B / 6.283185307179586);
                  L4: while (true) {
                    if (((rr) this).field_B > ((rr) this).field_A) {
                      L5: while (true) {
                        if (((rr) this).field_A >= 0) {
                          break L2;
                        } else {
                          ((rr) this).field_A = ((rr) this).field_A + ((rr) this).field_B;
                          continue L5;
                        }
                      }
                    } else {
                      ((rr) this).field_A = ((rr) this).field_A - ((rr) this).field_B;
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
            stackOut_18_1 = new StringBuilder().append("rr.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param5 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param6 + ')');
        }
        return stackIn_17_0 != 0;
    }

    private rr() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
