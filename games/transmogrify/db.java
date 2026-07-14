/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    static int[] field_e;
    private int[] field_c;
    static int field_d;
    static pd field_a;
    static String[] field_b;
    static String field_f;

    final static void a(fe param0, Object param1, int param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        if (null != param0.field_m) {
          L0: {
            if (param2 <= -29) {
              break L0;
            } else {
              field_e = null;
              break L0;
            }
          }
          var3_int = 0;
          L1: while (true) {
            L2: {
              if (-51 >= (var3_int ^ -1)) {
                break L2;
              } else {
                if (null == param0.field_m.peekEvent()) {
                  break L2;
                } else {
                  pg.a(1L, -101);
                  var3_int++;
                  continue L1;
                }
              }
            }
            try {
              L3: {
                if (param1 != null) {
                  param0.field_m.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param1, 1001, "dummy"));
                  break L3;
                } else {
                  break L3;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var3 = (Exception) (Object) decompiledCaughtException;
          }
        } else {
          return;
        }
    }

    final int a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          if (!param1) {
            break L0;
          } else {
            int discarded$2 = ((db) this).a(4, true);
            break L0;
          }
        }
        var3 = -1 + (((db) this).field_c.length >> 1189282881);
        var4 = var3 & param0;
        L1: while (true) {
          var5 = ((db) this).field_c[var4 + var4 + 1];
          if ((var5 ^ -1) == 0) {
            return -1;
          } else {
            if (param0 == ((db) this).field_c[var4 + var4]) {
              return var5;
            } else {
              var4 = var4 + 1 & var3;
              continue L1;
            }
          }
        }
    }

    db(int[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 1;
        while ((param0.length >> -639552927) + param0.length >= var2) {
            var2 = var2 << 1;
        }
        ((db) this).field_c = new int[var2 - -var2];
        for (var3 = 0; var3 < var2 + var2; var3++) {
            ((db) this).field_c[var3] = -1;
        }
        for (var3 = 0; var3 < param0.length; var3++) {
            var4 = -1 + var2 & param0[var3];
            while (0 != (((db) this).field_c[1 + (var4 - -var4)] ^ -1)) {
                var4 = var2 - 1 & var4 + 1;
            }
            ((db) this).field_c[var4 + var4] = param0[var3];
            ((db) this).field_c[var4 + (var4 + 1)] = var3;
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_e = null;
        field_a = null;
        field_b = null;
        if (param0 != 8192) {
            Object var2 = null;
            db.a((fe) null, (Object) null, -100);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[8192];
        field_f = "Unpacking music";
        field_b = new String[]{"Your aim in Transmogrify is to make a series of words from your collection of letter tiles.<br><br>There are 10 rounds: in each, you will keep the tiles from the previous word and get a new set of tiles in addition.<br><br>The tiles look like this: <img=1>", "You can move the tiles by dragging them, or by double-clicking them to add them to your proposed word.<br><br>Alternatively, you can use the keyboard. In this case, the 'UP' arrow key will assemble the word from the previous round and the 'DOWN' arrow key will clear the scoring rack.", "You cannot submit the same word twice in a single game.<br><br>If you really cannot make a word, you can skip a round, scoring 0 for it.<br><br>Tiles that are harder to use are worth more and reusing tiles causes their value to rise. The value is shown in the corner of the tile.", "Each of the 10 rounds has a bonus tile, which doubles the score for that word if it is used. This bonus does not carry through to the next round.<br><br>Bonus tiles look like this: <img=2>", "On top of points from the words themselves, there are two other bonuses available.<br><br>Make words quickly to get a large time bonus or make words radically different from previous words to get a large variety bonus. Once you've had some practice, try getting both.", "The dictionaries used by Transmogrify have been compiled from multiple independent sources.<br><br>Certain words that may offend some players have been omitted."};
    }
}
