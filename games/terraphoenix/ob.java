/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob {
    static int field_c;
    static int field_b;
    private static int[] field_f;
    private static int[] field_g;
    private static int[] field_e;
    static int field_h;
    static int field_i;
    static int[] field_d;
    static int[] field_a;

    final static void b() {
        ob.a(l.field_b, l.field_d, l.field_f, l.field_c);
    }

    private final static void c() {
        field_b = field_i / 2;
        field_c = field_h / 2;
    }

    public static void a() {
        field_d = null;
        field_g = null;
        field_f = null;
        field_a = null;
        field_e = null;
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_i = param2 - param0;
        field_h = param3 - param1;
        ob.c();
        if (field_d.length < field_h) {
            field_d = new int[vd.b(field_h, 17603)];
        }
        int var4 = param1 * l.field_k + param0;
        for (var5 = 0; var5 < field_h; var5++) {
            field_d[var5] = var4;
            var4 = var4 + l.field_k;
        }
    }

    static {
        int var0 = 0;
        field_f = new int[2048];
        field_e = new int[2048];
        field_g = new int[512];
        field_d = new int[1024];
        field_a = new int[2048];
        for (var0 = 1; var0 < 512; var0++) {
            field_g[var0] = 32768 / var0;
        }
        for (var0 = 1; var0 < 2048; var0++) {
            field_f[var0] = 65536 / var0;
        }
        for (var0 = 0; var0 < 2048; var0++) {
            field_a[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
            field_e[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
        }
    }
}
