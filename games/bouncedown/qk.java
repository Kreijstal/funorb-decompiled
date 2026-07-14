/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    private static int[] field_h;
    static int field_g;
    static int[] field_b;
    static int field_f;
    private static int[] field_i;
    private static int[] field_c;
    private static int[] field_d;
    static int field_a;
    static int field_e;

    public static void b() {
        field_b = null;
        field_i = null;
        field_c = null;
        field_h = null;
        field_d = null;
    }

    final static void c() {
        qk.a(na.field_g, na.field_i, na.field_b, na.field_f);
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_a = param2 - param0;
        field_g = param3 - param1;
        qk.a();
        if (field_b.length < field_g) {
            field_b = new int[ke.a(field_g, 24636)];
        }
        int var4 = param1 * na.field_e + param0;
        for (var5 = 0; var5 < field_g; var5++) {
            field_b[var5] = var4;
            var4 = var4 + na.field_e;
        }
    }

    private final static void a() {
        field_f = field_a / 2;
        field_e = field_g / 2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_h = new int[2048];
        field_b = new int[1024];
        field_c = new int[2048];
        field_d = new int[2048];
        field_i = new int[512];
        for (var0 = 1; var0 < 512; var0++) {
            field_i[var0] = 32768 / var0;
        }
        for (var0 = 1; var0 < 2048; var0++) {
            field_c[var0] = 65536 / var0;
        }
        for (var0 = 0; var0 < 2048; var0++) {
            field_h[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
            field_d[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
        }
    }
}
