/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TriangleRasterState {
    private static int[] sineQ16;
    static int clipHeight;
    private static int[] reciprocalQ15;
    static int[] rowBaseOffsets;
    private static int[] reciprocalQ16;
    static int clipCenterY;
    private static int[] cosineQ16;
    static int clipWidth;
    static int clipCenterX;

    public static void releaseTriangleTables() {
        rowBaseOffsets = null;
        reciprocalQ15 = null;
        reciprocalQ16 = null;
        sineQ16 = null;
        cosineQ16 = null;
    }

    private final static void setTriangleClip(int clipLeft, int clipTop, int clipRight, int clipBottom) {
        int rowIndex = 0;
        clipWidth = clipRight - clipLeft;
        clipHeight = clipBottom - clipTop;
        TriangleRasterState.updateTriangleClipCenter();
        if (rowBaseOffsets.length < clipHeight) {
            rowBaseOffsets = new int[ClientOptionSupport.roundUpPowerOfTwo((byte) 107, clipHeight)];
        }
        int rowBaseOffset = clipTop * SoftwareRasterizer.stride + clipLeft;
        for (rowIndex = 0; rowIndex < clipHeight; rowIndex++) {
            rowBaseOffsets[rowIndex] = rowBaseOffset;
            rowBaseOffset = rowBaseOffset + SoftwareRasterizer.stride;
        }
    }

    final static void prepareTriangleClipFromRasterizer() {
        TriangleRasterState.setTriangleClip(SoftwareRasterizer.clipLeft, SoftwareRasterizer.clipTop, SoftwareRasterizer.clipRight, SoftwareRasterizer.clipBottom);
    }

    private final static void updateTriangleClipCenter() {
        clipCenterX = clipWidth / 2;
        clipCenterY = clipHeight / 2;
    }

    static {
        int lookupIndex = 0;
        int reciprocalQ16Index;
        int trigonometricTableIndex;
        sineQ16 = new int[2048];
        reciprocalQ15 = new int[512];
        rowBaseOffsets = new int[1024];
        reciprocalQ16 = new int[2048];
        cosineQ16 = new int[2048];
        for (lookupIndex = 1; lookupIndex < 512; lookupIndex++) {
            reciprocalQ15[lookupIndex] = 32768 / lookupIndex;
        }
        for (reciprocalQ16Index = 1; reciprocalQ16Index < 2048; reciprocalQ16Index++) {
            reciprocalQ16[reciprocalQ16Index] = 65536 / reciprocalQ16Index;
        }
        for (trigonometricTableIndex = 0; trigonometricTableIndex < 2048; trigonometricTableIndex++) {
            sineQ16[trigonometricTableIndex] = (int)(65536.0 * Math.sin((double)trigonometricTableIndex * 0.0030679615));
            cosineQ16[trigonometricTableIndex] = (int)(65536.0 * Math.cos((double)trigonometricTableIndex * 0.0030679615));
        }
    }
}
