/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatSineHelpers {
    static String field_a;
    static String field_b;
    static String field_c;

    final static void activateDefaultQuickChatMenu(byte obfuscationGuard) {
        HuffmanCodec.installQuickChatMenu(105, ContentTransitionLayer.defaultQuickChatMenu);
        if (obfuscationGuard >= -76) {
          QuickChatSineHelpers.activateDefaultQuickChatMenu((byte) -90);
        }
    }

    final static int lookupSine2048Q16(byte obfuscationGuard, int angle) {
        int unusedGuardRemainder = 25 % ((obfuscationGuard - 66) / 58);
        return MeshRasterState.sine2048Q16[angle & 2047];
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 8070) {
          QuickChatSineHelpers.a(124);
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        field_a = "Return to lobby";
        field_b = "<%0> must play 1 more rated game before playing with the current options.";
        field_c = "Cancel";
    }
}
