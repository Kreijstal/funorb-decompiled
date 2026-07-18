/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    static int field_c;
    static gj field_b;
    static int[] field_e;
    static ci field_d;
    int field_a;

    final static void a(int param0, o param1, int param2) {
        hj var3 = null;
        try {
            var3 = ff.field_D;
            var3.a(false, param0);
            var3.f(6389, 5);
            var3.f(6389, 0);
            var3.c(param1.field_j, -159688920);
            var3.f(6389, param1.field_h);
            var3.f(6389, param1.field_n);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "nk.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + -31995 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        field_e = null;
        field_b = null;
        field_d = null;
    }

    nk(int param0) {
        ((nk) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_e = new int[8192];
    }
}
