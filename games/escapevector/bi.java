/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static int field_f;
    static int field_c;
    static int field_i;
    private static int[] field_h;
    private static int[] field_e;
    static int[] field_d;
    private static int[] field_g;
    static int field_b;
    static int[] field_a;

    public static void c() {
        field_a = null;
        field_e = null;
        field_h = null;
        field_d = null;
        field_g = null;
    }

    private final static void a() {
        field_b = field_c / 2;
        field_i = field_f / 2;
    }

    final static void b() {
        bi.a(em.field_a, em.field_k, em.field_b, em.field_j);
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_c = param2 - param0;
        field_f = param3 - param1;
        bi.a();
        if (field_a.length < field_f) {
            field_a = new int[md.a((byte) 127, field_f)];
        }
        int var4 = param1 * em.field_l + param0;
        for (var5 = 0; var5 < field_f; var5++) {
            field_a[var5] = var4;
            var4 = var4 + em.field_l;
        }
    }

    static {
        int var0 = 0;
        field_e = new int[512];
        field_h = new int[2048];
        field_g = new int[2048];
        field_d = new int[2048];
        field_a = new int[1024];
        for (var0 = 1; var0 < 512; var0++) {
            field_e[var0] = 32768 / var0;
        }
        for (var0 = 1; var0 < 2048; var0++) {
            field_h[var0] = 65536 / var0;
        }
        for (var0 = 0; var0 < 2048; var0++) {
            field_d[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
            field_g[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
        }
    }
}
