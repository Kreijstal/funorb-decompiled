/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl extends sr {
    static String field_s;
    static String field_t;
    static int field_n;
    static int field_q;
    static String field_u;
    static String field_p;
    static int field_r;
    static int field_o;

    final int a(int param0) {
        if (param0 >= -69) {
            field_n = -39;
            return 2;
        }
        return 2;
    }

    rl() {
    }

    final int a(int param0, Object param1, Object param2) {
        up var4 = null;
        up var5 = null;
        String var6 = null;
        String var7 = null;
        up var8 = null;
        var8 = ((sp) param1).field_Sb;
        var4 = var8;
        var5 = ((sp) param2).field_Sb;
        var6 = uf.field_e[var8.field_q];
        if (param0 != 2) {
          field_q = 3;
          var7 = uf.field_e[var5.field_q];
          return var6.compareTo(var7) ^ ((rl) this).field_i << -585493793;
        } else {
          var7 = uf.field_e[var5.field_q];
          return var6.compareTo(var7) ^ ((rl) this).field_i << -585493793;
        }
    }

    public static void b(int param0) {
        field_s = null;
        field_p = null;
        field_u = null;
        if (param0 != 20) {
            rl.b(85);
            field_t = null;
            return;
        }
        field_t = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Searching for opponents";
        field_t = "Defensive";
        field_q = 20;
        field_p = "This entry doesn't match";
        field_r = -1;
        field_u = "GAME OVER";
    }
}
