/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatSettingsSupport {
    static ResourceArchive field_a;
    static String field_b;

    final static void unpackChatSettings(byte guard, int packed) {
        LoginDialog.field_pb = 3 & packed >> 4;
        if (2 < LoginDialog.field_pb) {
          LoginDialog.field_pb = 2;
        }
        MenuTitleSupport.field_d = 3 & packed >> 2;
        ChatHistorySupport.field_f = 3 & packed;
        if (guard != 16) {
          ChatSettingsSupport.releaseStatics(17);
        }
        if (MenuTitleSupport.field_d > 2) {
          MenuTitleSupport.field_d = 2;
        }
        if (ChatHistorySupport.field_f > 2) {
          ChatHistorySupport.field_f = 2;
        }
    }

    public static void releaseStatics(int guard) {
        if (guard != 20) {
          field_a = (ResourceArchive) null;
          field_a = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_b = null;
    }

    final static boolean needsFrameworkPreparation(int guard) {
        if (guard != 16836) {
          return false;
        }
        if (20 > AccountNoticeKind.frameworkLoadingStage) {
          return true;
        }
        if (!RepeatedCharacterSupport.isSessionFrameworkReady((byte) -84)) {
          return true;
        }
        if (LaserGateSpan.field_g <= 0) {
          return false;
        }
        if (!NetworkGameClient.i(90)) {
          return true;
        }
        return false;
    }

    static {
        field_b = "Please send me news and updates (I can unsubscribe at any time)";
    }
}
