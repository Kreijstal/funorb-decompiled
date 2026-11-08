/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginPayloadKind {
    static BallSkin field_a;
    static boolean field_d;
    int wireId;
    static String dEFAULTPLAYERNAME;

    final static Sprite achievementPlaceholderSprite(int obfuscationGuard, int achievementIndex) {
        if (obfuscationGuard != -17104) {
          field_a = (BallSkin) null;
          if (UsernameSuggestionsPanel.field_V > 0) {
            return UsernameAvailabilityValidator.field_r;
          }
          if (QuickChatPhraseDefinition.field_w[achievementIndex]) {
            return Camera.field_j;
          }
          return UsernameAvailabilityValidator.field_r;
        }
        if (UsernameSuggestionsPanel.field_V > 0) {
          return UsernameAvailabilityValidator.field_r;
        }
        if (QuickChatPhraseDefinition.field_w[achievementIndex]) {
          return Camera.field_j;
        }
        return UsernameAvailabilityValidator.field_r;
    }

    final static boolean handleQuickChatKey(int param0, int param1, int param2) {
        if (IterableDualLinkDeque.field_a == 13) {
          ChatInputSupport.closeQuickChat(-1);
          return true;
        }
        if (IterableDualLinkDeque.field_a == 102) {
          LobbyPlayer.field_Ub.resetSelection(param0 ^ 30860);
          return true;
        }
        if (param0 != 15585) {
          return true;
        }
        if (null == LobbyPlayer.field_Ub) {
          return false;
        }
        if (LobbyPlayer.field_Ub.handleShortcutKey(param2, param1, 85)) {
          return true;
        }
        return false;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        dEFAULTPLAYERNAME = null;
        int var1 = -29 / ((param0 - 26) / 35);
    }

    LoginPayloadKind(int param0) {
        this.wireId = param0;
    }

    static {
        dEFAULTPLAYERNAME = "Player";
    }
}
