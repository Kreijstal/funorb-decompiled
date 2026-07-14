/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca {
    static int field_b;
    static int[] field_c;
    static int field_a;
    static int field_d;

    final static void a(String param0, boolean param1, int param2) {
        ij.field_g = param1 ? true : false;
        r.field_p = true;
        if (param2 != 16777215) {
            qj var4 = (qj) null;
            ca.a((qk) null, (qj) null, -27, -28);
        }
        pc.field_a = new af(sd.field_c, vd.field_p, param0, ei.field_e, ij.field_g);
        sd.field_c.b((lk) (Object) pc.field_a, (byte) -98);
    }

    final static void a(qk param0, qj param1, int param2, int param3) {
        vb.field_b = va.a(22018) * param2 / 1000;
        ch.a(-114, param0);
        kk.a(-16998, param0);
        ab.a(param0, 0);
        pf.d(260);
        ri.a((byte) -124);
        h.field_F = param3 + -vb.field_b;
    }

    final static void a(qk param0, qk param1, qk param2, int param3) {
        int var8 = 0;
        int var9 = 0;
        wb[] var14 = null;
        int var11_int = 0;
        int var13 = Main.field_T;
        se.field_G = gl.a("frame_top", param1, "commonui", -13244);
        rc.field_k = gl.a("frame_bottom", param1, "commonui", param3 + 11944);
        pb.field_k = ce.a(param3 ^ 25118, "jagex_logo_grey", "commonui", param1);
        eg.field_c = gl.a("button", param1, "commonui", -13244);
        gh.field_n = vc.a("validation", "commonui", 0, param1);
        me.field_c = (ee) (Object) ec.a("commonui", param2, false, "arezzo12", param1);
        j.field_C = (ee) (Object) ec.a("commonui", param2, false, "arezzo14", param1);
        vd.field_p = (ee) (Object) ec.a("commonui", param2, false, "arezzo14bold", param1);
        kc var17 = new kc(param0.a((byte) 7, "", "button.gif"), (java.awt.Component) (Object) tb.field_c);
        wb discarded$0 = lh.a("dropdown", param1, "commonui", 105);
        wb[] var5 = lk.a("screen_options", "commonui", (byte) 98, param1);
        ri.field_d = new wb[4];
        fb.field_b = new wb[4];
        nb.field_d = new wb[4];
        wb[][] var6 = new wb[][]{nb.field_d, fb.field_b, ri.field_d};
        int[][] var21 = new int[4][];
        int[][] var20 = var21;
        int[][] var19 = var20;
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].field_j;
        for (var8 = 1; var8 < var21.length; var8++) {
            var7[var8] = (int[]) (int[]) var21[0].clone();
        }
        if (param3 != -25188) {
            field_c = (int[]) null;
        }
        var8 = var5[0].field_i[0];
        var21[2][var8] = 16777215;
        var21[1][var8] = 2394342;
        var21[3][var8] = 4767999;
        for (var9 = 0; -4 < (var9 ^ -1); var9++) {
            var14 = var6[var9];
            wb[] var10 = var14;
            for (var11_int = 0; var14.length > var11_int; var11_int++) {
                var14[var11_int] = a.a(var5[var9], var21[var11_int], -88);
            }
        }
        var9 = ((kc) var17).field_o;
        ji.a(true);
        var17.c();
        vj.e(0, 0, vj.field_l, vj.field_g);
        kc var15 = new kc(var9, var9);
        kc var18 = var15;
        var18.c();
        var17.b(0, 0);
        kc var11 = new kc(var9, var9);
        var11.c();
        var17.b(var9 - ((kc) var17).field_p, 0);
        kc var12 = new kc(-(2 * var9) + ((kc) var17).field_p, var9);
        var12.c();
        var17.b(-var9, 0);
        gg.a(14756);
        eg.field_c = new kc[]{var15, var12, var11};
    }

    final static gk a(boolean param0) {
        if (param0) {
            return (gk) null;
        }
        return (gk) (Object) new ec();
    }

    public static void a(byte param0) {
        if (param0 <= 126) {
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1;
        field_c = new int[16];
    }
}
