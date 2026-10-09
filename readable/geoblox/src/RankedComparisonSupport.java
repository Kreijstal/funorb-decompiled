/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RankedComparisonSupport {
    final static boolean isRightRankedEntryBeforeLeft(boolean keyTwoFirst, int leftIndex, byte methodGuard, int rightIndex) {
        int rightTiePartSum;
        int leftTiePartSum;
        int guardResidue;
        int rightTiePartSumPhase2;
        int leftTiePartSumPhase2;
        int guardResiduePhase2;
        if (!keyTwoFirst) {
          if (ClientProtocolStage.rankedEntryKeyOne[rightIndex] < ClientProtocolStage.rankedEntryKeyOne[leftIndex]) {
            return true;
          }
          if (ClientProtocolStage.rankedEntryKeyOne[rightIndex] > ClientProtocolStage.rankedEntryKeyOne[leftIndex]) {
            return false;
          }
          if (LoginPasswordSupport.rankedEntryKeyTwo[leftIndex] > LoginPasswordSupport.rankedEntryKeyTwo[rightIndex]) {
            return true;
          }
          if (LoginPasswordSupport.rankedEntryKeyTwo[rightIndex] > LoginPasswordSupport.rankedEntryKeyTwo[leftIndex]) {
            return false;
          }
          rightTiePartSum = FrameTimer.rankedEntryRatioThirdComponents[rightIndex] + TextHotspotBounds.rankedEntryRatioNumerators[rightIndex] + NodeHashTableIterator.rankedEntryRatioSecondComponents[rightIndex];
          leftTiePartSum = TextHotspotBounds.rankedEntryRatioNumerators[leftIndex] + (NodeHashTableIterator.rankedEntryRatioSecondComponents[leftIndex] + FrameTimer.rankedEntryRatioThirdComponents[leftIndex]);
          guardResidue = 76 % ((-38 - methodGuard) / 45);
          if (rightTiePartSum < leftTiePartSum) {
            return true;
          }
          if (rightTiePartSum > leftTiePartSum) {
            return false;
          }
          return !(rightIndex >= leftIndex);
        }
        if (LoginPasswordSupport.rankedEntryKeyTwo[rightIndex] < LoginPasswordSupport.rankedEntryKeyTwo[leftIndex]) {
          return true;
        }
        if (LoginPasswordSupport.rankedEntryKeyTwo[rightIndex] > LoginPasswordSupport.rankedEntryKeyTwo[leftIndex]) {
          return false;
        }
        if (ClientProtocolStage.rankedEntryKeyOne[rightIndex] < ClientProtocolStage.rankedEntryKeyOne[leftIndex]) {
          return true;
        }
        if (ClientProtocolStage.rankedEntryKeyOne[rightIndex] > ClientProtocolStage.rankedEntryKeyOne[leftIndex]) {
          return false;
        }
        rightTiePartSumPhase2 = FrameTimer.rankedEntryRatioThirdComponents[rightIndex] + TextHotspotBounds.rankedEntryRatioNumerators[rightIndex] + NodeHashTableIterator.rankedEntryRatioSecondComponents[rightIndex];
        leftTiePartSumPhase2 = TextHotspotBounds.rankedEntryRatioNumerators[leftIndex] + (NodeHashTableIterator.rankedEntryRatioSecondComponents[leftIndex] + FrameTimer.rankedEntryRatioThirdComponents[leftIndex]);
        guardResiduePhase2 = 76 % ((-38 - methodGuard) / 45);
        if (rightTiePartSumPhase2 < leftTiePartSumPhase2) {
          return true;
        }
        if (rightTiePartSumPhase2 > leftTiePartSumPhase2) {
          return false;
        }
        if (rightIndex >= leftIndex) {
          return false;
        }
        return true;
    }

    final static UsernameAvailabilityQuery createUsernameResponseQuery(String candidateText, int responseCode, boolean queryFlag) {
        UsernameAvailabilityQuery query = null;
        RuntimeException queryFailureForContext = null;
        UsernameAvailabilityQuery queryBeforeReturn = null;
        RuntimeException queryFailureBeforeContext = null;
        StringBuilder queryMessagePrefix = null;
        String candidateDescription = null;
        RuntimeException caughtQueryFailure = null;
        try {
          query = new UsernameAvailabilityQuery(queryFlag);
          query.responseCode = responseCode;
          query.candidateOrFailureText = candidateText;
          queryBeforeReturn = query;
          return queryBeforeReturn;
        } catch (java.lang.RuntimeException queryFailure) {
          caughtQueryFailure = queryFailure;
          queryFailureForContext = caughtQueryFailure;
          queryFailureBeforeContext = queryFailureForContext;
          queryMessagePrefix = new StringBuilder().append("ig.B(");
          if (candidateText == null) {
            candidateDescription = "null";
          } else {
            candidateDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) queryFailureBeforeContext), ((StringBuilder) (Object) queryMessagePrefix).append(candidateDescription).append(',').append(responseCode).append(',').append(queryFlag).append(')').toString());
        }
    }

    static {
    }
}
