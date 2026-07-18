/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc extends nf {
    static int field_t;
    static int field_q;
    static int field_o;
    static pf field_v;
    static int field_x;
    static int field_r;
    static String field_u;
    static hj field_w;
    static String field_s;
    private Object field_p;

    lc(Object param0, int param1) {
        super(param1);
        try {
            ((lc) this).field_p = param0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "lc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean g(int param0) {
        if (param0 != 9) {
            return false;
        }
        return false;
    }

    public static void i(int param0) {
        field_s = null;
        field_w = null;
        field_u = null;
        field_v = null;
        int var1 = 0;
    }

    final Object f(int param0) {
        if (param0 != 0) {
            return null;
        }
        return ((lc) this).field_p;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = 0;
        field_u = "LEVEL SELECT";
        field_r = 0;
        field_s = "Accept";
    }
}
