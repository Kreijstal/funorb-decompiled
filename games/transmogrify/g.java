/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends fi {
    static hi field_y;
    static boolean field_A;
    static int field_z;

    final void a(int param0, int param1, qg param2, int param3, int param4, int param5) {
        vl var7 = null;
        RuntimeException var7_ref = null;
        vl var8 = null;
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
              var8 = b.field_i;
              var7 = var8;
              if (var8 == null) {
                break L1;
              } else {
                if (!((g) this).b(param5, param0, -1, param1, param4)) {
                  break L1;
                } else {
                  if (((g) this).field_m instanceof s) {
                    ((s) (Object) ((g) this).field_m).a((g) this, 2089, var8);
                    b.field_i = null;
                    break L1;
                  } else {
                    if (!(var8.field_m instanceof s)) {
                      break L1;
                    } else {
                      ((s) (Object) var8.field_m).a((g) this, param3 + 2090, var8);
                      b.field_i = null;
                      break L1;
                    }
                  }
                }
              }
            }
            if (param3 == -1) {
              break L0;
            } else {
              g.i(-34);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var7_ref;
            stackOut_9_1 = new StringBuilder().append("g.BA(").append(param0).append(44).append(param1).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
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
          throw ch.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    private g(int param0, int param1, int param2, int param3, ui param4, ma param5, qg param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            ((g) this).field_v = param6;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "g.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    public static void i(int param0) {
        field_y = null;
        if (param0 != 19224) {
            field_z = 81;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new hi();
    }
}
