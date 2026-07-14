/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge {
    static int[] field_e;
    static int[] field_d;
    private static int[] field_i;
    static int field_f;
    static int field_b;
    static int field_h;
    private static int[] field_g;
    private static int[] field_a;
    static int field_c;

    final static void b() {
        ge.a(si.field_b, si.field_j, si.field_l, si.field_a);
    }

    public static void c() {
        field_e = null;
        field_g = null;
        field_i = null;
        field_d = null;
        field_a = null;
    }

    private final static void a() {
        field_c = field_h / 2;
        field_b = field_f / 2;
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_h = param2 - param0;
        field_f = param3 - param1;
        ge.a();
        if (field_e.length < field_f) {
            field_e = new int[qa.a(field_f, -1)];
        }
        int var4 = param1 * si.field_e + param0;
        for (var5 = 0; var5 < field_f; var5++) {
            field_e[var5] = var4;
            var4 = var4 + si.field_e;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_d = new int[2048];
        field_e = new int[1024];
        field_g = new int[512];
        field_a = new int[2048];
        field_i = new int[2048];
        for (var0 = 1; var0 < 512; var0++) {
            field_g[var0] = 32768 / var0;
        }
        for (var0 = 1; var0 < 2048; var0++) {
            field_i[var0] = 65536 / var0;
        }
        for (var0 = 0; var0 < 2048; var0++) {
            field_d[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
            field_a[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
        }
    }
}
