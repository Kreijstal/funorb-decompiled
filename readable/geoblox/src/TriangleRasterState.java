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
            rowBaseOffsets = new int[da.a((byte) 107, clipHeight)];
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
        sineQ16 = new int[2048];
        reciprocalQ15 = new int[512];
        rowBaseOffsets = new int[1024];
        reciprocalQ16 = new int[2048];
        cosineQ16 = new int[2048];
        for (lookupIndex = 1; lookupIndex < 512; lookupIndex++) {
            reciprocalQ15[lookupIndex] = 32768 / lookupIndex;
        }
        for (lookupIndex = 1; lookupIndex < 2048; lookupIndex++) {
            reciprocalQ16[lookupIndex] = 65536 / lookupIndex;
        }
        for (lookupIndex = 0; lookupIndex < 2048; lookupIndex++) {
            sineQ16[lookupIndex] = (int)(65536.0 * Math.sin((double)lookupIndex * 0.0030679615));
            cosineQ16[lookupIndex] = (int)(65536.0 * Math.cos((double)lookupIndex * 0.0030679615));
        }
    }
}
