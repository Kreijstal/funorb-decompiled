/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wba {
    static eaa field_g;
    int field_b;
    static vr field_f;
    static String[] field_a;
    static kia[] field_e;
    static int field_c;
    static String field_d;

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_a = null;
        int var1 = 2 % ((-21 - param0) / 33);
        field_g = null;
        field_f = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    wba(int param0) {
        ((wba) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new eaa();
        field_c = 0;
        field_e = new kia[3];
        field_d = "Report <%0> for abuse";
    }
}
