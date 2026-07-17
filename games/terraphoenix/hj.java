/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends jc {
    static String field_A;
    static String field_H;
    static int[] field_J;
    static long field_I;
    static int[] field_K;

    private hj(int param0, int param1, int param2, int param3, cj param4, sc param5, gl param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            ((hj) this).field_F = param6;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "hj.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    final static int a(boolean param0, int param1) {
        param1 = (-715827883 & param1 >>> 1) + (1431655765 & param1);
        param1 = (858993459 & param1) + (1932735283 & param1 >>> 2);
        param1 = 252645135 & (param1 >>> 4) + param1;
        param1 = param1 + (param1 >>> 8);
        param1 = param1 + (param1 >>> 16);
        return param1 & 255;
    }

    final static void g(int param0) {
    }

    public static void g() {
        field_J = null;
        field_H = null;
        field_K = null;
        field_A = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, gl param5) {
        cb var7 = null;
        RuntimeException var7_ref = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            super.a(59, param1, param2, param3, param4, param5);
            var7 = oj.field_w;
            if (param0 > 36) {
              L1: {
                if (var7 == null) {
                  break L1;
                } else {
                  if (((hj) this).a(param3, param2, false, param4, param1)) {
                    if (!(((hj) this).field_r instanceof fe)) {
                      if (!(var7.field_r instanceof fe)) {
                        break L1;
                      } else {
                        ((fe) (Object) var7.field_r).a((hj) this, var7, 118);
                        oj.field_w = null;
                        return;
                      }
                    } else {
                      ((fe) (Object) ((hj) this).field_r).a((hj) this, var7, 121);
                      oj.field_w = null;
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var7_ref;
            stackOut_10_1 = new StringBuilder().append("hj.HA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param5 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Not enough time";
        field_J = new int[8192];
        field_H = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
