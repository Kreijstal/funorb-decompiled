/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kk {
    static int field_e;
    static int field_c;
    static int field_a;
    static int field_d;
    static int[] field_b;

    abstract byte[] a(int param0);

    final static void a(int param0, int param1) {
        int var2 = 0;
        if (param1 < 10) {
            field_d = 21;
        }
        ji.a(lh.field_s, 0, ed.field_p, (byte) 44, true, param0, og.field_b);
        for (var2 = 0; var2 < ed.field_p; var2++) {
            jk.field_c[param0 + var2] = var2;
        }
        ji.a(mh.field_j, param0, param0 + ed.field_p, (byte) 121, false, param0 + param0, t.field_u);
        if (!(param0 >= ed.field_p)) {
            ed.field_p = param0;
        }
    }

    abstract void a(int param0, byte[] param1);

    final static boolean b(byte param0) {
        int var1 = -38 / ((param0 - -9) / 44);
        return sk.field_b;
    }

    final static Boolean c(byte param0) {
        Boolean var1 = oj.field_g;
        int var2 = -38 % ((param0 - 14) / 60);
        oj.field_g = null;
        return var1;
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 <= 32) {
            field_e = 69;
        }
    }

    final static void a(hl param0, int param1, String param2) {
        ba.field_c = param0;
        if (param1 > -54) {
            return;
        }
        ik.field_q = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        ne.a(50, 89);
    }
}
