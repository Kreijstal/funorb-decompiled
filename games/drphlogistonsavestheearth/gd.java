/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd {
    static String[] field_d;
    static String field_e;
    static int field_a;
    static he[] field_b;
    static int field_c;

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        if (param0 != -27770) {
            return;
        }
        field_e = null;
    }

    final static void a(vj param0, int param1, vj param2) {
        if (param1 != 255) {
            field_b = null;
            ce.field_a = param2;
            sb.field_g = param0;
            return;
        }
        ce.field_a = param2;
        sb.field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[255];
        field_e = "Alternatively, click";
    }
}
