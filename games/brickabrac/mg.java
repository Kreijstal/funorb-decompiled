/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    private static int[] field_h;
    static int projectionCenterX;
    private static int[] field_c;
    static int projectionCenterY;
    static int[] field_g;
    static int field_e;
    static int field_b;
    private static int[] field_i;
    static int[] field_f;

    private final static void a() {
        projectionCenterX = field_e / 2;
        projectionCenterY = field_b / 2;
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_e = param2 - param0;
        field_b = param3 - param1;
        mg.a();
        if (field_g.length < field_b) {
          field_g = new int[fj.a(field_b, (byte) 108)];
        }
        int var4 = param1 * Rasterizer2D.width + param0;
        for (var5 = 0; var5 < field_b; var5++) {
          field_g[var5] = var4;
          var4 = var4 + Rasterizer2D.width;
        }
    }

    final static void c() {
        mg.a(Rasterizer2D.clipLeft, Rasterizer2D.clipTop, Rasterizer2D.clipRight, Rasterizer2D.clipBottom);
    }

    public static void b() {
        field_g = null;
        field_i = null;
        field_h = null;
        field_f = null;
        field_c = null;
    }

    static {
        int var0 = 0;
        int var0Lifetime1;
        int var0Lifetime2;
        field_h = new int[2048];
        field_g = new int[1024];
        field_i = new int[512];
        field_c = new int[2048];
        field_f = new int[2048];
        for (var0 = 1; var0 < 512; var0++) {
          field_i[var0] = 32768 / var0;
        }
        for (var0Lifetime1 = 1; var0Lifetime1 < 2048; var0Lifetime1++) {
          field_h[var0Lifetime1] = 65536 / var0Lifetime1;
        }
        for (var0Lifetime2 = 0; var0Lifetime2 < 2048; var0Lifetime2++) {
          field_f[var0Lifetime2] = (int)(65536.0 * Math.sin((double)var0Lifetime2 * 0.0030679615));
          field_c[var0Lifetime2] = (int)(65536.0 * Math.cos((double)var0Lifetime2 * 0.0030679615));
        }
    }
}
