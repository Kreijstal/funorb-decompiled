/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatInputSupport {
    static String raIntroNoName;
    static byte[][] field_j;
    static String runescapeclan;
    static int field_a;
    static String muXEnteredGame;
    static String muGameoptKickXFromThisGame;
    static boolean field_h;
    static String field_g;
    static String close;
    static ModelInstance[] field_l;
    static int field_b;
    static String xsGame;

    final static void a(byte param0, int param1) {
        ByteRecordSubmission.field_q = CanvasInputAttachmentSupport.field_g[param1];
        BufferedFile.field_b = CueAim.field_i[param1];
        if (param0 < -55) {
          SingleChildWidget.field_F = AwtEventQueueSupport.field_f[param1];
          return;
        }
        field_j = (byte[][]) null;
        SingleChildWidget.field_F = AwtEventQueueSupport.field_f[param1];
    }

    final static boolean handleChatKey(int param0, int param1, int param2) {
        StringBuilder discarded$1 = null;
        int var3;
        int var4;
        String var5_ref_String;
        int var5;
        int var6;
        String var8;
        int var10;
        int var11;
        String var12;
        String var13;
        String var14;
        String var15;
        String var16;
        String var65;
        String var66;
        String var67;
        String var68;
        String var69;
        String var70;
        String var71;
        String var72;
        String var73;
        String var74;
        String var75;
        String var76;
        String var77;
        String var78;
        String var79;
        Object var80;
        Object var81;
        Object var82;
        Object var83;
        Object var84;
        CharSequence var89;
        int var6Lifetime1;
        String var8Lifetime1;
        String var8Lifetime2;
        var80 = null;
        var81 = null;
        var82 = null;
        var83 = null;
        var84 = null;
        var3 = 1 / ((param1 - 10) / 61);
        var4 = 1;
        if (!LoginTextSupport.field_b &&
          Bzip2DecoderState.field_D == null) {
          var4 = 0;
        }
        if (CookieDateSupport.field_b == 0 &&
          null != LookupRetrySupport.field_e) {
          var4 = 0;
        }
        if (CookieDateSupport.field_b == 2 &&
          !SupportPageLauncher.isQuickChatRecipientAvailable(false)) {
          var4 = 0;
        }
        if (IterableDualLinkDeque.field_a == 84) {
          if (var4 == 0) {
            if (CookieDateSupport.field_b == 0) {
              return true;
            }
          } else {
            if (Base37Support.field_c.length() > 0) {
              var5_ref_String = Base37Support.field_c.toString();
              var8 = var5_ref_String;
              var8Lifetime2 = var5_ref_String;
              if (UiWidget.containsPassword((byte) -71, var5_ref_String)) {
                var13 = (String) null;
                var12 = (String) null;
                MenuScreenBase.appendChatMessage(0, QuickChatDynamicCommand.unableToSendMessagePasswordA, (String) null, 2, (String) null, true);
                var15 = (String) null;
                var14 = (String) null;
                MenuScreenBase.appendChatMessage(0, DebugTuningSlider.unableToSendMessagePasswordB, (String) null, 2, (String) null, true);
              } else {
                var6 = CookieDateSupport.field_b;
                if (var6 == 0 &&
                  null != HighscoresScreen.field_L) {
                  var6 = 1;
                }
                if (LobbyPanelLayoutSupport.getChatFilterMode(5, var6) == 2) {
                  TextInputPainter.setChatFilterMode(1, var6, param0, (byte) -4);
                }
                AlternateLongAndTextLoginPayload.a((byte) -116, var5_ref_String, param2, ArrayWidgetGroup.field_I, CookieDateSupport.field_b, -1);
              }
            }
          }
          ProjectedLineSupport.resetChatComposition(14851);
          return true;
        }
        if (IterableDualLinkDeque.field_a == 85) {
          if (var4 != 0 &&
            Base37Support.field_c.length() > 0) {
            TikiTableScene.resizeStringBuilder(' ', -1 + Base37Support.field_c.length(), -2790, Base37Support.field_c);
            return true;
          }
          return true;
        }
        var5 = LoginMethod.field_b;
        if (!UiTheme.isRenderableCharacter((char) var5, (byte) -125)) {
          return false;
        }
        if (var4 == 0) {
          return true;
        }
        if (80 > Base37Support.field_c.length()) {
          discarded$1 = Base37Support.field_c.append((char) var5);
          var6Lifetime1 = 485;
          var65 = ResourceArchive.field_j;
          var16 = IterableNodeHashTable.prependAccountBadge(524288, var65);
          var66 = var16;
          if (CookieDateSupport.field_b != 2) {
            var8Lifetime1 = "";
            boolean decompiledFrameRemainder1 = true;
            if (CookieDateSupport.field_b != 0) {
              var67 = var8Lifetime1 + var66 + ": ";
              var6Lifetime1 = var6Lifetime1 - RatingTextState.field_c.stringWidth(var67);
            } else {
              if (null == HighscoresScreen.field_L) {
                if (!JaggrabDownloader.field_l) {
                  boolean decompiledFrameRemainder0 = true;
                  if (HighscoresScreen.field_L != null) {
                    if (!CollisionContact.field_c) {
                      var70 = "[" + AccountWelcomePanel.substituteTemplateArguments(new String[]{HighscoresScreen.field_L.field_Ob}, -1, xsGame) + "] ";
                      var71 = var70 + var66 + ": ";
                      var6Lifetime1 = var6Lifetime1 - RatingTextState.field_c.stringWidth(var71);
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      if (PlayerContextMenu.field_g == null) {
                        var68 = "[" + AccountWelcomePanel.substituteTemplateArguments(new String[]{HighscoresScreen.field_L.field_Ob}, -1, xsGame) + "] ";
                        var69 = var68 + var66 + ": ";
                        var6Lifetime1 = var6Lifetime1 - RatingTextState.field_c.stringWidth(var69);
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        var8Lifetime1 = "[" + PlayerContextMenu.field_g + "] ";
                      }
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    var72 = var8Lifetime1 + var66 + ": ";
                    var6Lifetime1 = var6Lifetime1 - RatingTextState.field_c.stringWidth(var72);
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  var8Lifetime1 = "[" + BirthDateValidator.muChatLobby + "] ";
                }
              }
              if (decompiledFrameRemainder1) {
                if (HighscoresScreen.field_L != null) {
                  if (!CollisionContact.field_c) {
                    var75 = "[" + AccountWelcomePanel.substituteTemplateArguments(new String[]{HighscoresScreen.field_L.field_Ob}, -1, xsGame) + "] ";
                    var76 = var75 + var66 + ": ";
                    var6Lifetime1 = var6Lifetime1 - RatingTextState.field_c.stringWidth(var76);
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    if (PlayerContextMenu.field_g == null) {
                      var73 = "[" + AccountWelcomePanel.substituteTemplateArguments(new String[]{HighscoresScreen.field_L.field_Ob}, -1, xsGame) + "] ";
                      var74 = var73 + var66 + ": ";
                      var6Lifetime1 = var6Lifetime1 - RatingTextState.field_c.stringWidth(var74);
                      decompiledFrameRemainder1 = false;
                    }
                    else {
                      var8Lifetime1 = "[" + PlayerContextMenu.field_g + "] ";
                    }
                  }
                }
                if (decompiledFrameRemainder1) {
                  var77 = var8Lifetime1 + var66 + ": ";
                  var6Lifetime1 = var6Lifetime1 - RatingTextState.field_c.stringWidth(var77);
                }
              }
            }
            if (RatingTextState.field_c.stringWidth(Base37Support.field_c.toString()) > var6Lifetime1) {
              TikiTableScene.resizeStringBuilder(' ', -1 + Base37Support.field_c.length(), -2790, Base37Support.field_c);
            }
            return true;
          }
          var89 = (CharSequence) ((Object) ArrayWidgetGroup.field_I);
          var78 = AccountWelcomePanel.substituteTemplateArguments(new String[]{WidgetContainer.normalizeBase37Name(false, var89)}, -1, SpriteSheetLoadSupport.privatequickchatToX);
          var79 = AccountWelcomePanel.substituteTemplateArguments(new String[]{var16}, -1, UiComponent.privatequickchatFromX);
          var10 = RatingTextState.field_c.stringWidth(var78);
          var11 = RatingTextState.field_c.stringWidth(var79);
          if (var10 <= var11) {
            var6Lifetime1 = var6Lifetime1 - var11;
            if (RatingTextState.field_c.stringWidth(Base37Support.field_c.toString()) > var6Lifetime1) {
              TikiTableScene.resizeStringBuilder(' ', -1 + Base37Support.field_c.length(), -2790, Base37Support.field_c);
            }
            return true;
          }
          var6Lifetime1 = var6Lifetime1 - var10;
          if (RatingTextState.field_c.stringWidth(Base37Support.field_c.toString()) <= var6Lifetime1) {
            return true;
          }
          TikiTableScene.resizeStringBuilder(' ', -1 + Base37Support.field_c.length(), -2790, Base37Support.field_c);
        }
        return true;
    }

    public static void releaseStatics(int param0) {
        muXEnteredGame = null;
        field_j = (byte[][]) null;
        field_g = null;
        runescapeclan = null;
        field_l = null;
        if (param0 == 15059) {
          muGameoptKickXFromThisGame = null;
          close = null;
          raIntroNoName = null;
          xsGame = null;
          return;
        }
        xsGame = (String) null;
        muGameoptKickXFromThisGame = null;
        close = null;
        raIntroNoName = null;
        xsGame = null;
    }

    final static void quickSortRange(int param0, int param1, int[] param2, int[] param3, int param4) {
        int var10 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        try {
          if (param4 > param0) {
            var5_int = (param4 + param0) / 2;
            var6 = param0;
            var7 = param2[var5_int];
            param2[var5_int] = param2[param4];
            param2[param4] = var7;
            var8 = param3[var5_int];
            param3[var5_int] = param3[param4];
            param3[param4] = var8;
            stackIn_4_0 = (var7 == 2147483647) ? 0 : 1;
            var9 = stackIn_4_0;
            for (var10 = param0; param4 > var10; var10++) {
              if (param2[var10] < (var10 & var9) + var7) {
                var11 = param2[var10];
                param2[var10] = param2[var6];
                param2[var6] = var11;
                var12 = param3[var10];
                param3[var10] = param3[var6];
                param3[var6++] = var12;
              }
            }
            param2[param4] = param2[var6];
            param2[var6] = var7;
            param3[param4] = param3[var6];
            param3[var6] = var8;
            ChatInputSupport.quickSortRange(param0, -30916, param2, param3, var6 - 1);
            ChatInputSupport.quickSortRange(var6 + 1, param1 + 0, param2, param3, param4);
          }
          if (param1 != -30916) {
            ChatInputSupport.handleChatKey(-19, 83, -97);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("th.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void closeQuickChat(int obfuscationGuard) {
        if (obfuscationGuard == -1) {
          if (ArrayWidgetGroup.field_H) {
            DialogLayer.hideQuickChatOverlay(obfuscationGuard + 15976);
          }
          return;
        }
        ChatInputSupport.a((byte) -3, 101);
        if (ArrayWidgetGroup.field_H) {
          DialogLayer.hideQuickChatOverlay(obfuscationGuard + 15976);
        }
    }

    static {
        muGameoptKickXFromThisGame = "Kick <%0> from this game";
        field_j = new byte[250][];
        raIntroNoName = "To report a player, right-click on their name and select the option to report abuse.";
        runescapeclan = "RuneScape clan";
        field_b = 1;
        close = "Close";
        muXEnteredGame = "<%0> has entered a game.";
        field_h = false;
        field_g = null;
        xsGame = "<%0>'s game";
    }
}
