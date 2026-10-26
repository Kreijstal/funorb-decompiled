/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    private static int[] field_c;
    private static int[] field_h;
    private static int[] field_a;
    private static int[] field_g;
    static int[] field_i;
    static int field_f;
    static int field_e;
    static int field_b;
    static int field_d;

    private final static void b() {
        field_d = field_b / 2;
        field_e = field_f / 2;
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        field_b = param2 - param0;
        field_f = param3 - param1;
        re.b();
        if (field_i.length < field_f) {
          field_i = new int[fk.a(field_f, 40)];
        }
        int var4 = param1 * SoftwareRasterizer.stride + param0;
        for (int var5 = 0; var5 < field_f; var5++) {
          field_i[var5] = var4;
          var4 = var4 + SoftwareRasterizer.stride;
        }
    }

    public static void c() {
        field_i = null;
        field_c = null;
        field_h = null;
        field_g = null;
        field_a = null;
    }

    final static void a() {
        re.a(SoftwareRasterizer.clipLeft, SoftwareRasterizer.clipTop, SoftwareRasterizer.clipRight, SoftwareRasterizer.clipBottom);
    }

    static {
        field_a = new int[2048];
        field_g = new int[2048];
        field_h = new int[2048];
        field_c = new int[512];
        field_i = new int[1024];
        for (int var0 = 1; var0 < 512; var0++) {
          field_c[var0] = 32768 / var0;
        }
        for (int var0Lifetime1 = 1; var0Lifetime1 < 2048; var0Lifetime1++) {
          field_h[var0Lifetime1] = 65536 / var0Lifetime1;
        }
        for (int var0Lifetime2 = 0; var0Lifetime2 < 2048; var0Lifetime2++) {
          field_g[var0Lifetime2] = (int)(65536.0 * Math.sin((double)var0Lifetime2 * 0.0030679615));
          field_a[var0Lifetime2] = (int)(65536.0 * Math.cos((double)var0Lifetime2 * 0.0030679615));
        }
    }
}
