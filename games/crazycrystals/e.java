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
            this.a(81);
        }
        return this.field_c;
    }

    final void a(int param0, boolean param1) {
        this.field_d = true;
        int var3 = -32 % ((32 - param0) / 45);
        this.field_c = param1 ? true : false;
    }

    final static void b(byte param0) {
        vl.field_f = new am(kg.a(hk.field_e, 100, 0));
        be.field_d = new am(kg.a(rh.field_g, 100, 0));
        if (param0 >= -95) {
            field_a = (String) null;
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
            db var2 = (db) null;
            e.a(-15, (db) null, (db) null, (db) null);
        }
    }

    final static void a(int param0, db param1, db param2) {
        hk.field_e = bl.a(param2, "initialset", "crushed").a();
        if (param0 != 0) {
            return;
        }
        try {
            rh.field_g = ha.a(param1, "initialset", "fall-into-hole").b();
            mo.field_i = bl.a(param2, "initialset", "got-by-spider").a();
            pl.field_h = bl.a(param2, "initialset", "blown-up").a();
            sj.field_d = bl.a(param2, "initialset", "electrocuted-buzz").a();
            jn.field_m = ha.a(param1, "initialset", "electrocuted-end").b();
            bb.field_x = bl.a(param2, "initialset", "explode-into-sparks").a();
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "e.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(int param0) {
        if (param0 > -9) {
            field_a = (String) null;
        }
        return this.field_d;
    }

    final static void a(int param0, db param1, db param2, db param3) {
        dl var17 = null;
        wj[] var5 = null;
        wj[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        wj[] var14 = null;
        int var11_int = 0;
        dl var15 = null;
        dl var18 = null;
        dl var11 = null;
        dl var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = CrazyCrystals.field_B;
        try {
            gk.field_d = bf.a(param0 + -5, "frame_top", "commonui", param2);
            lm.field_g = bf.a(-1, "frame_bottom", "commonui", param2);
            p.field_f = wl.a("jagex_logo_grey", param2, 10, "commonui");
            sb.field_B = bf.a(-1, "button", "commonui", param2);
            ao.field_b = we.a("validation", "commonui", param2, false);
            ba.field_i = (vc) ((Object) lj.a(param2, "commonui", param3, "arezzo12", 17153));
            ai.field_h = (vc) ((Object) lj.a(param2, "commonui", param3, "arezzo14", 17153));
            mo.field_m = (vc) ((Object) lj.a(param2, "commonui", param3, "arezzo14bold", 17153));
            var17 = new dl(param1.a(7693, "", "button.gif"), (java.awt.Component) ((Object) jd.field_D));
            ee.a(param2, "commonui", (byte) -92, "dropdown");
            var5 = ep.a(param2, "screen_options", "commonui", false);
            ik.field_g = new wj[param0];
            pn.field_i = new wj[4];
            db.field_a = new wj[4];
            var6 = new wj[][]{db.field_a, ik.field_g, pn.field_i};
            var19 = new int[4][];
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_i;
            for (var8 = 1; var19.length > var8; var8++) {
                var7[var8] = (int[]) ((Object) var19[0].clone());
            }
            var8 = var5[0].field_j[0];
            var19[2][var8] = 16777215;
            var19[1][var8] = 2394342;
            var19[3][var8] = 4767999;
            for (var9 = 0; -4 < (var9 ^ -1); var9++) {
                var14 = var6[var9];
                wj[] var10 = var14;
                for (var11_int = 0; var11_int < var14.length; var11_int++) {
                    var14[var11_int] = ol.a(var19[var11_int], 120, var5[var9]);
                }
            }
            var9 = var17.field_u;
            hd.a(false);
            var17.a();
            kh.e(0, 0, kh.field_l, kh.field_d);
            var15 = new dl(var9, var9);
            var18 = var15;
            var18.a();
            var17.c(0, 0);
            var11 = new dl(var9, var9);
            var11.a();
            var17.c(-var17.field_l + var9, 0);
            var12 = new dl(var17.field_l + -(2 * var9), var9);
            var12.a();
            var17.c(-var9, 0);
            lg.a(1);
            sb.field_B = new dl[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "e.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    e(String param0) {
        this.field_c = false;
        this.field_d = false;
        try {
            this.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "e.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(int param0) {
        if (param0 <= 118) {
            field_b = (String) null;
        }
        return this.field_e;
    }

    static {
        field_a = "Key";
        field_b = "Log in";
    }
}
