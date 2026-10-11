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
        qb[] stackIn_3_0 = null;
        qb[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param1 > -72) {
            stackIn_3_0 = (qb[]) null;
            return stackIn_3_0;
          }
          for (var2_int = 0; param0.length > var2_int; var2_int++) {
            var3 = param0[var2_int];
            param0[var2_int].field_o = 0;
            var3.field_x = 0;
            param0[var2_int].field_n = param0[var2_int].field_q;
            param0[var2_int].field_w = param0[var2_int].field_y;
          }
          stackIn_8_0 = (qb[]) (param0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("ic.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_c = "If you get lost on the map, press 'N' to centre the screen back on your Arcanist. This key will normally cycle between your Arcanist and their minions, but we'll get to minions later.";
        field_b = "Play Rated games to win more wands.<br>The more titles you get in a game, the more wands you will earn.";
    }
}
