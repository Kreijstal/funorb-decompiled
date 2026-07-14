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
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = OrbDefence.field_D ? 1 : 0;
        if (param0 != null) {
          if ((param1 ^ -1) >= -1) {
            return;
          } else {
            var6 = param0[0].field_s;
            var7 = param0[param2].field_s;
            var8 = param0[1].field_s;
            param0[0].c(param5, param3, param4);
            param0[2].c(-var7 + param1 + param5, param3, param4);
            ul.a(pk.field_F);
            ul.i(param5 - -var6, param3, -var7 + (param5 - -param1), param0[1].field_t + param3);
            var9 = var6 + param5;
            var10 = -var7 + (param1 + param5);
            param5 = var9;
            L0: while (true) {
              if (param5 >= var10) {
                ul.b(pk.field_F);
                return;
              } else {
                param0[1].c(param5, param3, param4);
                param5 = param5 + var8;
                continue L0;
              }
            }
          }
        } else {
          return;
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
