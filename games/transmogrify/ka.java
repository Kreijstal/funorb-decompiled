/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka {
    private static int[] field_h;
    static int[] field_d;
    private static int[] field_e;
    static int field_a;
    private static int[] field_c;
    static int field_g;
    static int field_f;
    private static int[] field_b;
    static int field_i;

    public static void a() {
        field_d = null;
        field_e = null;
        field_c = null;
        field_b = null;
        field_h = null;
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_i = param2 - param0;
        field_a = param3 - param1;
        ka.b();
        if (field_d.length < field_a) {
            field_d = new int[u.a(-816856703, field_a)];
        }
        int var4 = param1 * sb.field_c + param0;
        for (var5 = 0; var5 < field_a; var5++) {
            field_d[var5] = var4;
            var4 = var4 + sb.field_c;
        }
    }

    private final static void b() {
        field_f = field_i / 2;
        field_g = field_a / 2;
    }

    final static void c() {
        ka.a(sb.field_d, sb.field_e, sb.field_b, sb.field_f);
    }

    static {
        int var0 = 0;
        field_c = new int[2048];
        field_d = new int[1024];
        field_h = new int[2048];
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
            field_h[var0] = (int)(65536.0 * Math.cos((double)var0 * 0.0030679615));
        }
    }
}
