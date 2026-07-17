/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl {
    int field_a;
    static String field_c;
    static String field_b;
    static int field_d;

    public final String toString() {
        throw new IllegalStateException();
    }

    gl(int param0) {
        ((gl) this).field_a = param0;
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Shields";
        field_b = "<%0> won the match by a mere <%1>!";
        field_d = 0;
    }
}
