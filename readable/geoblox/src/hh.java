/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static String fullscreenCloseButtonText;
    static BitmapFont field_d;
    static java.awt.Font field_a;
    static BitmapFont field_c;

    final static sl a(int param0, boolean param1) {
        sl var2 = new sl(true);
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
        keyboardMonitor = je.keyboardListener;
        synchronized (keyboardMonitor) {
          if (methodGuard <= 41) {
            return false;
          }
          if (vd.keyboardEventReadIndex == pc.keyboardEventFrameEndIndex) {
            return false;
          }
          ki.currentKeyboardEventCode = kj.queuedKeyboardEventCodes[vd.keyboardEventReadIndex];
          te.currentKeyboardEventCharacter = ai.queuedKeyboardEventCharacters[vd.keyboardEventReadIndex];
          vd.keyboardEventReadIndex = 1 + vd.keyboardEventReadIndex & 127;
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
