/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg {
    static di[] field_a;
    static int field_f;
    static String field_d;
    static int[] field_c;
    static rg[] field_e;
    static String field_b;
    static String[] field_g;

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        field_a = null;
        field_b = null;
        field_d = null;
        field_g = null;
        if (param0 != 13) {
            bg.a(76);
        }
    }

    final static byte[][][] a(mf param0, byte[][][] param1, mf param2, int param3) {
        if (param3 != 0) {
            bg.a(-94);
        }
        return sl.a(param2, param0, (int[]) null, param1, 1, param3 + 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_a = new di[255];
        for (var0 = 0; var0 < field_a.length; var0++) {
            field_a[var0] = new di();
        }
        field_d = "Achieved";
        field_f = -1;
        field_b = "This password contains your email address, and would be easy to guess";
        field_g = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_c = new int[]{0, 12, 13};
    }
}
