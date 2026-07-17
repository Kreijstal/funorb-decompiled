/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sja extends uda {
    static String field_gb;
    static pf field_fb;
    static long field_hb;

    final static void a(int param0, mha param1) {
        pf var3 = field_fb;
        var3.c(param0, (byte) 122);
        try {
            var3.d(5, 0);
            var3.d(0, 0);
            var3.b(param1.field_f, -115);
            var3.d(param1.field_h, 0);
            var3.d(param1.field_i, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "sja.T(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + 1 + 41);
        }
    }

    public static void o(int param0) {
        field_gb = null;
        field_fb = null;
        if (param0 != 33) {
            sja.o(-59);
        }
    }

    sja(rp param0, wj param1) {
        super(param0, param1, 33, 20, 30);
    }

    final void e(wj param0, int param1) {
        try {
            super.e(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "sja.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
    }
}
