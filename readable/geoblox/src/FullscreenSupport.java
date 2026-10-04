/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenSupport {
    static boolean field_a;
    static int avatarSteeringDirectionId;
    static String fullscreenAcceptCountdownPluralText;
    static String returnToGameText;

    final static void exitActiveFullscreen(byte methodGuard) {
        if (InstrumentPatch.field_n == null) {
            return;
        }
        EntitySpawnSupport.detachCanvasInputListeners(-2, InstrumentPatch.field_n);
        InstrumentPatch.field_n.exitFullscreen(0, MenuScreen.platformTaskDispatcher);
        if (methodGuard <= -14) {
            InstrumentPatch.field_n = null;
            if (!(null == FontLoadingSupport.field_d)) {
                FontLoadingSupport.field_d.restoreSize((byte) -101);
            }
            MessageDialog.gameCanvas.requestFocus();
            return;
        }
        PlatformTaskDispatcher unusedNullDispatcherSnapshot = (PlatformTaskDispatcher) null;
        FullscreenSupport.exitFullscreenAndDisposeFrame((java.awt.Frame) null, 17, (PlatformTaskDispatcher) null);
        InstrumentPatch.field_n = null;
        if (!(null == FontLoadingSupport.field_d)) {
            FontLoadingSupport.field_d.restoreSize((byte) -101);
        }
        MessageDialog.gameCanvas.requestFocus();
    }

    public static void releaseStaticReferences(int methodGuard) {
        if (methodGuard != -10848) {
            returnToGameText = (String) null;
            fullscreenAcceptCountdownPluralText = null;
            returnToGameText = null;
            return;
        }
        fullscreenAcceptCountdownPluralText = null;
        returnToGameText = null;
    }

    final static void prepareMeshSpecularResponse(byte methodGuard) {
        int responseIndex = 0;
        int sentinelDivisionThenResponseIndexSnapshot = 0;
        double specularExponent = 0.0;
        int clientControlFlowGuard = 0;
        int tailResponseIndex = 0;
        RuntimeException caughtPreparationFailure = null;
        RuntimeException preparationFailureForContext = null;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          TriangleRasterState.prepareTriangleClipFromRasterizer();
          ClientRenderingState.meshProjectionShift = 11;
          MultiHandleSliderRenderer.meshSpecularResponseByAbsDot = new int[260];
          sentinelDivisionThenResponseIndexSnapshot = -29 / ((methodGuard + 40) / 45);
          for (responseIndex = 0; 256 > responseIndex; responseIndex++) {
            specularExponent = 15.0;
            MultiHandleSliderRenderer.meshSpecularResponseByAbsDot[responseIndex] = (int)(255.0 * Math.pow((double)((float)responseIndex / 256.0f), specularExponent));
          }
          tailResponseIndex = 256;
          sentinelDivisionThenResponseIndexSnapshot = tailResponseIndex;
          while (MultiHandleSliderRenderer.meshSpecularResponseByAbsDot.length > tailResponseIndex) {
            MultiHandleSliderRenderer.meshSpecularResponseByAbsDot[tailResponseIndex] = 255;
            tailResponseIndex++;
          }
          return;
        } catch (java.lang.RuntimeException preparationFailure) {
          caughtPreparationFailure = preparationFailure;
          preparationFailureForContext = caughtPreparationFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) preparationFailureForContext), "jk.F(" + methodGuard + ')');
        }
    }

    final static int getPointerIdleTicks(boolean releaseTextFirst) {
        if (releaseTextFirst) {
            FullscreenSupport.releaseStaticReferences(-65);
            return GameplaySession.pointerIdleTicks;
        }
        return GameplaySession.pointerIdleTicks;
    }

    final static TextValidationFailure validateDomainLabel(int methodGuard, String domainLabel) {
        int characterIndex = 0;
        int labelLength = 0;
        int characterCode = 0;
        int clientControlFlowGuard = 0;
        TextValidationFailure emptyLabelFailure = null;
        TextValidationFailure overlongLabelFailure = null;
        TextValidationFailure edgeHyphenFailure = null;
        TextValidationFailure invalidCharacterFailure = null;
        RuntimeException validationFailureBeforeDescription = null;
        StringBuilder validationMessagePrefix = null;
        String labelDescription = null;
        RuntimeException caughtValidationFailure = null;
        RuntimeException validationFailureForContext = null;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          labelLength = domainLabel.length();
          if (methodGuard != 255) {
            FullscreenSupport.releaseStaticReferences(118);
          }
          if (0 == labelLength) {
            emptyLabelFailure = InstrumentNoteMask.field_f;
            return emptyLabelFailure;
          }
          if (labelLength > 63) {
            overlongLabelFailure = ButtonWidget.field_x;
            return overlongLabelFailure;
          }
          for (characterIndex = 0; labelLength > characterIndex; characterIndex++) {
            L2: {
              characterCode = domainLabel.charAt(characterIndex);
              if (45 == characterCode) {
                if ((characterIndex != 0) &&
                    (characterIndex != -1 + labelLength)) {
                  break L2;
                }
                edgeHyphenFailure = ArchiveLoadStep.field_h;
                return edgeHyphenFailure;
              }
              if (PacketBuffer.field_q.indexOf(characterCode) == -1) {
                invalidCharacterFailure = ArchiveLoadStep.field_h;
                return invalidCharacterFailure;
              }
            }
          }
          return null;
        } catch (java.lang.RuntimeException validationFailure) {
          caughtValidationFailure = validationFailure;
          validationFailureForContext = caughtValidationFailure;
          validationFailureBeforeDescription = validationFailureForContext;
          validationMessagePrefix = new StringBuilder().append("jk.E(").append(methodGuard).append(',');
          if (domainLabel == null) {
            labelDescription = "null";
          } else {
            labelDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) validationFailureBeforeDescription), ((StringBuilder) (Object) validationMessagePrefix).append(labelDescription).append(')').toString());
        }
    }

    final static void exitFullscreenAndDisposeFrame(java.awt.Frame fullscreenFrame, int methodGuard, PlatformTaskDispatcher taskDispatcher) {
        PlatformTask exitTask = null;
        int clientControlFlowGuard = 0;
        RuntimeException exitFailureBeforeDescriptions = null;
        StringBuilder exitMessagePrefix = null;
        String frameDescription = null;
        StringBuilder exitMessageAfterFrameDescription = null;
        String dispatcherDescription = null;
        RuntimeException caughtExitFailure = null;
        RuntimeException exitFailureForContext = null;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          while (true) {
            exitTask = taskDispatcher.requestExitFullscreen(fullscreenFrame, 0);
            while (exitTask.status == 0) {
              ByteTextDecodingSupport.sleepMillis(0, 10L);
            }
            if (exitTask.status != 1) {
              ByteTextDecodingSupport.sleepMillis(0, 100L);
              continue;
            }
            fullscreenFrame.setVisible(false);
            if (methodGuard != 10) {
              fullscreenAcceptCountdownPluralText = (String) null;
            }
            fullscreenFrame.dispose();
            return;
          }
        } catch (java.lang.RuntimeException exitFailure) {
          caughtExitFailure = exitFailure;
          exitFailureForContext = caughtExitFailure;
          exitFailureBeforeDescriptions = exitFailureForContext;
          exitMessagePrefix = new StringBuilder().append("jk.C(");
          if (fullscreenFrame == null) {
            frameDescription = "null";
          } else {
            frameDescription = "{...}";
          }
          exitMessageAfterFrameDescription = ((StringBuilder) (Object) exitMessagePrefix).append(frameDescription).append(',').append(methodGuard).append(',');
          if (taskDispatcher == null) {
            dispatcherDescription = "null";
          } else {
            dispatcherDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) exitFailureBeforeDescriptions), ((StringBuilder) (Object) exitMessageAfterFrameDescription).append(dispatcherDescription).append(')').toString());
        }
    }

    static {
        avatarSteeringDirectionId = 0;
        field_a = false;
        fullscreenAcceptCountdownPluralText = "If you do nothing the game will revert to normal view in <%0> seconds.";
        returnToGameText = "Return to game";
    }
}
