/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveLoadStep {
    static int keyStateWriteIndexOrResetSentinel;
    static boolean field_e;
    ResourceArchive archive;
    static boolean field_a;
    static TextValidationFailure field_h;
    static String highscoresText;
    static int[] firstVertexTransformedX;
    String groupName;
    String waitingText;
    int groupId;
    String loadingText;
    static ResourceArchive fontMetricsArchive;
    static String createPasswordValidText;

    public static void a(int param0) {
        if (param0 >= 121) {
            field_h = null;
            fontMetricsArchive = null;
            createPasswordValidText = null;
            firstVertexTransformedX = null;
            highscoresText = null;
            return;
        }
        highscoresText = (String) null;
        field_h = null;
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
        field_h = new TextValidationFailure();
        createPasswordValidText = "Password is valid";
    }
}
