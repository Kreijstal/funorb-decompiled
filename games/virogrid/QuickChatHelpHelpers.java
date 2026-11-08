/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatHelpHelpers {
    static LoginMethod field_b;
    static LoginPanel field_a;
    static String field_c;
    static String field_d;
    static String field_f;
    static int field_e;

    public static void releaseStatics(boolean param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        if (!param0) {
          field_f = null;
          field_c = null;
          return;
        }
        QuickChatHelpHelpers.openQuickChatHelp((byte) 74);
        field_f = null;
        field_c = null;
    }

    final static void openQuickChatHelp(byte param0) {
        int var1 = 65 / ((param0 - 27) / 34);
        BackgroundParticle.field_j = new HelpPopup(LobbySessionHelpers.field_e, ByteStorage.field_a, IterableDualLinkDeque.field_b, LinkTextPainter.field_h, ValidatedTextWidget.field_Z, IntrusiveDequeCursor.field_e);
    }

    static {
        field_b = new LoginMethod("email");
        field_c = "Waiting for graphics";
    }
}
