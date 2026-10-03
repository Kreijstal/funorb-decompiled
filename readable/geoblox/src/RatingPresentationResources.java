/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RatingPresentationResources {
    static LoginPayloadKind loginPayloadKindThree;
    static Sprite[] amorphousCrackFrames;
    static String[] ratingModeNames;
    static MusicScore jewelleryMusicTrack;
    private static String legacyCleanupContext;

    public static void releaseStaticReferences(int methodGuard) {
        if (methodGuard < -2) {
            loginPayloadKindThree = null;
            amorphousCrackFrames = null;
            ratingModeNames = null;
            jewelleryMusicTrack = null;
            return;
        }
        RatingPresentationResources.releaseStaticReferences(1);
        loginPayloadKindThree = null;
        amorphousCrackFrames = null;
        ratingModeNames = null;
        jewelleryMusicTrack = null;
    }

    static {
        legacyCleanupContext = "ej.A(";
        ratingModeNames = new String[]{"By rating", "By win percentage"};
        amorphousCrackFrames = new Sprite[4];
        loginPayloadKindThree = new LoginPayloadKind(3);
    }
}
