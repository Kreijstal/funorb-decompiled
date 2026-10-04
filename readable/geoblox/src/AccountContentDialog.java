/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountContentDialog extends ContentTransitionDialog {
    static FullscreenFailureReason field_hb;
    static String fullscreenUnavailableTrySignedAppletText;

    final static void renderClientStartupOrPreparedFrame(boolean accountRenderOption, int methodGuard, java.awt.Canvas canvas) {
        int unusedClientControlSnapshot = 0;
        RuntimeException renderFailureBeforeDescription = null;
        StringBuilder renderMessagePrefix = null;
        String canvasDescription = null;
        RuntimeException caughtRenderFailure = null;
        int clearLoadingCanvasFlag = 0;
        RuntimeException renderFailureForContext = null;
        java.awt.Canvas unusedNullCanvasSnapshot = null;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (VisualPropertyOverrides.clientBootstrapStage < 10) {
            clearLoadingCanvasFlag = 0;
            if (UsernameQueryState.canvasRedrawRequested) {
              clearLoadingCanvasFlag = 1;
              UsernameQueryState.canvasRedrawRequested = false;
            }
            ArchiveRequest.drawAwtLoadingProgress(LoginUiSupport.pollLoginUiArchiveProgress((byte) 73), CanvasResizeController.bootstrapProgressColor, clearLoadingCanvasFlag != 0, false, AudioService.getBootstrapLoadingStatusText((byte) -85));
          } else {
            if (OpacityWidget.isLogoAnimationComplete(7426)) {
              if (SpriteConstructionSupport.clientScreenStage == 0) {
                PcmResampler.renderAccountUiBackgroundAndDialogs(accountRenderOption, false, (byte) -102);
                MeshDepthSupport.drawMainRasterToCanvas(0, (byte) 42, canvas, 0);
              } else {
                EndingAnimationSupport.presentPreparedFrame(true, canvas);
              }
            } else {
              SoftwareRasterizer.clearFramebuffer();
              LogoCompositor.drawLogoAnimation(240, 320, -51);
              MeshDepthSupport.drawMainRasterToCanvas(0, (byte) 51, canvas, 0);
            }
          }
          if (methodGuard != 0) {
            unusedNullCanvasSnapshot = (java.awt.Canvas) null;
            AccountContentDialog.renderClientStartupOrPreparedFrame(true, -122, (java.awt.Canvas) null);
          }
          return;
        } catch (java.lang.RuntimeException renderFailure) {
          caughtRenderFailure = renderFailure;
          renderFailureForContext = caughtRenderFailure;
          renderFailureBeforeDescription = renderFailureForContext;
          renderMessagePrefix = new StringBuilder().append("ei.OB(").append(accountRenderOption).append(',').append(methodGuard).append(',');
          if (canvas == null) {
            canvasDescription = "null";
          } else {
            canvasDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) renderFailureBeforeDescription), ((StringBuilder) (Object) renderMessagePrefix).append(canvasDescription).append(')').toString());
        }
    }

    final static String accountNameValidationMessage(boolean allowRepeatedSeparators, boolean skipAccountCharacterCheck, CharSequence candidateName) {
        String displayNameFailureMessage = null;
        int characterIndex = 0;
        int unusedClientControlSnapshot = 0;
        String displayNameFailureBeforeReturn = null;
        String skippedCharacterCheckResult = null;
        String invalidAccountCharacterMessageBeforeReturn = null;
        RuntimeException validationFailureBeforeDescription = null;
        StringBuilder validationMessagePrefix = null;
        String candidateDescription = null;
        RuntimeException caughtValidationFailure = null;
        RuntimeException validationFailureForContext = null;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          displayNameFailureMessage = EntityMotionSupport.displayNameValidationMessage(allowRepeatedSeparators, 2, candidateName);
          if (displayNameFailureMessage != null) {
            displayNameFailureBeforeReturn = displayNameFailureMessage;
            return displayNameFailureBeforeReturn;
          }
          if (skipAccountCharacterCheck) {
            skippedCharacterCheckResult = (String) null;
            return skippedCharacterCheckResult;
          }
          characterIndex = 0;
          while (true) {
            if (characterIndex >= candidateName.length()) {
              return null;
            }
            if (TextInputValidator.isAllowedAccountNameCharacter(candidateName.charAt(characterIndex), (byte) 97)) {
              characterIndex++;
              continue;
            }
            break;
          }
          invalidAccountCharacterMessageBeforeReturn = BoardReconciliationSupport.createNameCharacterAlertText;
          return invalidAccountCharacterMessageBeforeReturn;
        } catch (java.lang.RuntimeException validationFailure) {
          caughtValidationFailure = validationFailure;
          validationFailureForContext = caughtValidationFailure;
          validationFailureBeforeDescription = validationFailureForContext;
          validationMessagePrefix = new StringBuilder().append("ei.QB(").append(allowRepeatedSeparators).append(',').append(skipAccountCharacterCheck).append(',');
          if (candidateName == null) {
            candidateDescription = "null";
          } else {
            candidateDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) validationFailureBeforeDescription), ((StringBuilder) (Object) validationMessagePrefix).append(candidateDescription).append(')').toString());
        }
    }

    public static void releaseStaticReferences(int methodGuard) {
        if (methodGuard > -59) {
            return;
        }
        field_hb = null;
        fullscreenUnavailableTrySignedAppletText = null;
    }

    final void replaceContent(UiWidget content, int methodGuard) {
        try {
            if (methodGuard > -10) {
                fullscreenUnavailableTrySignedAppletText = (String) null;
            }
            super.replaceContent(content, -22);
        } catch (RuntimeException contentReplacementFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) contentReplacementFailure), "ei.PB(" + (content != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    AccountContentDialog(DialogLayer dialogLayer, UiWidget initialContent) {
        super(dialogLayer, initialContent, 33, 20, 30);
    }

    static {
        field_hb = new FullscreenFailureReason();
        fullscreenUnavailableTrySignedAppletText = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
