/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dfa {
    static int field_a;
    static String field_c;
    static String field_b;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        if (param0 <= 65) {
            dfa.a((byte) -8);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Recall grapples";
        field_a = 128;
        field_b = "<%0> is already on your friend list.";
    }
}
