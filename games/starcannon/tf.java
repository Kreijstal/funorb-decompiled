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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = 87 % ((param2 - 2) / 54);
          var6_int = param0 + param4.field_s;
          var8 = param4.field_j + param3;
          sk.a(var6_int, param4.field_i, param4.field_f, true, var8);
          var9 = fi.field_g[1];
          if (param4 instanceof dk &&
            ((dk) (param4)).field_z) {
            var9.f((-var9.field_x + param4.field_i >> 1) + (var6_int + 1), (param4.field_f - var9.field_q >> 1) + 1 + var8, 256);
          }
          if (!param4.d(true)) {
            return;
          }
          ji.a(-4 + param4.field_i, -4 + param4.field_f, -140110815, 2 + var8, 2 + var6_int);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("tf.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
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
