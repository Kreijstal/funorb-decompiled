/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    static String field_f;
    static int field_d;
    static String field_c;
    static String field_a;
    static int field_b;
    static long field_e;

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != -13268) {
            wa.a(34);
            field_f = null;
            return;
        }
        field_f = null;
    }

    final static void a(boolean param0) {
        n var1 = (n) (Object) k.field_B.e((byte) 123);
        if (!(var1 != null)) {
            var1 = new n();
        }
        var1.a(na.field_b, -94, na.field_k, na.field_f, na.field_g, na.field_e, na.field_i, na.field_d);
        qb.field_g.a(1, (ai) (Object) var1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Try again";
        field_d = -1;
        field_c = "Quit";
        field_a = "Arrow";
    }
}
