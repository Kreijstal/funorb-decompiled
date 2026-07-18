/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kr extends sna {
    kha field_yb;
    static String field_wb;
    static String field_xb;
    static String field_zb;
    static int field_vb;

    final static void a(int param0, rg param1, int param2) {
        pf var3 = sja.field_fb;
        var3.c(param2, (byte) 126);
        var3.d(2, 0);
        var3.d(0, 0);
        try {
            var3.d(param1.field_i, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "kr.A(" + 93 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void f(int param0) {
        field_zb = null;
        int var1 = 0;
        field_xb = null;
        field_wb = null;
    }

    kr(int param0, kv param1, kha param2) {
        try {
            ((kr) this).field_p = 39;
            ((kr) this).field_v = param1;
            ((kr) this).field_sb = 39;
            if (qg.field_b.field_z != null) {
                ((kr) this).field_kb = 39 * (qg.field_b.field_z.g(0) % 4);
                ((kr) this).field_rb = qg.field_b.field_z.g(0) / 4 * 39 + -8;
            }
            ((kr) this).field_yb = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "kr.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_wb = "(Including <%0>)";
        field_xb = "Arena combat. Follow the tooltips on screen to continue.";
        field_zb = "Email: ";
    }
}
