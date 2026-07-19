/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    private static int[] field_g;
    static int field_h;
    static int field_d;
    private static int[] field_b;
    private static int[] field_e;
    static int[] field_i;
    static int field_a;
    static int[] field_f;
    static int field_c;

    private final static void a() {
        field_h = field_c / 2;
        field_d = field_a / 2;
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_c = param2 - param0;
        field_a = param3 - param1;
        wi.a();
        if (field_i.length < field_a) {
            field_i = new int[ua.a(field_a, 0)];
        }
        int var4 = param1 * ul.field_f + param0;
        for (var5 = 0; var5 < field_a; var5++) {
            field_i[var5] = var4;
            var4 = var4 + ul.field_f;
        }
    }

    final static void c() {
        wi.a(ul.field_i, ul.field_d, ul.field_e, ul.field_a);
    }

    public static void b() {
        field_i = null;
        field_g = null;
        field_e = null;
        field_f = null;
        field_b = null;
    }

    static {
        int var0 = 0;
        field_e = new int[2048];
        field_b = new int[2048];
        field_i = new int[1024];
        field_g = new int[512];
        field_f = new int[2048];
        for (var0 = 1; var0 < 512; var0++) {
            field_g[var0] = 32768 / var0;
        }
        for (var0 = 1; var0 < 2048; var0++) {
            field_e[var0] = 65536 / var0;
        }
        for (var0 = 0; var0 < 2048; var0++) {
            field_f[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
            field_b[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
        }
    }
}
