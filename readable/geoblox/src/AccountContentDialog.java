/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountContentDialog extends ContentTransitionDialog {
    static FullscreenFailureReason field_hb;
    static String fullscreenUnavailableTrySignedAppletText;

    final static void a(boolean param0, int param1, java.awt.Canvas param2) {
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        java.awt.Canvas var5 = null;
        var4 = Geoblox.clientControlFlowFlag;
        try {
          if (VisualPropertyOverrides.clientBootstrapStage < 10) {
            var3_int = 0;
            if (UsernameQueryState.canvasRedrawRequested) {
              var3_int = 1;
              UsernameQueryState.canvasRedrawRequested = false;
            }
            ArchiveRequest.a(LoginUiSupport.pollLoginUiArchiveProgress((byte) 73), CanvasResizeController.bootstrapProgressColor, var3_int != 0, false, AudioService.getBootstrapLoadingStatusText((byte) -85));
          } else {
            if (OpacityWidget.isLogoAnimationComplete(7426)) {
              if (SpriteConstructionSupport.clientScreenStage == 0) {
                PcmResampler.renderAccountUiBackgroundAndDialogs(param0, false, (byte) -102);
                MeshDepthSupport.drawMainRasterToCanvas(0, (byte) 42, param2, 0);
              } else {
                EndingAnimationSupport.presentPreparedFrame(true, param2);
              }
            } else {
              SoftwareRasterizer.clearFramebuffer();
              LogoCompositor.drawLogoAnimation(240, 320, -51);
              MeshDepthSupport.drawMainRasterToCanvas(0, (byte) 51, param2, 0);
            }
          }
          if (param1 != 0) {
            var5 = (java.awt.Canvas) null;
            AccountContentDialog.a(true, -122, (java.awt.Canvas) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("ei.OB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
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
