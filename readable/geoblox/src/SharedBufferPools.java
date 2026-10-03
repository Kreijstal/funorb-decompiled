/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SharedBufferPools {
    static boolean introFirstGeometrySoundPlayed;
    static IntrusiveDeque rasterSnapshotPool;
    static java.awt.Frame fullscreenFrame;
    static IndexedSprite germsBackgroundSprite;
    static byte[][][] additionalByteArrayPools;
    static String bubbleBonusText;
    private static String legacyCleanupDiagnosticPrefix;

    public static void clearSharedBufferResources(int methodGuard) {
        germsBackgroundSprite = null;
        if (methodGuard == -13575) {
            bubbleBonusText = null;
            fullscreenFrame = null;
            rasterSnapshotPool = null;
            additionalByteArrayPools = (byte[][][]) null;
            return;
        }
        SharedBufferPools.clearSharedBufferResources(-7);
        bubbleBonusText = null;
        fullscreenFrame = null;
        rasterSnapshotPool = null;
        additionalByteArrayPools = (byte[][][]) null;
    }

    static {
        legacyCleanupDiagnosticPrefix = "sg.A(";
        rasterSnapshotPool = new IntrusiveDeque();
        bubbleBonusText = "Bubble Bonus!";
    }
}
