/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ContextualRuntimeException extends RuntimeException {
    static int releasesPerDifficultyStep;
    Throwable wrappedCause;
    String contextPath;
    static double specialSpriteKindProbability;

    final static void updateTooltipState(String tooltipText, byte methodGuard) {
        int previousTooltipVisibleSnapshot = 0;
        RuntimeException tooltipFailureBeforeDescription = null;
        StringBuilder tooltipMessagePrefix = null;
        String textDescription = null;
        RuntimeException caughtTooltipFailure = null;
        int previousTooltipVisible = 0;
        RuntimeException tooltipFailureForContext = null;
        int unusedClientControlSnapshot = 0;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if ((-1 == NodeHashTableIterator.pendingTooltipAnchorX) &&
              (DequeCursor.pendingTooltipAnchorY == -1)) {
            NodeHashTableIterator.pendingTooltipAnchorX = PrefixCodeDecoder.pointerXSnapshot;
            DequeCursor.pendingTooltipAnchorY = PcmResampler.pointerYSnapshot;
          }
          tooltipAgeAdjustment: {
            ResizableDialog.tooltipAgeTicks = ResizableDialog.tooltipAgeTicks + 1;
            if (tooltipText != null) {
              if (tooltipText.equals(SettingsCookieSupport.currentTooltipText)) {
                break tooltipAgeAdjustment;
              }
            } else {
              if (null != SettingsCookieSupport.currentTooltipText) {
                break tooltipAgeAdjustment;
              }
            }
            if (!InstrumentPatch.tooltipSuppressed) {
              if (AsyncResourceDownloader.tooltipShowDelayTicks <= ResizableDialog.tooltipAgeTicks) {
                previousTooltipVisibleSnapshot = (ResizableDialog.tooltipAgeTicks < PcmResampler.tooltipShowDurationTicks + AsyncResourceDownloader.tooltipShowDelayTicks) ? 1 : 0;
              } else {
                previousTooltipVisibleSnapshot = 0;
              }
            } else {
              previousTooltipVisibleSnapshot = 0;
            }
            previousTooltipVisible = previousTooltipVisibleSnapshot;
            if (tooltipText == null) {
              ResizableDialog.tooltipAgeTicks = 0;
            } else {
              if (InstrumentPatch.tooltipSuppressed) {
                ResizableDialog.tooltipAgeTicks = AsyncResourceDownloader.tooltipShowDelayTicks;
              } else {
                if (previousTooltipVisible == 0) {
                  ResizableDialog.tooltipAgeTicks = 0;
                } else {
                  ResizableDialog.tooltipAgeTicks = AsyncResourceDownloader.tooltipShowDelayTicks;
                }
              }
            }
            PendingActionMarker.tooltipAnchorY = DequeCursor.pendingTooltipAnchorY;
            ByteTextDecodingSupport.tooltipAnchorX = NodeHashTableIterator.pendingTooltipAnchorX;
            if (tooltipText == null) {
              if (previousTooltipVisible != 0) {
                InstrumentPatch.tooltipSuppressed = true;
              }
            } else {
              InstrumentPatch.tooltipSuppressed = false;
            }
          }
          if ((!InstrumentPatch.tooltipSuppressed) &&
              (AsyncResourceDownloader.tooltipShowDelayTicks > ResizableDialog.tooltipAgeTicks) &&
              (AttachmentPointerState.pointerActivitySnapshot)) {
            ResizableDialog.tooltipAgeTicks = 0;
            ByteTextDecodingSupport.tooltipAnchorX = NodeHashTableIterator.pendingTooltipAnchorX;
            PendingActionMarker.tooltipAnchorY = DequeCursor.pendingTooltipAnchorY;
          }
          SettingsCookieSupport.currentTooltipText = tooltipText;
          if ((InstrumentPatch.tooltipSuppressed) &&
              (UsernameQuerySupport.tooltipSuppressionResetAge == ResizableDialog.tooltipAgeTicks)) {
            InstrumentPatch.tooltipSuppressed = false;
            ResizableDialog.tooltipAgeTicks = 0;
          }
          DequeCursor.pendingTooltipAnchorY = -1;
          NodeHashTableIterator.pendingTooltipAnchorX = -1;
          if (methodGuard >= 69) {
            return;
          }
          ContextualRuntimeException.a(false);
          return;
        } catch (java.lang.RuntimeException tooltipFailure) {
          caughtTooltipFailure = tooltipFailure;
          tooltipFailureForContext = caughtTooltipFailure;
          tooltipFailureBeforeDescription = tooltipFailureForContext;
          tooltipMessagePrefix = new StringBuilder().append("sa.B(");
          if (tooltipText == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) tooltipFailureBeforeDescription), ((StringBuilder) (Object) tooltipMessagePrefix).append(textDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final static void recomputeSpawnReleaseInterval(boolean preserveReleaseQuota) {
        int intervalTicks = (int)(201.0f / TextTemplateDefinition.entityMotionSpeed * FullscreenErrorDialog.spawnIntervalScale + 0.5f);
        UsernameResponseSupport.spawnReleaseIntervalTicks = intervalTicks;
        if (!preserveReleaseQuota) {
            releasesPerDifficultyStep = -10;
            return;
        }
    }

    final static String a(boolean param0) {
        if (!param0) {
            return (String) null;
        }
        if (!(ClientFlowState.accountCreationFlowState != IntrusiveDeque.pendingClientFlowToken)) {
            return ByteStorage.accountCreationPassword;
        }
        return LoginPasswordSupport.currentLoginPassword;
    }

    final static boolean a(PlatformTaskDispatcher param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 37) {
            specialSpriteKindProbability = -0.44199917757712387;
          }
          stackIn_3_0 = param0.hasFullscreenSupport(param1 - 26135);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("sa.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    ContextualRuntimeException(Throwable param0, String param1) {
        this.contextPath = param1;
        this.wrappedCause = param0;
    }

    static {
        releasesPerDifficultyStep = 20;
    }
}
