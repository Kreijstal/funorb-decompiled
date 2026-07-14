/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    private boolean field_d;
    private String field_e;
    private boolean field_c;
    static String field_a;
    static String field_b;

    final boolean a(byte param0) {
        if (param0 != 47) {
            String discarded$0 = ((e) this).a(81);
        }
        return ((e) this).field_c;
    }

    final void a(int param0, boolean param1) {
        ((e) this).field_d = true;
        int var3 = -32 % ((32 - param0) / 45);
        ((e) this).field_c = param1 ? true : false;
    }

    final static void b(byte param0) {
        vl.field_f = new am(kg.a(hk.field_e, 100, 0));
        be.field_d = new am(kg.a(rh.field_g, 100, 0));
        if (param0 >= -95) {
            field_a = null;
        }
        tl.field_a = new am(kg.a(mo.field_i, 100, 0));
        jo.field_p = new am(kg.a(pl.field_h, 100, 0));
        sa.field_mb = new am(kg.a(sj.field_d, 100, 0));
        io.field_M = new am(kg.a(jn.field_m, 100, 0));
        ec.field_k = new am(kg.a(bb.field_x, 100, 0));
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        if (param0) {
            Object var2 = null;
            e.a(-15, (db) null, (db) null, (db) null);
        }
    }

    final static void a(int param0, db param1, db param2) {
        hk.field_e = bl.a(param2, "initialset", "crushed").a();
        if (param0 != 0) {
            return;
        }
        rh.field_g = ha.a(param1, "initialset", "fall-into-hole").b();
        mo.field_i = bl.a(param2, "initialset", "got-by-spider").a();
        pl.field_h = bl.a(param2, "initialset", "blown-up").a();
        sj.field_d = bl.a(param2, "initialset", "electrocuted-buzz").a();
        jn.field_m = ha.a(param1, "initialset", "electrocuted-end").b();
        bb.field_x = bl.a(param2, "initialset", "explode-into-sparks").a();
    }

    final boolean b(int param0) {
        if (param0 > -9) {
            field_a = null;
        }
        return ((e) this).field_d;
    }

    final static void a(int param0, db param1, db param2, db param3) {
        int var8 = 0;
        int var9 = 0;
        wj[] var14 = null;
        int var11_int = 0;
        int var13 = CrazyCrystals.field_B;
        gk.field_d = bf.a(param0 + -5, "frame_top", "commonui", param2);
        lm.field_g = bf.a(-1, "frame_bottom", "commonui", param2);
        p.field_f = wl.a("jagex_logo_grey", param2, 10, "commonui");
        sb.field_B = bf.a(-1, "button", "commonui", param2);
        ao.field_b = we.a("validation", "commonui", param2, false);
        ba.field_i = (vc) (Object) lj.a(param2, "commonui", param3, "arezzo12", 17153);
        ai.field_h = (vc) (Object) lj.a(param2, "commonui", param3, "arezzo14", 17153);
        mo.field_m = (vc) (Object) lj.a(param2, "commonui", param3, "arezzo14bold", 17153);
        dl var17 = new dl(param1.a(7693, "", "button.gif"), (java.awt.Component) (Object) jd.field_D);
        wj discarded$0 = ee.a(param2, "commonui", (byte) -92, "dropdown");
        wj[] var5 = ep.a(param2, "screen_options", "commonui", false);
        ik.field_g = new wj[param0];
        pn.field_i = new wj[4];
        db.field_a = new wj[4];
        wj[][] var6 = new wj[][]{db.field_a, ik.field_g, pn.field_i};
        int[][] var21 = new int[4][];
        int[][] var20 = var21;
        int[][] var19 = var20;
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].field_i;
        for (var8 = 1; var21.length > var8; var8++) {
            var7[var8] = (int[]) var21[0].clone();
        }
        var8 = var5[0].field_j[0];
        var21[2][var8] = 16777215;
        var21[1][var8] = 2394342;
        var21[3][var8] = 4767999;
        for (var9 = 0; -4 < (var9 ^ -1); var9++) {
            var14 = var6[var9];
            wj[] var10 = var14;
            for (var11_int = 0; var11_int < var14.length; var11_int++) {
                var14[var11_int] = ol.a(var21[var11_int], 120, var5[var9]);
            }
        }
        var9 = var17.field_u;
        hd.a(false);
        var17.a();
        kh.e(0, 0, kh.field_l, kh.field_d);
        dl var15 = new dl(var9, var9);
        dl var18 = var15;
        var18.a();
        var17.c(0, 0);
        dl var11 = new dl(var9, var9);
        var11.a();
        var17.c(-var17.field_l + var9, 0);
        dl var12 = new dl(var17.field_l + -(2 * var9), var9);
        var12.a();
        var17.c(-var9, 0);
        lg.a(1);
        sb.field_B = new dl[]{var15, var12, var11};
    }

    e(String param0) {
        ((e) this).field_c = false;
        ((e) this).field_d = false;
        ((e) this).field_e = param0;
    }

    final String a(int param0) {
        if (param0 <= 118) {
            field_b = null;
        }
        return ((e) this).field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Key";
        field_b = "Log in";
    }
}
