/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    static mh field_b;
    static String field_a;
    static boolean field_c;

    public static void a(int param0) {
        field_b = null;
        field_a = null;
    }

    final static void b(int param0) {
        if (param0 > -75) {
            return;
        }
        ii var1 = (ii) (Object) hi.field_v.a(113);
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        lb.a(var1.field_i, var1.field_m, var1.field_p);
        lb.e(var1.field_n, var1.field_o, var1.field_t, var1.field_k);
        var1.field_i = null;
        fr.field_M.a((nm) (Object) var1, (byte) 3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Passwords must be between 5 and 20 characters long";
    }
}
