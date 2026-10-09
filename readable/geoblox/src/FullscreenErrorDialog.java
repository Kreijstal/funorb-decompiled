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
        Object messageOrConstructionFailure = null;
        Object constructionFailureBeforeDescriptions = null;
        StringBuilder constructionMessagePrefix = null;
        String dialogLayerDescription = null;
        StringBuilder constructionMessageBeforeReason = null;
        String failureReasonDescription = null;
        RuntimeException constructionFailure = null;
        UiWidget messageWidget = null;
        try {
          messageOrConstructionFailure = null;
          if (TextInputValidator.fullscreenUnavailableFailureReason == failureReason) {
            messageOrConstructionFailure = AccountContentDialog.fullscreenUnavailableTrySignedAppletText;
          } else {
            if (failureReason == AccountContentDialog.fullscreenFocusLostFailureReason) {
              messageOrConstructionFailure = NodeHashTableIterator.fullscreenFocusText;
              this.widgetHeight = this.widgetHeight + 10;
              if (EntitySpawnSupport.isCanvasResizeAllowed(true)) {
                messageOrConstructionFailure = MidiNoteMixer.fullscreenFocusOrResolutionText;
                this.widgetHeight = this.widgetHeight + 20;
              }
            } else {
              if (failureReason == LimitedRandomAccessFile.fullscreenTimeoutFailureReason) {
                messageOrConstructionFailure = MessageDialog.fullscreenTimeoutText;
                this.widgetHeight = this.widgetHeight + 30;
              }
            }
          }
          messageWidget = new UiWidget((String) (messageOrConstructionFailure), (WidgetListener) null);
          messageWidget.widgetX = 0;
          messageWidget.widgetHeight = 80;
          messageWidget.widgetWidth = this.widgetWidth;
          messageWidget.widgetY = 50;
          messageWidget.renderer = (WidgetRenderer) ((Object) new TextWidgetRenderer(UiFontResources.commonUiSmallFont, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.addChild((byte) -91, messageWidget);
          this.closeButton = this.appendFullscreenDialogButton(UiFontResources.fullscreenCloseButtonText, (byte) 87, (WidgetListener) (this));
          return;
        } catch (java.lang.RuntimeException caughtConstructionFailure) {
          constructionFailure = caughtConstructionFailure;
          messageOrConstructionFailure = constructionFailure;
          constructionFailureBeforeDescriptions = messageOrConstructionFailure;
          constructionMessagePrefix = new StringBuilder().append("ij.<init>(");
          if (dialogLayer == null) {
            dialogLayerDescription = "null";
          } else {
            dialogLayerDescription = "{...}";
          }
          constructionMessageBeforeReason = ((StringBuilder) (Object) constructionMessagePrefix).append(dialogLayerDescription).append(',');
          if (failureReason == null) {
            failureReasonDescription = "null";
          } else {
            failureReasonDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) (constructionFailureBeforeDescriptions), ((StringBuilder) (Object) constructionMessageBeforeReason).append(failureReasonDescription).append(')').toString());
        }
    }

    private final void hideFullscreenError(byte methodGuard) {
        if (!this.dialogVisible) {
            return;
        }
        int hideGuardQuotient = 102 / ((methodGuard - 6) / 43);
        this.dialogVisible = false;
    }

    public final void onButtonActivated(int buttonX, byte methodGuard, int buttonY, int pointerButton, ButtonWidget button) {
        RuntimeException activationFailureForContext = null;
        RuntimeException activationFailureBeforeDescription = null;
        StringBuilder activationMessagePrefix = null;
        String buttonDescription = null;
        RuntimeException activationFailure = null;
        try {
          if (button == this.closeButton) {
            this.hideFullscreenError((byte) 122);
          }
          if (methodGuard == -20) {
            return;
          }
          alternateArchivePort = -95;
          return;
        } catch (java.lang.RuntimeException caughtActivationFailure) {
          activationFailure = caughtActivationFailure;
          activationFailureForContext = activationFailure;
          activationFailureBeforeDescription = activationFailureForContext;
          activationMessagePrefix = new StringBuilder().append("ij.Q(").append(buttonX).append(',').append(methodGuard).append(',').append(buttonY).append(',').append(pointerButton).append(',');
          if (button == null) {
            buttonDescription = "null";
          } else {
            buttonDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) activationFailureBeforeDescription), ((StringBuilder) (Object) activationMessagePrefix).append(buttonDescription).append(')').toString());
        }
    }

    final static void drawAvatarFaceOrCryFrame(byte methodGuard) {
        int avatarEyeMouthOffsetX = 0;
        int avatarEyeMouthOffsetY = 0;
        int avatarEyeMouthOffsetXLiteralPhase1;
        int avatarEyeMouthOffsetYLiteralPhase1;
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
            avatarEyeMouthOffsetXLiteralPhase1 = UiWidget.gameplaySession.boardMaskOffsetX - 2;
            avatarEyeMouthOffsetYLiteralPhase1 = UiWidget.gameplaySession.boardMaskOffsetY - 2;
            if (!(WidgetTheme.avatarShockEffectTicks <= 0)) {
                SecondaryNodeHashTable.silverStarShockFrames[IndexedSpriteState.avatarShockFrameIndex].draw(320 - (SecondaryNodeHashTable.silverStarShockFrames[IndexedSpriteState.avatarShockFrameIndex].fullWidth >> 1), -(SecondaryNodeHashTable.silverStarShockFrames[IndexedSpriteState.avatarShockFrameIndex].fullHeight >> 1) + 240);
            }
            EndingAnimationSupport.avatarEyeFrames[DiskCacheWorker.avatarFeedbackFrameIndex].drawGrayModulated(avatarEyeMouthOffsetXLiteralPhase1 + 320, 240 + avatarEyeMouthOffsetYLiteralPhase1, DisplayModeInfo.avatarTintColor);
            UsernameSuggestionsPanel.avatarMouthFrames[TextValidationFailure.avatarFeedbackModeId].drawGrayModulated(320 + avatarEyeMouthOffsetXLiteralPhase1, 240 + avatarEyeMouthOffsetYLiteralPhase1, DisplayModeInfo.avatarTintColor);
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
