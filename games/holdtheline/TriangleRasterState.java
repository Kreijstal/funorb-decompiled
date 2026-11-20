/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TriangleRasterState {
    static int[] field_a;
    private static int[] field_g;
    static int field_c;
    static int field_i;
    static int field_d;
    static int[] field_e;
    private static int[] field_h;
    static int field_b;
    private static int[] field_f;

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_i = param2 - param0;
        field_d = param3 - param1;
        TriangleRasterState.b();
        if (field_a.length < field_d) {
          field_a = new int[SpriteButtonRenderer.a((byte) 7, field_d)];
        }
        int var4 = param1 * SoftwareRasterizer.width + param0;
        for (var5 = 0; var5 < field_d; var5++) {
          field_a[var5] = var4;
          var4 = var4 + SoftwareRasterizer.width;
        }
    }

    final static void c() {
        TriangleRasterState.a(SoftwareRasterizer.clipLeft, SoftwareRasterizer.clipTop, SoftwareRasterizer.clipRight, SoftwareRasterizer.clipBottom);
    }

    public static void clearSharedReferences() {
        field_a = null;
        field_h = null;
        field_f = null;
        field_e = null;
        field_g = null;
    }

    private final static void b() {
        field_b = field_i / 2;
        field_c = field_d / 2;
    }

    static {
        int var0 = 0;
        int var0Lifetime1;
        int var0Lifetime2;
        field_a = new int[1024];
        field_g = new int[2048];
        field_h = new int[512];
        field_f = new int[2048];
        field_e = new int[2048];
        for (var0 = 1; var0 < 512; var0++) {
          field_h[var0] = 32768 / var0;
        }
        for (var0Lifetime1 = 1; var0Lifetime1 < 2048; var0Lifetime1++) {
          field_f[var0Lifetime1] = 65536 / var0Lifetime1;
        }
        for (var0Lifetime2 = 0; var0Lifetime2 < 2048; var0Lifetime2++) {
          field_e[var0Lifetime2] = (int)(65536.0 * Math.sin((double)var0Lifetime2 * 0.0030679615));
          field_g[var0Lifetime2] = (int)(65536.0 * Math.cos((double)var0Lifetime2 * 0.0030679615));
        }
    }
}
