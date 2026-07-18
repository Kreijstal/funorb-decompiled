/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static je[][] field_b;
    static int field_c;
    static int field_d;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, vf param1, int param2, String param3, int param4, int param5, int param6, int param7, int param8) {
        try {
            gd.field_y = param7;
            jl.field_fb = param1;
            fb.field_a = param3;
            kb.field_a = param8;
            da.field_a = param5;
            ph.field_f = param2;
            sc.field_c = param4;
            i.field_a = param0;
            aj.field_c = (ch) (Object) new uf();
            uf.field_r = new nm(param1);
            ke.field_U = new bk(aj.field_c, uf.field_r);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "q.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + 20 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 20;
        field_a = "Passwords must be between 5 and 20 characters long";
    }
}
