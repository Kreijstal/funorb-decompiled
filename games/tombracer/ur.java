/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ur {
    static vpa field_a;
    int field_c;
    static String field_b;

    public final String toString() {
        throw new IllegalStateException();
    }

    ur(int param0) {
        ((ur) this).field_c = param0;
    }

    public static void a() {
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Mute this player for 48 hours";
    }
}
