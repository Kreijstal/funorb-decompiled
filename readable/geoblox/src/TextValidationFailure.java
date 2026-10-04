/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextValidationFailure {
    static int avatarFeedbackModeId;
    static long previousWallClockMillis;

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        int stackIn_7_0 = 0;
        int stackIn_17_0 = 0;
        int var6;
        int var7;
        int var8;
        DialRenderer.field_l[GmtTimestampSupport.rankedEntryCount] = param1;
        AchievementQuery.rankedEntryIndices[GmtTimestampSupport.rankedEntryCount] = GmtTimestampSupport.rankedEntryCount;
        LoginPasswordSupport.rankedEntryKeyTwo[GmtTimestampSupport.rankedEntryCount] = param5;
        if (ClientRenderingState.rankedKeyTwoLowerBoundSeed > param5) {
          LoginPayloadKind.field_a = param5;
        }
        if (ProxyAuthenticationRequiredException.field_a >= param5) {
          TextHotspotBounds.field_m[GmtTimestampSupport.rankedEntryCount] = param3;
          NodeHashTableIterator.field_i[GmtTimestampSupport.rankedEntryCount] = param4;
          FrameTimer.rankedEntryRatioThirdComponents[GmtTimestampSupport.rankedEntryCount] = param0;
          var6 = param0 + (param4 + param3);
          var8 = -80 / ((30 - param2) / 42);
          if (var6 != 0) {
            stackIn_17_0 = param3 * 1000 / var6;
          } else {
            stackIn_17_0 = 0;
          }
          var7 = stackIn_17_0;
          ClientProtocolStage.rankedEntryKeyOne[GmtTimestampSupport.rankedEntryCount] = var7;
          if (MeshPrioritySupport.field_b < var7) {
            MeshPrioritySupport.field_b = var7;
          }
          GmtTimestampSupport.rankedEntryCount = GmtTimestampSupport.rankedEntryCount + 1;
          if (LoginPayloadKind.field_a <= var7) {
            return;
          }
          LoginPayloadKind.field_a = var7;
          return;
        }
        MeshPrioritySupport.field_b = param5;
        TextHotspotBounds.field_m[GmtTimestampSupport.rankedEntryCount] = param3;
        NodeHashTableIterator.field_i[GmtTimestampSupport.rankedEntryCount] = param4;
        FrameTimer.rankedEntryRatioThirdComponents[GmtTimestampSupport.rankedEntryCount] = param0;
        var6 = param0 + (param4 + param3);
        var8 = -80 / ((30 - param2) / 42);
        if (var6 != 0) {
          stackIn_7_0 = param3 * 1000 / var6;
        } else {
          stackIn_7_0 = 0;
        }
        var7 = stackIn_7_0;
        ClientProtocolStage.rankedEntryKeyOne[GmtTimestampSupport.rankedEntryCount] = var7;
        if (MeshPrioritySupport.field_b < var7) {
          MeshPrioritySupport.field_b = var7;
        }
        GmtTimestampSupport.rankedEntryCount = GmtTimestampSupport.rankedEntryCount + 1;
        if (LoginPayloadKind.field_a <= var7) {
          return;
        }
        LoginPayloadKind.field_a = var7;
    }

    final static MouseWheelInput createMouseWheelInput(int methodGuard) {
        try {
            Throwable ignoredWheelFactoryFailure = null;
            MouseWheelInput wheelInputBeforeReturn = null;
            Throwable caughtWheelFactoryFailure = null;
            if (methodGuard < 2) {
              previousWallClockMillis = -62L;
            }
            try {
              wheelInputBeforeReturn = (MouseWheelInput) (Class.forName("AwtMouseWheelListener").newInstance());
              return wheelInputBeforeReturn;
            } catch (java.lang.Throwable wheelFactoryFailure) {
              caughtWheelFactoryFailure = wheelFactoryFailure;
              ignoredWheelFactoryFailure = caughtWheelFactoryFailure;
              return null;
            }
        } catch (RuntimeException | Error uncheckedWheelFactoryFailure) {
            throw uncheckedWheelFactoryFailure;
        } catch (Throwable checkedWheelFactoryFailure) {
            throw new RuntimeException(checkedWheelFactoryFailure);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int reverseLowBitsIntoAccumulator(int value, int initialAccumulator, int bitCount) {
        int accumulator = 0;
        RuntimeException failureForContext = null;
        int resultBeforeReturn = 0;
        RuntimeException caughtReverseFailure = null;
        try {
          accumulator = initialAccumulator;
          while (bitCount > 0) {
            accumulator = accumulator << 1 | value & 1;
            bitCount--;
            value = value >>> 1;
          }
          resultBeforeReturn = accumulator;
          return resultBeforeReturn;
        } catch (java.lang.RuntimeException reverseFailure) {
          caughtReverseFailure = reverseFailure;
          failureForContext = caughtReverseFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureForContext), "nd.B(" + value + ',' + initialAccumulator + ',' + bitCount + ')');
        }
    }

    static {
        avatarFeedbackModeId = 0;
    }
}
