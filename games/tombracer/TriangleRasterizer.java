/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TriangleRasterizer {
    static int viewportWidth;
    static int viewportHeight;
    static int centerY;
    static int[] rowOffsets;
    private static int[] field_h;
    private static int[] field_i;
    static int[] cosTable;
    static int[] sinTable;
    static int centerX;

    public static void releaseStatics() {
        rowOffsets = null;
        field_i = null;
        field_h = null;
        sinTable = null;
        cosTable = null;
    }

    final static void useRasterClip() {
        TriangleRasterizer.setViewport(SoftwareRasterizer.clipLeft, SoftwareRasterizer.clipTop, SoftwareRasterizer.clipRight, SoftwareRasterizer.clipBottom);
    }

    private final static void setViewport(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        viewportWidth = param2 - param0;
        viewportHeight = param3 - param1;
        TriangleRasterizer.centerProjection();
        if (rowOffsets.length < viewportHeight) {
          rowOffsets = new int[lla.nextPowerOfTwo(false, viewportHeight)];
        }
        int var4 = param1 * SoftwareRasterizer.width + param0;
        for (var5 = 0; var5 < viewportHeight; var5++) {
          rowOffsets[var5] = var4;
          var4 = var4 + SoftwareRasterizer.width;
        }
    }

    private final static void centerProjection() {
        centerX = viewportWidth / 2;
        centerY = viewportHeight / 2;
    }

    static {
        int var0 = 0;
        int var0Lifetime1;
        int var0Lifetime2;
        rowOffsets = new int[1024];
        field_h = new int[2048];
        field_i = new int[512];
        sinTable = new int[2048];
        cosTable = new int[2048];
        for (var0 = 1; var0 < 512; var0++) {
          field_i[var0] = 32768 / var0;
        }
        for (var0Lifetime1 = 1; var0Lifetime1 < 2048; var0Lifetime1++) {
          field_h[var0Lifetime1] = 65536 / var0Lifetime1;
        }
        for (var0Lifetime2 = 0; var0Lifetime2 < 2048; var0Lifetime2++) {
          sinTable[var0Lifetime2] = (int)(65536.0 * Math.sin((double)var0Lifetime2 * 0.0030679615));
          cosTable[var0Lifetime2] = (int)(65536.0 * Math.cos((double)var0Lifetime2 * 0.0030679615));
        }
    }
}
