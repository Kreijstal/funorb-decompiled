/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li {
    static int[] field_a;
    private static int[] field_g;
    static int field_c;
    static int field_i;
    static int field_d;
    static int[] field_e;
    private static int[] field_h;
    static int field_b;
    private static int[] field_f;

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_i = param2 - param0;
        field_d = param3 - param1;
        li.b();
        if (field_a.length < field_d) {
            field_a = new int[mo.a((byte) 7, field_d)];
        }
        int var4 = param1 * tc.field_j + param0;
        for (var5 = 0; var5 < field_d; var5++) {
            field_a[var5] = var4;
            var4 = var4 + tc.field_j;
        }
    }

    final static void c() {
        li.a(tc.field_d, tc.field_a, tc.field_e, tc.field_i);
    }

    public static void a() {
        field_a = null;
        field_h = null;
        field_f = null;
        field_e = null;
        field_g = null;
    }

    private final static void b() {
        field_b = field_i / 2;
        field_c = field_d / 2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_a = new int[1024];
        field_g = new int[2048];
        field_h = new int[512];
        field_f = new int[2048];
        field_e = new int[2048];
        for (var0 = 1; var0 < 512; var0++) {
            field_h[var0] = 32768 / var0;
        }
        for (var0 = 1; var0 < 2048; var0++) {
            field_f[var0] = 65536 / var0;
        }
        for (var0 = 0; var0 < 2048; var0++) {
            field_e[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
            field_g[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
        }
    }
}
