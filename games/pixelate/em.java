/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em {
    static String field_a;
    static String field_b;
    static String field_c;

    final static void a(byte param0) {
        if (param0 > -13) {
            field_a = null;
            oa.field_j = 0;
            return;
        }
        oa.field_j = 0;
    }

    final static void a(byte param0, lc param1, int param2) {
        pc var3 = null;
        if (param0 != -7) {
            Object var4 = null;
            em.a((String) null, 12L, (String) null, 43, (ak) null, -102, (gp) null, (int[]) null, 46);
            var3 = aa.field_f;
            var3.g(param2, 15514);
            var3.e(160, param1.field_k);
            var3.e(160, param1.field_s);
            return;
        }
        var3 = aa.field_f;
        var3.g(param2, 15514);
        var3.e(160, param1.field_k);
        var3.e(160, param1.field_s);
    }

    final static void a(tf[] param0, int param1) {
        int var3 = 0;
        int var4 = Pixelate.field_H ? 1 : 0;
        jm.field_i = param0;
        int var2 = param0[0].field_A;
        rn.field_b = var2;
        hf.field_k = var2;
        lo.field_Jb = (800 + -var2) / 2;
        ip.field_A = rk.field_e.field_w + rk.field_e.field_z;
        bh.field_k = ip.field_A * 50 + -163;
        if (param1 >= -75) {
            field_b = null;
            for (var3 = 0; (var3 ^ -1) > -51; var3++) {
                ud.field_I[var3] = new up(var3);
            }
            return;
        }
        for (var3 = 0; (var3 ^ -1) > -51; var3++) {
            ud.field_I[var3] = new up(var3);
        }
    }

    final static void a(String param0, long param1, String param2, int param3, ak param4, int param5, gp param6, int[] param7, int param8) {
        if (param5 != -163) {
            em.a((byte) 53);
        }
        bj.field_d = param6;
        eg.field_n = new wi(param4, param1, param2, param0, param3, param8, param7);
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 <= 88) {
            return;
        }
        field_a = null;
    }

    final static void a(vj param0, int param1, int param2, fm param3) {
        ub.field_a = pf.a(true) * param2 / 1000;
        nj.a(param3, (byte) 14);
        dk.a(false, param3);
        ec.a(false, param3);
        op.e(260);
        ng.g(0);
        ga.field_f = -ub.field_a + 0;
        int var4 = 26 % ((param1 - 1) / 55);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Loading extra data";
        field_b = "Names should contain a maximum of 12 characters";
        field_c = "Public";
    }
}
