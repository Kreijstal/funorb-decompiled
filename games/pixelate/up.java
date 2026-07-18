/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class up {
    static String field_o;
    static int[] field_e;
    private tf field_l;
    static int[] field_f;
    static int[] field_k;
    private int field_b;
    static int[] field_p;
    private int field_m;
    static int[] field_c;
    static String field_q;
    static dd[] field_d;
    static int[] field_i;
    static pj[] field_n;
    static int[] field_h;
    static um field_g;
    static String[] field_a;
    static int field_j;

    public static void a(byte param0) {
        field_h = null;
        field_a = null;
        field_g = null;
        field_d = null;
        field_c = null;
        if (param0 < 59) {
            up.a((byte) 127);
        }
        field_e = null;
        field_i = null;
        field_k = null;
        field_f = null;
        field_q = null;
        field_p = null;
        field_o = null;
        field_n = null;
    }

    final void a(boolean param0, int param1) {
        if (!param0) {
            ((up) this).field_b = ((up) this).field_b - 20;
        } else {
            ((up) this).field_b = ((up) this).field_b + 20;
        }
        if (((up) this).field_b < 0) {
            ((up) this).field_b = 0;
        }
        if (param1 != 20) {
            ((up) this).c(-100);
        }
        if (!(((up) this).field_b <= 255)) {
            ((up) this).field_b = 255;
        }
    }

    final void c(int param0) {
        ((up) this).field_b = 0;
        if (param0 > -90) {
            field_k = null;
        }
    }

    final void a(int param0) {
        int var3 = 0;
        if (!(((up) this).field_b != 0)) {
            return;
        }
        if (param0 != -25330) {
            ((up) this).a(false, 110);
        }
        if (null == ((up) this).field_l) {
            this.b(16);
        }
        int var2 = (-((up) this).field_b + 255) / 10;
        ((up) this).field_l.a(-var2 + 80, 180, ((up) this).field_b);
        if (uo.field_j <= 0) {
            if (!(10 > ((up) this).field_m)) {
                var3 = 3 * ((up) this).field_b >> 2;
                hd.field_w.a(-var2 + 96, 196, var3);
                hd.field_w.b(-var2 + 96, 196, var3);
            }
        }
    }

    private final void b(int param0) {
        int var7 = 0;
        int var8 = 0;
        int var9 = Pixelate.field_H ? 1 : 0;
        hh var10 = lk.field_o[((up) this).field_m];
        hh var11 = var10;
        jj var3 = rj.field_C[gd.field_e[((up) this).field_m].field_a];
        ((up) this).field_l = new tf(160, 160);
        ((up) this).field_l.c();
        int var4 = 16 * (5 - var11.field_f);
        int var5 = (-var11.field_a + 5) * 16;
        boolean[] var6 = ad.a(var11, 21922);
        for (var7 = 0; var7 < var11.field_a; var7++) {
            for (var8 = 0; var8 < var11.field_f; var8++) {
                var3.field_k[!var6[var7 * var10.field_f + var8] ? 0 : 1].f(var8 * 32 + var4, 32 * var7 + var5);
            }
        }
        qa.field_f.a(19692);
    }

    up(int param0) {
        ((up) this).field_b = 0;
        ((up) this).field_m = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_q = "Play the game without logging in just yet";
        field_i = new int[10];
        field_k = new int[10];
        field_d = new dd[10];
        field_f = new int[10];
        field_e = new int[10];
        field_p = new int[10];
        field_c = new int[10];
        field_c[0] = 0;
        field_k[0] = 10;
        field_f[0] = 10;
        field_p[0] = of.a(0.8, 65536);
        field_e[0] = 30;
        field_i[0] = 25;
        field_c[1] = 2;
        field_k[1] = 10;
        field_f[1] = 10;
        field_p[1] = of.a(0.8, 65536);
        field_e[1] = 30;
        field_i[1] = 25;
        field_c[2] = 0;
        field_k[2] = 10;
        field_f[2] = 10;
        field_p[2] = of.a(0.8, 65536);
        field_e[2] = 25;
        field_c[3] = 8;
        field_i[2] = 30;
        field_k[3] = 10;
        field_f[3] = 10;
        field_p[3] = of.a(0.85, 65536);
        field_e[3] = 25;
        field_i[3] = 35;
        field_c[4] = 1;
        field_k[4] = 5;
        field_f[4] = 10;
        field_p[4] = of.a(0.85, 65536);
        field_e[4] = 20;
        field_i[4] = 40;
        field_c[5] = 12;
        field_k[5] = 5;
        field_f[5] = 10;
        field_p[5] = of.a(0.9, 65536);
        field_e[5] = 20;
        field_c[6] = 1;
        field_i[5] = 40;
        field_k[6] = 100;
        field_f[6] = 5;
        field_p[6] = of.a(8.0, 65536);
        field_e[6] = 30;
        field_i[6] = 45;
        field_c[7] = 4;
        field_k[7] = 5;
        field_f[7] = 10;
        field_p[7] = of.a(1.0, 65536);
        field_e[7] = 25;
        field_i[7] = 50;
        field_c[8] = 9;
        field_k[8] = 5;
        field_f[8] = 5;
        field_p[8] = of.a(1.0, 65536);
        field_e[8] = 25;
        field_c[9] = 0;
        field_i[8] = 50;
        field_k[9] = 120;
        field_f[9] = 5;
        field_p[9] = of.a(8.0, 65536);
        field_e[9] = 25;
        field_i[9] = 50;
        field_n = new pj[25];
        for (var0 = 0; var0 < field_n.length; var0++) {
            field_n[var0] = new pj();
        }
        field_j = 0;
        field_a = new String[]{"It's a falling block game - with a twist! Each coloured piece falls onto the grid, <col=FF9900>changing the colour</col> of four cells where it lands.", "Fill the whole grid with coloured tiles and try to create the <col=FF9900>target picture</col> as fast as you can."};
    }
}
