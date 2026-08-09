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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        er var8 = null;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                kb.a(10);
                break L1;
              }
            }
            L2: {
              var6_int = param1 - -param3.field_o;
              var7 = param3.field_t + param4;
              h.a(var6_int, 1, var7, param3.field_n, param3.field_s);
              var8 = jn.field_b[1];
              if (!(param3 instanceof d)) {
                break L2;
              } else {
                if (!((d) ((Object) param3)).field_G) {
                  break L2;
                } else {
                  var8.d(var6_int - -1 - -(param3.field_n - var8.field_x >> -1113624351), (param3.field_s + -var8.field_B >> -1686258495) + (var7 - -1), 256);
                  break L2;
                }
              }
            }
            if (!param3.f(86)) {
              break L0;
            } else {
              mr.a(-4 + param3.field_n, var7 - -2, param3.field_s - 4, 0, var6_int + 2);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("kb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_e = null;
        field_d = null;
        if (param0 < 82) {
          kb.a(105);
          field_b = null;
          field_f = null;
          return;
        } else {
          field_b = null;
          field_f = null;
          return;
        }
    }

    static {
        field_a = new cg();
        field_f = "<col=F62610>Red:</col> <%0> <col=25D3F7>Blue:</col> <%1>";
    }
}
