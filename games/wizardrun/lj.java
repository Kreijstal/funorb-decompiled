/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
    static String field_d;
    static int[] field_b;
    static int field_a;
    static jd field_f;
    static kd field_c;
    static String field_e;
    private static String field_z;

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        if (param0 != -60) {
            return;
        }
        field_c = null;
        field_f = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "lj.A(";
        field_d = "Waiting for music";
        field_b = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_c = new kd();
        field_e = "Quit";
    }
}
