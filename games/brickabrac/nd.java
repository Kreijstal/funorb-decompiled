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

    final static SocketConnector createSocketConnector(int obfuscationGuard, int port, String host) {
        ProxySocketConnector connector = null;
        RuntimeException failure = null;
        String unusedHost = null;
        ProxySocketConnector result = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String hostSummary = null;
        RuntimeException caughtFailure = null;
        try {
          connector = new ProxySocketConnector();
          if (obfuscationGuard < 17) {
            unusedHost = (String) null;
            nd.createSocketConnector(19, -8, (String) null);
          }
          ((SocketConnector) ((Object) connector)).targetPort = port;
          ((SocketConnector) ((Object) connector)).targetHost = host;
          result = connector;
          return (SocketConnector) ((Object) result);
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("nd.B(").append(obfuscationGuard).append(',').append(port).append(',');
          if (host == null) {
            hostSummary = "null";
          } else {
            hostSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(hostSummary).append(')').toString());
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
          if (DialogMessagePanel.rankingRatings[leftIndex] > DialogMessagePanel.rankingRatings[rightIndex]) {
            return true;
          }
          if (DialogMessagePanel.rankingRatings[rightIndex] > DialogMessagePanel.rankingRatings[leftIndex]) {
            return false;
          }
          if (DebouncedValidationSource.rankingWinRateThousandths[leftIndex] > DebouncedValidationSource.rankingWinRateThousandths[rightIndex]) {
            return true;
          }
          if (DebouncedValidationSource.rankingWinRateThousandths[rightIndex] > DebouncedValidationSource.rankingWinRateThousandths[leftIndex]) {
            return false;
          }
          if (obfuscationGuard) {
            var4 = WidgetGroup.rankingLosses[rightIndex] + (ObjectHistoryBuffer.rankingDraws[rightIndex] + RankingsScreen.rankingWins[rightIndex]);
            var5 = WidgetGroup.rankingLosses[leftIndex] + RankingsScreen.rankingWins[leftIndex] + ObjectHistoryBuffer.rankingDraws[leftIndex];
            if (var5 > var4) {
              return true;
            }
            if (var5 < var4) {
              return false;
            }
            return !(leftIndex <= rightIndex);
          }
          field_c = -96;
          var4Lifetime3 = WidgetGroup.rankingLosses[rightIndex] + (ObjectHistoryBuffer.rankingDraws[rightIndex] + RankingsScreen.rankingWins[rightIndex]);
          var5Lifetime3 = WidgetGroup.rankingLosses[leftIndex] + RankingsScreen.rankingWins[leftIndex] + ObjectHistoryBuffer.rankingDraws[leftIndex];
          if (var5Lifetime3 > var4Lifetime3) {
            return true;
          }
          if (var5Lifetime3 < var4Lifetime3) {
            return false;
          }
          return !(leftIndex <= rightIndex);
        }
        if (DebouncedValidationSource.rankingWinRateThousandths[leftIndex] > DebouncedValidationSource.rankingWinRateThousandths[rightIndex]) {
          return true;
        }
        if (DebouncedValidationSource.rankingWinRateThousandths[leftIndex] < DebouncedValidationSource.rankingWinRateThousandths[rightIndex]) {
          return false;
        }
        if (DialogMessagePanel.rankingRatings[leftIndex] > DialogMessagePanel.rankingRatings[rightIndex]) {
          return true;
        }
        if (DialogMessagePanel.rankingRatings[rightIndex] > DialogMessagePanel.rankingRatings[leftIndex]) {
          return false;
        }
        if (obfuscationGuard) {
          var4Lifetime1 = WidgetGroup.rankingLosses[rightIndex] + (ObjectHistoryBuffer.rankingDraws[rightIndex] + RankingsScreen.rankingWins[rightIndex]);
          var5Lifetime1 = WidgetGroup.rankingLosses[leftIndex] + RankingsScreen.rankingWins[leftIndex] + ObjectHistoryBuffer.rankingDraws[leftIndex];
          if (var5Lifetime1 > var4Lifetime1) {
            return true;
          }
          if (var5Lifetime1 < var4Lifetime1) {
            return false;
          }
          return !(leftIndex <= rightIndex);
        }
        field_c = -96;
        var4Lifetime2 = WidgetGroup.rankingLosses[rightIndex] + (ObjectHistoryBuffer.rankingDraws[rightIndex] + RankingsScreen.rankingWins[rightIndex]);
        var5Lifetime2 = WidgetGroup.rankingLosses[leftIndex] + RankingsScreen.rankingWins[leftIndex] + ObjectHistoryBuffer.rankingDraws[leftIndex];
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
