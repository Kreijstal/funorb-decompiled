/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    static byte[][] field_d;
    static ff field_a;
    static int field_g;
    static kb field_e;
    static int[] field_b;
    static String field_f;
    static boolean[] field_c;

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = SolKnight.field_L ? 1 : 0;
        if (param0 == 64) {
          var3 = 1;
          L0: while (true) {
            if (-2 <= (param2 ^ -1)) {
              if (1 == param2) {
                return param1 * var3;
              } else {
                return var3;
              }
            } else {
              L1: {
                if (0 != (1 & param2)) {
                  var3 = var3 * param1;
                  break L1;
                } else {
                  break L1;
                }
              }
              param2 = param2 >> 1;
              param1 = param1 * param1;
              continue L0;
            }
          }
        } else {
          return -27;
        }
    }

    public static void a(int param0) {
        if (param0 != 11051) {
          field_e = null;
          field_a = null;
          field_c = null;
          field_d = null;
          field_f = null;
          field_e = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_d = null;
          field_f = null;
          field_e = null;
          field_b = null;
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(int param0, int param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = SolKnight.field_L ? 1 : 0;
        var3 = 0;
        if (param2 == 69) {
          L0: while (true) {
            if (-1 <= (param1 ^ -1)) {
              return var3;
            } else {
              var3 = 1 & param0 | var3 << -1477527295;
              param1--;
              param0 = param0 >>> 1;
              continue L0;
            }
          }
        } else {
          return 7;
        }
    }

    final static void a(int param0, o param1) {
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = SolKnight.field_L ? 1 : 0;
        if (0 != (3 & (param1.field_n | (param1.field_s | (param1.field_t | param1.field_p))))) {
          var2 = param1.field_p + (3 & param1.field_s);
          var3 = param1.field_t - -(3 & param1.field_n);
          var2 = var2 + 4 - (var2 & 3);
          var3 = 4 - ((var3 & 3) - var3);
          if (param0 >= 113) {
            var4 = new int[var3 * var2];
            var5 = 0;
            var6 = var2 * (param1.field_n & 3) + (3 & param1.field_s);
            var7 = 0;
            L0: while (true) {
              if (param1.field_t <= var7) {
                param1.field_p = var2;
                param1.field_s = param1.field_s & -4;
                param1.field_n = param1.field_n & -4;
                param1.field_t = var3;
                param1.field_v = var4;
                return;
              } else {
                var8 = 0;
                L1: while (true) {
                  if (param1.field_p <= var8) {
                    var6 = var6 + (-param1.field_p + var2);
                    var7++;
                    continue L0;
                  } else {
                    var6++;
                    var5++;
                    var4[var6] = param1.field_v[var5];
                    var8++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            field_d = null;
            var4 = new int[var3 * var2];
            var5 = 0;
            var6 = var2 * (param1.field_n & 3) + (3 & param1.field_s);
            var7 = 0;
            L2: while (true) {
              if (param1.field_t <= var7) {
                param1.field_p = var2;
                param1.field_s = param1.field_s & -4;
                param1.field_n = param1.field_n & -4;
                param1.field_t = var3;
                param1.field_v = var4;
                return;
              } else {
                var8 = 0;
                L3: while (true) {
                  if (param1.field_p <= var8) {
                    var6 = var6 + (-param1.field_p + var2);
                    var7++;
                    continue L2;
                  } else {
                    var6++;
                    var5++;
                    var4[var6] = param1.field_v[var5];
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new byte[50][];
        field_a = new ff(14, 0, 4, 1);
        field_b = new int[256];
        field_c = new boolean[64];
        field_f = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
