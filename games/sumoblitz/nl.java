/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nl extends gm {
    static iw field_p;
    static mp field_n;
    static boolean field_o;

    public static void b() {
        field_n = null;
        field_p = null;
    }

    nl(vn param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_s, -1, 2147483647, false);
    }

    public final void a(pk param0, int param1, int param2, boolean param3, int param4) {
        try {
            if (param3) {
                nn.a(param0.field_p, param0.field_r + param4, param0.field_q, (byte) -84, param1 + param0.field_v);
            }
            super.a(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "nl.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    nl(int param0) {
        this(kw.field_b, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new iw(4);
        field_n = new mp();
    }
}
