/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn {
    static sn field_a;
    static boolean field_b;

    final static dj a(boolean param0, int param1, byte param2, int param3, boolean param4) {
        if (param2 != -85) {
          field_b = true;
          return hd.a(false, true, param1, param3, param0, false);
        } else {
          return hd.a(false, true, param1, param3, param0, false);
        }
    }

    final static void a(int param0, rj param1, int param2, java.awt.Component param3, ec param4, int param5, boolean param6, int param7) {
        try {
            qf.a(param5, param6, 10);
            sh.field_d = qf.a(param4, param3, 0, param0);
            cf.field_fb = qf.a(param4, param3, 1, param2);
            t.field_i = new fi();
            kg.field_f = 1000 * param2 / param5;
            cf.field_fb.b((sp) (Object) t.field_i);
            if (param7 >= -104) {
                field_b = true;
            }
            uh.field_o = param1;
            uh.field_o.a(ce.field_u, (byte) -68);
            sh.field_d.b((sp) (Object) uh.field_o);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "wn.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    public static void a(int param0) {
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
