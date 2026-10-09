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
        int lookupIndexLiteralPhase1;
        int lookupIndexLiteralPhase2;
        sineQ16 = new int[2048];
        reciprocalQ15 = new int[512];
        rowBaseOffsets = new int[1024];
        reciprocalQ16 = new int[2048];
        cosineQ16 = new int[2048];
        for (lookupIndex = 1; lookupIndex < 512; lookupIndex++) {
            reciprocalQ15[lookupIndex] = 32768 / lookupIndex;
        }
        for (lookupIndexLiteralPhase1 = 1; lookupIndexLiteralPhase1 < 2048; lookupIndexLiteralPhase1++) {
            reciprocalQ16[lookupIndexLiteralPhase1] = 65536 / lookupIndexLiteralPhase1;
        }
        for (lookupIndexLiteralPhase2 = 0; lookupIndexLiteralPhase2 < 2048; lookupIndexLiteralPhase2++) {
            sineQ16[lookupIndexLiteralPhase2] = (int)(65536.0 * Math.sin((double)lookupIndexLiteralPhase2 * 0.0030679615));
            cosineQ16[lookupIndexLiteralPhase2] = (int)(65536.0 * Math.cos((double)lookupIndexLiteralPhase2 * 0.0030679615));
        }
    }
}
