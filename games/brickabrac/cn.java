/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cn {
    static int field_c;
    static byte[][] field_a;
    static jp[] field_e;
    static int field_d;
    static String field_b;

    final static i a(int param0, int param1, int param2, af param3, int param4, int param5, int param6, int param7, int param8) {
        i var9 = null;
        RuntimeException var9_ref = null;
        i stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var9 = (i) ((Object) aa.field_a.c(3));
              if (var9 != null) {
                break L1;
              } else {
                var9 = new i();
                break L1;
              }
            }
            var9.field_n = param1;
            var9.field_u = param2;
            var9.field_w = param4;
            var9.field_t = param3;
            var9.field_r = param7;
            var9.field_i = param6;
            var9.field_p = param0;
            var9.field_x = param8 << param5 ^ -1;
            stackIn_3_0 = (i) (var9);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var9_ref);

            stackIn_6_1 = new StringBuilder().append("cn.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(ul param0, j param1, int param2, int param3, int param4) {
        try {
            nn.field_g.b(param0.field_o, (param0.field_i >> 1171435496) + param3, (param0.field_n >> 283601960) + param4 - -nn.field_g.field_B, 0, -1, 256 * param0.field_q / 50);
            if (param2 != 10030) {
                j var6 = (j) null;
                cn.a((ul) null, (j) null, -6, -71, 111);
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "cn.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_a = (byte[][]) null;
        field_b = null;
        if (param0 < 97) {
            j var2 = (j) null;
            cn.a((ul) null, (j) null, 41, -50, 10);
        }
    }

    static {
        field_b = "Auto-respond to <%0>";
    }
}
