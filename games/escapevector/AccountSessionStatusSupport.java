/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountSessionStatusSupport {
    static byte[] field_b;
    static AccountNoticeKind field_d;
    static String field_a;
    static String field_c;

    final static boolean hasAccountSession(int guard) {
        if (guard != 17830) {
          field_c = (String) null;
          if (QuickChatPhraseCache.field_e < 10) {
            return false;
          }
          if (!SpriteState.guestSession) {
            return !HudMessage.a(true) ? true : false;
          }
          return false;
        }
        if (QuickChatPhraseCache.field_e < 10) {
          return false;
        }
        if (!SpriteState.guestSession) {
          return !HudMessage.a(true) ? true : false;
        }
        return false;
    }

    public static void releaseStatics(boolean guard) {
        if (guard) {
          return;
        }
        field_c = null;
        field_d = null;
        field_a = null;
        field_b = null;
    }

    static {
        field_b = new byte[65536];
        ArraySupport.fill(field_b, 0, 65536, (byte) -128);
        field_a = "Loading...";
        field_d = new AccountNoticeKind();
        field_c = "LEFT ARROW";
    }
}
