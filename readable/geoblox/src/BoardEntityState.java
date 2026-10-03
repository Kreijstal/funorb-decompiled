/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BoardEntityState {
    static int[] cameraMeshVertexX;
    static IntrusiveDeque attachedEntities;
    static String[] instructionPageTitles;
    static int selectedAchievementIndex;
    static String retryText;
    private static String legacyCleanupContext;

    public static void releaseStaticReferences(byte methodGuard) {
        retryText = null;
        cameraMeshVertexX = null;
        attachedEntities = null;
        if (methodGuard > -63) {
            BoardEntityState.releaseStaticReferences((byte) 92);
            instructionPageTitles = null;
            return;
        }
        instructionPageTitles = null;
    }

    static {
        legacyCleanupContext = "a.A(";
        cameraMeshVertexX = new int[8192];
        instructionPageTitles = new String[]{"Welcome to Geoblox!", "The controls", "How to play", "Bonuses", "Special geoblox", "Special geoblox cont."};
        selectedAchievementIndex = -1;
        retryText = "Retry";
        attachedEntities = new IntrusiveDeque();
    }
}
