/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LevelResultSubmission extends IntrusiveNode {
    static SecondaryHashTable lobbyGameIndex;
    int resultWordFour;
    int levelIndex;
    int packId;
    static RgbSprite spaceMidSprite;
    int resultWordThree;
    static String field_j;
    int resultWordTwo;
    static String field_o;
    int resultWordOne;
    static String field_q;
    static String field_s;

    static int a(int param0, int param1) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          stackIn_1_0 = param0 ^ param1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2), "pn.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static String c(int param0) {
        String stackIn_3_0 = null;
        String stackIn_59_0 = null;
        Object stackIn_96_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object var1 = null;
        Object var2 = null;
        String var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var8Lifetime1;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param0 != -9235) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          var1 = null;
          var2 = null;
          if (ScreenNavigationHelpers.quickChatChannel == 0 &&
            null != IncomingPacketHelpers.pendingLobbyGame) {
            var2 = rl.field_a;
          }
          if (2 == ScreenNavigationHelpers.quickChatChannel &&
            !FileCacheStore.b(-21835160)) {
            boolean decompiledSharedTail2 = !(LevelPack.isFriend(0, QuickChatHelpDialog.field_Qb));
            if (!decompiledSharedTail2) {
              var2 = GamePresentationHelpers.formatIndexedText(ScorePopup.field_j, new String[]{DualLinkNode.quickChatRecipient}, (byte) 103);
              decompiledSharedTail2 = (var10 != 0);
            }
            if (decompiledSharedTail2) {
              var2 = GamePresentationHelpers.formatIndexedText(kk.field_c, new String[]{DualLinkNode.quickChatRecipient}, (byte) 103);
            }
            if (TooltipSprite.quickChatMenuOpen) {
              SoundCache.appendSystemChatMessage((byte) 92, 0, (String) null, (String) (var2), (String) null, 2);
              QuickChatParameterType.closeQuickChatIfOpen(1);
            }
          }
          if (null == var2 &&
            !nd.chatPinnedToBottom &&
            null == SoundCache.field_k) {
            var2 = CalendarRankingHelpers.field_h;
          }
          if (null != var2) {
            DateFieldsWidget.a(-115, (String) null, (String) (var2), 0, GameOverlayHelpers.field_d);
          } else {
            var3 = LoadingProgressDialog.field_cb;
            var3 = TextFieldRenderer.a((byte) 82, var3);
            var4 = "";
            var5 = "|";
            var6 = ScreenNavigationHelpers.quickChatChannel;
            var7 = 0;
            if (2 == var6) {
              var4 = GamePresentationHelpers.formatIndexedText(SaveResultsPromptScreen.field_x, new String[]{DualLinkNode.quickChatRecipient}, (byte) 103);
              var8 = GamePresentationHelpers.formatIndexedText(FullscreenFailureDialog.field_fb, new String[]{var3}, (byte) 103);
              var7 = -485 + PasswordValidator.field_n.width + CanvasInputHelpers.field_e.width - (-CachedArchiveSource.chatFont.measureText(var8) + CachedArchiveSource.chatFont.measureText(var4));
              if (0 > var7) {
                var7 = 0;
              }
            }
            if (2 != var6 ||
              var10 != 0) {
              if (0 == var6) {
                if (null == ClientResourceHelpers.currentLobbyGame &&
                  QuickChatParameterType.field_d) {
                  var4 = "[" + ArcticBackground.field_u + "] ";
                }
                if (null != ClientResourceHelpers.currentLobbyGame) {
                  var6 = 1;
                  boolean decompiledSharedTail1 = (!(PowerUp.field_v) ||
                    null == jd.field_b);
                  if (!decompiledSharedTail1) {
                    var4 = "[" + jd.field_b + "] ";
                    decompiledSharedTail1 = (var10 != 0);
                  }
                  if (decompiledSharedTail1) {
                    var4 = "[" + GamePresentationHelpers.formatIndexedText(fm.field_a, new String[]{ClientResourceHelpers.currentLobbyGame.displayName}, (byte) 103) + "] ";
                  }
                }
              }
              if (!UsernameSuggestionPanel.a(param0 + 9142)) {
                stackIn_59_0 = "<img=3>: ";
              } else {
                stackIn_59_0 = ": ";
              }
              var8Lifetime1 = stackIn_59_0;
              var4 = var4 + var3 + var8Lifetime1;
              boolean decompiledSharedTail0 = !(TextWidgetRenderer.field_e);
              if (!decompiledSharedTail0) {
                var4 = "<col=999999>" + var4 + CircleBody.field_s + "</col>";
                var5 = "";
                decompiledSharedTail0 = (var10 != 0);
              }
              if ((decompiledSharedTail0) &&
                (PlayerNameChooserPanel.field_I)) {
                var4 = "<col=999999>" + var4 + MainMenuScreen.field_y + "</col>";
                var5 = "";
              }
              var9 = CachedArchiveSource.chatFont.measureText(var4);
              if (!UsernameSuggestionPanel.a(-112)) {
                if (PasswordValidator.field_n.activeInside &&
                  (-PasswordValidator.field_n.screenX + MusicPatch.pointerX) < var9) {
                  if (!TextWidgetRenderer.field_e) {
                    var1 = MainMenuScreen.field_y;
                  } else {
                    var1 = "Broken!";
                  }
                }
                if (PasswordValidator.field_n.pressedButton != 0 &&
                  var9 > PasswordValidator.field_n.pressLocalX &&
                  !TextWidgetRenderer.field_e) {
                  LevelPackLoader.a(param0 ^ -13455);
                }
              }
            }
            DateFieldsWidget.a(param0 + 9132, var5, var4 + TextFont.escapeAngles(OptionsScreen.field_A.toString()), var7, BackgroundScene.field_i[var6]);
            if (!MatchResultScreen.field_s) {
              CanvasInputHelpers.field_e.activeInside = false;
            }
            if (CanvasInputHelpers.field_e.activeInside) {
              var1 = GamePresentationHelpers.formatIndexedText(AccountDateHelpers.field_b, new String[]{var3, DualLinkNode.quickChatRecipient}, (byte) 103);
            }
          }
          stackIn_96_0 = var1;
          return (String) (stackIn_96_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) (var1), "pn.B(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        try {
          spaceMidSprite = null;
          field_s = null;
          lobbyGameIndex = null;
          field_q = null;
          field_o = null;
          field_j = null;
          if (param0 != -17432) {
            LevelResultSubmission.a(-11);
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "pn.C(" + param0 + ')');
        }
    }

    final static void b(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          WidgetTheme.chatHistoryCategoryLimit = param1;
          BubbleDistortion.chatHistoryCategoryCounts = new int[3];
          ScrollPane.chatHistorySize = 0;
          if (param0 > -4) {
            LevelResultSubmission.c(104);
          }
          UnderwaterBackground.chatHistory = new ChatMessage[param1 * 15];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2), "pn.A(" + param0 + ',' + param1 + ')');
        }
    }

    LevelResultSubmission(int packId, int levelIndex, int resultWordOne, int resultWordTwo, int resultWordThree, int resultWordFour) {
        try {
          this.resultWordOne = resultWordOne;
          this.levelIndex = levelIndex;
          this.resultWordTwo = resultWordTwo;
          this.packId = packId;
          this.resultWordThree = resultWordThree;
          this.resultWordFour = resultWordFour;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "pn.<init>(" + packId + ',' + levelIndex + ',' + resultWordOne + ',' + resultWordTwo + ',' + resultWordThree + ',' + resultWordFour + ')');
        }
    }

    static {
        field_o = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_j = "Score: ";
        field_s = "Spectate <%0>'s game";
        field_q = "Sound: ";
    }
}
