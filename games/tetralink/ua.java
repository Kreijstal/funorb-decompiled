/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static int field_c;
    static String[] field_b;
    static df field_h;
    static String field_f;
    static double field_i;
    static byte[] field_a;
    static String field_e;
    static hl field_d;
    static long field_g;

    final static boolean b(int param0) {
        int var1 = -12 % ((-4 - param0) / 36);
        if (!(-1 != rl.field_d)) {
            if (!(en.b(117, 1))) {
                return false;
            }
            rl.field_d = kb.field_q.d((byte) -99);
            kb.field_q.field_t = 0;
        }
        if (!((rl.field_d ^ -1) != 1)) {
            if (!(en.b(125, 2))) {
                return false;
            }
            rl.field_d = kb.field_q.e(127);
            kb.field_q.field_t = 0;
        }
        return en.b(115, rl.field_d);
    }

    final static void a(ah param0, ah param1, ah param2, int param3) {
        int var9 = 0;
        int var10 = 0;
        kh[] var15 = null;
        int var12_int = 0;
        int var14 = TetraLink.field_J;
        hn.field_O = bf.a((byte) -128, param0, "commonui", "frame_top");
        mc.field_i = bf.a((byte) -83, param0, "commonui", "frame_bottom");
        ac.field_c = ug.a(param0, (byte) -45, "jagex_logo_grey", "commonui");
        mf.field_q = bf.a((byte) -81, param0, "commonui", "button");
        fj.field_q = qa.a("commonui", -1, param0, "validation");
        dh.field_d = (jb) (Object) od.a(param0, "arezzo12", param1, "commonui", (byte) 95);
        od.field_S = (jb) (Object) od.a(param0, "arezzo14", param1, "commonui", (byte) 95);
        ab.field_V = (jb) (Object) od.a(param0, "arezzo14bold", param1, "commonui", (byte) 95);
        oh var18 = new oh(param2.a("button.gif", "", true), (java.awt.Component) (Object) uh.field_b);
        kh discarded$0 = qk.a((byte) 80, param0, "commonui", "dropdown");
        kh[] var5 = el.a(param0, "screen_options", "commonui", -1409);
        pj.field_a = new kh[4];
        ul.field_c = new kh[4];
        dh.field_g = new kh[4];
        kh[][] var6 = new kh[][]{ul.field_c, pj.field_a, dh.field_g};
        int var7 = 7 / ((param3 - -24) / 61);
        int[][] var22 = new int[4][];
        int[][] var21 = var22;
        int[][] var20 = var21;
        int[][] var17 = var20;
        int[][] var8 = var17;
        var8[0] = var5[0].field_p;
        for (var9 = 1; var22.length > var9; var9++) {
            var8[var9] = (int[]) var22[0].clone();
        }
        var9 = var5[0].field_o[0];
        var22[2][var9] = 16777215;
        var22[1][var9] = 2394342;
        var22[3][var9] = 4767999;
        for (var10 = 0; 3 > var10; var10++) {
            var15 = var6[var10];
            kh[] var11 = var15;
            for (var12_int = 0; var12_int < var15.length; var12_int++) {
                var15[var12_int] = gb.a(false, var22[var12_int], var5[var10]);
            }
        }
        var10 = var18.field_E;
        nm.b((byte) 111);
        var18.c();
        ra.d(0, 0, ra.field_f, ra.field_e);
        oh var16 = new oh(var10, var10);
        oh var19 = var16;
        var19.c();
        var18.b(0, 0);
        oh var12 = new oh(var10, var10);
        var12.c();
        var18.b(-var18.field_u + var10, 0);
        oh var13 = new oh(var18.field_u - var10 * 2, var10);
        var13.c();
        var18.b(-var10, 0);
        dh.a(-581);
        mf.field_q = new oh[]{var16, var13, var12};
    }

    final static void a(byte param0) {
        if (param0 != 123) {
            boolean discarded$0 = ua.b(93);
        }
        eh.b((byte) 106);
        bj.a((byte) -119);
    }

    public static void c(int param0) {
        field_h = null;
        field_b = null;
        field_a = null;
        field_f = null;
        if (param0 != -1) {
            return;
        }
        field_e = null;
        field_d = null;
    }

    final static void a(int param0) {
        cd.field_a = false;
        fn.field_K = param0 == (kb.field_q.d((byte) -99) ^ -1) ? true : false;
    }

    final static void a(int param0, String param1) {
        int var2 = aa.field_Nb;
        int var3 = a.field_a;
        int var4 = bk.field_i.field_Ib.c(param1, 500);
        int var5 = bk.field_i.field_Ib.b(param1, 500) + 6;
        if (param0 != 7918) {
            field_g = 6L;
        }
        int var6 = var4 * qe.field_d + 2;
        int var7 = eo.a(var5, (byte) 108, var2, 12);
        int var8 = mh.a(20, var3, var6, -8748);
        ra.b(var7, var8, var5, var6, 0);
        ra.c(1 + var7, 1 + var8, var5 + -2, var6 + -2, 16777088);
        int discarded$0 = bk.field_i.field_Ib.a(param1, var7 + 3, -bk.field_i.field_Ib.field_N + ai.field_d + (var8 - -1), 500, 1000, 0, -1, 0, 0, qe.field_d);
    }

    final static int a(int param0, int param1) {
        param1 = param1 & 8191;
        int var2 = 11 / ((param0 - -85) / 36);
        if (param1 >= 4096) {
            return -6145 < (param1 ^ -1) ? -km.field_n[6144 + -param1] : km.field_n[-6144 + param1];
        }
        return 2048 <= param1 ? -km.field_n[param1 - 2048] : km.field_n[2048 - param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"turntime_icons"};
        field_c = -1;
        field_e = "Names should contain a maximum of 12 characters";
        field_f = "Achieved";
        field_h = new df(0);
    }
}
