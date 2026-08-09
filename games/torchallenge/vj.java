/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    static ka[] field_d;
    static int field_c;
    static String field_a;
    static String field_e;
    static String field_b;

    public static void a(byte param0) {
        if (param0 < 60) {
            field_d = (ka[]) null;
        }
        field_b = null;
        field_a = null;
        field_e = null;
        field_d = null;
    }

    final static void a(lj param0, lj param1, int param2, lj param3) {
        ka var17 = null;
        ge[] var5 = null;
        ge[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        ge[] var14 = null;
        int var11_int = 0;
        ka var15 = null;
        ka var18 = null;
        ka var11 = null;
        ka var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = TorChallenge.field_F ? 1 : 0;
        try {
            fl.field_s = lk.a(-128, "frame_top", "commonui", param3);
            qa.field_e = lk.a(-127, "frame_bottom", "commonui", param3);
            rj.field_a = qk.a("commonui", "jagex_logo_grey", param3, 0);
            ae.field_v = lk.a(param2 ^ -23127, "button", "commonui", param3);
            ub.field_f = s.a(param3, "commonui", 0, "validation");
            ug.field_f = (eg) ((Object) qi.a(param0, "commonui", param3, "arezzo12", 0));
            oe.field_g = (eg) ((Object) qi.a(param0, "commonui", param3, "arezzo14", param2 ^ param2));
            dl.field_H = (eg) ((Object) qi.a(param0, "commonui", param3, "arezzo14bold", param2 + -23081));
            var17 = new ka(param1.a(-2, "", "button.gif"), (java.awt.Component) ((Object) bg.field_P));
            rb.a(param3, "commonui", (byte) -114, "dropdown");
            var5 = mh.a(32, param3, "screen_options", "commonui");
            c.field_d = new ge[4];
            we.field_o = new ge[4];
            lc.field_o = new ge[4];
            var6 = new ge[][]{c.field_d, we.field_o, lc.field_o};
            var19 = new int[4][];
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_l;
            for (var8 = 1; var8 < var19.length; var8++) {
                var7[var8] = (int[]) ((Object) var19[0].clone());
            }
            var8 = var5[0].field_k[0];
            var19[2][var8] = 16777215;
            var19[1][var8] = 2394342;
            var19[3][var8] = 4767999;
            for (var9 = 0; (var9 ^ -1) > -4; var9++) {
                var14 = var6[var9];
                ge[] var10 = var14;
                for (var11_int = 0; var11_int < var14.length; var11_int++) {
                    var14[var11_int] = qa.a(var19[var11_int], TorChallenge.a(param2, -23082), var5[var9]);
                }
            }
            var9 = var17.field_x;
            wb.b((byte) -128);
            var17.d();
            qg.g(0, 0, qg.field_g, qg.field_f);
            var15 = new ka(var9, var9);
            var18 = var15;
            var18.d();
            var17.a(0, 0);
            var11 = new ka(var9, var9);
            var11.d();
            var17.a(var9 + -var17.field_u, 0);
            var12 = new ka(-(2 * var9) + var17.field_u, var9);
            var12.d();
            var17.a(-var9, 0);
            ie.b((byte) -9);
            ae.field_v = new ka[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "vj.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Orb points: <%0>";
        field_e = "Change display name";
        field_b = "x";
    }
}
