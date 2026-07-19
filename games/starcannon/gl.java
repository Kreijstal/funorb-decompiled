/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl {
    static int field_f;
    static int[] field_b;
    static int field_a;
    static int field_e;
    private static int[] field_d;
    static int[] field_c;
    static int field_i;
    private static int[] field_h;
    private static int[] field_g;

    private final static void c() {
        field_e = field_f / 2;
        field_i = field_a / 2;
    }

    public static void a() {
        field_c = null;
        field_h = null;
        field_g = null;
        field_b = null;
        field_d = null;
    }

    final static void b() {
        gl.a(ki.field_l, ki.field_e, ki.field_g, ki.field_i);
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_f = param2 - param0;
        field_a = param3 - param1;
        gl.c();
        if (field_c.length < field_a) {
            field_c = new int[gb.a(field_a, (byte) -84)];
        }
        int var4 = param1 * ki.field_j + param0;
        for (var5 = 0; var5 < field_a; var5++) {
            field_c[var5] = var4;
            var4 = var4 + ki.field_j;
        }
    }

    static {
        int var0 = 0;
        field_b = new int[2048];
        field_d = new int[2048];
        field_h = new int[512];
        field_g = new int[2048];
        field_c = new int[1024];
        for (var0 = 1; var0 < 512; var0++) {
            field_h[var0] = 32768 / var0;
        }
        for (var0 = 1; var0 < 2048; var0++) {
            field_g[var0] = 65536 / var0;
        }
        for (var0 = 0; var0 < 2048; var0++) {
            field_b[var0] = (int)(65536.0 * Math.sin((double)var0 * 0.0030679615));
            field_d[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
        }
    }
}
