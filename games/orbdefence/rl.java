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
        field_c = null;
        field_d = null;
    }

    final static void a(hj[] param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
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
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param1 > 0) {
                  var6_int = param0[0].field_s;
                  var7 = param0[param2].field_s;
                  var8 = param0[1].field_s;
                  param0[0].c(param5, param3, param4);
                  param0[2].c(-var7 + param1 + param5, param3, param4);
                  ul.a(pk.field_F);
                  ul.i(param5 - -var6_int, param3, -var7 + (param5 - -param1), param0[1].field_t + param3);
                  var9 = var6_int + param5;
                  var10 = -var7 + (param1 + param5);
                  param5 = var9;
                  L2: while (true) {
                    if (param5 >= var10) {
                      ul.b(pk.field_F);
                      break L0;
                    } else {
                      param0[1].c(param5, param3, param4);
                      param5 = param5 + var8;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("rl.C(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "The account name you use to access RuneScape and other Jagex.com games";
        field_d = "+<%0>";
        field_c = "Names cannot start or end with space or underscore";
    }
}
