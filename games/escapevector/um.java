/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um {
    static byte[] field_b;
    static fc field_d;
    static String field_a;
    static String field_c;

    final static boolean a(int param0) {
        if (param0 != 17830) {
          field_c = (String) null;
          if (QuickChatPhraseCache.field_e < 10) {
            return false;
          }
          if (!SpriteState.field_u) {
            return !HudMessage.a(true) ? true : false;
          }
          return false;
        }
        if (QuickChatPhraseCache.field_e < 10) {
          return false;
        }
        if (!SpriteState.field_u) {
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
        field_d = new fc();
        field_c = "LEFT ARROW";
    }
}
