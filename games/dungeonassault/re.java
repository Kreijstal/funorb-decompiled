/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    static int field_h;
    private static int[] field_a;
    static int[] field_f;
    private static int[] field_g;
    static int[] field_e;
    private static int[] field_c;
    static int field_d;
    static int field_i;
    static int field_b;

    public static void c() {
        field_e = null;
        field_g = null;
        field_a = null;
        field_f = null;
        field_c = null;
    }

    final static void b() {
        re.a(gf.field_j, gf.field_f, gf.field_h, gf.field_e);
    }

    private final static void a() {
        field_d = field_b / 2;
        field_h = field_i / 2;
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_b = param2 - param0;
        field_i = param3 - param1;
        re.a();
        if (field_e.length < field_i) {
            field_e = new int[gk.a(-912121912, field_i)];
        }
        int var4 = param1 * gf.field_i + param0;
        for (var5 = 0; var5 < field_i; var5++) {
            field_e[var5] = var4;
            var4 = var4 + gf.field_i;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_a = new int[2048];
        field_f = new int[2048];
        field_e = new int[1024];
        field_c = new int[2048];
        field_g = new int[512];
        for (var0 = 1; var0 < 512; var0++) {
            field_g[var0] = 32768 / var0;
        }
        for (var0 = 1; var0 < 2048; var0++) {
            field_a[var0] = 65536 / var0;
        }
        for (var0 = 0; var0 < 2048; var0++) {
            field_f[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
            field_c[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
        }
    }
}
