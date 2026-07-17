/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static ng field_c;
    static String field_d;
    static String field_a;
    static lb field_b;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        field_a = null;
    }

    final static void a(int param0) {
        int var1 = 0;
        if (wc.field_a <= 32) {
            ah.a((byte) -102, 0);
        } else {
            var1 = wc.field_a % 32;
            if (!(var1 != 0)) {
                var1 = 32;
            }
            ah.a((byte) -68, -var1 + wc.field_a);
        }
        var1 = 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "That name is not available";
        field_a = "Connection restored.";
        field_c = new ng();
    }
}
