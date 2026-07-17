/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends rg {
    int field_P;
    int field_S;
    static int field_R;
    static String field_U;
    int field_Q;
    int field_W;
    int field_V;
    int field_T;

    public static void b(boolean param0) {
        field_U = null;
        if (param0) {
            return;
        }
        jh.b(false);
    }

    final boolean a(int param0, int param1, byte param2, int param3, fj param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var12 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              var8_int = param1 + -((jh) this).field_q + (-param0 + -((jh) this).field_P);
              var9 = param5 + (-((jh) this).field_S + (-((jh) this).field_m + -param3));
              if (((jh) this).field_W * ((jh) this).field_W > var9 * var9 + var8_int * var8_int) {
                L1: {
                  var10 = Math.atan2((double)var9, (double)var8_int) - ne.field_c;
                  if (0.0 > var10) {
                    var10 = var10 - 3.141592653589793 / (double)((jh) this).field_Q;
                    break L1;
                  } else {
                    if (var10 <= 0.0) {
                      break L1;
                    } else {
                      var10 = var10 + 3.141592653589793 / (double)((jh) this).field_Q;
                      break L1;
                    }
                  }
                }
                ((jh) this).field_V = (int)((double)((jh) this).field_Q * var10 / 6.283185307179586);
                L2: while (true) {
                  if (((jh) this).field_Q > ((jh) this).field_V) {
                    L3: while (true) {
                      if (((jh) this).field_V >= 0) {
                        stackOut_14_0 = 1;
                        stackIn_15_0 = stackOut_14_0;
                        break L0;
                      } else {
                        ((jh) this).field_V = ((jh) this).field_V + ((jh) this).field_Q;
                        continue L3;
                      }
                    }
                  } else {
                    ((jh) this).field_V = ((jh) this).field_V - ((jh) this).field_Q;
                    continue L2;
                  }
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var8;
            stackOut_16_1 = new StringBuilder().append("jh.AA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_15_0 != 0;
    }

    private jh() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = 0;
        field_U = "Press <%0> to fire cluster missiles";
    }
}
