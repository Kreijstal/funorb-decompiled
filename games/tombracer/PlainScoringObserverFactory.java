/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlainScoringObserverFactory extends ScoringObserverFactory {
    static String field_d;
    static String field_c;
    static int field_b;

    final MatchScoringObserver createScoringObserver(MatchState param0, int param1) {
        RuntimeException var3 = null;
        MatchState var4 = null;
        MatchScoringObserver stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -25077) {
            var4 = (MatchState) null;
            this.createScoringObserver((MatchState) null, 53);
          }
          stackIn_3_0 = new MatchScoringObserver(param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("aua.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public PlainScoringObserverFactory() {
    }

    public static void releaseStatics(boolean param0) {
        field_d = null;
        field_c = null;
        if (!param0) {
          PlainScoringObserverFactory.releaseStatics(true);
        }
    }

    static {
        field_d = "Continue";
        field_c = "Full";
        field_b = 4;
    }
}
