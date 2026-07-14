/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn {
    static sn field_a;
    static boolean field_b;

    final static dj a(boolean param0, int param1, byte param2, int param3, boolean param4) {
        if (param2 != -85) {
          field_b = true;
          return hd.a(false, true, param1, param3, param0, param4);
        } else {
          return hd.a(false, true, param1, param3, param0, param4);
        }
    }

    final static void a(int param0, rj param1, int param2, java.awt.Component param3, ec param4, int param5, boolean param6, int param7) {
        qf.a(param5, param6, 10);
        sh.field_d = qf.a(param4, param3, 0, param0);
        cf.field_fb = qf.a(param4, param3, 1, param2);
        t.field_i = new fi();
        kg.field_f = 1000 * param2 / param5;
        cf.field_fb.b((sp) (Object) t.field_i);
        if (param7 >= -104) {
            field_b = true;
        } else {
            uh.field_o = param1;
            uh.field_o.a(ce.field_u, (byte) -68);
            sh.field_d.b((sp) (Object) uh.field_o);
            return;
        }
        uh.field_o = param1;
        uh.field_o.a(ce.field_u, (byte) -68);
        sh.field_d.b((sp) (Object) uh.field_o);
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            Object var2 = null;
            wn.a(3, (rj) null, 66, (java.awt.Component) null, (ec) null, -13, false, 43);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new sn("usename");
        field_b = true;
    }
}
