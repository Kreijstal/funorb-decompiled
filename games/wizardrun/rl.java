/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    static int field_b;
    static bh field_a;

    final static void a(boolean param0, boolean param1) {
        uk.a((byte) -123, param0, true);
        if (param1) {
            rl.a(true, false);
        }
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 != -26035) {
            rl.a(52);
        }
    }

    final static void a(int param0) {
        int var1 = -51 % ((param0 - 63) / 40);
        uh.field_a = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 9;
        field_a = new bh(13, 0, 1, 0);
    }
}
