/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    int field_b;
    static String[] field_a;

    wh(int param0) {
        ((wh) this).field_b = param0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        if (param0 != 19) {
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
