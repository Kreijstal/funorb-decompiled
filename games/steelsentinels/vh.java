/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    static int field_c;
    static String[] field_d;
    static int field_a;
    static wk[] field_b;

    final static void a(int param0, tc param1, byte param2) {
        int var6 = 0;
        int var7 = SteelSentinels.field_G;
        kj var8 = mm.field_g;
        kj var9 = var8;
        var9.a(param0, (byte) -117);
        var9.field_p = var9.field_p + 1;
        int var4 = var9.field_p;
        var9.a((byte) 120, 1);
        var9.d(param1.field_p, 36);
        var9.d(param1.field_y, 20);
        var9.d(param1.field_o, 29);
        var9.b(true, param1.field_C);
        var9.b(true, param1.field_u);
        var9.b(true, param1.field_t);
        var9.b(true, param1.field_w);
        var9.a((byte) 123, param1.field_q.length);
        int var5 = -14 / ((57 - param2) / 48);
        for (var6 = 0; var6 < param1.field_q.length; var6++) {
            var8.b(true, param1.field_q[var6]);
        }
        int discarded$0 = var9.f(-103, var4);
        var9.b((byte) 99, -var4 + var9.field_p);
    }

    final static wk[] a(int param0, cm param1, int param2, byte param3) {
        if (!wa.a((byte) 30, param0, param2, param1)) {
            return null;
        }
        if (param3 <= 16) {
            Object var5 = null;
            wk[] discarded$0 = vh.a(83, (cm) null, 117, (byte) 119);
        }
        return gj.b(0);
    }

    public static void a(int param0) {
        if (param0 >= -1) {
            return;
        }
        field_b = null;
        field_d = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (!(!fj.field_e)) {
            return ve.field_b.a(true, ei.field_q, de.field_c);
        }
        if (vb.field_e) {
            return ba.a(112, param3, param0);
        }
        if (hd.b(-3, param3, param0)) {
            return true;
        }
        if (!(!uc.field_g)) {
            return false;
        }
        int var4 = 10 / ((param2 - 40) / 40);
        return he.a((byte) -122, param1, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 200;
        field_c = 34;
    }
}
