/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveLoadStep {
    static int keyStateWriteIndexOrResetSentinel;
    static boolean loginRetrySuspended;
    ResourceArchive archive;
    static boolean connectionLostMessagePending;
    static TextValidationFailure invalidTextFormatFailure;
    static String highscoresText;
    static int[] firstVertexTransformedX;
    String groupName;
    String waitingText;
    int groupId;
    String loadingText;
    static ResourceArchive fontMetricsArchive;
    static String createPasswordValidText;

    public static void releaseStaticReferences(int methodGuard) {
        if (methodGuard >= 121) {
            invalidTextFormatFailure = null;
            fontMetricsArchive = null;
            createPasswordValidText = null;
            firstVertexTransformedX = null;
            highscoresText = null;
            return;
        }
        highscoresText = (String) null;
        invalidTextFormatFailure = null;
        fontMetricsArchive = null;
        createPasswordValidText = null;
        firstVertexTransformedX = null;
        highscoresText = null;
    }

    private ArchiveLoadStep() throws Throwable {
        throw new Error();
    }

    static {
        keyStateWriteIndexOrResetSentinel = 0;
        firstVertexTransformedX = new int[8192];
        highscoresText = "Highscores";
        invalidTextFormatFailure = new TextValidationFailure();
        createPasswordValidText = "Password is valid";
    }
}
