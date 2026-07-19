/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    static pf[] field_a;
    static ud field_b;

    final static void a(vk param0, int param1, int param2) {
        la var3 = ra.field_C;
        var3.c(param1, 7);
        if (param2 != 10) {
            return;
        }
        try {
            var3.a(param0.field_l, (byte) -95);
            var3.b(param0.field_k, (byte) -122);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "ef.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 27887) {
            field_a = (pf[]) null;
        }
    }

    static {
        field_b = new ud();
    }
}
