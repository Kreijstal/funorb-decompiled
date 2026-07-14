/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    int field_a;
    static String field_b;
    int field_c;

    public static void a(int param0) {
        int var1 = 24 / ((param0 - -53) / 32);
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    ri(int param0, int param1, int param2, int param3) {
        ((ri) this).field_c = param3;
        ((ri) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Members only";
    }
}
