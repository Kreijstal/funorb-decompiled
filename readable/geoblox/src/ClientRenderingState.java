/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientRenderingState {
    static Sprite[] avatarCryMiddleFrames;
    static String createEmailConfirmationTooltipText;
    static int sessionClientId;
    static String justPlayText;
    static int[] transformedMeshNormalX;
    static String createEmailConfirmationText;
    static int meshProjectionShift;
    static int canvasHeight;
    static int rankedKeyTwoLowerBoundSeed;
    private static String unusedDiagnosticPrefix;

    public static void releaseClientRenderingResources(boolean methodGuard) {
        avatarCryMiddleFrames = null;
        createEmailConfirmationTooltipText = null;
        justPlayText = null;
        transformedMeshNormalX = null;
        createEmailConfirmationText = null;
        if (!methodGuard) {
            justPlayText = (String) null;
        }
    }

    static {
        unusedDiagnosticPrefix = "ok.A(";
        createEmailConfirmationTooltipText = "Type your email address again to make sure it's correct";
        justPlayText = "Just play";
        transformedMeshNormalX = new int[8192];
        meshProjectionShift = 9;
        createEmailConfirmationText = "Confirm Email:";
    }
}
