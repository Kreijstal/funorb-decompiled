/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ContextualRuntimeException extends RuntimeException {
    static int releasesPerDifficultyStep;
    Throwable field_a;
    String field_d;
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
          if ((-1 == NodeHashTableIterator.field_g) &&
              (DequeCursor.field_e == -1)) {
            NodeHashTableIterator.field_g = PrefixCodeDecoder.pointerXSnapshot;
            DequeCursor.field_e = PcmResampler.pointerYSnapshot;
          }
          L1: {
            ResizableDialog.field_V = ResizableDialog.field_V + 1;
            if (param0 != null) {
              if (param0.equals(tc.field_a)) {
                break L1;
              }
            } else {
              if (null != tc.field_a) {
                break L1;
              }
            }
            if (!InstrumentPatch.field_q) {
              if (AsyncResourceDownloader.field_e <= ResizableDialog.field_V) {
                stackIn_16_0 = (ResizableDialog.field_V < PcmResampler.field_j + AsyncResourceDownloader.field_e) ? 1 : 0;
              } else {
                stackIn_16_0 = 0;
              }
            } else {
              stackIn_16_0 = 0;
            }
            var2_int = stackIn_16_0;
            if (param0 == null) {
              ResizableDialog.field_V = 0;
            } else {
              if (InstrumentPatch.field_q) {
                ResizableDialog.field_V = AsyncResourceDownloader.field_e;
              } else {
                if (var2_int == 0) {
                  ResizableDialog.field_V = 0;
                } else {
                  ResizableDialog.field_V = AsyncResourceDownloader.field_e;
                }
              }
            }
            PendingActionMarker.field_g = DequeCursor.field_e;
            bc.field_a = NodeHashTableIterator.field_g;
            if (param0 == null) {
              if (var2_int != 0) {
                InstrumentPatch.field_q = true;
              }
            } else {
              InstrumentPatch.field_q = false;
            }
          }
          if ((!InstrumentPatch.field_q) &&
              (AsyncResourceDownloader.field_e > ResizableDialog.field_V) &&
              (wb.pointerActivitySnapshot)) {
            ResizableDialog.field_V = 0;
            bc.field_a = NodeHashTableIterator.field_g;
            PendingActionMarker.field_g = DequeCursor.field_e;
          }
          tc.field_a = param0;
          if ((InstrumentPatch.field_q) &&
              (cl.field_a == ResizableDialog.field_V)) {
            InstrumentPatch.field_q = false;
            ResizableDialog.field_V = 0;
          }
          DequeCursor.field_e = -1;
          NodeHashTableIterator.field_g = -1;
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
        int intervalTicks = (int)(201.0f / og.entityMotionSpeed * FullscreenErrorDialog.spawnIntervalScale + 0.5f);
        kb.spawnReleaseIntervalTicks = intervalTicks;
        if (!preserveReleaseQuota) {
            releasesPerDifficultyStep = -10;
            return;
        }
    }

    final static String a(boolean param0) {
        if (!param0) {
            return (String) null;
        }
        if (!(kd.field_b != IntrusiveDeque.field_d)) {
            return ByteStorage.field_a;
        }
        return hg.field_d;
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
        this.field_d = param1;
        this.field_a = param0;
    }

    static {
        releasesPerDifficultyStep = 20;
    }
}
