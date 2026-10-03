/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static String fullscreenCloseButtonText;
    static BitmapFont field_d;
    static java.awt.Font field_a;
    static BitmapFont field_c;

    final static UsernameAvailabilityQuery a(int param0, boolean param1) {
        UsernameAvailabilityQuery var2 = new UsernameAvailabilityQuery(true);
        var2.field_d = param1 ? true : false;
        int var3 = -105 / ((-35 - param0) / 37);
        return var2;
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
          ki.currentKeyboardEventCode = MidiPcmStream.queuedKeyboardEventCodes[ClientSessionSnapshot.keyboardEventReadIndex];
          te.currentKeyboardEventCharacter = ScoreSubmission.queuedKeyboardEventCharacters[ClientSessionSnapshot.keyboardEventReadIndex];
          ClientSessionSnapshot.keyboardEventReadIndex = 1 + ClientSessionSnapshot.keyboardEventReadIndex & 127;
          eventAvailable = true;
        }
        return eventAvailable;
    }

    public static void a(boolean param0) {
        field_a = null;
        fullscreenCloseButtonText = null;
        field_d = null;
        if (param0) {
            hh.a(102, true);
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        fullscreenCloseButtonText = "Close";
    }
}
