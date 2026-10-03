/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CacheFileState {
    static BufferedRandomAccessFile randomSeedFile;
    static Sprite debugOverviewRaster;
    static BufferedRandomAccessFile cacheDataFile;
    static int avatarFrameStepTicks;
    private static String legacyCleanupContext;

    public static void releaseStaticReferences(byte methodGuard) {
        debugOverviewRaster = null;
        randomSeedFile = null;
        cacheDataFile = null;
        if (methodGuard > -86) {
            cacheDataFile = (BufferedRandomAccessFile) null;
        }
    }

    static {
        legacyCleanupContext = "af.A(";
        avatarFrameStepTicks = 0;
        debugOverviewRaster = new Sprite(320, 240);
    }
}
