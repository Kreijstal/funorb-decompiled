/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca extends IntrusiveNode {
    static String unpackingMusicText;
    static mg field_f;
    static int field_i;
    static IndexedSprite bakingBackgroundSprite;

    final static nd a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        nd var5 = null;
        nd stackIn_4_0 = null;
        nd stackIn_7_0 = null;
        nd stackIn_10_0 = null;
        nd stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if ((param0 != null) &&
              (0 != param0.length())) {
            var2_int = param0.indexOf('@');
            if (var2_int == -1) {
              stackIn_7_0 = pj.field_f;
              return stackIn_7_0;
            }
            var3 = param0.substring(0, var2_int);
            var4 = param0.substring(param1 + var2_int);
            var5 = r.a(var3, true);
            if (var5 == null) {
              stackIn_12_0 = GzipInflater.a(var4, false);
              return stackIn_12_0;
            }
            stackIn_10_0 = (nd) (var5);
            return stackIn_10_0;
          }
          stackIn_4_0 = fb.field_j;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = (RuntimeException) (var2);
          stackIn_15_1 = new StringBuilder().append("ca.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        unpackingMusicText = null;
        field_f = null;
        bakingBackgroundSprite = null;
        if (param0) {
            bakingBackgroundSprite = (IndexedSprite) null;
        }
    }

    private ca() throws Throwable {
        throw new Error();
    }

    static {
        unpackingMusicText = "Unpacking music";
    }
}
