/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RegistrationResponseDialog extends AccountMessageDialog implements WidgetActionListener {
    private boolean registrationResponseHandled;
    private AccountRegistrationPanel registrationPanel;
    static int tableSubmissionSequence;
    private boolean ineligibleResponse;

    final static void a(int param0, RasterCacheSurface param1, int param2, RgbSprite param3, int param4, boolean param5) {
        try {
          if (param5) {
            tableSubmissionSequence = -58;
          }
          IndexedSpriteGeometry.pushSpriteRaster(-77, param1.sprite);
          Rasterizer2D.fillVerticalGradient(0, 0, param1.width, param1.height, FontRequestHelpers.farmBackgroundColors[param0], 22953);
          param3.b((-param3.canvasWidth + param1.width) / 2 - 80 / param2, -param3.canvasHeight + (param1.height + param4 - 201 / param2), 41, 110);
          RasterStackHelpers.popRaster(-107);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "qf.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean tickLayerAndCheckHidden(int obfuscationGuard) {
        if (obfuscationGuard != 0) {
          return true;
        }
        if (!this.visible) {
          return super.tickLayerAndCheckHidden(0);
        }
        if (this.registrationResponseHandled) {
          return super.tickLayerAndCheckHidden(0);
        }
        AccountResponse var2 = SoundPlayback.a(106);
        if (var2 != null) {
          this.handleRegistrationResponse(-7, var2, false);
          return super.tickLayerAndCheckHidden(0);
        }
        return super.tickLayerAndCheckHidden(0);
    }

    final static int packChatFilters(int obfuscationGuard) {
        if (obfuscationGuard == 248) {
          return WeightedLruCache.privateChatFilter + ((InstructionsScreen.gameChatFilter << 2) + (InstructionsScreen.lobbyChatFilter << 4));
        }
        tableSubmissionSequence = 19;
        return WeightedLruCache.privateChatFilter + ((InstructionsScreen.gameChatFilter << 2) + (InstructionsScreen.lobbyChatFilter << 4));
    }

    RegistrationResponseDialog(WidgetLayerStack layerStack, AccountRegistrationPanel registrationPanel) {
        super(layerStack, FontSceneGlobals.field_a, MidiSynthesizer.field_o, false, false);
        try {
          this.registrationPanel = registrationPanel;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "qf.<init>(" + (layerStack != null ? "{...}" : "null") + ',' + (registrationPanel != null ? "{...}" : "null") + ')');
        }
    }

    final void showIneligibleResponse(boolean skipIneligibleAction) {
        this.handleRegistrationResponse(-7, AchievementIcon.a(248, -85, CircleBody.field_q), skipIneligibleAction);
    }

    public final void onAction(int pointerY, int button, byte obfuscationGuard, int pointerX, FocusableWidget widget) {
        if (this.ineligibleResponse) {
          ArrayWidgetGroup.a((byte) -16, true, false);
          return;
        }
        if (obfuscationGuard >= -22) {
          return;
        }
        try {
          FullscreenFailureDialog.l(64);
          this.closeDialog(17);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "qf.Q(" + pointerY + ',' + button + ',' + obfuscationGuard + ',' + pointerX + ',' + (widget != null ? "{...}" : "null") + ')');
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    private final void handleRegistrationResponse(int obfuscationGuard, AccountResponse response, boolean skipIneligibleAction) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String message = null;
        RuntimeException var4_ref = null;
        DialogMessagePanel messagePanel = null;
        int unusedGameFlag = 0;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          this.registrationResponseHandled = true;
          if (response.success) {
            message = FramedMenuScreen.field_r;
          } else {
            if (null != response.suggestedUsernames) {
              message = ScreenNavigationHelpers.field_f;
              if (null != this.registrationPanel) {
                this.registrationPanel.onRefreshUsernameSuggestions((byte) 124);
              }
            } else {
              message = response.message;
              if (response.responseCode == 248) {
                if (!skipIneligibleAction) {
                  CachedArchiveSource.e(-77);
                }
                this.ineligibleResponse = true;
                message = CircleBody.field_q;
              }
            }
          }
          messagePanel = new DialogMessagePanel((AccountMessageDialog) (this), FontSceneGlobals.field_a, message);
          if (response.success) {
            if (response.underThirteen) {
              this.transitionToContent((byte) 118, new Under13RegistrationNoticePanel(this));
              return;
            }
            messagePanel.appendButton((byte) 126, UsernameSuggestionPanel.field_L, (WidgetListener) (this));
          } else {
            if (this.ineligibleResponse) {
              messagePanel.appendButton((byte) -37, UsernameSuggestionPanel.field_L, (WidgetListener) (this));
            } else {
              if (response.responseCode != 5) {
                messagePanel.addAction(false, HalloweenBackground.field_s, -1);
              } else {
                messagePanel.addAction(false, DialogMessagePanel.field_L, 11);
                messagePanel.addAction(false, HalfRgbBlendHelpers.quitToWebsiteText, 17);
              }
            }
            if (3 == response.responseCode) {
              messagePanel.addAction(false, Ball.field_H, 7);
            } else {
              if (response.responseCode == 6) {
                messagePanel.addAction(false, MatchingTextValidator.field_p, 9);
              }
            }
          }
          this.transitionToContent((byte) 106, messagePanel);
          if (obfuscationGuard == -7) {
            return;
          }
          this.registrationPanel = (AccountRegistrationPanel) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_31_0 = var4_ref;
          stackIn_31_1 = new StringBuilder().append("qf.L(").append(obfuscationGuard).append(',');
          if (response == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(skipIneligibleAction).append(')').toString());
        }
    }

    static {
    }
}
