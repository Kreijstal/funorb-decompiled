/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc extends ok {
    static int[] field_K;
    static String field_J;
    static vd field_H;
    static qj field_E;
    static int field_L;

    public static void b() {
        field_J = null;
        field_K = null;
        field_H = null;
        field_E = null;
    }

    final void a(al param0, boolean param1, int param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        fj var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3, param4, param5);
              var7 = rf.field_e;
              if (var7 == null) {
                break L1;
              } else {
                if (((mc) this).a(param5, param3, param4, false, param2)) {
                  if (!(((mc) this).field_l instanceof n)) {
                    if (var7.field_l instanceof n) {
                      ((n) (Object) var7.field_l).a(var7, (mc) this, 21277);
                      rf.field_e = null;
                      break L1;
                    } else {
                      return;
                    }
                  } else {
                    ((n) (Object) ((mc) this).field_l).a(var7, (mc) this, 21277);
                    rf.field_e = null;
                    return;
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("mc.GB(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    private mc(int param0, int param1, int param2, int param3, t param4, tg param5, al param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            ((mc) this).field_B = param6;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "mc.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(boolean param0, int param1, ti param2) {
        la var3 = null;
        try {
            var3 = ra.field_C;
            var3.c(3, 7);
            var3.a(5, (byte) -123);
            var3.a(0, (byte) -114);
            var3.b(param2.field_i, (byte) -127);
            var3.a(param2.field_l, (byte) -89);
            var3.a(param2.field_k, (byte) -68);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "mc.A(" + 0 + 44 + 3 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = new int[128];
        field_L = -1;
        field_J = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
