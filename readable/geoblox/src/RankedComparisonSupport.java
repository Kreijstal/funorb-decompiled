/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RankedComparisonSupport {
    final static boolean isRightRankedEntryBeforeLeft(boolean keyTwoFirst, int leftIndex, byte methodGuard, int rightIndex) {
        int rightTiePartSum;
        int leftTiePartSum;
        int guardResidue;
        if (!keyTwoFirst) {
          if (ClientProtocolStage.rankedEntryKeyOne[rightIndex] < ClientProtocolStage.rankedEntryKeyOne[leftIndex]) {
            return true;
          }
          if (ClientProtocolStage.rankedEntryKeyOne[rightIndex] > ClientProtocolStage.rankedEntryKeyOne[leftIndex]) {
            return false;
          }
          if (hg.rankedEntryKeyTwo[leftIndex] > hg.rankedEntryKeyTwo[rightIndex]) {
            return true;
          }
          if (hg.rankedEntryKeyTwo[rightIndex] > hg.rankedEntryKeyTwo[leftIndex]) {
            return false;
          }
          rightTiePartSum = FrameTimer.field_b[rightIndex] + TextHotspotBounds.field_m[rightIndex] + NodeHashTableIterator.field_i[rightIndex];
          leftTiePartSum = TextHotspotBounds.field_m[leftIndex] + (NodeHashTableIterator.field_i[leftIndex] + FrameTimer.field_b[leftIndex]);
          guardResidue = 76 % ((-38 - methodGuard) / 45);
          if (rightTiePartSum < leftTiePartSum) {
            return true;
          }
          if (rightTiePartSum > leftTiePartSum) {
            return false;
          }
          return !(rightIndex >= leftIndex);
        }
        if (hg.rankedEntryKeyTwo[rightIndex] < hg.rankedEntryKeyTwo[leftIndex]) {
          return true;
        }
        if (hg.rankedEntryKeyTwo[rightIndex] > hg.rankedEntryKeyTwo[leftIndex]) {
          return false;
        }
        if (ClientProtocolStage.rankedEntryKeyOne[rightIndex] < ClientProtocolStage.rankedEntryKeyOne[leftIndex]) {
          return true;
        }
        if (ClientProtocolStage.rankedEntryKeyOne[rightIndex] > ClientProtocolStage.rankedEntryKeyOne[leftIndex]) {
          return false;
        }
        rightTiePartSum = FrameTimer.field_b[rightIndex] + TextHotspotBounds.field_m[rightIndex] + NodeHashTableIterator.field_i[rightIndex];
        leftTiePartSum = TextHotspotBounds.field_m[leftIndex] + (NodeHashTableIterator.field_i[leftIndex] + FrameTimer.field_b[leftIndex]);
        guardResidue = 76 % ((-38 - methodGuard) / 45);
        if (rightTiePartSum < leftTiePartSum) {
          return true;
        }
        if (rightTiePartSum > leftTiePartSum) {
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
          query.field_j = responseCode;
          query.field_e = candidateText;
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
