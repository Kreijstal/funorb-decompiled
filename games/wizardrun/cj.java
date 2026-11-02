/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj {
    static int[] field_e;
    static int[] field_a;
    static int field_c;
    static int field_b;
    private static int[] field_g;
    static int field_d;
    static int field_f;
    private static int[] field_i;
    private static int[] field_h;

    public static void b() {
        field_a = null;
        field_g = null;
        field_h = null;
        field_e = null;
        field_i = null;
    }

    final static void c() {
        cj.a(SoftwareRasterizer.clipLeft, SoftwareRasterizer.clipTop, SoftwareRasterizer.clipRight, SoftwareRasterizer.clipBottom);
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_b = param2 - param0;
        field_d = param3 - param1;
        cj.a();
        if (field_a.length < field_d) {
          field_a = new int[rd.a(field_d, false)];
        }
        int var4 = param1 * SoftwareRasterizer.width + param0;
        for (var5 = 0; var5 < field_d; var5++) {
          field_a[var5] = var4;
          var4 = var4 + SoftwareRasterizer.width;
        }
    }

    private final static void a() {
        field_c = field_b / 2;
        field_f = field_d / 2;
    }

    static {
        int var0 = 0;
        int var0Lifetime1;
        int var0Lifetime2;
        field_e = new int[2048];
        field_a = new int[1024];
        field_g = new int[512];
        field_h = new int[2048];
        field_i = new int[2048];
        for (var0 = 1; var0 < 512; var0++) {
          field_g[var0] = 32768 / var0;
        }
        for (var0Lifetime1 = 1; var0Lifetime1 < 2048; var0Lifetime1++) {
          field_h[var0Lifetime1] = 65536 / var0Lifetime1;
        }
        for (var0Lifetime2 = 0; var0Lifetime2 < 2048; var0Lifetime2++) {
          field_e[var0Lifetime2] = (int)(65536.0 * Math.sin((double)var0Lifetime2 * 0.0030679615));
          field_i[var0Lifetime2] = (int)(65536.0 * Math.cos((double)var0Lifetime2 * 0.0030679615));
        }
    }
}
