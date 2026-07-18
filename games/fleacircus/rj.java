/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj extends kc {
    static int field_k;
    static int field_o;
    private String field_l;
    private String field_h;
    static boolean field_m;
    static vc field_i;
    static boolean field_j;
    static boolean field_n;

    final void a(ni param0, byte param1) {
        try {
            param0.a(((rj) this).field_l, (byte) 81);
            int var3_int = 110 % ((param1 - -62) / 38);
            param0.b(((rj) this).field_h, (byte) 94);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "rj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final uj a(boolean param0) {
        if (!param0) {
            rj.a((byte) -81);
            return wa.field_g;
        }
        return wa.field_g;
    }

    rj(String param0, String param1) {
        try {
            ((rj) this).field_h = param1;
            ((rj) this).field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "rj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_i = null;
        if (param0 != 75) {
            rj.a((byte) 16);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = -1;
        field_i = new vc();
        field_n = false;
    }
}
