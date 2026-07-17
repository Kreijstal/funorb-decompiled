/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn {
    static sn field_a;
    static boolean field_b;

    final static dj a(boolean param0, int param1) {
        return hd.a(false, true, param1, 1, true, false);
    }

    final static void a(int param0, rj param1, int param2, java.awt.Component param3, ec param4) {
        try {
            qf.a(22050, true, 10);
            sh.field_d = qf.a(param4, param3, 0, 22050);
            cf.field_fb = qf.a(param4, param3, 1, 1024);
            t.field_i = new fi();
            kg.field_f = 46;
            cf.field_fb.b((sp) (Object) t.field_i);
            uh.field_o = param1;
            uh.field_o.a(ce.field_u, (byte) -68);
            sh.field_d.b((sp) (Object) uh.field_o);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "wn.C(" + 22050 + 44 + (param1 != null ? "{...}" : "null") + 44 + 1024 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 44 + 22050 + 44 + 1 + 44 + -112 + 41);
        }
    }

    public static void a() {
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new sn("usename");
        field_b = true;
    }
}
