/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatPanelUpdateHelpers {
    static IntrusiveDeque field_d;
    static AudioOutput field_c;
    static String field_a;
    static String textDetail;
    static boolean field_e;

    public static void releaseStatics(int param0) {
        field_a = null;
        field_d = null;
        if (param0 >= -32) {
          return;
        }
        field_c = null;
        textDetail = null;
    }

    final static void updateChatPanel(int param0, int param1, int param2, boolean param3) {
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        SpriteWidget var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        ChatMessage var9 = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          if (EmailValidator.field_t > Bzip2State.field_D) {
            Bzip2State.field_D = Bzip2State.field_D + 1;
          }
          if (IntrusiveDeque.field_h != LoginPanel.field_M.field_b) {
            EmailDomainValidationHelpers.field_c = EmailDomainValidationHelpers.field_c + (LoginPanel.field_M.field_b - IntrusiveDeque.field_h);
            IntrusiveDeque.field_h = LoginPanel.field_M.field_b;
          }
          if (0 >= Bzip2State.field_D) {
            return;
          }
          MusicVolumeAndOverlayHelpers.animateLobbyOverlayBounds(param1 - 39);
          ClientEnvironmentHelpers.field_c.updateInputFullScreen(param3, (byte) 125);
          if (null != CameraAndLogoHelpers.field_c) {
            if (FrameSkin.field_f) {
              CameraAndLogoHelpers.field_c.processPointerFrame(ClientEnvironmentHelpers.field_c.field_J, ClientEnvironmentHelpers.field_c.field_Bb, (byte) -128, param3);
            } else {
              CameraAndLogoHelpers.field_c = null;
            }
          }
          for (var4_int = 0; 5 > var4_int; var4_int++) {
            var5 = NodeHashTable.field_i[var4_int];
            if (var5 != null) {
              if (var5.field_nb != 0) {
                ClientServiceHelpers.openChatFilterMenu(var5, var4_int, 20435);
              }
              var6 = UiTheme.getChatFilterSetting(var4_int, (byte) 119);
              BoundedUrlRequest.field_g[var4_int].normalSprite = NodeHashTableIterator.chatFilterIcons[var6];
              QuickChatPhraseDefinition.field_o[var4_int].field_V = PendingHighscoreRequest.field_i[var6];
            }
          }
          if (~AccountCreationSupport.field_d.field_nb != param1) {
            SpriteWidget.field_yb = new ReportAbuseDialog(AccountCreationSupport.field_d.field_Bb, AccountCreationSupport.field_d.field_J, AccountCreationSupport.field_d.field_K, AccountCreationSupport.field_d.field_ub, param2, LobbySessionHelpers.field_e, ByteStorage.field_a, IterableDualLinkDeque.field_b, LinkTextPainter.field_h, ValidatedTextWidget.field_Z, IntrusiveDequeCursor.field_e, (String) null, 0L);
          }
          var9 = QueuedResultSubmission.rebuildChatHistoryRows(param1 ^ 1402, param0, PopupMenuDrawHelpers.field_d, LobbySortHelpers.field_e);
          if (var9 != null) {
            BirthDateInputWidget.openChatMessageContextMenu(-44, var9);
          }
          var8 = UiTheme.buildChatInputPrompt(3063);
          if (var8 == null) {
            return;
          }
          QuickChatCategoryCache.field_g = var8;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var4), "ac.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_a = "Report abuse";
        field_e = false;
        textDetail = "Detail: ";
    }
}
