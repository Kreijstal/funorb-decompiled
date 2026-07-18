/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf implements de {
    static ue field_a;

    public final void a(int param0, boolean param1, int param2, int param3, uj param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        hl var9 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var7 = 87 % ((param2 - 2) / 54);
              var6_int = param0 - -param4.field_s;
              var8 = param4.field_j + param3;
              sk.a(var6_int, param4.field_i, param4.field_f, true, var8);
              var9 = fi.field_g[1];
              if (!(param4 instanceof dk)) {
                break L1;
              } else {
                if (!((dk) (Object) param4).field_z) {
                  break L1;
                } else {
                  var9.f((-var9.field_x + param4.field_i >> 1) + (var6_int - -1), (param4.field_f - var9.field_q >> 1) + 1 + var8, 256);
                  break L1;
                }
              }
            }
            if (!param4.d(true)) {
              break L0;
            } else {
              ji.a(-4 + param4.field_i, -4 + param4.field_f, -140110815, 2 + var8, 2 + var6_int);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("tf.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 18172) {
            tf.a(-88);
        }
    }

    static {
    }
}
