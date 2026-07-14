/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl {
    static int field_a;
    private static int[] field_d;
    static int field_f;
    static int[] field_b;
    private static int[] field_e;
    static int field_c;
    private static int[] field_h;
    static int field_i;
    static int[] field_g;

    final static void b() {
        bl.a(gb.field_l, gb.field_b, gb.field_h, gb.field_i);
    }

    public static void c() {
        field_b = null;
        field_h = null;
        field_e = null;
        field_g = null;
        field_d = null;
    }

    private final static void a() {
        field_c = field_f / 2;
        field_a = field_i / 2;
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_f = param2 - param0;
        field_i = param3 - param1;
        bl.a();
        if (field_b.length < field_i) {
            field_b = new int[bf.a(true, field_i)];
        }
        int var4 = param1 * gb.field_d + param0;
        for (var5 = 0; var5 < field_i; var5++) {
            field_b[var5] = var4;
            var4 = var4 + gb.field_d;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_h = new int[512];
        field_e = new int[2048];
        field_d = new int[2048];
        field_b = new int[1024];
        field_g = new int[2048];
        for (var0 = 1; var0 < 512; var0++) {
            field_h[var0] = 32768 / var0;
        }
        for (var0 = 1; var0 < 2048; var0++) {
            field_e[var0] = 65536 / var0;
        }
        for (var0 = 0; var0 < 2048; var0++) {
            field_g[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
            field_d[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
        }
    }
}
