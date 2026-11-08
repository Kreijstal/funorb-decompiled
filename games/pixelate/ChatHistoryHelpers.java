/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatHistoryHelpers {
    static SceneWidget field_b;
    static String field_d;
    static int field_a;
    static String field_e;
    static boolean field_c;

    final static void clearChatHistory(boolean param0) {
        int var1_int = 0;
        int var2 = Pixelate.field_H ? 1 : 0;
        try {
          for (var1_int = 0; var1_int < AlphaContainer.field_L; var1_int++) {
            MenuScreen.field_e[var1_int] = null;
          }
          if (!param0) {
            ChatHistoryHelpers.clearChatHistory(false);
          }
          AlphaContainer.field_L = 0;
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "ek.B(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        int var1 = -83 / ((param0 + 65) / 59);
        field_b = null;
        field_e = null;
    }

    static {
        field_a = 0;
        field_e = "That name is not available";
        field_c = false;
        field_d = "You have been removed from <%0>'s game.";
    }
}
