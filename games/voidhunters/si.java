/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends rqa {
    static int field_s;
    static int field_p;
    static int field_r;
    static boolean[] field_o;
    static int[] field_q;

    final nc a(nc[] param0, int param1) {
        si.a(164, 62, param0[0].a(60));
        if (param1 > -119) {
            si.a(100, -78, -48);
        }
        return new nc((Object) (Object) "void");
    }

    si(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void b(boolean param0) {
        if (!param0) {
            field_s = 71;
        }
        field_q = null;
        field_o = null;
    }

    final static void a(int param0, int param1, int param2) {
        hna var3 = null;
        if (param1 != 62) {
            field_r = 110;
        }
        if (vqa.field_g != null) {
            var3 = new hna();
            var3.field_r = new tw();
            var3.field_r.field_d = new so(param0, param2);
            vqa.field_g.a(param1 ^ 62, true, var3);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0_int = 0;
        ogb.a(105, 50);
        field_o = new boolean[112];
        field_q = new int[128];
        for (var0_int = 0; field_q.length > var0_int; var0_int++) {
            field_q[var0_int] = -1;
        }
        for (var0_int = 65; var0_int <= 90; var0_int++) {
            field_q[var0_int] = var0_int - 65;
        }
        for (var0_int = 97; -123 <= (var0_int ^ -1); var0_int++) {
            field_q[var0_int] = 26 + (var0_int - 97);
        }
        for (var0_int = 48; var0_int <= 57; var0_int++) {
            field_q[var0_int] = -48 + (var0_int + 52);
        }
        int[] var0 = field_q;
        field_q[43] = 62;
        var0[42] = 62;
        field_q[47] = 63;
        int[] var1 = field_q;
        var1[45] = 63;
    }
}
