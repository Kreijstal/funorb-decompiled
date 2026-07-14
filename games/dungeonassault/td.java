/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static String field_b;
    static boolean field_c;
    static String field_d;
    static java.awt.Font field_a;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 < 7) {
            field_b = null;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static void a(int param0, int param1) {
        int discarded$3 = wk.c(false);
        if (param1 <= 120) {
            Object var3 = null;
            boolean discarded$4 = td.a((String) null, true, false, (String) null, (rg) null, -5, (String) null);
        }
    }

    final static boolean a(String param0, boolean param1, boolean param2, String param3, rg param4, int param5, String param6) {
        jb var8 = null;
        if (!(ol.field_i == sp.field_e)) {
            return false;
        }
        if (!param2) {
            td.a(91);
            var8 = new jb(lg.field_w, param4);
            lg.field_w.a((lm) (Object) var8, -1);
            if (rg.i((byte) -125)) {
                var8.r(102);
                return true;
            }
            field_d = param0;
            mh.field_b = null;
            in.field_E = param1 ? true : false;
            wk.field_g = param5;
            he.field_m = param6;
            ol.field_i = ql.field_f;
            ho.field_i = param3;
            return true;
        }
        var8 = new jb(lg.field_w, param4);
        lg.field_w.a((lm) (Object) var8, -1);
        if (rg.i((byte) -125)) {
            var8.r(102);
        } else {
            field_d = param0;
            mh.field_b = null;
            in.field_E = param1 ? true : false;
            wk.field_g = param5;
            he.field_m = param6;
            ol.field_i = ql.field_f;
            ho.field_i = param3;
            return true;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Passwords must be between 5 and 20 letters and numbers";
        field_c = false;
    }
}
