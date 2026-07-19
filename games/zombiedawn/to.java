/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class to {
    static int[] field_a;
    static String field_d;
    static int[] field_c;
    static int[] field_b;

    final static void a(int param0, byte param1) {
        ij.field_E = (param0 << 899554224) / 150;
        int var2 = -85 % ((param1 - 52) / 33);
        ij.field_P = param0 * 400 / 150;
        ij.field_I = 100 * param0 / 150;
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        field_a = null;
        if (param0 < 25) {
            to.a(-37, (byte) 85);
        }
    }

    static {
        field_a = new int[8192];
        field_c = new int[]{45, 15, 134, 33};
        field_b = new int[]{0, 0};
    }
}
