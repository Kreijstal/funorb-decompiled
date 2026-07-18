/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jo {
    static String field_a;
    static int field_b;

    public static void a() {
        field_a = null;
    }

    final static void a(boolean param0, int param1, og param2) {
        df var3 = null;
        try {
            var3 = wa.field_d;
            var3.f(-121, 7);
            var3.b(90, param2.field_j);
            var3.b(90, param2.field_l);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "jo.A(" + true + ',' + 7 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Unpacking sound effects";
    }
}
