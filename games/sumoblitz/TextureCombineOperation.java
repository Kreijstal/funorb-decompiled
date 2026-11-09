/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextureCombineOperation {
    static int field_a;

    final static void a(long param0, byte param1) {
        if (param0 <= 0L) {
          return;
        }
        if (param1 < 72) {
          field_a = 47;
          if (param0 % 10L != 0L) {
            ChatMessage.sleepIgnoringInterrupt(param0, (byte) -21);
            return;
          }
          ChatMessage.sleepIgnoringInterrupt(param0 - 1L, (byte) -21);
          ChatMessage.sleepIgnoringInterrupt(1L, (byte) -21);
          return;
        }
        if (param0 % 10L != 0L) {
          ChatMessage.sleepIgnoringInterrupt(param0, (byte) -21);
          return;
        }
        ChatMessage.sleepIgnoringInterrupt(param0 - 1L, (byte) -21);
        ChatMessage.sleepIgnoringInterrupt(1L, (byte) -21);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
    }
}
