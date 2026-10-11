/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee implements isa {
    static volatile int field_a;

    public final void a(ae param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        iu var8 = null;
        try {
          var6_int = param0.field_i + param1;
          var7 = param3 + param0.field_n;
          bl.a(param0.field_m, var7, param0.field_p, var6_int, 1);
          var8 = pq.field_b[1];
          if (param0 instanceof rj &&
            ((rj) (param0)).field_w) {
            var8.a(1 + var6_int + (-var8.field_n + param0.field_m >> 1), var7 + 1 + (-var8.field_k + param0.field_p >> 1), 256);
          }
          if (param2 != 16777215) {
            ee.a(55);
          }
          if (!param0.b((byte) -34)) {
            return;
          }
          nn.a(2 + var6_int, 2 + var7, param0.field_p - 4, -4 + param0.field_m, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("ee.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (param0 != -1) {
          return;
        }
        laa.field_y = null;
        np.field_x = null;
    }

    static {
        field_a = -1;
    }
}
