/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    static fia field_a;
    static int field_b;

    final static void a(long param0, int param1, int param2, String param3, int param4) {
        try {
            if (param2 <= 1) {
                Object var7 = null;
                oi.a(-68L, 54, 86, (String) null, 2);
            }
            gm.field_n = param4;
            apa.field_a = param0;
            cr.field_b = param3;
            uda.field_q = param1;
            ns.field_f = true;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "oi.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void a(boolean param0) {
        field_a = null;
    }

    static {
    }
}
