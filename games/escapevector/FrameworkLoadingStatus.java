/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FrameworkLoadingStatus {
    static QuickChatDynamicCommand field_a;
    static String field_b;
    static long field_c;

    public static void releaseStatics(int guard) {
        if (guard < 40) {
          field_b = (String) null;
          field_a = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_b = null;
    }

    final static String loadingMessage(int guard) {
        if (AccountNoticeKind.frameworkLoadingStage < 2) {
          return LoginMethod.field_a;
        }
        if (PasswordValidator.field_p != null) {
          if (!PasswordValidator.field_p.ensureIndex(0)) {
            return AlphaContainer.field_H;
          }
          return HighscoreTable.field_g;
        }
        if (!ii.field_a.ensureIndex(0)) {
          return TextFieldValidator.field_l;
        }
        if (!ii.field_a.tryLoadNamedGroup(0, "commonui")) {
          return DebouncedValidator.field_d + " - " + ii.field_a.namedGroupProgress("commonui", 0) + "%";
        }
        if (!LoadingProgressDialog.field_ab.ensureIndex(0)) {
          return CipherPacketBuffer.field_o;
        }
        if (!LoadingProgressDialog.field_ab.tryLoadNamedGroup(0, "commonui")) {
          return NanoTickClock.field_h + " - " + LoadingProgressDialog.field_ab.namedGroupProgress("commonui", guard ^ 1) + "%";
        }
        if (guard != 1) {
          field_a = (QuickChatDynamicCommand) null;
        }
        if (!AlternateUsernameCredentials.field_j.ensureIndex(0)) {
          return QuickChatPhraseCache.field_a;
        }
        if (!AlternateUsernameCredentials.field_j.tryLoadAllGroups((byte) -119)) {
          return IntrusiveDequeCursor.field_b + " - " + AlternateUsernameCredentials.field_j.overallProgress(-67) + "%";
        }
        return field_b;
    }

    static {
        field_a = new QuickChatDynamicCommand(12, 0, 1, 0);
        field_b = "Please wait...";
    }
}
