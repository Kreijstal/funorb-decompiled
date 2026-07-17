/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends hf {
    int field_J;
    static int[] field_R;
    int field_O;
    static String field_K;
    int field_S;
    int field_I;
    int field_N;
    static nh field_L;
    static boolean field_Q;
    static int field_M;
    int field_T;
    static vh field_P;

    public static void b(boolean param0) {
        field_L = null;
        field_R = null;
        field_P = null;
        field_K = null;
    }

    final boolean a(int param0, vg param1, int param2, byte param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var12 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (super.a(param0, param1, param2, (byte) 117, param4, param5, param6)) {
              L1: {
                var8_int = param4 + -param5 + (-((nd) this).field_o + -((nd) this).field_O);
                var9 = param0 - param6 + -((nd) this).field_m - ((nd) this).field_S;
                if (((nd) this).field_J * ((nd) this).field_J <= var9 * var9 + var8_int * var8_int) {
                  break L1;
                } else {
                  L2: {
                    var10 = Math.atan2((double)var9, (double)var8_int) - pd.field_a;
                    if (var10 < 0.0) {
                      var10 = var10 - 3.141592653589793 / (double)((nd) this).field_T;
                      break L2;
                    } else {
                      if (0.0 < var10) {
                        var10 = var10 + 3.141592653589793 / (double)((nd) this).field_T;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  ((nd) this).field_N = (int)(var10 * (double)((nd) this).field_T / 6.283185307179586);
                  L3: while (true) {
                    if (((nd) this).field_N < ((nd) this).field_T) {
                      L4: while (true) {
                        if (((nd) this).field_N >= 0) {
                          break L1;
                        } else {
                          ((nd) this).field_N = ((nd) this).field_N + ((nd) this).field_T;
                          continue L4;
                        }
                      }
                    } else {
                      ((nd) this).field_N = ((nd) this).field_N - ((nd) this).field_T;
                      continue L3;
                    }
                  }
                }
              }
              stackOut_14_0 = 1;
              stackIn_15_0 = stackOut_14_0;
              return stackIn_15_0 != 0;
            } else {
              if (param3 >= 113) {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                ((nd) this).field_J = 25;
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var8;
            stackOut_20_1 = new StringBuilder().append("nd.JA(").append(param0).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_19_0 != 0;
    }

    final static void a(int param0, String param1) {
        try {
            pi.field_J = param1;
            if (param0 != -1) {
                Object var3 = null;
                nd.a(100, (String) null);
            }
            sf.a(12, 11649);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "nd.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private nd() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = new int[]{0, 0, 0, 0, 100, 1000, 5000, 0};
        field_M = 128;
        field_P = new vh();
    }
}
