/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    static String field_b;
    static int field_c;
    static jj field_a;
    static String field_d;

    final static java.awt.Frame a(ej param0, int param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        a[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        a[] var10 = null;
        re var11 = null;
        var9 = stellarshard.field_B;
        try {
          if (!param0.a(param5 ^ -127)) {
            return null;
          }
          if (param5 == ~param3) {
            var10 = dl.a(param0, false);
            var6 = var10;
            if (var6 == null) {
              stackIn_8_0 = null;
              return (java.awt.Frame) (stackIn_8_0);
            }
            var7_int = 0;
            for (var8 = 0; var10.length > var8; var8++) {
              if (var10[var8].field_f == param1 &&
                var10[var8].field_c == param2 && ((param4 == 0 ||
                var10[var8].field_e == param4) &&
                (var7_int == 0 ||
                !(var10[var8].field_a <= param3)))) {
                var7_int = 1;
                param3 = var10[var8].field_a;
              }
            }
            if (var7_int == 0) {
              return null;
            }
          }
          var11 = param0.a(param5 ^ -2019341457, param4, param2, param1, param3);
          while (var11.field_f == 0) {
            jj.a((byte) -114, 10L);
          }
          var7 = (java.awt.Frame) (var11.field_b);
          if (var7 == null) {
            stackIn_30_0 = null;
            return (java.awt.Frame) (stackIn_30_0);
          }
          if (2 != var11.field_f) {
            return var7;
          }
          kf.a(var7, param5 + 16711936, param0);
          stackIn_34_0 = null;
          return (java.awt.Frame) (stackIn_34_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_37_0 = var6_ref;
          stackIn_37_1 = new StringBuilder().append("oe.A(");
          if (param0 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != 0) {
          return;
        }
        field_b = null;
    }

    static {
        field_b = "Email is valid";
    }
}
