/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class en {
    static int field_g;
    static int[] field_e;
    static int field_a;
    static int field_i;
    private static int[] field_f;
    private static int[] field_h;
    static int[] field_b;
    private static int[] field_c;
    static int field_d;

    private final static void b() {
        field_a = field_g / 2;
        field_i = field_d / 2;
    }

    public static void a() {
        field_b = null;
        field_h = null;
        field_f = null;
        field_e = null;
        field_c = null;
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_g = param2 - param0;
        field_d = param3 - param1;
        en.b();
        if (field_b.length < field_d) {
            field_b = new int[cg.a(-922314526, field_d)];
        }
        int var4 = param1 * bi.field_f + param0;
        for (var5 = 0; var5 < field_d; var5++) {
            field_b[var5] = var4;
            var4 = var4 + bi.field_f;
        }
    }

    final static void c() {
        en.a(bi.field_g, bi.field_l, bi.field_b, bi.field_d);
    }

    static {
        int var0 = 0;
        field_h = new int[512];
        field_f = new int[2048];
        field_c = new int[2048];
        field_b = new int[1024];
        field_e = new int[2048];
        for (var0 = 1; var0 < 512; var0++) {
            field_h[var0] = 32768 / var0;
        }
        for (var0 = 1; var0 < 2048; var0++) {
            field_f[var0] = 65536 / var0;
        }
        for (var0 = 0; var0 < 2048; var0++) {
            field_e[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
            field_c[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
        }
    }
}
