/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenErrorDialog extends ResizableDialog implements ButtonActivationListener {
    static int previousUiPointerButton;
    static float spawnIntervalScale;
    private ButtonWidget closeButton;
    static String menuText;
    static int nextUpdateTimeHistoryIndex;
    static int alternateArchivePort;
    static String createPasswordTooltipText;

    private final ButtonWidget appendFullscreenDialogButton(String buttonText, byte methodGuard, WidgetListener listener) {
        ButtonWidget button = null;
        RuntimeException buttonFailureForContext = null;
        int buttonTop = 0;
        ButtonWidget buttonBeforeReturn = null;
        RuntimeException buttonFailureBeforeDescription = null;
        StringBuilder buttonMessagePrefix = null;
        String textDescription = null;
        StringBuilder messageBeforeListener = null;
        String listenerDescription = null;
        RuntimeException caughtButtonFailure = null;
        try {
          button = new ButtonWidget(buttonText, listener);
          if (methodGuard != 87) {
            previousUiPointerButton = 121;
          }
          button.renderer = (WidgetRenderer) ((Object) new SpriteButtonRenderer());
          buttonTop = this.widgetHeight - 6;
          this.widgetHeight = this.widgetHeight + 38;
          button.setWidgetBounds(30, -14 + (this.widgetWidth - 16), (byte) -111, buttonTop, 15);
          this.addChild((byte) -70, button);
          this.refreshLayout(methodGuard - 198);
          buttonBeforeReturn = button;
          return buttonBeforeReturn;
        } catch (java.lang.RuntimeException buttonFailure) {
          caughtButtonFailure = buttonFailure;
          buttonFailureForContext = caughtButtonFailure;
          buttonFailureBeforeDescription = buttonFailureForContext;
          buttonMessagePrefix = new StringBuilder().append("ij.B(");
          if (buttonText == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          messageBeforeListener = ((StringBuilder) (Object) buttonMessagePrefix).append(textDescription).append(',').append(methodGuard).append(',');
          if (listener == null) {
            listenerDescription = "null";
          } else {
            listenerDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) buttonFailureBeforeDescription), ((StringBuilder) (Object) messageBeforeListener).append(listenerDescription).append(')').toString());
        }
    }

    public static void releaseStaticReferences(byte methodGuard) {
        menuText = null;
        if (methodGuard > 0) {
            FullscreenErrorDialog.releaseStaticReferences((byte) 25);
            createPasswordTooltipText = null;
            return;
        }
        createPasswordTooltipText = null;
    }

    final static int chooseSpawnEntityCategory(int methodGuard) {
        if (methodGuard <= 18) {
            FullscreenErrorDialog.chooseSpawnEntityCategory(48);
            return AchievementQuery.nextSpriteVariantIndex(MessageDialog.availableEntityCategoryCount, 1);
        }
        return AchievementQuery.nextSpriteVariantIndex(MessageDialog.availableEntityCategoryCount, 1);
    }

    FullscreenErrorDialog(DialogLayer dialogLayer, FullscreenFailureReason failureReason) {
        super(dialogLayer, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        UiWidget var4 = null;
        try {
          var3 = null;
          if (TextInputValidator.fullscreenUnavailableFailureReason == failureReason) {
            var3 = AccountContentDialog.fullscreenUnavailableTrySignedAppletText;
          } else {
            if (failureReason == AccountContentDialog.fullscreenFocusLostFailureReason) {
              var3 = NodeHashTableIterator.fullscreenFocusText;
              this.widgetHeight = this.widgetHeight + 10;
              if (EntitySpawnSupport.isCanvasResizeAllowed(true)) {
                var3 = MidiNoteMixer.fullscreenFocusOrResolutionText;
                this.widgetHeight = this.widgetHeight + 20;
              }
            } else {
              if (failureReason == LimitedRandomAccessFile.fullscreenTimeoutFailureReason) {
                var3 = MessageDialog.fullscreenTimeoutText;
                this.widgetHeight = this.widgetHeight + 30;
              }
            }
          }
          var4 = new UiWidget((String) (var3), (WidgetListener) null);
          var4.widgetX = 0;
          var4.widgetHeight = 80;
          var4.widgetWidth = this.widgetWidth;
          var4.widgetY = 50;
          var4.renderer = (WidgetRenderer) ((Object) new TextWidgetRenderer(UiFontResources.commonUiSmallFont, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.addChild((byte) -91, var4);
          this.closeButton = this.appendFullscreenDialogButton(UiFontResources.fullscreenCloseButtonText, (byte) 87, (WidgetListener) (this));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ij.<init>(");
          if (dialogLayer == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (failureReason == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void hideFullscreenError(byte methodGuard) {
        if (!this.dialogVisible) {
            return;
        }
        int var2 = 102 / ((methodGuard - 6) / 43);
        this.dialogVisible = false;
    }

    public final void onButtonActivated(int param0, byte param1, int param2, int param3, ButtonWidget param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 == this.closeButton) {
            this.hideFullscreenError((byte) 122);
          }
          if (param1 == -20) {
            return;
          }
          alternateArchivePort = -95;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ij.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void drawAvatarFaceOrCryFrame(byte methodGuard) {
        int avatarEyeMouthOffsetX = 0;
        int avatarEyeMouthOffsetY = 0;
        if (!UiWidget.gameplaySession.sessionEnding) {
            avatarEyeMouthOffsetX = UiWidget.gameplaySession.boardMaskOffsetX - 2;
            avatarEyeMouthOffsetY = UiWidget.gameplaySession.boardMaskOffsetY - 2;
            if (!(WidgetTheme.avatarShockEffectTicks <= 0)) {
                SecondaryNodeHashTable.silverStarShockFrames[IndexedSpriteState.avatarShockFrameIndex].draw(320 - (SecondaryNodeHashTable.silverStarShockFrames[IndexedSpriteState.avatarShockFrameIndex].fullWidth >> 1), -(SecondaryNodeHashTable.silverStarShockFrames[IndexedSpriteState.avatarShockFrameIndex].fullHeight >> 1) + 240);
            }
            EndingAnimationSupport.avatarEyeFrames[DiskCacheWorker.avatarFeedbackFrameIndex].drawGrayModulated(avatarEyeMouthOffsetX + 320, 240 + avatarEyeMouthOffsetY, DisplayModeInfo.avatarTintColor);
            UsernameSuggestionsPanel.avatarMouthFrames[TextValidationFailure.avatarFeedbackModeId].drawGrayModulated(320 + avatarEyeMouthOffsetX, 240 + avatarEyeMouthOffsetY, DisplayModeInfo.avatarTintColor);
            if (methodGuard >= 3) {
                return;
            }
            menuText = (String) null;
            return;
        }
        if (null == MatchCandidateSupport.currentAvatarCryFrame) {
            avatarEyeMouthOffsetX = UiWidget.gameplaySession.boardMaskOffsetX - 2;
            avatarEyeMouthOffsetY = UiWidget.gameplaySession.boardMaskOffsetY - 2;
            if (!(WidgetTheme.avatarShockEffectTicks <= 0)) {
                SecondaryNodeHashTable.silverStarShockFrames[IndexedSpriteState.avatarShockFrameIndex].draw(320 - (SecondaryNodeHashTable.silverStarShockFrames[IndexedSpriteState.avatarShockFrameIndex].fullWidth >> 1), -(SecondaryNodeHashTable.silverStarShockFrames[IndexedSpriteState.avatarShockFrameIndex].fullHeight >> 1) + 240);
            }
            EndingAnimationSupport.avatarEyeFrames[DiskCacheWorker.avatarFeedbackFrameIndex].drawGrayModulated(avatarEyeMouthOffsetX + 320, 240 + avatarEyeMouthOffsetY, DisplayModeInfo.avatarTintColor);
            UsernameSuggestionsPanel.avatarMouthFrames[TextValidationFailure.avatarFeedbackModeId].drawGrayModulated(320 + avatarEyeMouthOffsetX, 240 + avatarEyeMouthOffsetY, DisplayModeInfo.avatarTintColor);
            if (methodGuard >= 3) {
                return;
            }
            menuText = (String) null;
            return;
        }
        MatchCandidateSupport.currentAvatarCryFrame.draw(-(MatchCandidateSupport.currentAvatarCryFrame.fullWidth >> 1) + 319, -(MatchCandidateSupport.currentAvatarCryFrame.fullHeight >> 1) + 240);
        if (methodGuard >= 3) {
            return;
        }
        menuText = (String) null;
    }

    static {
        previousUiPointerButton = 0;
        menuText = "Menu";
        spawnIntervalScale = 0.5f;
        createPasswordTooltipText = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
