/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek {
    static char[] field_a;
    static String field_b;
    static String field_c;

    final static void a(boolean param0, boolean param1) {
        ch.field_b = true;
        mj.field_d = 0;
        di.field_d = null;
        gi.a((byte) -58);
        qk.field_e = new dn(param0);
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = 34 % ((param0 - -63) / 45);
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Loading levels";
        field_a = new char[128];
        field_c = "Press ESC for Pause Menu or to skip tutorial";
    }
}
