/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn {
    static int field_c;
    static int field_a;
    static int[] field_h;
    private static int[] field_d;
    private static int[] field_g;
    static int field_i;
    static int field_e;
    private static int[] field_b;
    private static int[] field_f;

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_c = param2 - param0;
        field_e = param3 - param1;
        wn.a();
        if (field_h.length < field_e) {
            field_h = new int[js.a(field_e, (byte) 122)];
        }
        int var4 = param1 * gf.field_b + param0;
        for (var5 = 0; var5 < field_e; var5++) {
            field_h[var5] = var4;
            var4 = var4 + gf.field_b;
        }
    }

    final static void c() {
        wn.a(gf.field_i, gf.field_a, gf.field_l, gf.field_f);
    }

    public static void b() {
        field_h = null;
        field_d = null;
        field_b = null;
        field_g = null;
        field_f = null;
    }

    private final static void a() {
        field_i = field_c / 2;
        field_a = field_e / 2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_h = new int[1024];
        field_d = new int[512];
        field_g = new int[2048];
        field_b = new int[2048];
        field_f = new int[2048];
        for (var0 = 1; var0 < 512; var0++) {
            field_d[var0] = 32768 / var0;
        }
        for (var0 = 1; var0 < 2048; var0++) {
            field_b[var0] = 65536 / var0;
        }
        for (var0 = 0; var0 < 2048; var0++) {
            field_g[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
            field_f[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
        }
    }
}
