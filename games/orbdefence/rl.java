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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
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
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if ((param1 ^ -1) < -1) {
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
                      decompiledRegionSelector0 = 1;
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
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("rl.C(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_b = "The account name you use to access RuneScape and other Jagex.com games";
        field_d = "+<%0>";
        field_c = "Names cannot start or end with space or underscore";
    }
}
