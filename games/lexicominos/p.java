/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static int[] field_d;
    static String[] field_a;
    static long field_c;
    static String field_b;

    final static void a(tg param0) {
        th var5 = null;
        int var4 = 0;
        try {
            var5 = ed.field_q;
            var5.h(6, 0);
            var5.field_h = var5.field_h + 1;
            var4 = var5.field_h;
            var5.c(1, -1);
            if (null == param0.field_h) {
                var5.c(0, -1);
            } else {
                var5.c(param0.field_h.length, -1);
                var5.a(0, param0.field_h, 255, param0.field_h.length);
            }
            int discarded$0 = var5.a(var4, (byte) 85);
            var5.field_h = var5.field_h - 4;
            param0.field_k = var5.d((byte) 19);
            var5.d(-var4 + var5.field_h, (byte) -125);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "p.A(" + (param0 != null ? "{...}" : "null") + ',' + 6 + ',' + 24 + ')');
        }
    }

    public static void a() {
        field_b = null;
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Showing by rating", "Showing by win percentage"};
        field_b = "Password: ";
    }
}
