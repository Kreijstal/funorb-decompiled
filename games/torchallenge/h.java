/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    static byte[][] field_a;
    static int[][][] field_b;
    private ka[] field_c;

    public static void a(int param0) {
        field_b = null;
        if (param0 <= 9) {
            h.a(66);
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TorChallenge.field_F ? 1 : 0;
        if (0 >= param4) {
          return;
        } else {
          L0: {
            param2[param0] = param3;
            param2[-1 + param4] = param1;
            if (param3 >= param1) {
              var6 = -1;
              var5 = -param1 + param3;
              break L0;
            } else {
              var6 = 1;
              var5 = -param3 + param1;
              break L0;
            }
          }
          var7 = param4;
          if (2 != var7) {
            L1: {
              if ((var7 ^ -1) != -2) {
                break L1;
              } else {
                param2[0] = param1 + param3 >> 1152917025;
                break L1;
              }
            }
            if (0 != var7) {
              var8 = 0;
              var9 = 1;
              L2: while (true) {
                if (var9 >= var7 - 1) {
                  return;
                } else {
                  param2[var9] = param2[0];
                  var8 = var9 * var5;
                  param2[var9] = param2[var9] + var6 * var8 / (var7 - 1);
                  if ((var7 - 1) / 2 <= var8 * var6 % (var7 + -1)) {
                    param2[var9] = param2[var9] + 1;
                    var9++;
                    continue L2;
                  } else {
                    var9++;
                    continue L2;
                  }
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != 4) {
            return;
        }
        fe var2 = cg.field_a[param0];
        int var3 = hb.field_b[param0];
        e discarded$0 = ol.a(-127, var2, var3);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        hd.a(((h) this).field_c, param0, param4, (byte) -66, param1, param3);
        if (param2 != -1) {
            ((h) this).field_c = null;
        }
    }

    h(ka[] param0) {
        ((h) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[][][]{new int[8][], new int[8][], new int[8][], new int[8][], new int[8][], new int[8][], new int[8][], new int[8][]};
    }
}
