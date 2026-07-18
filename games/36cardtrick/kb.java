/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb {
    static int field_d;
    static int[] field_b;
    static cc field_a;
    static long field_f;
    static int[] field_e;
    static int[] field_c;

    final static boolean a(boolean param0) {
        if (wc.field_A == null) {
            return false;
        }
        if (!wc.field_A.b(true)) {
            return false;
        }
        return true;
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 480;
        field_e = new int[4];
        field_a = new cc();
    }
}
