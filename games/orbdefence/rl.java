/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    static String field_b;
    static String field_d;
    static hj field_a;
    static int field_e;
    static String field_c;

    final static boolean a(byte param0) {
        if (param0 <= 98) {
          return true;
        }
        return pc.field_db;
    }

    public static void b(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 >= -49) {
          return;
        }
        field_c = null;
        field_d = null;
    }

    final static void a(hj[] param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param0 != null &&
            param1 > 0) {
            var6_int = param0[0].field_s;
            var7 = param0[param2].field_s;
            var8 = param0[1].field_s;
            param0[0].c(param5, param3, param4);
            param0[2].c(-var7 + param1 + param5, param3, param4);
            ul.a(pk.field_F);
            ul.i(param5 + var6_int, param3, -var7 + (param5 + param1), param0[1].field_t + param3);
            var9 = var6_int + param5;
            var10 = -var7 + (param1 + param5);
            for (param5 = var9; param5 < var10; param5 = param5 + var8) {
              param0[1].c(param5, param3, param4);
            }
            ul.b(pk.field_F);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("rl.C(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_b = "The account name you use to access RuneScape and other Jagex.com games";
        field_d = "+<%0>";
        field_c = "Names cannot start or end with space or underscore";
    }
}
