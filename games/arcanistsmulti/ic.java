/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic {
    static String field_c;
    static int field_a;
    static String field_b;

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            ic.a(52);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static qb[] a(qb[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        qb var3 = null;
        int var4 = 0;
        Object stackIn_3_0 = null;
        qb[] stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        qb[] stackOut_7_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 <= -72) {
              var2_int = 0;
              L1: while (true) {
                if (param0.length <= var2_int) {
                  stackOut_7_0 = (qb[]) param0;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  var3 = param0[var2_int];
                  param0[var2_int].field_o = 0;
                  var3.field_x = 0;
                  param0[var2_int].field_n = param0[var2_int].field_q;
                  param0[var2_int].field_w = param0[var2_int].field_y;
                  var2_int++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (qb[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("ic.A(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "If you get lost on the map, press 'N' to centre the screen back on your Arcanist. This key will normally cycle between your Arcanist and their minions, but we'll get to minions later.";
        field_b = "Play Rated games to win more wands.<br>The more titles you get in a game, the more wands you will earn.";
    }
}
