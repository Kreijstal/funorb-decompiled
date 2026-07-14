/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    static int field_b;
    private boolean field_a;
    static String field_e;
    private boolean field_d;
    private String field_c;

    final static void a(bj param0, bj param1, byte param2, bj param3) {
        int var8 = 0;
        int var9 = 0;
        ln[] var14 = null;
        int var11_int = 0;
        int var13 = MinerDisturbance.field_ab;
        vk.field_e = td.a("frame_top", param0, "commonui", (byte) 126);
        v.field_d = td.a("frame_bottom", param0, "commonui", (byte) 118);
        fh.field_a = jn.a("jagex_logo_grey", param2 + -29571, "commonui", param0);
        r.field_a = td.a("button", param0, "commonui", (byte) 109);
        ed.field_g = md.a("validation", param0, 10, "commonui");
        sl.field_q = (we) (Object) oc.a(param3, (byte) 125, "commonui", "arezzo12", param0);
        bn.field_d = (we) (Object) oc.a(param3, (byte) 125, "commonui", "arezzo14", param0);
        cn.field_g = (we) (Object) oc.a(param3, (byte) 125, "commonui", "arezzo14bold", param0);
        ea var17 = new ea(param1.a("", param2 ^ 18, "button.gif"), (java.awt.Component) (Object) ef.field_c);
        ln discarded$0 = pb.a("commonui", param0, "dropdown", (byte) -77);
        ln[] var5 = tb.a("screen_options", "commonui", param0, 1);
        kn.field_F = new ln[4];
        kc.field_f = new ln[4];
        qe.field_c = new ln[4];
        ln[][] var6 = new ln[][]{kn.field_F, kc.field_f, qe.field_c};
        int[][] var21 = new int[4][];
        int[][] var20 = var21;
        int[][] var19 = var20;
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].field_n;
        for (var8 = 1; var8 < var21.length; var8++) {
            var7[var8] = (int[]) var21[0].clone();
        }
        var8 = var5[0].field_m[0];
        var21[2][var8] = 16777215;
        var21[1][var8] = 2394342;
        var21[3][var8] = 4767999;
        for (var9 = 0; 3 > var9; var9++) {
            var14 = var6[var9];
            ln[] var10 = var14;
            for (var11_int = 0; var14.length > var11_int; var11_int++) {
                var14[var11_int] = ci.a(var5[var9], (byte) -114, var21[var11_int]);
            }
        }
        var9 = var17.field_C;
        ti.a((byte) -15);
        var17.g();
        eh.b(0, 0, eh.field_g, eh.field_c);
        ea var15 = new ea(var9, var9);
        ea var18 = var15;
        var18.g();
        var17.g(0, 0);
        ea var11 = new ea(var9, var9);
        var11.g();
        var17.g(-var17.field_y + var9, 0);
        ea var12 = new ea(-(var9 * 2) + var17.field_y, var9);
        var12.g();
        var17.g(-var9, 0);
        tk.b(true);
        if (param2 != 18) {
            return;
        }
        r.field_a = new ea[]{var15, var12, var11};
    }

    public static void a(byte param0) {
        if (param0 >= -42) {
            field_e = null;
        }
        field_e = null;
    }

    final boolean a(int param0) {
        if (param0 != 0) {
            return false;
        }
        return ((jf) this).field_d;
    }

    final String a(boolean param0) {
        if (param0) {
            return null;
        }
        return ((jf) this).field_c;
    }

    final void a(boolean param0, boolean param1) {
        if (param0) {
            boolean discarded$0 = ((jf) this).a(-52);
        }
        ((jf) this).field_d = true;
        ((jf) this).field_a = param1 ? true : false;
    }

    final static int b(byte param0) {
        int var1 = 0;
        int var2 = MinerDisturbance.field_ab;
        if (param0 <= 48) {
            return -28;
        }
        for (var1 = 0; (var1 ^ -1) > -1001; var1++) {
            if (uf.field_p[var1] == null) {
                return var1;
            }
        }
        return 0;
    }

    jf(String param0) {
        ((jf) this).field_a = false;
        ((jf) this).field_d = false;
        ((jf) this).field_c = param0;
    }

    final boolean b(int param0) {
        if (param0 >= -98) {
            field_b = 65;
        }
        return ((jf) this).field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Prev";
    }
}
