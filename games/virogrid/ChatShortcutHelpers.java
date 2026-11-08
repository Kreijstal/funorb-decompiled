/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatShortcutHelpers {
    static int[] field_c;
    int field_b;
    int field_a;

    final static boolean handleChatShortcutKey(int param0, int param1, boolean param2) {
        String var4 = null;
        String var4Lifetime1;
        String var4Lifetime2;
        String var4Lifetime3;
        if (!param2) {
          ChatShortcutHelpers.releaseStatics(-33);
        }
        int var3 = null != QueuedRequest.field_h ? 1 : 0;
        if (ScrollPane.field_Gb == 9) {
          if (!CachedArchiveSource.canMessage(28977, LoginPanel.field_O, TextMeasureHelpers.field_a, MidiPcmStream.field_F, ProgressMessageDialog.field_ub)) {
            if (10 == ScrollPane.field_Gb) {
              if (var3 != 0) {
                return false;
              }
              QuickChatOpenHelpers.openPublicQuickChat((byte) 86);
              return true;
            }
            if (ScrollPane.field_Gb != 11) {
              return false;
            }
            if (!ViewportController.field_m) {
              return false;
            }
            if (EmailValidator.field_o == 2 &&
              !GameClock.isFriendOrGameMember(PendingHighscoreRequest.field_n, GrowableIntList.field_c, -24236)) {
              return false;
            }
            if (2 != EmailValidator.field_o) {
              if (var3 != 0) {
                return false;
              }
              if (LobbyGame.tryAcquireChatSendPermit(-120)) {
                var4 = (String) null;
                AccountChoicePanel.sendChatMessage(GameKeyHandler.field_d, EmailValidator.field_o, PendingHighscoreRequest.field_n, param0, (byte) 39, (String) null);
              }
              return true;
            }
            if (LobbyGame.tryAcquireChatSendPermit(-120)) {
              var4Lifetime3 = (String) null;
              AccountChoicePanel.sendChatMessage(GameKeyHandler.field_d, EmailValidator.field_o, PendingHighscoreRequest.field_n, param0, (byte) 39, (String) null);
              return true;
            }
            return true;
          }
          if (MidiPcmStream.field_F != 2 &&
            var3 != 0) {
            return false;
          }
          return LoginCredentialType.openQuickChatForRecipient(TextMeasureHelpers.field_a, MidiPcmStream.field_F, -22557, LoginPanel.field_O, ProgressMessageDialog.field_ub);
        }
        if (10 == ScrollPane.field_Gb) {
          if (var3 != 0) {
            return false;
          }
          QuickChatOpenHelpers.openPublicQuickChat((byte) 86);
          return true;
        }
        if (ScrollPane.field_Gb != 11) {
          return false;
        }
        if (!ViewportController.field_m) {
          return false;
        }
        if (EmailValidator.field_o == 2 &&
          !GameClock.isFriendOrGameMember(PendingHighscoreRequest.field_n, GrowableIntList.field_c, -24236)) {
          return false;
        }
        if (2 != EmailValidator.field_o) {
          if (var3 == 0) {
            if (LobbyGame.tryAcquireChatSendPermit(-120)) {
              var4Lifetime1 = (String) null;
              AccountChoicePanel.sendChatMessage(GameKeyHandler.field_d, EmailValidator.field_o, PendingHighscoreRequest.field_n, param0, (byte) 39, (String) null);
              return true;
            }
            return true;
          }
          return false;
        }
        if (LobbyGame.tryAcquireChatSendPermit(-120)) {
          var4Lifetime2 = (String) null;
          AccountChoicePanel.sendChatMessage(GameKeyHandler.field_d, EmailValidator.field_o, PendingHighscoreRequest.field_n, param0, (byte) 39, (String) null);
          return true;
        }
        return true;
    }

    public static void releaseStatics(int param0) {
        if (param0 != 46) {
          field_c = (int[]) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    ChatShortcutHelpers(int param0, int param1, int param2, int param3, int param4) {
        this.field_a = param0;
        this.field_b = param1;
    }

    static {
    }
}
