/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag {
    static int field_a;
    static int field_c;
    static int[][] field_b;

    public static void a(byte param0) {
        if (param0 <= 108) {
            field_c = 38;
        }
        field_b = null;
    }

    final static wb a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = stellarshard.field_B;
        var2 = param1.length();
        if (param0 != (var2 ^ -1)) {
          if (var2 > 63) {
            return bg.field_a;
          } else {
            var3 = 0;
            L0: while (true) {
              if (var3 < var2) {
                var4 = param1.charAt(var3);
                if (var4 == 45) {
                  L1: {
                    if (0 == var3) {
                      break L1;
                    } else {
                      if (var3 == -1 + var2) {
                        break L1;
                      } else {
                        var3++;
                        continue L0;
                      }
                    }
                  }
                  return h.field_a;
                } else {
                  if (0 == (lc.field_m.indexOf(var4) ^ -1)) {
                    return h.field_a;
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return uj.field_d;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[][]{new int[8], new int[8], new int[8], new int[8], new int[8], new int[8]};
    }
}
