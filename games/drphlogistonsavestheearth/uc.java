/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static int[] field_b;
    static int field_h;
    private static int[] field_d;
    private static int[] field_e;
    static int field_c;
    static int[] field_g;
    static int field_f;
    static int field_i;
    private static int[] field_a;

    private final static void a() {
        field_i = field_f / 2;
        field_c = field_h / 2;
    }

    public static void c() {
        field_g = null;
        field_e = null;
        field_a = null;
        field_b = null;
        field_d = null;
    }

    final static void b() {
        uc.a(wj.field_g, wj.field_e, wj.field_b, wj.field_j);
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_f = param2 - param0;
        field_h = param3 - param1;
        uc.a();
        if (field_g.length < field_h) {
            field_g = new int[lg.a(2, field_h)];
        }
        int var4 = param1 * wj.field_k + param0;
        for (var5 = 0; var5 < field_h; var5++) {
            field_g[var5] = var4;
            var4 = var4 + wj.field_k;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_d = new int[2048];
        field_e = new int[512];
        field_a = new int[2048];
        field_b = new int[2048];
        field_g = new int[1024];
        for (var0 = 1; var0 < 512; var0++) {
            field_e[var0] = 32768 / var0;
        }
        for (var0 = 1; var0 < 2048; var0++) {
            field_a[var0] = 65536 / var0;
        }
        for (var0 = 0; var0 < 2048; var0++) {
            field_b[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
            field_d[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
        }
    }
}
