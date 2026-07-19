/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh {
    private static int[] field_f;
    static int field_h;
    private static int[] field_e;
    static int[] field_b;
    private static int[] field_a;
    static int field_i;
    private static int[] field_g;
    static int field_c;
    static int field_d;

    public static void c() {
        field_b = null;
        field_e = null;
        field_a = null;
        field_f = null;
        field_g = null;
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_c = param2 - param0;
        field_h = param3 - param1;
        mh.a();
        if (field_b.length < field_h) {
            field_b = new int[da.a((byte) 107, field_h)];
        }
        int var4 = param1 * vb.field_f + param0;
        for (var5 = 0; var5 < field_h; var5++) {
            field_b[var5] = var4;
            var4 = var4 + vb.field_f;
        }
    }

    final static void b() {
        mh.a(vb.field_e, vb.field_i, vb.field_k, vb.field_d);
    }

    private final static void a() {
        field_d = field_c / 2;
        field_i = field_h / 2;
    }

    static {
        int var0 = 0;
        field_f = new int[2048];
        field_e = new int[512];
        field_b = new int[1024];
        field_a = new int[2048];
        field_g = new int[2048];
        for (var0 = 1; var0 < 512; var0++) {
            field_e[var0] = 32768 / var0;
        }
        for (var0 = 1; var0 < 2048; var0++) {
            field_a[var0] = 65536 / var0;
        }
        for (var0 = 0; var0 < 2048; var0++) {
            field_f[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
            field_g[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
        }
    }
}
