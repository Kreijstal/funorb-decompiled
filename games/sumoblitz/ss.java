/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ss {
    static String field_a;

    public static void a() {
        field_a = null;
    }

    final static void a(al param0, byte param1, ki param2, int param3) {
        try {
            gi.field_i = vm.a(-32) * param3 / 1000;
            int discarded$0 = 100;
            ak.a(param2);
            wq.a(false, param2);
            int discarded$1 = -84;
            lq.a(param2);
            qt.b(true);
            int discarded$2 = -90;
            rw.a();
            td.field_u = 0 - gi.field_i;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ss.C(" + (param0 != null ? "{...}" : "null") + ',' + 127 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, qv param2) {
        pl var3 = null;
        try {
            var3 = as.field_v;
            var3.g(param0, 8);
            var3.b((byte) 16, 2);
            var3.b((byte) 89, 0);
            var3.b((byte) 82, param2.field_n);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ss.A(" + param0 + ',' + 1000 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Restart level";
    }
}
