/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k {
    private static int[] field_h;
    static int field_g;
    static int field_f;
    static int[] field_e;
    static int field_d;
    private static int[] field_i;
    private static int[] field_c;
    private static int[] field_b;
    static int field_a;

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_f = param2 - param0;
        field_d = param3 - param1;
        k.c();
        if (field_e.length < field_d) {
            field_e = new int[fa.a(-102, field_d)];
        }
        int var4 = param1 * lf.field_f + param0;
        for (var5 = 0; var5 < field_d; var5++) {
            field_e[var5] = var4;
            var4 = var4 + lf.field_f;
        }
    }

    public static void a() {
        field_e = null;
        field_b = null;
        field_i = null;
        field_c = null;
        field_h = null;
    }

    final static void b() {
        k.a(lf.field_g, lf.field_c, lf.field_e, lf.field_h);
    }

    private final static void c() {
        field_g = field_f / 2;
        field_a = field_d / 2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_c = new int[2048];
        field_e = new int[1024];
        field_h = new int[2048];
        field_i = new int[2048];
        field_b = new int[512];
        for (var0 = 1; var0 < 512; var0++) {
            field_b[var0] = 32768 / var0;
        }
        for (var0 = 1; var0 < 2048; var0++) {
            field_i[var0] = 65536 / var0;
        }
        for (var0 = 0; var0 < 2048; var0++) {
            field_c[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
            field_h[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
        }
    }
}
