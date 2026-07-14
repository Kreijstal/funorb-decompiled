/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn extends ma {
    int[] field_l;
    static String field_p;
    static int[][] field_m;
    static int[] field_n;
    static dd[] field_o;
    int field_q;

    public static void a(int param0) {
        if (param0 != -2048) {
            dn.c(111);
        }
        field_o = null;
        field_m = null;
        field_p = null;
        field_n = null;
    }

    final static int[] a(int[] param0, byte param1, int[] param2) {
        int var4 = 0;
        int var5 = Pool.field_O;
        int[] var6 = new int[param2.length];
        int[] var3 = var6;
        for (var4 = 0; var4 < param2.length; var4++) {
            var6[param0[var4]] = param2[var4];
        }
        if (param1 < 2) {
            return null;
        }
        return var3;
    }

    final static void d(int param0) {
        if (param0 != 8192) {
            field_m = null;
        }
        wf.field_c = null;
        cl.field_c = null;
    }

    final static int a(int param0, int param1, int param2, or param3) {
        int var4 = param0 * sa.field_h.field_G;
        int var5 = param2 * sa.field_h.field_G;
        sa.field_h.d(param3.field_g + ": " + param3.b((byte) 115), var4, var5, 16777215, 3355443);
        if (!(param3.field_i == null)) {
            param2++;
            param2 = dn.a(1 + param0, 30409, param2, param3.field_i);
        }
        if (!(param3.field_d == null)) {
            param2++;
            param2 = dn.a(param0 + 1, 30409, param2, param3.field_d);
        }
        if (param1 != 30409) {
            return -95;
        }
        return param2;
    }

    final static void c(int param0) {
        int var1 = 24 / ((-10 - param0) / 49);
        if (!(null == jd.field_c)) {
            jd.field_c.c(-96);
            jd.field_c = null;
        }
    }

    final static int a(int param0, boolean param1) {
        if (param1) {
            return 77;
        }
        param0 = param0 >> 5;
        if ((param0 ^ -1) > -1) {
            if (-2048 <= param0) {
                return -te.field_m[-param0];
            }
            return 0;
        }
        if (param0 <= 2048) {
            return te.field_m[param0];
        }
        return 0;
    }

    final static boolean a(boolean param0, int param1) {
        if (!param0) {
            field_p = null;
        }
        return -1 >= (param1 ^ -1) ? true : false;
    }

    dn(int param0, int[] param1) {
        ((dn) this).field_q = param0;
        ((dn) this).field_l = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[8192];
        field_p = "Ask to join <%0>'s game";
    }
}
