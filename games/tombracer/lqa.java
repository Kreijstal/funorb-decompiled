/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lqa extends ei {
    boolean field_j;
    boolean field_h;
    boolean field_f;
    boolean field_e;
    boolean field_k;
    boolean field_i;
    static String field_g;
    boolean field_d;

    public final String toString() {
        String[] var2 = new String[]{"Pure Java", "OpenGL", "SSE", "DirectX", "Pure Java (Z-Buffered)", "OpenGL+"};
        String[] var1 = var2;
        return var2[((lqa) this).field_b];
    }

    final boolean a(ei param0, int param1) {
        lqa var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (param1 == 55) {
              L1: {
                L2: {
                  var3 = (lqa) (Object) param0;
                  if (!super.a(param0, 55)) {
                    break L2;
                  } else {
                    L3: {
                      if (var3.field_j) {
                        stackOut_6_0 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        break L3;
                      } else {
                        stackOut_5_0 = 1;
                        stackIn_7_0 = stackOut_5_0;
                        break L3;
                      }
                    }
                    if (stackIn_7_0 == (((lqa) this).field_j ? 1 : 0)) {
                      break L2;
                    } else {
                      if (((lqa) this).field_a != var3.field_a) {
                        break L2;
                      } else {
                        L4: {
                          if (var3.field_k) {
                            stackOut_11_0 = 0;
                            stackIn_12_0 = stackOut_11_0;
                            break L4;
                          } else {
                            stackOut_10_0 = 1;
                            stackIn_12_0 = stackOut_10_0;
                            break L4;
                          }
                        }
                        if (stackIn_12_0 == (var3.field_k ? 1 : 0)) {
                          break L2;
                        } else {
                          stackOut_13_0 = 1;
                          stackIn_15_0 = stackOut_13_0;
                          break L1;
                        }
                      }
                    }
                  }
                }
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("lqa.B(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param1 + 41);
        }
        return stackIn_15_0 != 0;
    }

    lqa(int param0, int param1, boolean param2, boolean param3, boolean param4, boolean param5, boolean param6, boolean param7, boolean param8, boolean param9, boolean param10) {
        super(param0, param1);
        ((lqa) this).field_j = param2 ? true : false;
        ((lqa) this).field_i = param5 ? true : false;
        ((lqa) this).field_f = param10 ? true : false;
        ((lqa) this).field_k = param4 ? true : false;
        ((lqa) this).field_e = param7 ? true : false;
        ((lqa) this).field_d = param8 ? true : false;
        ((lqa) this).field_h = param9 ? true : false;
    }

    public static void a() {
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
