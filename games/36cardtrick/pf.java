/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf extends qb {
    static String field_g;
    static int field_h;

    public static void e(int param0) {
        int var1 = -106 % ((46 - param0) / 43);
        field_g = null;
    }

    final static void d(int param0) {
        int var1 = 0;
        double var2 = 0.0;
        int var4 = Main.field_T;
        jb.b();
        th.field_a = 11;
        sh.field_l = new int[param0];
        for (var1 = 0; -257 < (var1 ^ -1); var1++) {
            var2 = 15.0;
            sh.field_l[var1] = (int)(Math.pow((double)((float)var1 / 256.0f), var2) * 255.0);
        }
        int var5 = 256;
        var1 = var5;
        while (var5 < sh.field_l.length) {
            sh.field_l[var5] = 255;
            var5++;
        }
    }

    final static kc[] a(int param0) {
        int var2 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = Main.field_T;
        kc[] var1 = new kc[cf.field_c];
        int var3 = -56 / ((param0 - 69) / 40);
        for (var2 = 0; var2 < cf.field_c; var2++) {
            var4 = na.field_q[var2] * hb.field_a[var2];
            var5 = rd.field_k[var2];
            var6 = new int[var4];
            for (var7 = 0; var7 < var4; var7++) {
                var6[var7] = jf.field_i[bc.a((int) var5[var7], 255)];
            }
            var1[var2] = new kc(p.field_l, gk.field_a, kb.field_c[var2], ml.field_b[var2], na.field_q[var2], hb.field_a[var2], var6);
        }
        rh.d(77);
        return var1;
    }

    private pf() throws Throwable {
        throw new Error();
    }

    final static String a(qk param0, String param1, String param2, boolean param3) {
        if (!param3) {
            kc[] discarded$0 = pf.a(3);
        }
        if (!param0.b(4)) {
            return param1;
        }
        return param2 + " - " + param0.a(2) + "%";
    }

    final static void b(byte param0) {
        if (!(vg.field_d)) {
            throw new IllegalStateException();
        }
        tj.field_K = true;
        gh.a((byte) 59, true);
        cd.field_e = 0;
        if (param0 <= 126) {
            field_g = (String) null;
        }
    }

    final static nk a(int param0, String[] param1) {
        nk var2 = new nk(false);
        var2.field_c = (String[]) param1;
        if (param0 > -95) {
            field_h = -16;
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Your email address is used to identify this account";
    }
}
