/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    static o field_b;
    String field_a;
    static int field_f;
    boolean field_c;
    String field_d;
    static int[] field_g;
    static int[] field_e;

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
            field_f = 70;
            field_e = null;
            field_g = null;
            return;
        }
        field_e = null;
        field_g = null;
    }

    final static int a(String param0, boolean param1, byte param2) {
        if (param2 != 99) {
            return 9;
        }
        if (param1) {
            return kb.field_f.b(param0);
        }
        return ke.field_H.b(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new int[8192];
        field_e = new int[8192];
    }
}
