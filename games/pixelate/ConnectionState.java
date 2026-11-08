/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConnectionState {
    static Sprite field_a;
    static int field_c;
    static java.applet.Applet field_b;

    public static void releaseStatics(int param0) {
        field_b = null;
        field_a = null;
        if (param0 == 70) {
          return;
        }
        ConnectionState.updateChatPanel((byte) -62, false, -83, 24);
    }

    final static void updateChatPanel(byte param0, boolean param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        SceneWidget var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        ChatMessage var9 = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          if (MatchingTextValidator.field_o != ClientException.field_f.field_i) {
            SpriteBuildHelpers.field_i = SpriteBuildHelpers.field_i + (ClientException.field_f.field_i - MatchingTextValidator.field_o);
            MatchingTextValidator.field_o = ClientException.field_f.field_i;
          }
          if (param0 > -50) {
            return;
          }
          if (HuffmanCodec.field_b < MusicPlaybackHelpers.field_c) {
            HuffmanCodec.field_b = HuffmanCodec.field_b + 1;
          }
          if (HuffmanCodec.field_b <= 0) {
            return;
          }
          LobbySlideHelpers.layoutSlidingLobbyPanel(-96);
          Cp1252DecodeHelpers.field_i.updateInputFullScreen(-28476, param1);
          if (PuzzleModePictureHelpers.field_b != null) {
            if (!SoundVoice.field_q) {
              PuzzleModePictureHelpers.field_b = null;
            } else {
              PuzzleModePictureHelpers.field_b.handlePointerEvents(Cp1252DecodeHelpers.field_i.screenY, param1, (byte) 99, Cp1252DecodeHelpers.field_i.field_tb);
            }
          }
          for (var4_int = 0; 5 > var4_int; var4_int++) {
            var5 = ResourceArchive.field_f[var4_int];
            if (var5 != null) {
              if (var5.field_P != 0) {
                DiskCacheRequest.openChatFilterMenu((byte) -13, var5, var4_int);
              }
              var6 = IterableNodeHashTable.getChatFilterMode(var4_int, 0);
              ResourceArchive.field_h[var4_int].field_H = Checkbox.field_V[var6];
              DelegatingCanvas.field_e[var4_int].field_cb = LoginCredentials.field_a[var6];
            }
          }
          if (0 != GradientOutlineTextPainter.field_u.field_P) {
            AccountTermsPanel.field_M = new ReportAbuseDialog(GradientOutlineTextPainter.field_u.field_tb, GradientOutlineTextPainter.field_u.screenY, GradientOutlineTextPainter.field_u.field_K, GradientOutlineTextPainter.field_u.height, param3, VolumeControlledVoice.field_o, ScorePopup.field_i, Vector3.field_f, TextFieldValidator.field_h, SavedDataRequest.field_q, DefaultQuickChatPhraseListener.field_c, (String) null, 0L);
          }
          var9 = CacheReference.rebuildChatHistoryWidgets((byte) -110, RankingSummaryScreen.field_q, param2, MouseWheelHandler.field_c);
          if (var9 != null) {
            MouseInputGlobals.openChatMessageContextMenu(var9, (byte) 125);
          }
          var8 = MeshDecodeHelpers.buildChatInputPrompt((byte) 88);
          if (var8 == null) {
            return;
          }
          PuzzleThumbnail.field_o = var8;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ChatMessage.addExceptionContext((Throwable) ((Object) var4), "bd.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean shouldShowBootstrapLoadingScreen(boolean param0) {
        if (!param0) {
          field_a = (Sprite) null;
          if (AchievementRecord.field_q < 20) {
            return true;
          }
          if (!LoadingStepTracker.isLobbyUiReady(106)) {
            return true;
          }
          if (NineSliceSpriteFactory.field_g <= 0) {
            return false;
          }
          if (!ChatHistoryAllocator.alwaysTrue(-81)) {
            return true;
          }
          return false;
        }
        if (AchievementRecord.field_q < 20) {
          return true;
        }
        if (!LoadingStepTracker.isLobbyUiReady(106)) {
          return true;
        }
        if (NineSliceSpriteFactory.field_g <= 0) {
          return false;
        }
        if (!ChatHistoryAllocator.alwaysTrue(-81)) {
          return true;
        }
        return false;
    }

    final boolean isConnectionActive(int param0) {
        if (param0 != -21) {
          return true;
        }
        if (BoardView.field_b == this) {
          return true;
        }
        if (ConnectionStateGlobals.field_d == this) {
          return true;
        }
        if (Pixelate.field_G != this) {
          return false;
        }
        return true;
    }

    final static void clearSocialLists(byte param0) {
        DualLinkNode var1 = null;
        int var2 = Pixelate.field_H ? 1 : 0;
        DualLinkNode var1Lifetime1;
        try {
          ReflectionCheckRequest.field_t = 0;
          DialWidgetPainter.field_q = 0;
          LabeledField.field_L = null;
          if (param0 != -1) {
            field_c = 75;
          }
          VerticalScrollbar.field_Hb.clear(param0 - 110);
          LegacyMenuBuilder.field_b.clear(-127);
          var1 = LobbyGameLookupHelpers.field_b.first(-89);
          while (var1 != null) {
            var1.unlinkSecondary(17);
            var1 = LobbyGameLookupHelpers.field_b.next((byte) 50);
          }
          var1Lifetime1 = GameResultsScreen.field_q.first(-84);
          while (var1Lifetime1 != null) {
            var1Lifetime1.unlinkSecondary(17);
            var1Lifetime1 = GameResultsScreen.field_q.next((byte) 50);
          }
          ValidatedTextWidget.field_db = 0;
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "bd.A(" + param0 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_a = new Sprite(270, 70);
    }
}
