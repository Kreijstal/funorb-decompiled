/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    static Sprite[] avatarCryMiddleFrames;
    static String createEmailConfirmationTooltipText;
    static int sessionClientId;
    static String justPlayText;
    static int[] transformedMeshNormalX;
    static String createEmailConfirmationText;
    static int meshProjectionShift;
    static int canvasHeight;
    static int field_b;
    private static String field_z;

    public static void a(boolean param0) {
        avatarCryMiddleFrames = null;
        createEmailConfirmationTooltipText = null;
        justPlayText = null;
        transformedMeshNormalX = null;
        createEmailConfirmationText = null;
        if (!param0) {
            justPlayText = (String) null;
        }
    }

    static {
        field_z = "ok.A(";
        createEmailConfirmationTooltipText = "Type your email address again to make sure it's correct";
        justPlayText = "Just play";
        transformedMeshNormalX = new int[8192];
        meshProjectionShift = 9;
        createEmailConfirmationText = "Confirm Email:";
    }
}
