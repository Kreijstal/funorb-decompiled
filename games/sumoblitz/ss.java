/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ss {
    static String field_a;

    public static void a(byte param0) {
        field_a = null;
        if (param0 <= 69) {
            field_a = (String) null;
        }
    }

    final static void a(al param0, byte param1, ki param2, int param3) {
        try {
            gi.field_i = vm.a(-32) * param3 / 1000;
            ak.a(param2, 100);
            wq.a(false, param2);
            lq.a(param2, -84);
            qt.b(true);
            rw.a((byte) -90);
            if (param1 < 125) {
                field_a = (String) null;
            }
            td.field_u = 0 - gi.field_i;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ss.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, qv param2) {
        pl var3 = null;
        try {
            var3 = as.field_v;
            if (param1 != 1000) {
                field_a = (String) null;
            }
            var3.g(param0, 8);
            var3.b((byte) 16, 2);
            var3.b((byte) 89, 0);
            var3.b((byte) 82, param2.field_n);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ss.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Restart level";
    }
}
