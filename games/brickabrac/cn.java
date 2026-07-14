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
        i var9_ref = null;
        i var9 = (i) (Object) aa.field_a.c(3);
        if (var9 == null) {
            var9_ref = new i();
        }
        var9_ref.field_n = param1;
        var9_ref.field_u = param2;
        var9_ref.field_w = param4;
        var9_ref.field_t = param3;
        var9_ref.field_r = param7;
        var9_ref.field_i = param6;
        var9_ref.field_p = param0;
        var9_ref.field_x = param8 << param5 ^ -1;
        return var9_ref;
    }

    final static void a(ul param0, j param1, int param2, int param3, int param4) {
        nn.field_g.b(param0.field_o, (param0.field_i >> 1171435496) + param3, (param0.field_n >> 283601960) + param4 - -nn.field_g.field_B, 0, -1, 256 * param0.field_q / 50);
        if (param2 != 10030) {
            Object var6 = null;
            cn.a((ul) null, (j) null, -6, -71, 111);
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_b = null;
        if (param0 < 97) {
            Object var2 = null;
            cn.a((ul) null, (j) null, 41, -50, 10);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Auto-respond to <%0>";
    }
}
