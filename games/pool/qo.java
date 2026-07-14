/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qo extends rg {
    static String field_x;
    int field_z;
    int field_w;
    int field_B;
    int field_A;
    int field_y;
    static String field_E;
    static rq field_C;
    static vh field_F;
    int field_G;

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    final static void a(byte param0, int param1, int param2, int param3) {
        lq.field_V = param2;
        if (param0 != -82) {
            return;
        }
        bg.field_d = param1;
        hd.field_H = param3;
    }

    public static void c(byte param0) {
        field_C = null;
        if (param0 != 11) {
            field_F = null;
        }
        field_E = null;
        field_x = null;
        field_F = null;
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        if (param3 < 97) {
            return;
        }
        int var6 = ((qo) this).field_w << -2087367837;
        param4 = (var6 & 15) + (param4 << -1407134332);
        int var7 = ((qo) this).field_y << 552176387;
        param1 = (param1 << 1790115140) + (15 & var7);
        ((qo) this).a(var6, var7, param4, param1, param0, param2);
    }

    final static void a(byte param0, boolean param1, byte[] param2, di param3, di param4, int param5, String[][] param6, int param7, di param8, String[] param9, dd[][] param10, String[][] param11, int[] param12, byte[] param13, dd[][] param14) {
        if (param0 != -72) {
            return;
        }
        pm.a(param13, param2, param11, param8, param14, param5, (qb[]) null, (int[]) null, param10, param7, param9, param4, param1, param12, param3, param6, param0 ^ 6033);
    }

    final static int a(int param0, byte[] param1, int param2) {
        if (param2 != 0) {
            return -30;
        }
        return oa.a(0, param0, param2 ^ -1, param1);
    }

    final static long a(int param0, CharSequence param1) {
        int var5 = 0;
        if (param0 <= 92) {
            field_C = null;
        }
        int var2 = param1.length();
        long var3 = 0L;
        for (var5 = 0; var5 < var2; var5++) {
            var3 = (var3 << 1717072453) - (var3 - (long)param1.charAt(var5));
        }
        return var3;
    }

    qo() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Create";
    }
}
