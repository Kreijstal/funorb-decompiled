/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id {
    static String resumeGameText;
    static HighscoreNameEntry[] highscoreNameTable;
    static Sprite[] field_c;

    public static void b(boolean param0) {
        field_c = null;
        highscoreNameTable = null;
        resumeGameText = null;
        if (!param0) {
            resumeGameText = (String) null;
        }
    }

    final static void restoreRasterTarget(boolean returnToPool) {
        RasterTargetSnapshot var1 = (RasterTargetSnapshot) ((Object) MatchingTextValidator.rasterTargetStack.removeLast(1));
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        SoftwareRasterizer.setRasterTarget(var1.pixels, var1.stride, var1.framebufferHeight);
        SoftwareRasterizer.setClip(var1.clipLeft, var1.clipTop, var1.clipRight, var1.clipBottom);
        var1.pixels = null;
        if (!returnToPool) {
            return;
        }
        SharedBufferPools.rasterSnapshotPool.addLast(-110, var1);
    }

    static {
        int var0 = 0;
        resumeGameText = "Resume Game";
        highscoreNameTable = new HighscoreNameEntry[255];
        for (var0 = 0; var0 < highscoreNameTable.length; var0++) {
            highscoreNameTable[var0] = new HighscoreNameEntry();
        }
    }
}
