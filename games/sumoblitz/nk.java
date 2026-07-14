/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    static int field_c;
    static int field_e;
    private static int[] field_f;
    static int field_i;
    private static int[] field_g;
    private static int[] field_h;
    private static int[] field_a;
    static int field_b;
    static int[] field_d;

    public static void c() {
        field_d = null;
        field_f = null;
        field_g = null;
        field_h = null;
        field_a = null;
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_i = param2 - param0;
        field_c = param3 - param1;
        nk.a();
        if (field_d.length < field_c) {
            field_d = new int[hn.a(false, field_c)];
        }
        int var4 = param1 * lk.field_b + param0;
        for (var5 = 0; var5 < field_c; var5++) {
            field_d[var5] = var4;
            var4 = var4 + lk.field_b;
        }
    }

    private final static void a() {
        field_e = field_i / 2;
        field_b = field_c / 2;
    }

    final static void b() {
        nk.a(lk.field_k, lk.field_i, lk.field_j, lk.field_e);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_g = new int[2048];
        field_a = new int[2048];
        field_h = new int[2048];
        field_f = new int[512];
        field_d = new int[1024];
        for (var0 = 1; var0 < 512; var0++) {
            field_f[var0] = 32768 / var0;
        }
        for (var0 = 1; var0 < 2048; var0++) {
            field_g[var0] = 65536 / var0;
        }
        for (var0 = 0; var0 < 2048; var0++) {
            field_h[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
            field_a[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
        }
    }
}
