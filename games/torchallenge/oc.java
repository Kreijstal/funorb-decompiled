/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    static int field_d;
    private static int[] field_f;
    static int[] field_b;
    static int field_i;
    static int field_c;
    static int field_e;
    private static int[] field_h;
    static int[] field_g;
    private static int[] field_a;

    private final static void b() {
        field_i = field_d / 2;
        field_c = field_e / 2;
    }

    final static void c() {
        oc.a(qg.field_a, qg.field_k, qg.field_c, qg.field_l);
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_d = param2 - param0;
        field_e = param3 - param1;
        oc.b();
        if (field_b.length < field_e) {
            field_b = new int[ll.a(true, field_e)];
        }
        int var4 = param1 * qg.field_g + param0;
        for (var5 = 0; var5 < field_e; var5++) {
            field_b[var5] = var4;
            var4 = var4 + qg.field_g;
        }
    }

    public static void a() {
        field_b = null;
        field_h = null;
        field_a = null;
        field_g = null;
        field_f = null;
    }

    static {
        int var0 = 0;
        field_f = new int[2048];
        field_b = new int[1024];
        field_h = new int[512];
        field_a = new int[2048];
        field_g = new int[2048];
        for (var0 = 1; var0 < 512; var0++) {
            field_h[var0] = 32768 / var0;
        }
        for (var0 = 1; var0 < 2048; var0++) {
            field_a[var0] = 65536 / var0;
        }
        for (var0 = 0; var0 < 2048; var0++) {
            field_g[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
            field_f[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
        }
    }
}
