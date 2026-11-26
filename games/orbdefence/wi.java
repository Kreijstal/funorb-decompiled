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
          field_i = new int[ua.roundUpPowerOfTwo(field_a, 0)];
        }
        int var4 = param1 * SoftwareRasterizer.field_f + param0;
        for (var5 = 0; var5 < field_a; var5++) {
          field_i[var5] = var4;
          var4 = var4 + SoftwareRasterizer.field_f;
        }
    }

    final static void c() {
        wi.a(SoftwareRasterizer.field_i, SoftwareRasterizer.field_d, SoftwareRasterizer.field_e, SoftwareRasterizer.field_a);
    }

    public static void clearStaticReferences() {
        field_i = null;
        field_g = null;
        field_e = null;
        field_f = null;
        field_b = null;
    }

    static {
        int var0 = 0;
        int var0Lifetime1;
        int var0Lifetime2;
        field_e = new int[2048];
        field_b = new int[2048];
        field_i = new int[1024];
        field_g = new int[512];
        field_f = new int[2048];
        for (var0 = 1; var0 < 512; var0++) {
          field_g[var0] = 32768 / var0;
        }
        for (var0Lifetime1 = 1; var0Lifetime1 < 2048; var0Lifetime1++) {
          field_e[var0Lifetime1] = 65536 / var0Lifetime1;
        }
        for (var0Lifetime2 = 0; var0Lifetime2 < 2048; var0Lifetime2++) {
          field_f[var0Lifetime2] = (int)(65536.0 * Math.sin((double)var0Lifetime2 * 0.0030679615));
          field_b[var0Lifetime2] = (int)(65536.0 * Math.cos((double)var0Lifetime2 * 0.0030679615));
        }
    }
}
