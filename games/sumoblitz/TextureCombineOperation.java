/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextureCombineOperation {
    static int keyCode;

    final static void sleepMillis(long millis, byte guard) {
        if (millis <= 0L) {
          return;
        }
        if (guard < 72) {
          keyCode = 47;
          if (millis % 10L != 0L) {
            ChatMessage.sleepIgnoringInterrupt(millis, (byte) -21);
            return;
          }
          ChatMessage.sleepIgnoringInterrupt(millis - 1L, (byte) -21);
          ChatMessage.sleepIgnoringInterrupt(1L, (byte) -21);
          return;
        }
        if (millis % 10L != 0L) {
          ChatMessage.sleepIgnoringInterrupt(millis, (byte) -21);
          return;
        }
        ChatMessage.sleepIgnoringInterrupt(millis - 1L, (byte) -21);
        ChatMessage.sleepIgnoringInterrupt(1L, (byte) -21);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
    }
}
