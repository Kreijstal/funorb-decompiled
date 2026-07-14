/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm {
    static boolean field_d;
    static String field_a;
    static nm field_e;
    static String field_f;
    static int field_b;
    static dd[] field_g;
    static long field_c;

    final static double[][] a(double[] param0, int param1) {
        int var2 = -107 % ((param1 - 67) / 56);
        return new double[][]{param0, new double[6], new double[6], new double[6]};
    }

    public static void a(byte param0) {
        field_a = null;
        field_g = null;
        field_f = null;
        field_e = null;
        if (param0 > -12) {
            rm.a((byte) -85);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Show private chat from my friends and opponents";
        field_f = "Yes";
        field_c = 0L;
    }
}
