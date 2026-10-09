/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextValidationFailure {
    static int avatarFeedbackModeId;
    static long previousWallClockMillis;

    final static void appendRankedEntry(int thirdComponent, int responseIndex, byte methodGuard, int numerator, int secondComponent, int keyTwo) {
        int ratioBeforeUpperKeyBranchJoin = 0;
        int ratioBeforeNormalKeyBranchJoin = 0;
        int componentSum;
        int ratioKey;
        int guardQuotient;
        int componentSumPhase2;
        int ratioKeyPhase2;
        int guardQuotientPhase2;
        DialRenderer.rankedEntryResponseIndices[GmtTimestampSupport.rankedEntryCount] = responseIndex;
        AchievementQuery.rankedEntryIndices[GmtTimestampSupport.rankedEntryCount] = GmtTimestampSupport.rankedEntryCount;
        LoginPasswordSupport.rankedEntryKeyTwo[GmtTimestampSupport.rankedEntryCount] = keyTwo;
        if (ClientRenderingState.rankedKeyTwoLowerBoundSeed > keyTwo) {
          LoginPayloadKind.rankedSortLowerBoundValue = keyTwo;
        }
        if (ProxyAuthenticationRequiredException.rankedKeyTwoUpperBoundSeed >= keyTwo) {
          TextHotspotBounds.rankedEntryRatioNumerators[GmtTimestampSupport.rankedEntryCount] = numerator;
          NodeHashTableIterator.rankedEntryRatioSecondComponents[GmtTimestampSupport.rankedEntryCount] = secondComponent;
          FrameTimer.rankedEntryRatioThirdComponents[GmtTimestampSupport.rankedEntryCount] = thirdComponent;
          componentSum = thirdComponent + (secondComponent + numerator);
          guardQuotient = -80 / ((30 - methodGuard) / 42);
          if (componentSum != 0) {
            ratioBeforeNormalKeyBranchJoin = numerator * 1000 / componentSum;
          } else {
            ratioBeforeNormalKeyBranchJoin = 0;
          }
          ratioKey = ratioBeforeNormalKeyBranchJoin;
          ClientProtocolStage.rankedEntryKeyOne[GmtTimestampSupport.rankedEntryCount] = ratioKey;
          if (MeshPrioritySupport.rankedSortUpperBoundValue < ratioKey) {
            MeshPrioritySupport.rankedSortUpperBoundValue = ratioKey;
          }
          GmtTimestampSupport.rankedEntryCount = GmtTimestampSupport.rankedEntryCount + 1;
          if (LoginPayloadKind.rankedSortLowerBoundValue <= ratioKey) {
            return;
          }
          LoginPayloadKind.rankedSortLowerBoundValue = ratioKey;
          return;
        }
        MeshPrioritySupport.rankedSortUpperBoundValue = keyTwo;
        TextHotspotBounds.rankedEntryRatioNumerators[GmtTimestampSupport.rankedEntryCount] = numerator;
        NodeHashTableIterator.rankedEntryRatioSecondComponents[GmtTimestampSupport.rankedEntryCount] = secondComponent;
        FrameTimer.rankedEntryRatioThirdComponents[GmtTimestampSupport.rankedEntryCount] = thirdComponent;
        componentSumPhase2 = thirdComponent + (secondComponent + numerator);
        guardQuotientPhase2 = -80 / ((30 - methodGuard) / 42);
        if (componentSumPhase2 != 0) {
          ratioBeforeUpperKeyBranchJoin = numerator * 1000 / componentSumPhase2;
        } else {
          ratioBeforeUpperKeyBranchJoin = 0;
        }
        ratioKeyPhase2 = ratioBeforeUpperKeyBranchJoin;
        ClientProtocolStage.rankedEntryKeyOne[GmtTimestampSupport.rankedEntryCount] = ratioKeyPhase2;
        if (MeshPrioritySupport.rankedSortUpperBoundValue < ratioKeyPhase2) {
          MeshPrioritySupport.rankedSortUpperBoundValue = ratioKeyPhase2;
        }
        GmtTimestampSupport.rankedEntryCount = GmtTimestampSupport.rankedEntryCount + 1;
        if (LoginPayloadKind.rankedSortLowerBoundValue <= ratioKeyPhase2) {
          return;
        }
        LoginPayloadKind.rankedSortLowerBoundValue = ratioKeyPhase2;
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
