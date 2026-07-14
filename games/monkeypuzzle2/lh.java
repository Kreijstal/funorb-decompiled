/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    static String field_a;
    static am field_c;
    static int field_b;
    static boolean field_e;
    static String[] field_d;

    final static void a(ad param0, ad param1, ad param2, int param3) {
        int var8 = 0;
        int var9 = 0;
        ai[] var15 = null;
        int var11_int = 0;
        int var14 = MonkeyPuzzle2.field_F ? 1 : 0;
        pe.field_a = lb.a(false, "commonui", param1, "frame_top");
        ra.field_Z = lb.a(false, "commonui", param1, "frame_bottom");
        af.field_e = ma.a(param1, "jagex_logo_grey", 16711680, "commonui");
        qj.field_C = lb.a(false, "commonui", param1, "button");
        hk.field_i = rd.a("validation", param1, 0, "commonui");
        pf.field_c = (ta) (Object) cb.a("commonui", param0, -103, param1, "arezzo12");
        t.field_z = (ta) (Object) cb.a("commonui", param0, -99, param1, "arezzo14");
        pj.field_c = (ta) (Object) cb.a("commonui", param0, -75, param1, "arezzo14bold");
        le var18 = new le(param2.a("", "button.gif", -128), (java.awt.Component) (Object) ie.field_e);
        ai discarded$0 = df.a("commonui", param1, (byte) 118, "dropdown");
        ai[] var5 = uj.a("commonui", "screen_options", param1, false);
        vj.field_d = new ai[4];
        oa.field_D = new ai[4];
        tf.field_a = new ai[4];
        ai[][] var6 = new ai[][]{vj.field_d, tf.field_a, oa.field_D};
        int[][] var22 = new int[4][];
        int[][] var21 = var22;
        int[][] var20 = var21;
        int[][] var17 = var20;
        int[][] var7 = var17;
        var7[0] = var5[0].field_m;
        for (var8 = 1; var8 < var22.length; var8++) {
            var7[var8] = (int[]) var22[0].clone();
        }
        var8 = var5[0].field_n[0];
        var22[2][var8] = 16777215;
        var22[1][var8] = 2394342;
        var22[3][var8] = 4767999;
        for (var9 = 0; 3 > var9; var9++) {
            var15 = var6[var9];
            ai[] var10 = var15;
            for (var11_int = 0; var11_int < var15.length; var11_int++) {
                var15[var11_int] = ri.a(var5[var9], true, var22[var11_int]);
            }
        }
        var9 = var18.field_j;
        vf.a((byte) 34);
        var18.e();
        ge.g(0, 0, ge.field_h, ge.field_g);
        le var16 = new le(var9, var9);
        le var19 = var16;
        var19.e();
        var18.a(0, 0);
        int var12 = 16 % ((param3 - 39) / 53);
        le var11 = new le(var9, var9);
        var11.e();
        var18.a(-var18.field_k + var9, 0);
        le var13 = new le(-(var9 * 2) + var18.field_k, var9);
        var13.e();
        var18.a(-var9, 0);
        tj.b(653);
        qj.field_C = new le[]{var16, var13, var11};
    }

    final static cj a(boolean param0, String param1, int param2) {
        cj var3 = new cj(false);
        var3.field_i = param2;
        var3.field_h = param1;
        if (!param0) {
            field_e = false;
        }
        return var3;
    }

    final static String a(byte param0) {
        if (param0 > -93) {
            field_b = 46;
        }
        return MonkeyPuzzle2.field_D.f(-1);
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_c = null;
        }
        field_c = null;
        field_a = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Discard";
        field_c = new am();
        field_d = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
