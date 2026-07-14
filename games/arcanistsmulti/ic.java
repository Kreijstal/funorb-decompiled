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
        int var2 = 0;
        qb var3 = null;
        int var4 = 0;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 > -72) {
          return null;
        } else {
          var2 = 0;
          L0: while (true) {
            if (param0.length <= var2) {
              return param0;
            } else {
              var3 = param0[var2];
              param0[var2].field_o = 0;
              var3.field_x = 0;
              param0[var2].field_n = param0[var2].field_q;
              param0[var2].field_w = param0[var2].field_y;
              var2++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "If you get lost on the map, press 'N' to centre the screen back on your Arcanist. This key will normally cycle between your Arcanist and their minions, but we'll get to minions later.";
        field_b = "Play Rated games to win more wands.<br>The more titles you get in a game, the more wands you will earn.";
    }
}
