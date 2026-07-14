/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends a {
    static wb field_k;
    static o field_n;
    static String field_l;
    static String field_m;
    static int field_o;
    static String field_p;
    static o field_j;
    static java.awt.Canvas field_q;

    final static void d(byte param0) {
        if (null != ah.field_e) {
            ah.field_e.f(true);
        }
        sj.field_d = new ga();
        gf.field_cb.c(-3399, (rc) (Object) sj.field_d);
        if (param0 < 117) {
            field_o = 48;
        }
    }

    public static void e(byte param0) {
        field_j = null;
        field_l = null;
        field_q = null;
        field_k = null;
        field_m = null;
        field_p = null;
        field_n = null;
        if (param0 < 57) {
            field_k = null;
        }
    }

    final qf a(String param0, byte param1) {
        int var3 = null == wd.a(param0, -112) ? 1 : 0;
        if (param1 > -109) {
            field_m = null;
        }
        if (!(var3 != 0)) {
            return rg.field_f;
        }
        return ph.field_g;
    }

    dc(vg param0) {
        super(param0);
    }

    final static uj[] a(byte param0, dl param1) {
        int var5 = 0;
        uj var6 = null;
        int var7 = SolKnight.field_L ? 1 : 0;
        if (!(param1.b((byte) 31))) {
            return new uj[]{};
        }
        nj var8 = param1.a(7721);
        while (0 == var8.field_c) {
            i.a((byte) 82, 10L);
        }
        if (!(var8.field_c != 2)) {
            return new uj[]{};
        }
        int[] var12 = (int[]) var8.field_e;
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var9 = var10;
        int[] var3 = var9;
        uj[] var4 = new uj[var12.length >> 1121286018];
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new uj();
            var4[var5] = var6;
            var6.field_c = var3[var5 << 1628135106];
            var6.field_d = var3[(var5 << -1412379550) - -1];
            var6.field_e = var3[2 + (var5 << 1837004482)];
            var6.field_a = var3[3 + (var5 << 700676706)];
        }
        var5 = 56 / ((57 - param0) / 58);
        return var4;
    }

    final static void a(dj param0, int param1, byte param2) {
        jd var3 = id.field_c;
        if (param2 != 46) {
            return;
        }
        var3.e(param1, -2147483648);
        var3.c(36, param0.field_i);
        var3.c(108, param0.field_h);
    }

    final String a(String param0, boolean param1) {
        if (param1) {
            Object var4 = null;
            uj[] discarded$0 = dc.a((byte) -32, (dl) null);
        }
        if (((dc) this).a(param0, (byte) -112) == rg.field_f) {
            return fg.field_e;
        }
        return field_l;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new wb(3);
        field_l = "Email is valid";
        field_m = "CURRENT<br>SCORE";
        field_p = "Members' Benefits";
    }
}
