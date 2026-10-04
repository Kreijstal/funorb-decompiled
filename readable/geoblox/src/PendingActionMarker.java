/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PendingActionMarker extends IntrusiveNode {
    static IntrusiveDeque pendingRankedListQueries;
    int actionId;
    static int tooltipAnchorY;

    final static void returnGuestSessionToLogin(byte methodGuard) {
        if (!ProgressBarWidget.guestSessionMode) {
            throw new IllegalStateException();
        }
        AccountEligibilitySupport.loginReturnAllowed = true;
        if (methodGuard > 115) {
            TextInputValidator.openAccountLoginPanel((byte) 107, false);
            SpriteConstructionSupport.clientScreenStage = 0;
            return;
        }
        pendingRankedListQueries = (IntrusiveDeque) null;
        TextInputValidator.openAccountLoginPanel((byte) 107, false);
        SpriteConstructionSupport.clientScreenStage = 0;
    }

    public static void releaseStaticReferences(byte methodGuard) {
        int guardQuotient = -118 / ((-11 - methodGuard) / 40);
        pendingRankedListQueries = null;
    }

    PendingActionMarker(int param0) {
        this.actionId = param0;
    }

    static {
        tooltipAnchorY = -1;
        pendingRankedListQueries = new IntrusiveDeque();
    }
}
