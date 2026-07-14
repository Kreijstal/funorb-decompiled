/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends k {
    static me field_k;
    static String[] field_m;
    private String field_n;
    private cb field_p;
    private boolean field_o;
    static ta field_l;
    static String field_r;
    static vl field_q;

    final static java.applet.Applet e(byte param0) {
        if (null != sl.field_x) {
            return sl.field_x;
        }
        if (param0 >= -60) {
            field_m = null;
        }
        return (java.applet.Applet) (Object) so.field_f;
    }

    final qh a(String param0, byte param1) {
        ac var3 = null;
        if (((uc) this).field_p.a(param0, param1) == lp.field_xb) {
            return lp.field_xb;
        }
        if (!(param0.equals((Object) (Object) ((uc) this).field_n))) {
            var3 = hg.a(0, param0);
            if (!(var3.b(96))) {
                return hq.field_z;
            }
            ((uc) this).field_n = param0;
            ((uc) this).field_o = var3.a(false);
        }
        return ((uc) this).field_o ? ae.field_c : lp.field_xb;
    }

    final String a(int param0, String param1) {
        int var3 = 27 / ((-16 - param0) / 50);
        if (((uc) this).field_p.a(param1, (byte) 106) == lp.field_xb) {
            return ((uc) this).field_p.a(37, param1);
        }
        if (!(((uc) this).a(param1, (byte) 106) != lp.field_xb)) {
            return sn.field_s;
        }
        return to.field_l;
    }

    uc(vb param0, vb param1) {
        super(param0);
        ((uc) this).field_n = "";
        ((uc) this).field_o = false;
        ((uc) this).field_p = new cb(param0, param1);
    }

    public static void g(int param0) {
        if (param0 != 0) {
            field_q = null;
        }
        field_r = null;
        field_l = null;
        field_m = null;
        field_k = null;
        field_q = null;
    }

    final static void e(int param0) {
        int var3 = BrickABrac.field_J ? 1 : 0;
        int var1 = 9 % ((-59 - param0) / 35);
        rk.field_Tb = null;
        fo.field_h = 0;
        ol.field_w = 0;
        bf.field_N.c((byte) -72);
        jq.field_n.c((byte) -92);
        tk var2 = of.field_i.b((byte) 74);
        while (var2 != null) {
            var2.d(3);
            var2 = of.field_i.a(false);
        }
        var2 = tf.field_d.b((byte) 122);
        while (var2 != null) {
            var2.d(3);
            var2 = tf.field_d.a(false);
        }
        wk.field_m = 0;
    }

    final static String[] a(int param0, String param1, byte param2) {
        int var4 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        String[] var3 = new String[param0];
        if (param2 != -1) {
            return null;
        }
        for (var4 = 0; var4 < param0; var4++) {
            var3[var4] = param1 + "_0" + var4;
        }
        return var3;
    }

    final static boolean f(int param0) {
        if (param0 != 21651) {
            return false;
        }
        return va.field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Match by...";
        field_m = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_k = new me("email");
        field_q = new vl();
    }
}
