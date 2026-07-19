/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id {
    static int[] field_f;
    static int field_g;
    private static int[] field_a;
    static int field_b;
    static int field_i;
    private static int[] field_e;
    static int field_d;
    private static int[] field_h;
    static int[] field_c;

    private final static void b() {
        field_i = field_d / 2;
        field_g = field_b / 2;
    }

    public static void c() {
        field_f = null;
        field_e = null;
        field_h = null;
        field_c = null;
        field_a = null;
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_d = param2 - param0;
        field_b = param3 - param1;
        id.b();
        if (field_f.length < field_b) {
            field_f = new int[wh.a(field_b, 678231216)];
        }
        int var4 = param1 * de.field_e + param0;
        for (var5 = 0; var5 < field_b; var5++) {
            field_f[var5] = var4;
            var4 = var4 + de.field_e;
        }
    }

    final static void a() {
        id.a(de.field_i, de.field_c, de.field_h, de.field_k);
    }

    static {
        int var0 = 0;
        field_f = new int[1024];
        field_e = new int[512];
        field_a = new int[2048];
        field_h = new int[2048];
        field_c = new int[2048];
        for (var0 = 1; var0 < 512; var0++) {
            field_e[var0] = 32768 / var0;
        }
        for (var0 = 1; var0 < 2048; var0++) {
            field_h[var0] = 65536 / var0;
        }
        for (var0 = 0; var0 < 2048; var0++) {
            field_c[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
            field_a[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
        }
    }
}
