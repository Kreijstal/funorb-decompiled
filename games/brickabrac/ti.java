/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    private static String field_z;

    final static void sortRankingIndexRange(int upperBound, int lowerBound, int end, boolean sortByRating, int obfuscationGuard, int retainedEnd, int start) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = BrickABrac.field_J ? 1 : 0;
        try {
          if (retainedEnd <= start) {
            return;
          }
          if (end <= 1 + start) {
            return;
          }
          if (5 + start < end &&
            upperBound != lowerBound) {
            if (obfuscationGuard <= 93) {
              return;
            }
            var7_int = (lowerBound >> 1) - (-(upperBound >> 1) - (1 & (upperBound & lowerBound)));
            var8 = start;
            var9 = upperBound;
            var10 = lowerBound;
            for (var11 = start; end > var11; var11++) {
              var12 = VerticalScrollbar.rankingSortIndices[var11];
              if (sortByRating) {
                stackIn_25_0 = DialogMessagePanel.rankingRatings[var12];
              } else {
                stackIn_25_0 = DebouncedValidationSource.rankingWinRateThousandths[var12];
              }
              var13 = stackIn_25_0;
              if (var7_int < var13) {
                VerticalScrollbar.rankingSortIndices[var11] = VerticalScrollbar.rankingSortIndices[var8];
                if (var13 < var9) {
                  var9 = var13;
                }
                incrementValue$0 = var8;
                var8++;
                VerticalScrollbar.rankingSortIndices[incrementValue$0] = var12;
              } else {
                if (var10 < var13) {
                  var10 = var13;
                }
              }
            }
            ti.sortRankingIndexRange(upperBound, var9, var8, sortByRating, 125, retainedEnd, start);
            ti.sortRankingIndexRange(var10, lowerBound, end, sortByRating, 99, retainedEnd, var8);
            return;
          }
          for (var7_intLifetime1 = -1 + end; var7_intLifetime1 > start; var7_intLifetime1--) {
            for (var8Lifetime1 = start; var8Lifetime1 < var7_intLifetime1; var8Lifetime1++) {
              var9Lifetime1 = VerticalScrollbar.rankingSortIndices[var8Lifetime1];
              var10Lifetime1 = VerticalScrollbar.rankingSortIndices[var8Lifetime1 + 1];
              if (nd.comesBeforeRankingRow(true, var10Lifetime1, var9Lifetime1, sortByRating)) {
                VerticalScrollbar.rankingSortIndices[var8Lifetime1] = var10Lifetime1;
                VerticalScrollbar.rankingSortIndices[1 + var8Lifetime1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var7), field_z + upperBound + ',' + lowerBound + ',' + end + ',' + sortByRating + ',' + obfuscationGuard + ',' + retainedEnd + ',' + start + ')');
        }
    }

    static {
        field_z = "ti.A(";
    }
}
