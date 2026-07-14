/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk {
    static he[][] field_b;
    static String[] field_c;
    static int[] field_a;
    static String[] field_d;

    final static java.net.URL a(java.net.URL param0, java.applet.Applet param1, int param2) {
        String var4 = null;
        String var3 = null;
        if (ih.field_J != null) {
            if (!ih.field_J.equals((Object) (Object) param1.getParameter("settings"))) {
                var3 = ih.field_J;
                var4 = var3;
                var4 = var3;
            }
        }
        var4 = null;
        if (ml.field_h != null) {
            if (!(ml.field_h.equals((Object) (Object) param1.getParameter("session")))) {
                var4 = ml.field_h;
            }
        }
        if (param2 != 4767999) {
            field_c = null;
        }
        return th.a(var3, -1, param0, -1, var4);
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        if (param0 <= 21) {
            field_d = null;
        }
        field_c = null;
        field_b = null;
    }

    final static void a(int param0, vj param1, vj param2, vj param3) {
        int var8 = 0;
        int var9 = 0;
        he[] var15 = null;
        int var11 = 0;
        int var14 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        ob.field_f = cl.a("commonui", param1, -125, "frame_top");
        kc.field_i = cl.a("commonui", param1, -115, "frame_bottom");
        ck.field_l = qk.a("commonui", param1, "jagex_logo_grey", true);
        rk.field_d = cl.a("commonui", param1, -120, "button");
        ja.field_n = ea.a("validation", "commonui", 0, param1);
        u.field_d = (rf) (Object) qg.a(param2, "arezzo12", "commonui", param1, 126);
        uh.field_i = (rf) (Object) qg.a(param2, "arezzo14", "commonui", param1, -100);
        wi.field_e = (rf) (Object) qg.a(param2, "arezzo14bold", "commonui", param1, 106);
        nh var18 = new nh(param3.a("button.gif", "", 24874), (java.awt.Component) (Object) n.field_g);
        he discarded$0 = eh.a("commonui", (byte) -45, param1, "dropdown");
        he[] var5 = ij.a("screen_options", (byte) 113, param1, "commonui");
        al.field_d = new he[4];
        qb.field_b = new he[4];
        gd.field_b = new he[4];
        he[][] var6 = new he[][]{al.field_d, qb.field_b, gd.field_b};
        int[][] var22 = new int[4][];
        int[][] var21 = var22;
        int[][] var20 = var21;
        int[][] var17 = var20;
        int[][] var7 = var17;
        var7[0] = var5[0].field_l;
        for (var8 = 1; var8 < var22.length; var8++) {
            var7[var8] = (int[]) var22[0].clone();
        }
        var8 = var5[0].field_m[0];
        var22[2][var8] = 16777215;
        var22[1][var8] = 2394342;
        var22[3][var8] = 4767999;
        for (var9 = 0; -4 < (var9 ^ -1); var9++) {
            var15 = var6[var9];
            he[] var10 = var15;
            for (var11 = 0; var11 < var15.length; var11++) {
                var15[var11] = a.a(var5[var9], var22[var11], (byte) -122);
            }
        }
        var9 = var18.field_w;
        aj.a(true);
        var18.c();
        var11 = 101 % ((22 - param0) / 61);
        wj.e(0, 0, wj.field_k, wj.field_c);
        nh var16 = new nh(var9, var9);
        nh var19 = var16;
        var19.c();
        var18.a(0, 0);
        nh var12 = new nh(var9, var9);
        var12.c();
        var18.a(-var18.field_y + var9, 0);
        nh var13 = new nh(var18.field_y + -(var9 * 2), var9);
        var13.c();
        var18.a(-var9, 0);
        cl.d((byte) -73);
        rk.field_d = new nh[]{var16, var13, var12};
    }

    final static void a(long param0, boolean param1) {
        if (0L >= param0) {
            return;
        }
        if (param0 % 10L == 0L) {
            lh.b(param0 - 1L, (byte) 120);
            lh.b(1L, (byte) -3);
        } else {
            lh.b(param0, (byte) -124);
        }
        if (!param1) {
            kk.a(-113L, false);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new he[2][];
        field_d = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
