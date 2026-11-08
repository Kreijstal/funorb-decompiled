/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DecodedSpriteBuffers {
    static ValidationState field_a;

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 != -15651) {
          DecodedSpriteBuffers.releaseStatics(-103);
        }
    }

    final static void clearDecodedSpriteData(int param0) {
        JoinGameTextGlobals.field_a = (byte[][]) null;
        IntrusiveDeque.field_h = null;
        ErrorPrintHelpers.field_e = null;
        if (param0 < -77) {
          QuickChatCategory.field_x = null;
          ViewportController.field_t = null;
          LobbyResourceHelpers.field_c = null;
          return;
        }
        DecodedSpriteBuffers.releaseStatics(32);
        QuickChatCategory.field_x = null;
        ViewportController.field_t = null;
        LobbyResourceHelpers.field_c = null;
    }

    static {
        field_a = new ValidationState();
    }
}
