/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af extends kf {
    static id[] field_w;
    static long field_x;
    static lk field_y;

    final void a(int param0, int param1, int param2, uj param3, byte param4, int param5) {
        tj var7 = null;
        RuntimeException var7_ref = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3, param4, param5);
              var7 = il.field_k;
              if (var7 == null) {
                break L1;
              } else {
                if (this.a(param1, param2, param0, param5, param4 + -12768)) {
                  if (this.field_g instanceof da) {
                    ((da) ((Object) this.field_g)).a(var7, (af) (this), param4 + 138);
                    il.field_k = null;
                    return;
                  } else {
                    if (!(var7.field_g instanceof da)) {
                      break L1;
                    } else {
                      ((da) ((Object) var7.field_g)).a(var7, (af) (this), 106);
                      il.field_k = null;
                      return;
                    }
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
            var7_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var7_ref);
            stackOut_8_1 = new StringBuilder().append("af.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private af(int param0, int param1, int param2, int param3, de param4, qg param5, uj param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_t = param6;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "af.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(int param0) {
        field_y = null;
        field_w = null;
        if (param0 != 9392) {
            field_x = -117L;
        }
    }

    static {
    }
}
