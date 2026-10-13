/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MeshRasterState {
    private static int[] reciprocalQ16;
    static int projectionCenterX;
    private static int[] cosine2048Q16;
    static int projectionCenterY;
    static int[] rowOffsets;
    static int viewportWidth;
    static int viewportHeight;
    private static int[] reciprocalQ15;
    static int[] sine2048Q16;

    private final static void updateProjectionCenter() {
        projectionCenterX = viewportWidth / 2;
        projectionCenterY = viewportHeight / 2;
    }

    private final static void setViewport(int left, int top, int right, int bottom) {
        int var5 = 0;
        viewportWidth = right - left;
        viewportHeight = bottom - top;
        MeshRasterState.updateProjectionCenter();
        if (rowOffsets.length < viewportHeight) {
          rowOffsets = new int[fj.a(viewportHeight, (byte) 108)];
        }
        int var4 = top * Rasterizer2D.width + left;
        for (var5 = 0; var5 < viewportHeight; var5++) {
          rowOffsets[var5] = var4;
          var4 = var4 + Rasterizer2D.width;
        }
    }

    final static void syncRasterClip() {
        MeshRasterState.setViewport(Rasterizer2D.clipLeft, Rasterizer2D.clipTop, Rasterizer2D.clipRight, Rasterizer2D.clipBottom);
    }

    public static void releaseTables() {
        rowOffsets = null;
        reciprocalQ15 = null;
        reciprocalQ16 = null;
        sine2048Q16 = null;
        cosine2048Q16 = null;
    }

    static {
        int var0 = 0;
        int var0Lifetime1;
        int var0Lifetime2;
        reciprocalQ16 = new int[2048];
        rowOffsets = new int[1024];
        reciprocalQ15 = new int[512];
        cosine2048Q16 = new int[2048];
        sine2048Q16 = new int[2048];
        for (var0 = 1; var0 < 512; var0++) {
          reciprocalQ15[var0] = 32768 / var0;
        }
        for (var0Lifetime1 = 1; var0Lifetime1 < 2048; var0Lifetime1++) {
          reciprocalQ16[var0Lifetime1] = 65536 / var0Lifetime1;
        }
        for (var0Lifetime2 = 0; var0Lifetime2 < 2048; var0Lifetime2++) {
          sine2048Q16[var0Lifetime2] = (int)(65536.0 * Math.sin((double)var0Lifetime2 * 0.0030679615));
          cosine2048Q16[var0Lifetime2] = (int)(65536.0 * Math.cos((double)var0Lifetime2 * 0.0030679615));
        }
    }
}
