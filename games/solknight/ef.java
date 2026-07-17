/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    static byte[][] field_d;
    static ff field_a;
    static int field_g;
    static kb field_e;
    static int[] field_b;
    static String field_f;
    static boolean[] field_c;

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_2_0 = 0;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == 64) {
              var3_int = 1;
              L1: while (true) {
                if (param2 <= 1) {
                  if (1 != param2) {
                    stackOut_13_0 = var3_int;
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  } else {
                    stackOut_11_0 = param1 * var3_int;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  }
                } else {
                  L2: {
                    if (0 != (1 & param2)) {
                      var3_int = var3_int * param1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  param2 = param2 >> 1;
                  param1 = param1 * param1;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = -27;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var3, "ef.C(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_14_0;
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_d = null;
        field_f = null;
        field_e = null;
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (param1 <= 0) {
                stackOut_5_0 = var3_int;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                var3_int = 1 & param0 | var3_int << 1;
                param1--;
                param0 = param0 >>> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var3, "ef.D(" + param0 + 44 + param1 + 44 + 69 + 41);
        }
        return stackIn_6_0;
    }

    final static void a(int param0, o param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var9 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (0 != (3 & (param1.field_n | (param1.field_s | (param1.field_t | param1.field_p))))) {
              L1: {
                var2_int = param1.field_p + (3 & param1.field_s);
                var3 = param1.field_t - -(3 & param1.field_n);
                var2_int = var2_int + 4 - (var2_int & 3);
                var3 = 4 - ((var3 & 3) - var3);
                if (param0 >= 113) {
                  break L1;
                } else {
                  field_d = null;
                  break L1;
                }
              }
              var4 = new int[var3 * var2_int];
              var5 = 0;
              var6 = var2_int * (param1.field_n & 3) + (3 & param1.field_s);
              var7 = 0;
              L2: while (true) {
                if (param1.field_t <= var7) {
                  param1.field_p = var2_int;
                  param1.field_s = param1.field_s & -4;
                  param1.field_n = param1.field_n & -4;
                  param1.field_t = var3;
                  param1.field_v = var4;
                  break L0;
                } else {
                  var8 = 0;
                  L3: while (true) {
                    if (param1.field_p <= var8) {
                      var6 = var6 + (-param1.field_p + var2_int);
                      var7++;
                      continue L2;
                    } else {
                      int incrementValue$2 = var6;
                      var6++;
                      int incrementValue$3 = var5;
                      var5++;
                      var4[incrementValue$2] = param1.field_v[incrementValue$3];
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("ef.A(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new byte[50][];
        field_a = new ff(14, 0, 4, 1);
        field_b = new int[256];
        field_c = new boolean[64];
        field_f = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
