/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai {
    static String[] field_d;
    static int field_g;
    static sd field_i;
    static volatile boolean field_h;
    static String field_e;
    static int field_c;
    static vb field_f;
    static rh field_b;
    static int[] field_a;
    private static String field_z;

    public static void a() {
        field_i = null;
        field_a = null;
        field_d = null;
        field_f = null;
        field_b = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "ai.A(";
        field_h = false;
        field_d = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_i = new sd(1);
        field_e = "Weight: ";
        field_b = new rh(12, 0, 1, 0);
        field_a = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
