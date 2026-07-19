/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uoa {
    static int field_e;
    static int field_b;
    static int field_g;
    static int[] field_d;
    private static int[] field_h;
    private static int[] field_i;
    static int[] field_c;
    static int[] field_a;
    static int field_f;

    public static void a() {
        field_d = null;
        field_i = null;
        field_h = null;
        field_a = null;
        field_c = null;
    }

    final static void b() {
        uoa.a(bea.field_b, bea.field_h, bea.field_d, bea.field_k);
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_e = param2 - param0;
        field_b = param3 - param1;
        uoa.c();
        if (field_d.length < field_b) {
            field_d = new int[lla.a(false, field_b)];
        }
        int var4 = param1 * bea.field_g + param0;
        for (var5 = 0; var5 < field_b; var5++) {
            field_d[var5] = var4;
            var4 = var4 + bea.field_g;
        }
    }

    private final static void c() {
        field_f = field_e / 2;
        field_g = field_b / 2;
    }

    static {
        int var0 = 0;
        field_d = new int[1024];
        field_h = new int[2048];
        field_i = new int[512];
        field_a = new int[2048];
        field_c = new int[2048];
        for (var0 = 1; var0 < 512; var0++) {
            field_i[var0] = 32768 / var0;
        }
        for (var0 = 1; var0 < 2048; var0++) {
            field_h[var0] = 65536 / var0;
        }
        for (var0 = 0; var0 < 2048; var0++) {
            field_a[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
            field_c[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
        }
    }
}
