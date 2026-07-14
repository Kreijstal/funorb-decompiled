/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm {
    private uh field_b;
    private long field_c;
    private int field_a;
    private uh[] field_d;
    static boolean field_f;
    static od field_e;

    final uh b(int param0) {
        uh var3 = null;
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (((hm) this).field_b == null) {
            return null;
        }
        uh var2 = ((hm) this).field_d[(int)((long)(param0 + ((hm) this).field_a) & ((hm) this).field_c)];
        while (var2 != ((hm) this).field_b) {
            if ((((hm) this).field_c ^ -1L) == (((hm) this).field_b.field_t ^ -1L)) {
                var3 = ((hm) this).field_b;
                ((hm) this).field_b = ((hm) this).field_b.field_p;
                return var3;
            }
            ((hm) this).field_b = ((hm) this).field_b.field_p;
        }
        ((hm) this).field_b = null;
        return null;
    }

    final static String a(int param0) {
        if (param0 != 22812) {
            return null;
        }
        return pi.field_J;
    }

    final static void a(int param0, int param1, gk param2, int param3, int param4, rf param5, int param6, int param7, int param8, gk param9, int param10, gk param11, rf param12, int param13, boolean param14, int param15, int param16, int param17, int param18, int param19, int param20) {
        fj.a(param7, param12, (byte) 114, param5);
        fa.a(param14, param1, param15, param20, param8);
        a.a(param0, param4, (byte) 103);
        la.a(param16, 2, param9, param17, param11, param18);
        ia.a(param2, 0, param13, param10);
        vd.a(param19, param6, param14, param3);
    }

    hm(int param0) {
        int var2 = 0;
        uh var3 = null;
        ((hm) this).field_d = new uh[param0];
        ((hm) this).field_a = param0;
        for (var2 = 0; var2 < param0; var2++) {
            var3 = new uh();
            ((hm) this).field_d[var2] = new uh();
            var3.field_n = var3;
            var3.field_p = var3;
        }
    }

    final void a(long param0, int param1, uh param2) {
        if (!(param2.field_n == null)) {
            param2.f(64);
        }
        int var6 = 8 % ((70 - param1) / 48);
        uh var5 = ((hm) this).field_d[(int)((long)(-1 + ((hm) this).field_a) & param0)];
        param2.field_p = var5;
        param2.field_n = var5.field_n;
        param2.field_n.field_p = param2;
        param2.field_p.field_n = param2;
        param2.field_t = param0;
    }

    public static void c(int param0) {
        field_e = null;
        if (param0 > -16) {
            String discarded$0 = hm.a(104);
        }
    }

    final uh a(long param0, int param1) {
        uh var6 = null;
        int var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        ((hm) this).field_c = param0;
        uh var4 = ((hm) this).field_d[(int)((long)(((hm) this).field_a + -1) & param0)];
        int var5 = -33 % ((26 - param1) / 45);
        ((hm) this).field_b = var4.field_p;
        while (var4 != ((hm) this).field_b) {
            if ((param0 ^ -1L) == (((hm) this).field_b.field_t ^ -1L)) {
                var6 = ((hm) this).field_b;
                ((hm) this).field_b = ((hm) this).field_b.field_p;
                return var6;
            }
            ((hm) this).field_b = ((hm) this).field_b.field_p;
        }
        ((hm) this).field_b = null;
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = false;
    }
}
