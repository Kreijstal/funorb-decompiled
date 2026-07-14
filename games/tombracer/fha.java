/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fha {
    static String[] field_a;

    public static void a(byte param0) {
        field_a = null;
        int var1 = -23 % ((param0 - 77) / 44);
    }

    final static void a(boolean param0, cn param1, cn param2, cn param3) {
        int var8 = 0;
        int var9 = 0;
        hja[] var14 = null;
        int var11_int = 0;
        int var13 = TombRacer.field_G ? 1 : 0;
        uca.field_f = uka.a(param2, "commonui", 5, "frame_top");
        if (!param0) {
            return;
        }
        fua.field_f = uka.a(param2, "commonui", 5, "frame_bottom");
        bg.field_s = nia.a(param2, "commonui", "jagex_logo_grey", -101);
        nga.field_n = uka.a(param2, "commonui", 5, "button");
        pq.field_b = hr.a("validation", param2, "commonui", -57);
        eka.field_o = (il) (Object) oo.a(param2, param1, false, "commonui", "arezzo12");
        mj.field_J = (il) (Object) oo.a(param2, param1, false, "commonui", "arezzo14");
        ft.field_c = (il) (Object) oo.a(param2, param1, false, "commonui", "arezzo14bold");
        iu var17 = new iu(param3.a("button.gif", (byte) 118, ""), (java.awt.Component) (Object) nma.field_l);
        hja discarded$0 = uv.a("dropdown", param2, "commonui", 8864);
        hja[] var5 = tw.a((byte) 127, "screen_options", "commonui", param2);
        ita.field_e = new hja[4];
        rra.field_a = new hja[4];
        ie.field_f = new hja[4];
        hja[][] var6 = new hja[][]{ie.field_f, rra.field_a, ita.field_e};
        int[][] var21 = new int[4][];
        int[][] var20 = var21;
        int[][] var19 = var20;
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].field_g;
        for (var8 = 1; var21.length > var8; var8++) {
            var7[var8] = (int[]) var21[0].clone();
        }
        var8 = var5[0].field_h[0];
        var21[2][var8] = 16777215;
        var21[1][var8] = 2394342;
        var21[3][var8] = 4767999;
        for (var9 = 0; var9 < 3; var9++) {
            var14 = var6[var9];
            hja[] var10 = var14;
            for (var11_int = 0; var11_int < var14.length; var11_int++) {
                var14[var11_int] = kua.a(21938, var21[var11_int], var5[var9]);
            }
        }
        var9 = var17.field_q;
        gb.a(-29711);
        var17.c();
        bea.a(0, 0, bea.field_g, bea.field_a);
        iu var15 = new iu(var9, var9);
        iu var18 = var15;
        var18.c();
        var17.d(0, 0);
        iu var11 = new iu(var9, var9);
        var11.c();
        var17.d(var9 + -var17.field_m, 0);
        iu var12 = new iu(var17.field_m - var9 * 2, var9);
        var12.c();
        var17.d(-var9, 0);
        pfa.a(1);
        nga.field_n = new iu[]{var15, var12, var11};
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
