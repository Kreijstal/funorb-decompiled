/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameSoundResources {
    static String optionalLoginText;
    static PcmSample[] gameSoundSamples;
    static Sprite spaceForegroundSprite;
    private static String legacyCleanupContext;

    public static void releaseStaticReferences(int methodGuard) {
        spaceForegroundSprite = null;
        if (methodGuard != 33) {
            GameSoundResources.releaseStaticReferences(76);
            gameSoundSamples = null;
            optionalLoginText = null;
            return;
        }
        gameSoundSamples = null;
        optionalLoginText = null;
    }

    static {
        legacyCleanupContext = "fl.A(";
        gameSoundSamples = new PcmSample[33];
    }
}
