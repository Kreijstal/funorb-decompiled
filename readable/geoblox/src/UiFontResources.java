/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiFontResources {
    static String fullscreenCloseButtonText;
    static BitmapFont commonUiSmallFont;
    static java.awt.Font awtLoadingFont;
    static BitmapFont commonUiBoldFont;

    final static UsernameAvailabilityQuery createAcceptedUsernameQuery(int methodGuard, boolean underThirteenFlag) {
        UsernameAvailabilityQuery query = new UsernameAvailabilityQuery(true);
        query.field_d = underThirteenFlag ? true : false;
        int sentinelDivision = -105 / ((-35 - methodGuard) / 37);
        return query;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean pollKeyboardEvent(int methodGuard) {
        Object unusedKeyboardMonitorScratch = null;
        Object keyboardMonitor = null;
        Throwable unusedPollFailureScratch = null;
        boolean eventAvailable = false;
        Throwable unusedPollFailureCarrier = null;
        keyboardMonitor = TrackedPcmStream.keyboardListener;
        synchronized (keyboardMonitor) {
          if (methodGuard <= 41) {
            return false;
          }
          if (ClientSessionSnapshot.keyboardEventReadIndex == MidiNote.keyboardEventFrameEndIndex) {
            return false;
          }
          SessionSnapshotSupport.currentKeyboardEventCode = MidiPcmStream.queuedKeyboardEventCodes[ClientSessionSnapshot.keyboardEventReadIndex];
          te.currentKeyboardEventCharacter = ScoreSubmission.queuedKeyboardEventCharacters[ClientSessionSnapshot.keyboardEventReadIndex];
          ClientSessionSnapshot.keyboardEventReadIndex = 1 + ClientSessionSnapshot.keyboardEventReadIndex & 127;
          eventAvailable = true;
        }
        return eventAvailable;
    }

    public static void releaseStaticReferences(boolean methodGuard) {
        awtLoadingFont = null;
        fullscreenCloseButtonText = null;
        commonUiSmallFont = null;
        if (methodGuard) {
            UiFontResources.createAcceptedUsernameQuery(102, true);
            commonUiBoldFont = null;
            return;
        }
        commonUiBoldFont = null;
    }

    static {
        fullscreenCloseButtonText = "Close";
    }
}
