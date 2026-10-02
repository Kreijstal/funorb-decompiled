/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    static String noHighscoresText;
    static int[] field_b;
    static int field_a;
    static String loginNoDisplayNameText;
    static IndexedSprite[] field_e;
    static int field_d;

    public static void b(boolean param0) {
        field_e = null;
        loginNoDisplayNameText = null;
        if (param0) {
            field_a = 105;
        }
        field_b = null;
        noHighscoresText = null;
    }

    final static int a(boolean param0) {
        if (!param0) {
            return 104;
        }
        return (int)(1000000000L / oj.field_c);
    }

    final static boolean a(int param0) {
        int stackIn_7_0 = 0;
        if (param0 <= 46) {
          field_a = -60;
        }
        L1: {
          if (hj.field_a >= 10) {
            if (!hl.field_G) {
              if (!t.b(13)) {
                stackIn_7_0 = 1;
                break L1;
              }
            }
          }
          stackIn_7_0 = 0;
        }
        return stackIn_7_0 != 0;
    }

    static {
        $cfr$clinit: {
            int var0;
            int var1;
            int var2;
            noHighscoresText = "No highscores";
            field_b = new int[256];
            loginNoDisplayNameText = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
            var1 = 0;
            L0: while (true) {
              if (var1 >= 256) {
                break $cfr$clinit;
              } else {
                var0 = var1;
                var2 = 0;
                L1: while (true) {
                  if (8 <= var2) {
                    field_b[var1] = var0;
                    var1++;
                    continue L0;
                  } else {
                    if (1 != (var0 & 1)) {
                      var0 = var0 >>> 1;
                      var2++;
                      continue L1;
                    } else {
                      var0 = -306674912 ^ var0 >>> 1;
                      var2++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
