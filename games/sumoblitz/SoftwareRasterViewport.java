/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoftwareRasterViewport {
    static int height;
    static int centerX;
    private static int[] reciprocal15;
    static int width;
    private static int[] reciprocal16;
    private static int[] sine;
    private static int[] cosine;
    static int centerY;
    static int[] rowOffsets;

    public static void releaseStatics() {
        rowOffsets = null;
        reciprocal15 = null;
        reciprocal16 = null;
        sine = null;
        cosine = null;
    }

    private final static void setViewport(int left, int top, int right, int bottom) {
        int var5 = 0;
        width = right - left;
        height = bottom - top;
        SoftwareRasterViewport.updateCenter();
        if (rowOffsets.length < height) {
          rowOffsets = new int[LegacyOpenGlVertexBuffer.nextPowerOfTwo(false, height)];
        }
        int var4 = top * SoftwareRasterizer.width + left;
        for (var5 = 0; var5 < height; var5++) {
          rowOffsets[var5] = var4;
          var4 = var4 + SoftwareRasterizer.width;
        }
    }

    private final static void updateCenter() {
        centerX = width / 2;
        centerY = height / 2;
    }

    final static void syncClip() {
        SoftwareRasterViewport.setViewport(SoftwareRasterizer.clipLeft, SoftwareRasterizer.clipTop, SoftwareRasterizer.clipRight, SoftwareRasterizer.clipBottom);
    }

    static {
        int var0 = 0;
        int var0Lifetime1;
        int var0Lifetime2;
        reciprocal16 = new int[2048];
        cosine = new int[2048];
        sine = new int[2048];
        reciprocal15 = new int[512];
        rowOffsets = new int[1024];
        for (var0 = 1; var0 < 512; var0++) {
          reciprocal15[var0] = 32768 / var0;
        }
        for (var0Lifetime1 = 1; var0Lifetime1 < 2048; var0Lifetime1++) {
          reciprocal16[var0Lifetime1] = 65536 / var0Lifetime1;
        }
        for (var0Lifetime2 = 0; var0Lifetime2 < 2048; var0Lifetime2++) {
          sine[var0Lifetime2] = (int)(65536.0 * Math.sin((double)var0Lifetime2 * 0.0030679615));
          cosine[var0Lifetime2] = (int)(65536.0 * Math.cos((double)var0Lifetime2 * 0.0030679615));
        }
    }
}
