/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    static int field_c;
    static double[] field_d;
    private ei field_a;
    private q field_b;
    static String field_e;

    final q a(byte param0) {
        q var2 = ((re) this).field_a.field_b.field_e;
        if (param0 < 21) {
            field_d = null;
        }
        if (((re) this).field_a.field_b == var2) {
            ((re) this).field_b = null;
            return null;
        }
        ((re) this).field_b = var2.field_e;
        return var2;
    }

    final q a(int param0, q param1) {
        q var3 = null;
        if (param1 == null) {
            var3 = ((re) this).field_a.field_b.field_e;
        } else {
            var3 = param1;
        }
        if (param0 != 13771) {
            q discarded$0 = ((re) this).a(-112);
        }
        if (((re) this).field_a.field_b == var3) {
            ((re) this).field_b = null;
            return null;
        }
        ((re) this).field_b = var3.field_e;
        return var3;
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var6 = 0;
        int var4 = Torquing.field_u;
        if (!(ci.field_c == param2)) {
            q.field_b = new int[param2];
            for (var3 = 0; var3 < param2; var3++) {
                q.field_b[var3] = (var3 << -1208155796) / param2;
            }
            ci.field_c = param2;
            jh.field_A = param2 - 1;
            ff.field_b = param2 * 32;
        }
        if (param0 == um.field_o) {
        } else {
            if (ci.field_c == param0) {
                dp.field_a = q.field_b;
            } else {
                dp.field_a = new int[param0];
                var6 = 0;
                var3 = var6;
                while (var6 < param0) {
                    dp.field_a[var6] = (var6 << 8676588) / param0;
                    var6++;
                }
            }
            um.field_o = param0;
            vp.field_I = param0 + -1;
        }
        if (param1 != 0) {
            Object var5 = null;
            re.a((la) null, false, (la) null, (la) null);
        }
    }

    final static void a(la param0, boolean param1, la param2, la param3) {
        int var8 = 0;
        int var9 = 0;
        sm[] var14 = null;
        int var11_int = 0;
        int var13 = Torquing.field_u;
        hh.field_b = pb.a("frame_top", -1, "commonui", param3);
        vf.field_i = pb.a("frame_bottom", -1, "commonui", param3);
        rp.field_h = mn.a(param3, "commonui", "jagex_logo_grey", 114);
        dg.field_g = pb.a("button", -1, "commonui", param3);
        wj.field_h = jb.a(0, param3, "validation", "commonui");
        sp.field_R = (uc) (Object) dc.a("commonui", param3, param0, !param1 ? true : false, "arezzo12");
        dg.field_e = (uc) (Object) dc.a("commonui", param3, param0, false, "arezzo14");
        pe.field_E = (uc) (Object) dc.a("commonui", param3, param0, !param1 ? true : false, "arezzo14bold");
        if (!param1) {
            field_c = 47;
        }
        t var17 = new t(param2.a(-126, "", "button.gif"), (java.awt.Component) (Object) k.field_d);
        sm discarded$0 = md.a("dropdown", 31094, param3, "commonui");
        sm[] var5 = ip.a(param3, -126, "commonui", "screen_options");
        jn.field_c = new sm[4];
        s.field_s = new sm[4];
        ni.field_l = new sm[4];
        sm[][] var6 = new sm[][]{ni.field_l, s.field_s, jn.field_c};
        int[][] var21 = new int[4][];
        int[][] var20 = var21;
        int[][] var19 = var20;
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].field_k;
        for (var8 = 1; var21.length > var8; var8++) {
            var7[var8] = (int[]) var21[0].clone();
        }
        var8 = var5[0].field_l[0];
        var21[2][var8] = 16777215;
        var21[1][var8] = 2394342;
        var21[3][var8] = 4767999;
        for (var9 = 0; (var9 ^ -1) > -4; var9++) {
            var14 = var6[var9];
            sm[] var10 = var14;
            for (var11_int = 0; var11_int < var14.length; var11_int++) {
                var14[var11_int] = jj.a(var5[var9], var21[var11_int], 0);
            }
        }
        var9 = var17.field_t;
        bp.a((byte) -95);
        var17.e();
        ph.e(0, 0, ph.field_j, ph.field_d);
        t var15 = new t(var9, var9);
        t var18 = var15;
        var18.e();
        var17.b(0, 0);
        t var11 = new t(var9, var9);
        var11.e();
        var17.b(-var17.field_s + var9, 0);
        t var12 = new t(var17.field_s + -(var9 * 2), var9);
        var12.e();
        var17.b(-var9, 0);
        r.a(125);
        dg.field_g = new t[]{var15, var12, var11};
    }

    final q a(boolean param0) {
        if (!param0) {
            return null;
        }
        q var2 = ((re) this).field_b;
        if (!(((re) this).field_a.field_b != var2)) {
            ((re) this).field_b = null;
            return null;
        }
        ((re) this).field_b = var2.field_h;
        return var2;
    }

    final q a(int param0) {
        q var2 = ((re) this).field_a.field_b.field_h;
        if (((re) this).field_a.field_b == var2) {
            ((re) this).field_b = null;
            return null;
        }
        if (param0 != 17514) {
            q discarded$0 = ((re) this).a((byte) 73);
        }
        ((re) this).field_b = var2.field_h;
        return var2;
    }

    public static void b(int param0) {
        field_d = null;
        if (param0 != 21007) {
            return;
        }
        field_e = null;
    }

    final q b(boolean param0) {
        q var2 = ((re) this).field_b;
        if (!(((re) this).field_a.field_b != var2)) {
            ((re) this).field_b = null;
            return null;
        }
        ((re) this).field_b = var2.field_e;
        if (!param0) {
            q discarded$0 = ((re) this).a(true);
        }
        return var2;
    }

    final q a(q param0, int param1) {
        q var3 = null;
        if (param0 != null) {
            var3 = param0;
        } else {
            var3 = ((re) this).field_a.field_b.field_h;
        }
        if (((re) this).field_a.field_b == var3) {
            ((re) this).field_b = null;
            return null;
        }
        ((re) this).field_b = var3.field_h;
        if (param1 != -27392) {
            re.a(7, 38, 13);
        }
        return var3;
    }

    re(ei param0) {
        ((re) this).field_a = param0;
    }

    final static int a(int param0, int param1) {
        param1 = ((param1 & -1431655766) >>> 1443786401) + (1431655765 & param1);
        param1 = (-1288490189 & param1 >>> -1362635710) + (858993459 & param1);
        param1 = (param1 >>> -1641394460) + param1 & param0;
        param1 = param1 + (param1 >>> 1690680488);
        param1 = param1 + (param1 >>> 190668816);
        return param1 & 255;
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        if (param1) {
            ph.b(0, 0, ph.field_j, ph.field_d, 0, 192);
        } else {
            ph.b();
        }
        jm.a(param1, -127);
        if (!param0) {
            field_d = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_d = new double[]{0.0, 80.0, 0.0};
    }
}
