/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static java.applet.Applet field_b;
    static String field_a;

    final static void a(ui param0, int param1) {
        try {
            wj.field_Ob.a(param0, param1, 0, -1);
            rc.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "th.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 <= 120) {
            field_b = (java.applet.Applet) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(int param0, int param1, boolean param2, int param3, boolean param4, boolean param5, boolean param6, int param7, int param8, int param9, int param10, byte param11, int param12, boolean param13) {
        sl.field_g = null;
        ce.e(116);
        param13 = lk.a(param8, -121, param1, param10, param13, param9, param3);
        ph.a(param5, param12, param7, param6, param13, param2, param4, -1, param0, param10);
        a.a(param12, param5, true);
        if (param11 <= 42) {
            field_a = (String) null;
        } else {
            tf.b(param8, param13, 0, param12);
            return;
        }
        tf.b(param8, param13, 0, param12);
    }

    final static void a(int param0, boolean param1) {
        uf var2 = we.field_b;
        var2.f(param0, -4);
        var2.field_n = var2.field_n + 1;
        int var3 = var2.field_n;
        var2.a(true, 2);
        var2.a(false, kk.field_l.length, kk.field_l, 0);
        var2.a(true, qa.field_x);
        var2.a(param1, jb.field_c);
        var2.a(false, v.field_a.length, v.field_a, 0);
        var2.b(var2.field_n - var3, param1);
    }

    static {
        field_a = "Settling Score: ";
    }
}
