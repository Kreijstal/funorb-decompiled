/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    static boolean field_a;
    static u field_b;

    public static void a(boolean param0) {
        if (!param0) {
            sg.a(120);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(int param0) {
        fg.field_i = null;
        ba.field_h = null;
        if (param0 <= 79) {
            sg.a(true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
    }
}
