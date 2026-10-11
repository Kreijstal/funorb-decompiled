/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb implements ur {
    static co field_c;
    static er[] field_d;
    static cg field_a;
    static tk field_e;
    static r field_b;
    static String field_f;

    public final void a(boolean param0, int param1, boolean param2, iq param3, int param4) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        er var8 = null;
        try {
          if (!param2) {
            kb.a(10);
          }
          var6_int = param1 + param3.field_o;
          var7 = param3.field_t + param4;
          h.a(var6_int, 1, var7, param3.field_n, param3.field_s);
          var8 = jn.field_b[1];
          if (param3 instanceof d &&
            ((d) (param3)).field_G) {
            var8.d(var6_int + 1 + (param3.field_n - var8.field_x >> 1), (param3.field_s - var8.field_B >> 1) + (var7 + 1), 256);
          }
          if (!param3.f(86)) {
            return;
          }
          mr.a(-4 + param3.field_n, var7 + 2, param3.field_s - 4, 0, var6_int + 2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("kb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_e = null;
        field_d = null;
        if (param0 >= 82) {
          field_b = null;
          field_f = null;
          return;
        }
        kb.a(105);
        field_b = null;
        field_f = null;
    }

    static {
        field_a = new cg();
        field_f = "<col=F62610>Red:</col> <%0> <col=25D3F7>Blue:</col> <%1>";
    }
}
