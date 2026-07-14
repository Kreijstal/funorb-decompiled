/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ha {
    static int field_g;
    int field_e;
    int field_b;
    int field_a;
    int field_c;
    int field_d;
    int field_f;

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, int param1);

    private final static na a(int param0, int[] param1, na param2) {
        na var3 = new na(0, 0, 0);
        var3.field_a = param2.field_a;
        var3.field_e = param2.field_e;
        var3.field_d = param2.field_d;
        if (param0 >= -62) {
            return null;
        }
        var3.field_c = param2.field_c;
        var3.field_h = param1;
        var3.field_i = param2.field_i;
        var3.field_f = param2.field_f;
        var3.field_b = param2.field_b;
        return var3;
    }

    final static void a(byte param0, rh param1, rh param2, rh param3) {
        int var8 = 0;
        int var9 = 0;
        na[] var15 = null;
        int var11_int = 0;
        int var13 = Geoblox.field_C;
        id.field_c = wj.a("frame_top", "commonui", param2, 0);
        fh.field_e = wj.a("frame_bottom", "commonui", param2, 0);
        jc.field_a = ug.a("jagex_logo_grey", param2, (byte) -78, "commonui");
        vk.field_e = wj.a("button", "commonui", param2, 0);
        oa.field_e = oi.a((byte) -39, "validation", "commonui", param2);
        hh.field_d = (m) (Object) q.a(param3, 1, "arezzo12", "commonui", param2);
        ng.field_F = (m) (Object) q.a(param3, 1, "arezzo14", "commonui", param2);
        hh.field_c = (m) (Object) q.a(param3, 1, "arezzo14bold", "commonui", param2);
        dm var18 = new dm(param1.a(0, "", "button.gif"), (java.awt.Component) (Object) f.field_kb);
        na discarded$0 = jg.a(param2, 1, "commonui", "dropdown");
        na[] var5 = ka.a("commonui", "screen_options", true, param2);
        ek.field_a = new na[4];
        sb.field_e = new na[4];
        lj.field_c = new na[4];
        na[][] var6 = new na[][]{ek.field_a, sb.field_e, lj.field_c};
        int[][] var22 = new int[4][];
        int[][] var21 = var22;
        int[][] var20 = var21;
        int[][] var17 = var20;
        int[][] var7 = var17;
        var7[0] = var5[0].field_h;
        for (var8 = 1; var22.length > var8; var8++) {
            var7[var8] = (int[]) var22[0].clone();
        }
        var8 = var5[0].field_i[0];
        var22[2][var8] = 16777215;
        var22[1][var8] = 2394342;
        var22[3][var8] = 4767999;
        for (var9 = 0; -4 < (var9 ^ -1); var9++) {
            var15 = var6[var9];
            na[] var10 = var15;
            for (var11_int = 0; var11_int < var15.length; var11_int++) {
                var15[var11_int] = ha.a(-84, var22[var11_int], var5[var9]);
            }
        }
        var9 = var18.field_m;
        oc.b(-105);
        if (param0 <= 98) {
            Object var14 = null;
            na discarded$1 = ha.a(72, (int[]) null, (na) null);
        }
        var18.e();
        vb.a(0, 0, vb.field_f, vb.field_b);
        dm var16 = new dm(var9, var9);
        dm var19 = var16;
        var19.e();
        var18.c(0, 0);
        dm var11 = new dm(var9, var9);
        var11.e();
        var18.c(var9 + -var18.field_r, 0);
        dm var12 = new dm(var18.field_r + -(2 * var9), var9);
        var12.e();
        var18.c(-var9, 0);
        id.a(true);
        vk.field_e = new dm[]{var16, var12, var11};
    }

    final static int a(int param0) {
        int var1 = 77 / ((param0 - -17) / 52);
        return nk.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
    }
}
