/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nq extends nm {
    static boolean field_p;
    private int field_o;
    static String field_k;
    private int field_r;
    private int field_m;
    private int field_q;
    private jp field_s;
    static String field_n;
    private String field_l;
    static int field_i;
    private boolean field_j;

    final static void a(mf param0, mf param1, byte param2, mf param3) {
        int var8 = 0;
        int var9 = 0;
        tp[] var14 = null;
        int var11_int = 0;
        int var13 = BrickABrac.field_J ? 1 : 0;
        nf.field_W = cr.a("commonui", param3, "frame_top", param2 ^ -57);
        qc.field_l = cr.a("commonui", param3, "frame_bottom", 2);
        ka.field_n = pl.a("commonui", "jagex_logo_grey", (byte) -110, param3);
        sf.field_U = cr.a("commonui", param3, "button", 2);
        df.field_a = bd.a("commonui", "validation", param3, (byte) -8);
        og.field_Yb = (dh) (Object) si.a((byte) -118, "commonui", "arezzo12", param3, param0);
        a.field_u = (dh) (Object) si.a((byte) -108, "commonui", "arezzo14", param3, param0);
        wm.field_a = (dh) (Object) si.a((byte) -126, "commonui", "arezzo14bold", param3, param0);
        jp var17 = new jp(param1.a(122, "button.gif", ""), (java.awt.Component) (Object) kj.field_D);
        tp discarded$0 = uo.a((byte) 29, param3, "dropdown", "commonui");
        tp[] var5 = wq.a("commonui", param3, "screen_options", param2 ^ 946715361);
        mq.field_b = new tp[4];
        cd.field_b = new tp[4];
        ng.field_d = new tp[4];
        tp[][] var6 = new tp[][]{mq.field_b, ng.field_d, cd.field_b};
        int[][] var21 = new int[4][];
        int[][] var20 = var21;
        int[][] var19 = var20;
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].field_j;
        for (var8 = 1; var21.length > var8; var8++) {
            var7[var8] = (int[]) var21[0].clone();
        }
        var8 = var5[0].field_i[0];
        var21[2][var8] = 16777215;
        var21[1][var8] = 2394342;
        var21[3][var8] = 4767999;
        for (var9 = 0; var9 < 3; var9++) {
            var14 = var6[var9];
            tp[] var10 = var14;
            for (var11_int = 0; var11_int < var14.length; var11_int++) {
                var14[var11_int] = ek.a(var5[var9], (byte) -85, var21[var11_int]);
            }
        }
        var9 = var17.field_C;
        jf.d(param2 ^ 88);
        var17.g();
        lb.a(0, 0, lb.field_c, lb.field_d);
        jp var15 = new jp(var9, var9);
        jp var18 = var15;
        var18.g();
        var17.d(0, 0);
        jp var11 = new jp(var9, var9);
        var11.g();
        if (param2 != -59) {
            nq.d(-50);
        }
        var17.d(var9 - var17.field_D, 0);
        jp var12 = new jp(-(var9 * 2) + var17.field_D, var9);
        var12.g();
        var17.d(-var9, 0);
        sc.b(-81);
        sf.field_U = new jp[]{var15, var12, var11};
    }

    final void c(int param0) {
        if (param0 != 0) {
            return;
        }
        ((nq) this).field_j = oh.a(pq.field_k, po.field_a, (byte) -24, ((nq) this).field_r, ((nq) this).field_m, ((nq) this).field_s);
        ((nq) this).field_j = ((nq) this).field_s.d(((nq) this).field_m, ((nq) this).field_r, pq.field_k, po.field_a);
    }

    final static void e(int param0) {
        if (!(eo.field_f == null)) {
            eo.field_f.f();
        }
        if (!(jk.field_w == null)) {
            jk.field_w.f();
        }
        if (param0 < 39) {
            nq.a(-13, -69);
        }
    }

    public static void a(byte param0) {
        field_k = null;
        if (param0 > -40) {
            return;
        }
        field_n = null;
    }

    final static void d(int param0) {
        if (param0 != 2) {
            field_i = 90;
        }
        ld.field_s = true;
        ng.field_b = 0;
    }

    final static void a(int param0, int param1) {
        int var3 = BrickABrac.field_J ? 1 : 0;
        if (param1 != 13330) {
            field_n = null;
        }
        e var4 = (e) (Object) na.field_Q.d(-37);
        while (var4 != null) {
            ud.a(param0, var4, (byte) 80);
            var4 = (e) (Object) na.field_Q.a((byte) 116);
        }
        nm var2 = ej.field_F.d(param1 ^ -13402);
        while (var2 != null) {
            ma.b((byte) -85, param0);
            var2 = ej.field_F.a((byte) 116);
        }
    }

    final static hl a(byte param0, String param1, mf param2, mf param3, String param4) {
        int var5 = param2.a(param1, false);
        int var6 = param2.a(var5, -80, param4);
        if (param0 != -37) {
            return null;
        }
        return wn.a(var5, param3, param2, var6, (byte) -112);
    }

    nq(int param0, int param1, jp param2, String param3) {
        ((nq) this).field_s = param2;
        ((nq) this).field_m = param0;
        ((nq) this).field_r = param1;
        ((nq) this).field_l = param3.toLowerCase();
        ((nq) this).field_q = 2 * lm.field_b - -ob.field_D.c(((nq) this).field_l);
        ((nq) this).field_o = ob.field_D.field_P + 2 * ki.field_a - -ob.field_D.field_F;
    }

    final void a(int param0) {
        ((nq) this).field_s.c(((nq) this).field_m, ((nq) this).field_r);
        if (param0 != 2) {
            return;
        }
        if (!(!((nq) this).field_j)) {
            hj.a(-lm.field_b + pq.field_k, -ki.field_a + po.field_a, ((nq) this).field_o, ((nq) this).field_q, ((nq) this).field_l, 16777215);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Join";
        field_n = "Invalid password.";
        field_p = false;
    }
}
