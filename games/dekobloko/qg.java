/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    private static int[] field_i;
    static int field_g;
    private static int[] field_h;
    static int[] field_f;
    static int field_c;
    static int field_a;
    static int field_e;
    static int[] field_b;
    static int[] field_d;

    private final static void c() {
        field_g = field_a / 2;
        field_c = field_e / 2;
    }

    public static void a() {
        field_d = null;
        field_i = null;
        field_h = null;
        field_f = null;
        field_b = null;
    }

    final static void b() {
        qg.a(hk.field_c, hk.field_h, hk.field_g, hk.field_b);
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_a = param2 - param0;
        field_e = param3 - param1;
        qg.c();
        if (field_d.length < field_e) {
            field_d = new int[oe.b(-10498, field_e)];
        }
        int var4 = param1 * hk.field_j + param0;
        for (var5 = 0; var5 < field_e; var5++) {
            field_d[var5] = var4;
            var4 = var4 + hk.field_j;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_f = new int[2048];
        field_h = new int[2048];
        field_b = new int[2048];
        field_d = new int[1024];
        field_i = new int[512];
        for (var0 = 1; var0 < 512; var0++) {
            field_i[var0] = 32768 / var0;
        }
        for (var0 = 1; var0 < 2048; var0++) {
            field_h[var0] = 65536 / var0;
        }
        for (var0 = 0; var0 < 2048; var0++) {
            field_f[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
            field_b[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
        }
    }
}
