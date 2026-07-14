/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends rk {
    int field_t;
    bc[] field_q;
    int[] field_u;
    int field_r;
    byte[][][] field_s;
    static ej field_p;
    bc[] field_m;
    int[] field_o;
    int[] field_v;
    static ad field_n;

    final static char a(boolean param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        if (!param0) {
          var2 = 255 & param1;
          if (0 != var2) {
            if (var2 >= 128) {
              if ((var2 ^ -1) <= -161) {
                return (char)var2;
              } else {
                L0: {
                  var3 = cd.field_m[var2 + -128];
                  if (var3 != 0) {
                    break L0;
                  } else {
                    var3 = 63;
                    break L0;
                  }
                }
                var2 = var3;
                return (char)var2;
              }
            } else {
              return (char)var2;
            }
          } else {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          }
        } else {
          return '';
        }
    }

    public static void b(boolean param0) {
        field_n = null;
        field_p = null;
        if (param0) {
            dg.b(false);
        }
    }

    dg() {
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = Confined.field_J ? 1 : 0;
        var3 = param0;
        L0: while (true) {
          if (-2 <= (param1 ^ -1)) {
            if (-2 == (param1 ^ -1)) {
              return var3 * param2;
            } else {
              return var3;
            }
          } else {
            L1: {
              if (0 != (param1 & 1)) {
                var3 = var3 * param2;
                break L1;
              } else {
                break L1;
              }
            }
            param1 = param1 >> 1;
            param2 = param2 * param2;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new ej();
    }
}
