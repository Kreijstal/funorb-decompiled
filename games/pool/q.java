/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static vh field_b;
    static int field_a;

    public static void a(int param0) {
        int var1 = 103 / ((0 - param0) / 53);
        field_b = null;
    }

    final static void a(di param0, int param1) {
        gm var2 = null;
        jg discarded$0 = null;
        try {
            if (param1 <= 4) {
                field_b = (vh) null;
            }
            gm.b(param0.a(false, "", "headers.packvorbis"));
            var2 = gm.a(param0, "jagex logo2.packvorbis", "");
            discarded$0 = var2.b();
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "q.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
