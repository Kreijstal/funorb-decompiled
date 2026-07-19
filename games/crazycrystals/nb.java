/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb {
    static int[] field_c;
    static int field_h;
    static int field_f;
    private static int[] field_i;
    private static int[] field_g;
    static int field_d;
    private static int[] field_e;
    static int[] field_a;
    static int field_b;

    public static void c() {
        field_a = null;
        field_e = null;
        field_g = null;
        field_c = null;
        field_i = null;
    }

    final static void b() {
        nb.a(kh.field_c, kh.field_b, kh.field_g, kh.field_j);
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_d = param2 - param0;
        field_b = param3 - param1;
        nb.a();
        if (field_a.length < field_b) {
            field_a = new int[pb.a(field_b, (byte) -99)];
        }
        int var4 = param1 * kh.field_l + param0;
        for (var5 = 0; var5 < field_b; var5++) {
            field_a[var5] = var4;
            var4 = var4 + kh.field_l;
        }
    }

    private final static void a() {
        field_h = field_d / 2;
        field_f = field_b / 2;
    }

    static {
        int var0 = 0;
        field_c = new int[2048];
        field_g = new int[2048];
        field_e = new int[512];
        field_i = new int[2048];
        field_a = new int[1024];
        for (var0 = 1; var0 < 512; var0++) {
            field_e[var0] = 32768 / var0;
        }
        for (var0 = 1; var0 < 2048; var0++) {
            field_g[var0] = 65536 / var0;
        }
        for (var0 = 0; var0 < 2048; var0++) {
            field_c[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
            field_i[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
        }
    }
}
