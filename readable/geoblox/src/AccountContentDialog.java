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
            ArchiveRequest.a(LoginUiSupport.pollLoginUiArchiveProgress((byte) 73), CanvasResizeController.field_q, var3_int != 0, false, AudioService.getBootstrapLoadingStatusText((byte) -85));
          } else {
            if (OpacityWidget.isLogoAnimationComplete(7426)) {
              if (SpriteConstructionSupport.clientScreenStage == 0) {
                PcmResampler.a(param0, false, (byte) -102);
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

    final static String a(boolean param0, boolean param1, CharSequence param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = Geoblox.clientControlFlowFlag;
        try {
          var3 = EntityMotionSupport.a(param0, 2, param2);
          if (var3 != null) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          if (param1) {
            stackIn_7_0 = (String) null;
            return stackIn_7_0;
          }
          var4 = 0;
          while (true) {
            if (var4 >= param2.length()) {
              return null;
            }
            if (TextInputValidator.isAllowedAccountNameCharacter(param2.charAt(var4), (byte) 97)) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_13_0 = BoardReconciliationSupport.createNameCharacterAlertText;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("ei.QB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void n(int param0) {
        if (param0 > -59) {
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
