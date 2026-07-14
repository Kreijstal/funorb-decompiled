/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf extends ca {
    int field_j;
    static hj[] field_g;
    static int field_i;
    ca field_f;
    static tl field_l;
    bb field_h;
    static int field_k;

    final static void a(boolean param0, java.awt.Component param1) {
        param1.setFocusTraversalKeysEnabled(param0);
        param1.addKeyListener((java.awt.event.KeyListener) (Object) ad.field_b);
        param1.addFocusListener((java.awt.event.FocusListener) (Object) ad.field_b);
    }

    final static void a(kc param0, int param1, int param2, int param3, int param4, boolean param5, int param6, hj[] param7, kc param8, int param9, int param10, int param11, int param12, hj[] param13, int param14) {
        Object var17 = null;
        ok.a(param2, param9, param4, param13, param11, param6, param3, -1, 0, lf.field_e, he.field_C, param7, param14, mf.field_c, 480, (hj[]) null, param12, 0, param1, param0, param8);
        hb.a(param5, (byte) -128);
        if (param10 < 5) {
            Object var16 = null;
            hf.a((v) null, (ki) null, 124, 16);
        }
    }

    final static void a(v param0, ki param1, int param2, int param3) {
        ol.field_h = ok.a((byte) 84) * param2 / param3;
        fb.a(-2, param1);
        fh.a(param1, -237);
        f.a(param1, -17763);
        OrbDefence.d(false);
        ta.j(0);
        ji.field_b = -ol.field_h + 0;
    }

    public static void c(boolean param0) {
        field_g = null;
        if (!param0) {
            return;
        }
        field_l = null;
    }

    hf(bb param0, ca param1) {
        ((hf) this).field_h = param0;
        ((hf) this).field_j = param0.j();
        ((hf) this).field_f = param1;
        ((hf) this).field_h.g(ck.field_f * ((hf) this).field_j + 128 >> -732362456);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 0;
        field_l = new tl();
    }
}
