/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ContextualRuntimeException extends RuntimeException {
    static int releasesPerDifficultyStep;
    Throwable wrappedCause;
    String contextPath;
    static double specialSpriteKindProbability;

    final static void a(String param0, byte param1) {
        int stackIn_16_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Geoblox.clientControlFlowFlag;
        try {
          if ((-1 == NodeHashTableIterator.pendingTooltipAnchorX) &&
              (DequeCursor.pendingTooltipAnchorY == -1)) {
            NodeHashTableIterator.pendingTooltipAnchorX = PrefixCodeDecoder.pointerXSnapshot;
            DequeCursor.pendingTooltipAnchorY = PcmResampler.pointerYSnapshot;
          }
          L1: {
            ResizableDialog.tooltipAgeTicks = ResizableDialog.tooltipAgeTicks + 1;
            if (param0 != null) {
              if (param0.equals(SettingsCookieSupport.field_a)) {
                break L1;
              }
            } else {
              if (null != SettingsCookieSupport.field_a) {
                break L1;
              }
            }
            if (!InstrumentPatch.field_q) {
              if (AsyncResourceDownloader.field_e <= ResizableDialog.tooltipAgeTicks) {
                stackIn_16_0 = (ResizableDialog.tooltipAgeTicks < PcmResampler.field_j + AsyncResourceDownloader.field_e) ? 1 : 0;
              } else {
                stackIn_16_0 = 0;
              }
            } else {
              stackIn_16_0 = 0;
            }
            var2_int = stackIn_16_0;
            if (param0 == null) {
              ResizableDialog.tooltipAgeTicks = 0;
            } else {
              if (InstrumentPatch.field_q) {
                ResizableDialog.tooltipAgeTicks = AsyncResourceDownloader.field_e;
              } else {
                if (var2_int == 0) {
                  ResizableDialog.tooltipAgeTicks = 0;
                } else {
                  ResizableDialog.tooltipAgeTicks = AsyncResourceDownloader.field_e;
                }
              }
            }
            PendingActionMarker.field_g = DequeCursor.pendingTooltipAnchorY;
            ByteTextDecodingSupport.field_a = NodeHashTableIterator.pendingTooltipAnchorX;
            if (param0 == null) {
              if (var2_int != 0) {
                InstrumentPatch.field_q = true;
              }
            } else {
              InstrumentPatch.field_q = false;
            }
          }
          if ((!InstrumentPatch.field_q) &&
              (AsyncResourceDownloader.field_e > ResizableDialog.tooltipAgeTicks) &&
              (AttachmentPointerState.pointerActivitySnapshot)) {
            ResizableDialog.tooltipAgeTicks = 0;
            ByteTextDecodingSupport.field_a = NodeHashTableIterator.pendingTooltipAnchorX;
            PendingActionMarker.field_g = DequeCursor.pendingTooltipAnchorY;
          }
          SettingsCookieSupport.field_a = param0;
          if ((InstrumentPatch.field_q) &&
              (UsernameQuerySupport.field_a == ResizableDialog.tooltipAgeTicks)) {
            InstrumentPatch.field_q = false;
            ResizableDialog.tooltipAgeTicks = 0;
          }
          DequeCursor.pendingTooltipAnchorY = -1;
          NodeHashTableIterator.pendingTooltipAnchorX = -1;
          if (param1 >= 69) {
            return;
          }
          ContextualRuntimeException.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_41_0 = var2;
          stackIn_41_1 = new StringBuilder().append("sa.B(");
          if (param0 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param1).append(')').toString());
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
