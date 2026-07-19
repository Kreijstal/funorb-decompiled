/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    static int field_d;
    static int field_b;
    private static int[] field_i;
    static int[] field_g;
    private static int[] field_e;
    static int field_c;
    static int[] field_a;
    private static int[] field_h;
    static int field_f;

    private final static void b() {
        field_d = field_b / 2;
        field_c = field_f / 2;
    }

    final static void a() {
        dj.a(eh.field_a, eh.field_d, eh.field_k, eh.field_e);
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_b = param2 - param0;
        field_f = param3 - param1;
        dj.b();
        if (field_a.length < field_f) {
            field_a = new int[ab.a(field_f, 15952)];
        }
        int var4 = param1 * eh.field_g + param0;
        for (var5 = 0; var5 < field_f; var5++) {
            field_a[var5] = var4;
            var4 = var4 + eh.field_g;
        }
    }

    public static void c() {
        field_a = null;
        field_h = null;
        field_e = null;
        field_g = null;
        field_i = null;
    }

    static {
        int var0 = 0;
        field_g = new int[2048];
        field_e = new int[2048];
        field_i = new int[2048];
        field_h = new int[512];
        field_a = new int[1024];
        for (var0 = 1; var0 < 512; var0++) {
            field_h[var0] = 32768 / var0;
        }
        for (var0 = 1; var0 < 2048; var0++) {
            field_e[var0] = 65536 / var0;
        }
        for (var0 = 0; var0 < 2048; var0++) {
            field_g[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
            field_i[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
        }
    }
}
