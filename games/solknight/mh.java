/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh {
    static int[] field_a;

    final static wg a(int param0, boolean param1, String param2) {
        wg var3 = new wg(false);
        var3.field_d = param2;
        var3.field_b = param0;
        if (!param1) {
            return null;
        }
        return var3;
    }

    final static void a(int param0) {
        int var2 = SolKnight.field_L ? 1 : 0;
        fh.field_e.c(-10158);
        int var1 = 0;
        if (param0 != 8192) {
            return;
        }
        while (-33 < (var1 ^ -1)) {
            qf.field_c[var1] = 0L;
            var1++;
        }
        for (var1 = 0; (var1 ^ -1) > -33; var1++) {
            pg.field_d[var1] = 0L;
        }
        mj.field_b = 0;
    }

    public static void b(int param0) {
        if (param0 < 90) {
            return;
        }
        field_a = null;
    }

    final static o a(boolean param0, da param1, int param2, int param3) {
        if (!param0) {
            field_a = null;
        }
        if (!l.a(108, param3, param2, param1)) {
            return null;
        }
        return sf.b(0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[8192];
    }
}
