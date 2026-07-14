/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg {
    static String field_c;
    static int field_b;
    private String field_d;
    static int field_a;
    static long field_f;
    static String field_e;

    final boolean a(int param0, String param1) {
        if (param0 >= -125) {
            return true;
        }
        return ((fg) this).field_d.equals((Object) (Object) param1);
    }

    fg(String param0) {
        ((fg) this).field_d = param0;
    }

    final void a(byte param0, java.applet.Applet param1) {
        if (param0 < 73) {
          field_b = -54;
          jd.a("jagex-last-login-method", 31536000L, param1, 1000, ((fg) this).field_d);
          return;
        } else {
          jd.a("jagex-last-login-method", 31536000L, param1, 1000, ((fg) this).field_d);
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1, int param2, int param3, o[] param4, byte param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = SolKnight.field_L ? 1 : 0;
        if (param4 != null) {
          if ((param2 ^ -1) >= -1) {
            return;
          } else {
            var6 = param4[0].field_q;
            var7 = param4[2].field_q;
            var8 = param4[1].field_q;
            param4[0].b(param1, param0, param3);
            param4[2].b(-var7 + (param1 + param2), param0, param3);
            mi.b(ql.field_q);
            var9 = -50 / ((-22 - param5) / 56);
            mi.d(var6 + param1, param0, -var7 + param1 + param2, param0 + param4[1].field_r);
            var10 = var6 + param1;
            var11 = param2 + param1 + -var7;
            param1 = var10;
            L0: while (true) {
              if (var11 <= param1) {
                mi.a(ql.field_q);
                return;
              } else {
                param4[1].b(param1, param0, param3);
                param1 = param1 + var8;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        int var1 = 76 % ((param0 - -22) / 53);
        field_e = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Try again";
        field_b = 0;
        field_e = "Please check if address is correct";
    }
}
