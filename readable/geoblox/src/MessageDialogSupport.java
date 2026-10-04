/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MessageDialogSupport {
    static String idleMessage20MinText;
    static String createDoubleSpaceAlertText;
    static int releasesPerTheme;
    static int field_f;
    static int field_e;
    static boolean entitiesDetachedThisTick;
    static ByteArrayBuffer encryptedPayloadScratchBuffer;
    static int field_i;
    static String[] membersExpansionBenefitTexts;

    final static void showMessageDialog(String messageText, int methodGuard, boolean showLoginOnDismiss) {
        VisualPropertyOverrides.field_I = showLoginOnDismiss;
        if (methodGuard != 480) {
            return;
        }
        try {
            MeshPrioritySupport.field_d = true;
            Geoblox.activeMessageDialog = new MessageDialog(ClientFlowState.accountDialogLayer, UiFontResources.commonUiBoldFont, messageText, AgeValidator.field_i, VisualPropertyOverrides.field_I);
            ClientFlowState.accountDialogLayer.showDialog(false, Geoblox.activeMessageDialog);
        } catch (RuntimeException messageDialogFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) messageDialogFailure), "fa.B(" + (messageText != null ? "{...}" : "null") + ',' + methodGuard + ',' + showLoginOnDismiss + ')');
        }
    }

    public static void releaseStaticReferences(int methodGuard) {
        encryptedPayloadScratchBuffer = null;
        idleMessage20MinText = null;
        if (methodGuard != 30970) {
            return;
        }
        createDoubleSpaceAlertText = null;
        membersExpansionBenefitTexts = null;
    }

    static {
        releasesPerTheme = 60;
        field_f = 14;
        idleMessage20MinText = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        createDoubleSpaceAlertText = "Names cannot contain consecutive spaces";
        field_e = 0;
        field_i = 480;
        membersExpansionBenefitTexts = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
