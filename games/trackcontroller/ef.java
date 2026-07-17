/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    static pf[] field_a;
    static ud field_b;

    final static void a(vk param0) {
        la var3 = ra.field_C;
        var3.c(2, 7);
        try {
            var3.a(param0.field_l, (byte) -95);
            var3.b(param0.field_k, (byte) -122);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "ef.B(" + (param0 != null ? "{...}" : "null") + 44 + 2 + 44 + 10 + 41);
        }
    }

    public static void a() {
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ud();
    }
}
