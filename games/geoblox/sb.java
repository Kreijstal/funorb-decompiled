/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    static String field_f;
    static int[] field_b;
    static int field_a;
    static String field_c;
    static na[] field_e;
    static int field_d;

    public static void b(boolean param0) {
        field_e = null;
        field_c = null;
        if (param0) {
            field_a = 105;
        }
        field_b = null;
        field_f = null;
    }

    final static int a(boolean param0) {
        if (!param0) {
            return 104;
        }
        return (int)(1000000000L / oj.field_c);
    }

    final static boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 > 46) {
            break L0;
          } else {
            field_a = -60;
            break L0;
          }
        }
        L1: {
          L2: {
            if (-11 < (hj.field_a ^ -1)) {
              break L2;
            } else {
              if (hl.field_G) {
                break L2;
              } else {
                if (t.b(13)) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_f = "No highscores";
        field_b = new int[256];
        field_c = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        var1 = 0;
        L0: while (true) {
          if (var1 >= 256) {
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
                  var0 = -306674912 ^ var0 >>> 1592307073;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
