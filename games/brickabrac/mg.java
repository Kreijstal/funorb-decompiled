/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    private static int[] field_h;
    static int field_d;
    private static int[] field_c;
    static int field_a;
    static int[] field_g;
    static int field_e;
    static int field_b;
    private static int[] field_i;
    static int[] field_f;

    private final static void a() {
        field_d = field_e / 2;
        field_a = field_b / 2;
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_e = param2 - param0;
        field_b = param3 - param1;
        mg.a();
        if (field_g.length < field_b) {
            field_g = new int[fj.a(field_b, (byte) 108)];
        }
        int var4 = param1 * lb.field_c + param0;
        for (var5 = 0; var5 < field_b; var5++) {
            field_g[var5] = var4;
            var4 = var4 + lb.field_c;
        }
    }

    final static void c() {
        mg.a(lb.field_i, lb.field_b, lb.field_f, lb.field_j);
    }

    public static void b() {
        field_g = null;
        field_i = null;
        field_h = null;
        field_f = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_h = new int[2048];
        field_g = new int[1024];
        field_i = new int[512];
        field_c = new int[2048];
        field_f = new int[2048];
        for (var0 = 1; var0 < 512; var0++) {
            field_i[var0] = 32768 / var0;
        }
        for (var0 = 1; var0 < 2048; var0++) {
            field_h[var0] = 65536 / var0;
        }
        for (var0 = 0; var0 < 2048; var0++) {
            field_f[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
            field_c[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
        }
    }
}
