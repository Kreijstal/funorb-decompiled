/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class d extends ta {
    int field_t;
    static int field_s;
    static String field_q;
    static sp field_r;

    public static void a(int param0) {
        field_q = null;
        field_r = null;
        int var1 = 112 % ((param0 - -54) / 34);
    }

    d(int param0) {
        ((d) this).field_t = param0;
    }

    final static void d() {
        if (!(gn.field_m == null)) {
            gn.field_m.b(true);
        }
        je.field_g = new th();
        hb.field_x.c((gm) (Object) je.field_g, 33);
    }

    final static void a(String param0) {
        try {
            eb.field_c = param0;
            od.b(128, 12);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "d.D(" + (param0 != null ? "{...}" : "null") + ',' + 31 + ')');
        }
    }

    abstract Object b(int param0);

    abstract boolean c(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Account created successfully!";
        field_s = 0;
    }
}
