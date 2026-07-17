/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    static boolean field_d;
    static long field_c;
    static int field_b;
    static ti field_a;
    static boolean[] field_e;

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        og.a((byte) 89);
        sb.g(param1, param4, param0, param3);
    }

    public static void a(int param0) {
        if (param0 != 18126) {
            c.a(-55);
            field_a = null;
            field_e = null;
            return;
        }
        field_a = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new boolean[64];
    }
}
