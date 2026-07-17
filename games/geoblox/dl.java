/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    static boolean field_b;
    static sl field_a;
    static volatile boolean field_c;

    public static void a(boolean param0) {
        if (!param0) {
            dl.a(false);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a() {
        fb.field_l = false;
        int discarded$0 = eh.field_d.c((byte) 34);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = true;
        field_c = true;
    }
}
