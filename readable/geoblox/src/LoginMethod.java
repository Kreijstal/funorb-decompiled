/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginMethod {
    static String gameNameText;
    private String methodName;

    final static boolean isAvatarCryHoldExpired(int methodGuard) {
        if (methodGuard != -3) {
            gameNameText = (String) null;
            if (NameCharacterSupport.avatarCryPhase != 2) {
                return false;
            }
            if (LimitedRandomAccessFile.avatarFeedbackHoldTicks < 0) {
                return true;
            }
            return false;
        }
        if (NameCharacterSupport.avatarCryPhase != 2) {
            return false;
        }
        if (LimitedRandomAccessFile.avatarFeedbackHoldTicks < 0) {
            return true;
        }
        return false;
    }

    final boolean matchesMethodName(int methodGuard, String candidate) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (methodGuard > 107) {
            stackIn_4_0 = this.methodName.equals(candidate);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("od.E(").append(methodGuard).append(',');
          if (candidate == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void releaseStaticReferences(byte methodGuard) {
        gameNameText = null;
        if (methodGuard >= -8) {
            LoginMethod.releaseMarkedThemeMusicPreparation((byte) -78);
        }
    }

    final void rememberMethod(java.applet.Applet applet, int methodGuard) {
        try {
            IntArrayQuery.writeCookieValue((byte) -25, 31536000L, applet, "jagex-last-login-method", this.methodName);
            if (methodGuard != 0) {
                java.applet.Applet var4 = (java.applet.Applet) null;
                this.rememberMethod((java.applet.Applet) null, -71);
            }
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "od.F(" + (applet != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    final static FullscreenFocusCanvas createFullscreenFocusCanvas(int height, int refreshRate, int bitDepth, int methodGuard, PlatformTaskDispatcher dispatcher, int width) {
        java.awt.Frame unusedFullscreenFrameSnapshot = null;
        RuntimeException creationFailureForContext = null;
        FullscreenFocusCanvas canvas = null;
        java.awt.Frame fullscreenFrame = null;
        FullscreenFocusCanvas canvasBeforeReturn = null;
        RuntimeException creationFailureBeforeDescription = null;
        StringBuilder creationMessagePrefix = null;
        String dispatcherDescription = null;
        RuntimeException caughtCreationFailure = null;
        try {
          if (methodGuard != -3) {
            gameNameText = (String) null;
          }
          fullscreenFrame = FullscreenEntrySupport.enterFullscreenAndWait(bitDepth, -1, height, width, dispatcher, refreshRate);
          unusedFullscreenFrameSnapshot = fullscreenFrame;
          if (fullscreenFrame == null) {
            return null;
          }
          canvas = new FullscreenFocusCanvas();
          canvas.fullscreenFrame = fullscreenFrame;
          canvas.fullscreenFrame.add((java.awt.Component) ((Object) canvas));
          canvas.setBounds(0, 0, width, height);
          canvas.addFocusListener(canvas);
          canvas.requestFocus();
          canvasBeforeReturn = canvas;
          return canvasBeforeReturn;
        } catch (java.lang.RuntimeException creationFailure) {
          caughtCreationFailure = creationFailure;
          creationFailureForContext = caughtCreationFailure;
          creationFailureBeforeDescription = creationFailureForContext;
          creationMessagePrefix = new StringBuilder().append("od.A(").append(height).append(',').append(refreshRate).append(',').append(bitDepth).append(',').append(methodGuard).append(',');
          if (dispatcher == null) {
            dispatcherDescription = "null";
          } else {
            dispatcherDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) creationFailureBeforeDescription), ((StringBuilder) (Object) creationMessagePrefix).append(dispatcherDescription).append(',').append(width).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void releaseMarkedThemeMusicPreparation(byte methodGuard) {
        int themeFlagIndex = 0;
        RuntimeException preparationReleaseFailureForContext = null;
        int clientControlSnapshot = 0;
        RuntimeException caughtPreparationReleaseFailure = null;
        clientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (null != GameAudioState.gameSoundSampleCache) {
            for (themeFlagIndex = 0; themeFlagIndex < 7; themeFlagIndex++) {
              if (!EmailValidator.themeMusicPreparationFlags[themeFlagIndex]) {
                return;
              }
            }
            AccountEligibilitySupport.musicScoreArchive = null;
            UsernameAvailabilityQuery.instrumentPatchArchive = null;
            PasswordWidgetRenderer.gameMusicStream.clearInstrumentSampleIds((byte) 83);
            GameAudioState.gameSoundSampleCache = null;
          }
          if (methodGuard == -24) {
            return;
          }
          LoginMethod.releaseMarkedThemeMusicPreparation((byte) -35);
          return;
        } catch (java.lang.RuntimeException preparationReleaseFailure) {
          caughtPreparationReleaseFailure = preparationReleaseFailure;
          preparationReleaseFailureForContext = caughtPreparationReleaseFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) preparationReleaseFailureForContext), "od.B(" + methodGuard + ')');
        }
    }

    LoginMethod(String methodName) {
        try {
            this.methodName = methodName;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "od.<init>(" + (methodName != null ? "{...}" : "null") + ')');
        }
    }

    static {
        gameNameText = "Geoblox";
    }
}
