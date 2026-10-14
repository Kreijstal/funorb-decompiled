/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd {
    static int[] field_f;
    static int[] viewFacePointOneY;
    static String field_d;
    static boolean field_b;
    static int field_c;
    static UiComponent field_a;
    static String receivedChatSenderName;

    public static void a(byte param0) {
        receivedChatSenderName = null;
        field_a = null;
        if (param0 != 121) {
          return;
        }
        viewFacePointOneY = null;
        field_f = null;
        field_d = null;
    }

    final static dl a(int param0, int param1, String param2) {
        wi var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        wi stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new wi();
          if (param0 < 17) {
            var4 = (String) null;
            nd.a(19, -8, (String) null);
          }
          ((dl) ((Object) var3)).field_c = param1;
          ((dl) ((Object) var3)).field_a = param2;
          stackIn_3_0 = var3;
          return (dl) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("nd.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static boolean comesBeforeRankingRow(boolean obfuscationGuard, int leftIndex, int rightIndex, boolean sortByRating) {
        int var4;
        int var5;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var4Lifetime3;
        int var5Lifetime3;
        if (sortByRating) {
          if (ec.rankingRatings[leftIndex] > ec.rankingRatings[rightIndex]) {
            return true;
          }
          if (ec.rankingRatings[rightIndex] > ec.rankingRatings[leftIndex]) {
            return false;
          }
          if (pj.rankingWinRateThousandths[leftIndex] > pj.rankingWinRateThousandths[rightIndex]) {
            return true;
          }
          if (pj.rankingWinRateThousandths[rightIndex] > pj.rankingWinRateThousandths[leftIndex]) {
            return false;
          }
          if (obfuscationGuard) {
            var4 = ib.rankingLosses[rightIndex] + (ObjectHistoryBuffer.rankingDraws[rightIndex] + RankingsScreen.rankingWins[rightIndex]);
            var5 = ib.rankingLosses[leftIndex] + RankingsScreen.rankingWins[leftIndex] + ObjectHistoryBuffer.rankingDraws[leftIndex];
            if (var5 > var4) {
              return true;
            }
            if (var5 < var4) {
              return false;
            }
            return !(leftIndex <= rightIndex);
          }
          field_c = -96;
          var4Lifetime3 = ib.rankingLosses[rightIndex] + (ObjectHistoryBuffer.rankingDraws[rightIndex] + RankingsScreen.rankingWins[rightIndex]);
          var5Lifetime3 = ib.rankingLosses[leftIndex] + RankingsScreen.rankingWins[leftIndex] + ObjectHistoryBuffer.rankingDraws[leftIndex];
          if (var5Lifetime3 > var4Lifetime3) {
            return true;
          }
          if (var5Lifetime3 < var4Lifetime3) {
            return false;
          }
          return !(leftIndex <= rightIndex);
        }
        if (pj.rankingWinRateThousandths[leftIndex] > pj.rankingWinRateThousandths[rightIndex]) {
          return true;
        }
        if (pj.rankingWinRateThousandths[leftIndex] < pj.rankingWinRateThousandths[rightIndex]) {
          return false;
        }
        if (ec.rankingRatings[leftIndex] > ec.rankingRatings[rightIndex]) {
          return true;
        }
        if (ec.rankingRatings[rightIndex] > ec.rankingRatings[leftIndex]) {
          return false;
        }
        if (obfuscationGuard) {
          var4Lifetime1 = ib.rankingLosses[rightIndex] + (ObjectHistoryBuffer.rankingDraws[rightIndex] + RankingsScreen.rankingWins[rightIndex]);
          var5Lifetime1 = ib.rankingLosses[leftIndex] + RankingsScreen.rankingWins[leftIndex] + ObjectHistoryBuffer.rankingDraws[leftIndex];
          if (var5Lifetime1 > var4Lifetime1) {
            return true;
          }
          if (var5Lifetime1 < var4Lifetime1) {
            return false;
          }
          return !(leftIndex <= rightIndex);
        }
        field_c = -96;
        var4Lifetime2 = ib.rankingLosses[rightIndex] + (ObjectHistoryBuffer.rankingDraws[rightIndex] + RankingsScreen.rankingWins[rightIndex]);
        var5Lifetime2 = ib.rankingLosses[leftIndex] + RankingsScreen.rankingWins[leftIndex] + ObjectHistoryBuffer.rankingDraws[leftIndex];
        if (var5Lifetime2 > var4Lifetime2) {
          return true;
        }
        if (var5Lifetime2 < var4Lifetime2) {
          return false;
        }
        if (leftIndex <= rightIndex) {
          return false;
        }
        return true;
    }

    static {
        field_b = true;
        viewFacePointOneY = new int[8192];
        field_d = "Just play";
    }
}
