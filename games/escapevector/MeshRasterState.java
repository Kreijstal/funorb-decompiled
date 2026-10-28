/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MeshRasterState {
    static int clipHeight;
    static int clipWidth;
    static int centerY;
    private static int[] reciprocalQ16;
    private static int[] reciprocalQ15;
    static int[] sineQ16;
    private static int[] cosineQ16;
    static int centerX;
    static int[] rowOffsets;

    public static void releaseStatics() {
        rowOffsets = null;
        reciprocalQ15 = null;
        reciprocalQ16 = null;
        sineQ16 = null;
        cosineQ16 = null;
    }

    private final static void updateCenter() {
        centerX = clipWidth / 2;
        centerY = clipHeight / 2;
    }

    final static void useRasterClip() {
        MeshRasterState.setClip(SoftwareRasterizer.clipLeft, SoftwareRasterizer.clipTop, SoftwareRasterizer.clipRight, SoftwareRasterizer.clipBottom);
    }

    private final static void setClip(int left, int top, int right, int bottom) {
        clipWidth = right - left;
        clipHeight = bottom - top;
        MeshRasterState.updateCenter();
        if (rowOffsets.length < clipHeight) {
          rowOffsets = new int[AlphaContainer.nextPowerOfTwo((byte) 127, clipHeight)];
        }
        int var4 = top * SoftwareRasterizer.width + left;
        for (int var5 = 0; var5 < clipHeight; var5++) {
          rowOffsets[var5] = var4;
          var4 = var4 + SoftwareRasterizer.width;
        }
    }

    static {
        reciprocalQ15 = new int[512];
        reciprocalQ16 = new int[2048];
        cosineQ16 = new int[2048];
        sineQ16 = new int[2048];
        rowOffsets = new int[1024];
        for (int var0 = 1; var0 < 512; var0++) {
          reciprocalQ15[var0] = 32768 / var0;
        }
        for (int var0Lifetime1 = 1; var0Lifetime1 < 2048; var0Lifetime1++) {
          reciprocalQ16[var0Lifetime1] = 65536 / var0Lifetime1;
        }
        for (int var0Lifetime2 = 0; var0Lifetime2 < 2048; var0Lifetime2++) {
          sineQ16[var0Lifetime2] = (int)(65536.0 * Math.sin((double)var0Lifetime2 * 0.0030679615));
          cosineQ16[var0Lifetime2] = (int)(65536.0 * Math.cos((double)var0Lifetime2 * 0.0030679615));
        }
    }
}
