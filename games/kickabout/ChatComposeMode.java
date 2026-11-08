/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatComposeMode {
    static String field_a;
    static boolean field_b;
    static String field_c;

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 != 0) {
          field_b = true;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final static void setComposeMode(int param0) {
        NodeHashTableIterator.field_b = param0;
        PlayArea.showCurrentQuickChatMenu(true);
    }

    static {
        field_b = false;
        field_a = LeaguesScreen.charToString(' ', (byte) -83);
        field_c = "Press F10 to open Quick Chat.";
    }
}
