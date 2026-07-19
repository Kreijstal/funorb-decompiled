/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static int[] field_i;
    private static int[] field_c;
    private static int[] field_f;
    static int field_d;
    static int field_a;
    static int field_h;
    static int field_g;
    private static int[] field_e;
    private static int[] field_b;

    public static void b() {
        field_i = null;
        field_e = null;
        field_c = null;
        field_b = null;
        field_f = null;
    }

    private final static void c() {
        field_h = field_g / 2;
        field_a = field_d / 2;
    }

    final static void a() {
        ig.a(ll.field_a, ll.field_b, ll.field_e, ll.field_g);
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_g = param2 - param0;
        field_d = param3 - param1;
        ig.c();
        if (field_i.length < field_d) {
            field_i = new int[bc.a(field_d, -73)];
        }
        int var4 = param1 * ll.field_d + param0;
        for (var5 = 0; var5 < field_d; var5++) {
            field_i[var5] = var4;
            var4 = var4 + ll.field_d;
        }
    }

    static {
        int var0 = 0;
        field_f = new int[2048];
        field_i = new int[1024];
        field_c = new int[2048];
        field_e = new int[512];
        field_b = new int[2048];
        for (var0 = 1; var0 < 512; var0++) {
            field_e[var0] = 32768 / var0;
        }
        for (var0 = 1; var0 < 2048; var0++) {
            field_c[var0] = 65536 / var0;
        }
        for (var0 = 0; var0 < 2048; var0++) {
            field_b[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
            field_f[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
        }
    }
}
