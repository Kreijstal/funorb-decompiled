/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    int field_a;
    static int[][][] field_b;
    static String field_c;

    am(int param0) {
        ((am) this).field_a = param0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        if (param0 < 6) {
            am.a(-39);
            field_b = null;
            field_c = null;
            return;
        }
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Create your own free Jagex account";
    }
}
