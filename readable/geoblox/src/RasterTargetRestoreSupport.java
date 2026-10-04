/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RasterTargetRestoreSupport {
    static String resumeGameText;
    static HighscoreNameEntry[] highscoreNameTable;
    static Sprite[] dialogTopFrameSprites;

    public static void releaseRasterRestoreResources(boolean methodGuard) {
        dialogTopFrameSprites = null;
        highscoreNameTable = null;
        resumeGameText = null;
        if (!methodGuard) {
            resumeGameText = (String) null;
        }
    }

    final static void restoreRasterTarget(boolean returnToPool) {
        RasterTargetSnapshot rasterSnapshot = (RasterTargetSnapshot) ((Object) MatchingTextValidator.rasterTargetStack.removeLast(1));
        if ((rasterSnapshot == null)) {
            throw new IllegalStateException();
        }
        SoftwareRasterizer.setRasterTarget(rasterSnapshot.pixels, rasterSnapshot.stride, rasterSnapshot.framebufferHeight);
        SoftwareRasterizer.setClip(rasterSnapshot.clipLeft, rasterSnapshot.clipTop, rasterSnapshot.clipRight, rasterSnapshot.clipBottom);
        rasterSnapshot.pixels = null;
        if (!returnToPool) {
            return;
        }
        SharedBufferPools.rasterSnapshotPool.addLast(-110, rasterSnapshot);
    }

    static {
        int highscoreNameIndex = 0;
        resumeGameText = "Resume Game";
        highscoreNameTable = new HighscoreNameEntry[255];
        for (highscoreNameIndex = 0; highscoreNameIndex < highscoreNameTable.length; highscoreNameIndex++) {
            highscoreNameTable[highscoreNameIndex] = new HighscoreNameEntry();
        }
    }
}
